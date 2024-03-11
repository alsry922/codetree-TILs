n, k = list(map(int, input().split()))
lst = list(map(int, input().split()))

sorted_list = sorted(lst)


for i in range(n):
    if (i == k-1):
        print(sorted_list[i])