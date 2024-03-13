n = int(input())
arr = list(map(int, input().split()))
medians = []

def find_median(arr):
    arr.sort()
    medians.append(arr[len(arr) // 2])
    
for i in range(n):
    if (i % 2 == 0):
        find_median(arr[:i+1])

for ele in medians:
    print(ele, end=" ")