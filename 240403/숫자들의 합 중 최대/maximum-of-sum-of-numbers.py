X, Y = tuple(map(int, input().split()))

max_num = 0
for number in range(X, Y+1):
    digit1, digit2 = tuple(map(int, list(str(number))))
    max_num = max(max_num, digit1+digit2)

print(max_num)