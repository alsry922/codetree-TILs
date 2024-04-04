N = int(input())
glacier_height = [
    int(input()) for _ in range(N)
]

answer = 0

for ocean_height in range(1, 1001):
    sink_glacier_heights = [
        height - ocean_height for height in glacier_height
    ]
    count = 0
    if sink_glacier_heights[0] > 0:
        count += 1
    for i in range(1, len(sink_glacier_heights)):
        if sink_glacier_heights[i] > 0 and sink_glacier_heights[i - 1] <= 0:
            count += 1

    answer = max(answer, count)

print(answer)