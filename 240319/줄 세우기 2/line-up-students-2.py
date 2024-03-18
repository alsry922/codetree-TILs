class Person:
    def __init__(self, height, weight, number):
        self.height = height
        self.weight = weight
        self.number = number

    def __str__(self):
        return f'{self.height} {self.weight} {self.number}'
    
    def __repr__(self):
        return self.__str__()

n = int(input())
persons = []
for i in range(n):
    height, weight = list(map(int, input().split()))
    persons.append(Person(height, weight, i+1))

persons.sort(key=lambda ele: (ele.height, -ele.weight))

for ele in persons:
    print(ele)