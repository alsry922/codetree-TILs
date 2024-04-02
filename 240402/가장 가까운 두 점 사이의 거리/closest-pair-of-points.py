import sys

N = int(input())
X = []
Y = []
ANS = sys.maxsize

for i in range(N):
    x, y = tuple(map(int, input().split()))
    X.append(x)
    Y.append(y)

for i in range(N):
    for j in range(i+1, N):
        distance = (abs(X[i]-X[j]) ** 2) + (abs(Y[i]-Y[j]) ** 2)
        ANS = min(ANS, distance)

print(ANS)