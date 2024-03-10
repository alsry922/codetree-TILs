n = int(input())
arr = (list(map(int, input().split())))

sortedArr = sorted(arr)
for ele in sortedArr:
    print(ele, end=' ')
print()

reverseSortedArr = list(reversed(sortedArr))
for ele in reverseSortedArr:
    print(ele, end=' ')