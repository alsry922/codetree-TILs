n = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))


answer = 'Yes'
for ele in A:
    if ele not in B:
        answer = 'No'

print(answer)