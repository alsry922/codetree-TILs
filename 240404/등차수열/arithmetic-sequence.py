N = int(input())
arr = list(map(int, input().split()))

answer = 0

for k in range(1, 101):
    count = 0
    for i in range(len(arr)):
        for j in range(i+1, len(arr)):
            if abs(arr[i] - k) == abs(arr[j] - k):
                count += 1
    
    answer = max(answer, count)

print(answer)