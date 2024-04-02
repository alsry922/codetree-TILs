N, M, D, S = tuple(map(int, input().split()))
records = [
    tuple(map(int, input().split())) for _ in range(D)
]

patients = [
    tuple(map(int, input().split())) for _ in range(S)
]

cheese = [0] * (D+1)
answer = [False] * (N+1)

for i in range(S):
    patient, time = patients[i]
    answer[patient] = True
    for j in range(D):
        if (records[j][0] == patient and records[j][2] < time):
            cheese[records[j][1]] += 1

for i in range(1, len(cheese)):
    if (cheese[i] == S):
        for j in range(D):
            if (records[j][1] == i):
                answer[records[j][0]] = True

count = 0
for i in range(len(answer)):
    if answer[i]:
        count += 1

print(count)