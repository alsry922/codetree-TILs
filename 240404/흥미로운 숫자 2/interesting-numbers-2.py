X, Y = tuple(map(int, input().split()))

answer = 0

for num in range(X, Y+1):
    number_appear_count = [0] * 10
    digits = len(list(str(num)))
    while (num):
        number_appear_count[num % 10] += 1
        num //= 10
    
    interesting = False

    for number_count in number_appear_count:
        if number_count == digits-1:
            interesting = True

    if interesting:
        answer += 1

print(answer)