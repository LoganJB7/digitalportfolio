#Program prints out future bank balance
def calculate_future_value(p,i,t):
    f=p*(1 + i)**t
    return f
p = float(input("Enter current bank balance:"))
i = float(input("Enter interest rate:"))
t = float(input("Enter the amount of time that passes:"))
future_value=calculate_future_value(p,i*1.0,t)
print(future_value)