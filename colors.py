# Program allows user to input to colors and prints out combined output
prim1 = input('Enter primary color:')
prim2 = input('Enter primary color:')

prim1 = prim1.lower() 
prim2 = prim2.lower()
color = 'no color'

if prim1 == 'yellow' and prim2 == 'blue' or prim1 == 'blue' and prim2 == 'yellow':
    color = 'green'
elif prim1 == 'red' and prim2 == 'yellow' or prim1 == 'yellow' and prim2 == 'red':
    color = 'orange'
elif prim1 == 'red' and prim2 == 'blue' or prim1 == 'blue' and prim2 == 'red':
    color = 'purple'

if color == 'no color':
    print("You didn't input two primary colors.")
else:
    print(f'When you mix {prim1} and {prim2}, you get {color}.')