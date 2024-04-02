import sys
N = int(input())
TIMES = [
    tuple(map(int, input().split()))
        for _ in range(N)
]

ans = sys.maxsize
for i in range(N):
    timeSum = 0;
    for j in range(N):
        if (i == j):
            continue
        start, end = TIMES[j]
        timeSum += end - start
    ans = min(ans, timeSum)

print(ans)