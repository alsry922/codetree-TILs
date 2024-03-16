class Forecast:
    def __init__(self, date, day, weather):
        self.date = date
        self.day = day
        self.weather = weather

length = int(input())
arr = [tuple(input().split()) for _ in range(length)]
forecast = [Forecast(date, day, weather) for date, day, weather in arr]
rainDay = [Forecast(date, day, weather) for date, day, weather in arr if weather == 'Rain']

min_idx = 0
for i in range(len(rainDay)):
    if (rainDay[i].date < rainDay[min_idx].date):
        min_idx = i
    
print(rainDay[min_idx].date, rainDay[min_idx].day, rainDay[min_idx].weather)