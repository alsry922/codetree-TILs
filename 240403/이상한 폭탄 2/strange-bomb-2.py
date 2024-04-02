N, K = tuple(map(int, input().split()))
bombs = [
    int(input()) for _ in range(N)
]

max_num_of_bomb = -1
for index, target_bomb in enumerate(bombs):
    for j in range(len(bombs)):
        if j == index:
            continue
        if target_bomb != bombs[j]:
            continue
        if abs(index - j) <= K:
            max_num_of_bomb = max(max_num_of_bomb, bombs[j])

print(max_num_of_bomb)