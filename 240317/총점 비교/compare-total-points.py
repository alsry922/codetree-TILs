from functools import cmp_to_key

class Student:
    def __init__(self, name, kor, eng, math):
        self.name = name
        self.kor = kor
        self.eng = eng
        self.math = math

n = int(input())
students = [
    Student(name, int(kor), int(eng), int(math)) for _ in range(n)
        for name, kor, eng, math in [input().split()]
]

students.sort(key=lambda ele: (ele.kor + ele.eng + ele.math))

for ele in students:
    print(ele.name, ele.kor, ele.eng, ele.math)