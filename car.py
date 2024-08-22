#This program provides a class named car with attributes and methods
class Car:
    def __init__ (self,year_model,make):
        self._year_model= year_model
        self._make = make
        self._speed = 0
    
    def accelerate(self):
        self._speed += 5
    
    def brake(self):
        self._speed -= 5
    
    def get_speed(self):
        return self._speed

car= Car(2024,"Kia")
for i in range(5):
    car.accelerate()
    print(car.get_speed())

for i in range(5):
    car.brake()
    print(car.get_speed())