MAX_NUM = 100
N = int(input())
segments = [
    tuple(map(int, input().split())) for _ in range(N)
]

answer = 0

for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            count = [0] * (MAX_NUM + 1)
            for l in range(N):
                if l==i or l==j or l==k:
                    continue
                x1, x2 = segments[l]
                for ele in range(x1, x2+1):
                    count[ele] += 1
            if max(count) <= 1:
                answer += 1

print(answer)