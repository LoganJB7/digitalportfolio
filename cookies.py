# Recipes shows how much ingredients are needed in recipe
num_cookies = int(input('Enter number of cookies:'))
cups_sugar = 1.5 * num_cookies / 48
cups_butter = num_cookies / 48
cups_flour = 2.75 * num_cookies / 48

print(f'You need {cups_sugar} cups of sugar, {cups_butter} cups of butter, and {cups_flour} cups of flour.')