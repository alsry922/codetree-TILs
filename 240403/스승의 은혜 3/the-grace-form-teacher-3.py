N, B = tuple(map(int, input().split()))
presents = [
    tuple(map(int, input().split())) for _ in range(N)
]

max_count = 0

for i in range(len(presents)):
    discounted_presents = [
        (present[0] // 2, present[1]) if index == i else present for index, present in enumerate(presents)
    ]
    discounted_presents.sort(key=lambda present: (present[0], present[1]))
    sum_cost = 0
    count = 0
    for j in range(len(discounted_presents)):
        if (sum_cost + discounted_presents[j][0] + discounted_presents[j][1] > B):
            break
        sum_cost += (discounted_presents[j][0] + discounted_presents[j][1])
        count += 1
    max_count = max(max_count, count)

print(max_count)