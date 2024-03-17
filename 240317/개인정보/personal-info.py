class Person:
    def __init__(self, name, height, weight):
        self.name = name
        self.height = height
        self.weight = weight

person_info = [input().split() for _ in range(5)]
persons = [Person(name, int(height), float(weight)) for (name, height, weight) in person_info]

persons.sort(key=lambda ele: ele.name)

print('name')
for ele in persons:
    print(f'{ele.name} {ele.height} {ele.weight:.1f}')
print()

persons.sort(key=lambda ele: -ele.height)
print('height')
for ele in persons:
    print(f'{ele.name} {ele.height} {ele.weight:.1f}')