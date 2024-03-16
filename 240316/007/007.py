code, place, time = input().split()

class Spy:
    def __init__(self, code, place, time):
        self.code = code
        self.place = place
        self.time = time

spy = Spy(code, place, time)
print('secret code :', spy.code)
print('meeting point :', spy.place)
print('time :', spy.time)