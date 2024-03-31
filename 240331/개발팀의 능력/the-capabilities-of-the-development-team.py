import sys

developers = list(map(int, input().split()))
total_sum = sum(developers)
min_diff = sys.maxsize

def get_diff(i, j, k):
    return_value = sys.maxsize

    team1 = developers[i]
    team2 = developers[j] + developers[k]
    team3 = total_sum - team1 - team2

    if (team1 == team2 or team2 == team3 or team1 == team3):
        return return_value
    
    ret = abs(team1 - team2)
    ret = max(ret, abs(team2 - team3))
    ret = max(ret, abs(team3 - team1))

    return ret

for i in range(len(developers)):
    for j in range(i+1, len(developers)):
        for k in range(j+1, len(developers)):
            min_diff = min(min_diff, get_diff(i, j, k))

if (min_diff == sys.maxsize):
    print(-1)
else:
    print(min_diff)