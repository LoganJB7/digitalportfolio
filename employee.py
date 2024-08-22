#This program stores all employee data
class Employee:
    def __init__(self):
        self.name = ''
        self.idNumber = ''
        self.department = ''
        self.jobTitle = ''
    
    def set_name(self, name):
        self.name = name
    
    def set_idNumber(self, id):
        self.idNumber = id
    
    def set_department(self, dept):
        self.department = dept
    
    def set_jobTitle(self, title):
        self.jobTitle = title
    
    def get_name(self):
        return self.name

    def get_idNumber(self):
        return self.idNumber
    
    def get_department(self):
        return self.department
    
    def get_jobTitle(self):
        return self.jobTitle

susanMeyers = Employee()
susanMeyers.set_name('Susan Meyers')
susanMeyers.set_idNumber('47899')
susanMeyers.set_department('Accounting')
susanMeyers.set_jobTitle('Vice President')

markJones = Employee()
markJones.set_name('Mark Jones')
markJones.set_idNumber('39119')
markJones.set_department('IT')
markJones.set_jobTitle('Programmer')

joyRogers = Employee()
joyRogers.set_name('Joy Rogers')
joyRogers.set_idNumber('81774')
joyRogers.set_department('Manufacturing')
joyRogers.set_jobTitle('Engineer')

emp = [susanMeyers, markJones, joyRogers]

for employee in emp:
    print(f'Name: {employee.get_name()}')
    print(f'ID Number: {employee.get_idNumber()}')
    print(f'Department: {employee.get_department()}')
    print(f'Job Title: {employee.get_jobTitle()}')
    print()