import sys

developers = list(map(int, input().split()))
total_sum = sum(developers)
min_diff = sys.maxsize

def get_diff(i, j, k, l):
    team1 = developers[i] + developers[j]
    team2 = developers[k] + developers[l]
    team3 = total_sum - team1 - team2

    ret = abs(team1 - team2)
    ret = max(ret, abs(team2 - team3))
    ret = max(ret, abs(team1 - team3))

    return ret

for i in range(len(developers)):
    for j in range(i+1, len(developers)):
        for k in range(len(developers)):
            for l in range(k+1, len(developers)):
                if (k == i or k == j or l == i or l == j):
                    continue
                min_diff = min(min_diff, get_diff(i, j, k, l))

print(min_diff)