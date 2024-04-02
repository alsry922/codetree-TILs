import sys
MAX_NUM = 1000
N = int(input())
TIMES = [
    tuple(map(int, input().split()))
        for _ in range(N)
]

ans = 1
for i in range(N):
    count = [0] * 1000;
    for j in range(N):
        if i == j:
            continue
        start, end = TIMES[j]
        for k in range(start, end):
            count[k] += 1;
    
    time = 0

    for j in range(1, MAX_NUM):
        if count[j] > 0:
            time += 1

    ans = max(ans, time)
print(ans)