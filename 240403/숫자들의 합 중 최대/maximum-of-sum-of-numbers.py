X, Y = tuple(map(int, input().split()))

max_num = 0
for number in range(X, Y+1):
    digit_num = tuple(map(int, list(str(number))))
    digit_sum = 0
    for digit in digit_num:
        digit_sum += digit
    max_num = max(max_num, digit_sum)

print(max_num)