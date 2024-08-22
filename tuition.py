#Program prints out increased tuition for 5 years
tuition = 8000.00
print("In 1 year, the tuition will be $" + str(round(tuition * 1.03, 2)) + ".")
print("In 2 years, the tuition will be $" + str(round(tuition * 1.03 * 1.03, 2)) + ".")
print("In 3 years, the tuition will be $" + str(round(tuition * 1.03 * 1.03 * 1.03, 3)) + ".")
print("In 4 years, the tuition will be $" + str(round(tuition * 1.03 * 1.03 * 1.03 * 1.03, 5)) + ".")
print("In 5 years, the tuition will be $" + str(round(tuition * 1.03 * 1.03 * 1.03 * 1.03 * 1.03, 12)) + ".")