
.section .data
STR0:	.asciz "Enter two 4-byte integers: "
STR1:	.asciz "%d %d"
STR2:	.asciz "x: %d, y: %d\n"

.section .text
.global main

main:
	pushq %rbp
	movq %rsp, %rbp

	movq $STR0, %rdi
	call printf

	subq $16, %rsp
	
	movq $STR1, %rdi
	leaq 12(%rsp), %rsi
	leaq 8(%rsp), %rdx
	call scanf

	movq $STR2, %rdi
	movl 12(%rsp), %esi
	movl 8(%rsp), %edx
	call printf

	movl 12(%rsp), %edi
	movl 8(%rsp), %esi
	call if_else 

	movq $STR2, %rdi
	movl 12(%rsp), %esi
	movl 8(%rsp), %edx
	call printf

	movl 12(%rsp), %edi
	movl 8(%rsp), %esi
	call cond_move

	movq $STR0, %rdi
	call printf

	movq %rbp, %rsp
	popq %rbp

	ret
