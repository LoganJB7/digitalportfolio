#This program reads the golf.txt file and prints each golfer's name and score.
with open("golf.txt","r") as file:
    lines = file.readlines()
    i = 0
    while i < len(lines):
        name = lines[i].strip()
        score = lines[i+1].strip()
        print(f"Name:{name}\nScore:{score}\n")
        i += 2