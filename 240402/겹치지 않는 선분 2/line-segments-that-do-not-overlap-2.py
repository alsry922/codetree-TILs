OFFSET = 1000000
N = int(input())
starts = []
ends = []

for i in range(N):
    x1, x2 = tuple(map(int, input().split()))
    starts.append((x1, 0))
    ends.append((x2, 1))

answer = 0
for i in range(N):
    isSuccess = True
    targetStartX, targetStartY = starts[i]
    targetEndX, targetEndY = ends[i]
    for j in range(N):
        if i == j:
            continue
        currStartX, currStartY = starts[j]
        currEndX, currEndY = ends[j]
        if ((currStartX < targetStartX and targetEndX < currEndX) or \
                (targetStartX < currStartX and currEndX < targetEndX)):
                    isSuccess = False
                    break
    if (isSuccess):
        answer += 1


print(answer)