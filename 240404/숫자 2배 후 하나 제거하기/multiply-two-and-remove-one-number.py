import sys

N = int(input())
arr = list(map(int, input().split()))

min_diff = sys.maxsize 
# 하나의 원소를 두 배
for i in range(N):
    arr[i] *= 2
    # 제외할 원소를 선택
    for j in range(N):
        remaining = []
        # 남은 원소들 추가
        for k, elem in enumerate(arr):
            if j != k:
                remaining.append(elem)
        # 인접한 원소들 차이의 합 계산
        sum_diff = 0
        for index in range(1, len(remaining)):
            sum_diff += abs(remaining[index] - remaining[index-1])
        
        min_diff = min(min_diff, sum_diff)
    
    arr[i] //= 2

print(min_diff)