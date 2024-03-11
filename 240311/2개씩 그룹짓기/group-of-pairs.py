N = int(input())
arr = list(map(int, input().split()))

arr.sort()
maxGroup = 0
length = len(arr)
for i in range(len(arr)):
    value = arr[i] + arr[length-i-1]
    if value > maxGroup:
        maxGroup = value

print(maxGroup)