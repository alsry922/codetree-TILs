class Agent:
    def __init__(self, codename, score):
        self.codename = codename
        self.score = score

agents = []
for _ in range(5):
    codename, score = input().split()
    agents.append(Agent(codename, int(score)))

min_val = 100
min_agent = None

for ele in agents:
    if ele.score < min_val:
        min_agent = ele
        min_val = min_agent.score

print(min_agent.codename, min_agent.score)