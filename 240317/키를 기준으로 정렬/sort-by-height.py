class Person:
    def __init__(self, name, height, weight):
        self.name = name
        self.height = height
        self.weight = weight

n = int(input())
persons = [Person(name, int(height), int(weight)) for _ in range(n) for name, height, weight in [input().split()]]

persons.sort(key=lambda ele: ele.height)
for ele in persons:
    print(ele.name, ele.height, ele.weight)