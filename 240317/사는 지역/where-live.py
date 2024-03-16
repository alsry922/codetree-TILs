class Person:
    def __init__(self, name, postcode, region):
        self.name = name
        self.postcode = postcode
        self.region = region

length = int(input())
persons = []
for i in range(length):
    name, postcode, region = input().split()
    persons.append(Person(name, postcode, region))

max_idx = 0
for i in range(length):
    if (persons[i].name > persons[max_idx].name):
        max_idx = i

print(f'''name {persons[max_idx].name}
addr {persons[max_idx].postcode}
city {persons[max_idx].region}
''')