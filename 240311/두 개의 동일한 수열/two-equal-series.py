n = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

answer = 'No'
for ele in A:
    if ele in B:
        answer = 'Yes'

print(answer)