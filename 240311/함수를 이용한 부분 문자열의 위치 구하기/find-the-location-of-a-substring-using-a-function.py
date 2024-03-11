string = input()
target = input()

def contains_target(target):
    if target in string:
        return string.find(target)
    return -1

print(contains_target(target))