class User:
    def __init__(self, id='codetree', level=10):
        self.id = id
        self.level = level

id, level = input().split()

user1 = User()
user2 = User(id, level)

print(f'user {user1.id} lv {user1.level}')
print(f'user {user2.id} lv {user2.level}')