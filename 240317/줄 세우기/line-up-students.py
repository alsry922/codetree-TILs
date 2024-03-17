class Student:
    def __init__(self, height, weight, number):
        self.height = height
        self.weight = weight
        self.number = number

n = int(input())
students_info = [list(map(int, input().split())) for _ in range(n)]
students = [Student(height, weight, number) for number, (height, weight) in enumerate(students_info, start=1)]
    

students.sort(key=lambda ele: (-ele.height, -ele.weight, ele.number))
for ele in students:
    print(ele.height, ele.weight, ele.number)