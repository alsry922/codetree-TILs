N = int(input())
simulations = [
    list(map(int, input().split())) for _ in range(N)
]

max_score = 0
for i in range(1, 4):
    stones = [False] * 4
    stones[i] = True
    score = 0
    for simulate in simulations:
        a, b, c = simulate
        stones[a], stones[b] = stones[b], stones[a]
        if stones[c]:
            score += 1
    max_score = max(max_score, score)

print(max_score)