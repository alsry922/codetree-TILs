n = int(input())
word_list = [input() for _ in range(n)]

sorted_word_list = sorted(word_list)

for ele in sorted_word_list:
    print(ele)