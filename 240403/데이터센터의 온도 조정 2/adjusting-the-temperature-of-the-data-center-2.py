N, C, G, H = tuple(map(int, input().split()))
temper_for_inst = [
    tuple(map(int, input().split())) for _ in range(N)
]

def get_work_load(temper, low, high):
    if temper < low:
        return C
    if low <= temper and temper <= high:
        return G
    if temper > high:
        return H

answer = 0

for temper in range(1001):
    sum_work_load = 0
    for j in range(N):
        low, high = temper_for_inst[j]
        work_load = get_work_load(temper, low, high)
        sum_work_load += work_load
    answer = max(answer, sum_work_load)

print(answer)