n, k, T = tuple(input().split())
n, k = (int(n), int(k))
words = [input() for _ in range(n)]

filtered_words = []

for word in words:
    if word.startswith(T):
        filtered_words.append(word)

filtered_words.sort()
print(filtered_words[k-1])