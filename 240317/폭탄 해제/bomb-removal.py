class Bomb:
    def __init__(self, code, color, time):
        self.code = code
        self.color = color
        self.time = time

code, color, time = input().split()
bomb = Bomb(code, color, int(time))
print(f'code : {bomb.code}')
print(f'color : {bomb.color}')
print(f'second : {bomb.time}')