.section .data
STR1:
	.asciz "Division\n"
STR2:
	.asciz "Enter integer: "
STR3:
	.asciz "%ld"
STR4:
	.asciz "x: %ld, y: %ld\n"
STR5:
	.asciz "x/y: %ld, x%y: %ld\n"

.section .text
.global main
main:
	pushq %rbp
	movq %rsp, %rbp

	movq $STR1, %rdi
	call printf

	subq $16, %rsp
	movq $0, 8(%rsp)		
	movq $0, (%rsp)		
	
	movq $STR2, %rdi
	call printf

	movq $STR3, %rdi
	leaq 8(%rsp), %rsi
	call scanf

	movq $STR2, %rdi
	call printf

	movq $STR3, %rdi
	leaq (%rsp), %rsi
	call scanf

	movq $STR4, %rdi
	movq 8(%rsp), %rsi
	movq (%rsp), %rdx
	call printf

	movq 8(%rsp), %rax
	cqto 
	idivq (%rsp)
	
	movq $STR5, %rdi
	movq %rax, %rsi
	# remainder already in %rdx

	call printf

	movq %rbp, %rsp
	popq %rbp
	ret
