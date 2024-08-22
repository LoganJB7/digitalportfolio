#This program calculates and displays the factorial of a nonnegative integer entered by the user.

num=int(input("Enter a nonnegative integer:"))
factorial = 1
for i in range(1,num+1):
    factorial *= i
print(factorial)