X, Y = tuple(map(int, input().split()))

answer = 0

for ele in range(X, Y+1):
    digits = list(str(ele))
    isPelindrome = True
    length = len(digits)
    for i in range(length):
        if digits[i] != digits[length-1-i]:
            isPelindrome = False
            break
    if isPelindrome:
        answer += 1

print(answer)