K, N = tuple(map(int, input().split()))
game_results = [
    tuple(map(int, input().split())) for _ in range(K)
]

count = 0

for i in range(1, N+1):
    for j in range(1, N+1):
        isAlwaysWin = True
        if i == j:
            continue
        for game_result in game_results:
            if game_result.index(i) > game_result.index(j):
                isAlwaysWin = False
                break
        if isAlwaysWin:
            count += 1
            
print(count)