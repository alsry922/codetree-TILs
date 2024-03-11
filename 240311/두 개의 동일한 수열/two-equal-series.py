n = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))


def equal():
    for ele1, ele2 in zip(A, B):
        if (ele1 != ele2):
            return 'No'
    return 'Yes'

A.sort()
B.sort()

print(equal())