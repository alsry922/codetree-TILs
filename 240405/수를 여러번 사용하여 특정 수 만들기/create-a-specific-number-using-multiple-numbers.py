A, B, C = tuple(map(int, input().split()))

max_sum = 0

for i in range(C+1):
    sum_a = A * i
    if sum_a > C:
        break
    for j in range(C+1):
        sum_b = B * j
        if sum_a + sum_b > C:
            break
        max_sum = max(max_sum, sum_a+sum_b)

print(max_sum)