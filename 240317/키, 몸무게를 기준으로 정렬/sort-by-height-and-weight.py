class Person:
    def __init__(self, name, height, weight):
        self.name = name
        self.height = height
        self.weight = weight

n = int(input())
person_info = [tuple(input().split()) for _ in range(n)]
persons = [
    Person(name, int(height), int(weight)) for (name, height, weight) in person_info
]

persons.sort(key=lambda ele: (ele.height, -ele.weight))

for person in persons:
    print(f'{person.name} {person.height} {person.weight}')