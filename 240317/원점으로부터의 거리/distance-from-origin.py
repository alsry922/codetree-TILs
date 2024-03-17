class Pair:
    def __init__(self, x, y, number):
        self.x = x
        self.y = y
        self.number = number

n = int(input())
position = []
for i in range(1, n+1):
    x, y = list(map(int, input().split()))
    position.append(Pair(x, y, i))

position.sort(key=lambda ele: abs(ele.x - 0) + abs(ele.y - 0))
for pos in position:
    print(pos.number)