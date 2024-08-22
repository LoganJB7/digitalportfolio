# Provides ratio of litter of male to female
number_of_males=int(input('Enter number of males:'))
number_of_females=int(input('Enter number of females:'))
total_number_of_otters= number_of_males + number_of_females
percentage_of_males = (number_of_males / total_number_of_otters) * 100
percentage_of_females = (number_of_females / total_number_of_otters) *100
print(f'Percent males: {percentage_of_males:.0f}%')
print(f'Percent females: {percentage_of_females:.0f}%')