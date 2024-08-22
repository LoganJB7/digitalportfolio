#This program calculates the average of all the numbers stored in the file and prints the average to the screen.
with open('numbers.txt','r') as file:
    numbers = file.readlines()
    numbers =[int(num) for num in numbers]
    average = sum (numbers) / len(numbers)
print(average)