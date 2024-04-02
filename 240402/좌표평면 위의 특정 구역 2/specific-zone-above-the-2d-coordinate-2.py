import sys

MAX_NUM = sys.maxsize
ANS = sys.maxsize
N = int(input())
x = []
y = []
for _ in range(N):
    xInput, yInput = tuple(map(int, input().split()))
    x.append(xInput)
    y.append(yInput)

for i in range(N):
    maxX = 1
    minX = MAX_NUM
    maxY = 1
    minY = MAX_NUM
    for j in range(N):
        if (i == j):
            continue
        maxX = max(maxX, x[j])
        minX = min(minX, x[j])
        maxY = max(maxY, y[j])
        minY = min(minY, y[j])
    ANS = min(ANS, ((maxX - minX) * (maxY - minY)))

print(ANS)