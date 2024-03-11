word1 = input()
word2 = input()

def equal():
    if len(word1) != len(word2):
        return 'No'

    sorted_word1 = sorted(word1)
    sorted_word2 = sorted(word2)
    for ele1, ele2 in zip(sorted_word1, sorted_word2):
        if (ele1 != ele2):
            return 'No'
    return 'Yes'

print(equal())