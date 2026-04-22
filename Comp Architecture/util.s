
.section .data
LT: 	.asciz "Less than\n"
NLT:	.asciz "Not less than\n"

.section .text
.global if_else 
.global cond_move

if_else:
	pushq %rbp

	# if x < y 
	#	print "less than" 
	# else 
	#   print "not less than"

	# x in edi, y in esi

	cmpl %esi, %edi
	jge .XGEY

	movq $LT, %rdi
	call printf
	jmp .END

.XGEY:
	movq $NLT, %rdi
	call printf

.END:
	popq %rbp
	ret


cond_move:
	pushq %rbp

	# if x < y 
	#	print "less than" 
	# else 
	#   print "not less than"

	# x in edi, y in esi

	movl %edi, %r8d
	movl %esi, %r9d 

	movq $LT, %rdi
	movq $NLT, %rsi

	cmpl %r9d, %r8d
	cmovge %rsi, %rdi 
	call printf

	popq %rbp
	ret
