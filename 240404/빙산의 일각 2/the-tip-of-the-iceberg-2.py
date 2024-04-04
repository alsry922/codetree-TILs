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
    for index, height in enumerate(sink_glacier_heights):
        if index == 0 and height > 0:
            count = 1
        
        if height > 0 and sink_glacier_heights[index-1] <= 0:
            count += 1
        # elif height <= 0 and sink_glacier_heights[index-1] > 0:
        #     count += 1
    answer = max(answer, count)

print(answer)