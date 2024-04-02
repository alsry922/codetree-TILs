N = int(input())
coords = [
    tuple(map(int, input().split())) for _ in range(N)
]

def area(x1, y1, x2, y2, x3, y3):
    return abs((x1*y2 + x2*y3 + x3*y1) - (y1*x2 + y2*x3 + y3*x1))

max_area = 0
for i in range(N):
    for j in range(N):
        for k in range(N):
            x1, y1 = coords[i]
            x2, y2 = coords[j]
            x3, y3 = coords[k]
            if (x1 == x2 or x2 == x3 or x3 == x1) and \
                (y1 == y2 or y2 == y3 or y3 == y1):
                max_area = max(max_area, 
                                area(x1, y1, x2, y2, x3, y3))

print(max_area)