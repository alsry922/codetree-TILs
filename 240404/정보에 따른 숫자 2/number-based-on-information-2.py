import sys

T, a, b = tuple(map(int, input().split()))
S = []
N = []
answer = 0

class Alphabet:
    def __init__(self, alpha, pos):
        self.alpha = alpha
        self.pos = pos
    
    def __repr__(self):
        return f'({self.alpha}, {self.pos})'

for i in range(T):
    alpha, pos = input().split()
    if alpha == 'S':
        S.append(Alphabet(alpha, int(pos)))
    else:
        N.append(Alphabet(alpha, int(pos)))

def is_special_num(x):
    minS = sys.maxsize
    minN = sys.maxsize

    for s in S:
        minS = min(minS, abs(x-s.pos))
    
    for n in N:
        minN = min(minN, abs(x-n.pos))
    
    return minS <= minN


for x in range(a, b+1):
    if is_special_num(x):
        answer += 1

print(answer)