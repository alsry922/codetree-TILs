N, B = tuple(map(int, input().split()))

P = [
    int(input()) for _ in range(N)
]

answer = 0
for i in range(N):
    arr = P[:]
    arr[i] //= 2
    arr.sort()
    arr_sum = 0
    count = 0
    for j in range(N):
        if (arr_sum + arr[j] > B):
            break
        arr_sum += arr[j]
        count += 1
    answer = max(answer, count)

print(answer)