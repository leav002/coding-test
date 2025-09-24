examsu = input()
scorearr = []
avg = 0

scorearr = list(map(int, input().split()))

M = max(scorearr)

for i in range(int(examsu)):
    scorearr[i] = scorearr[i] / M * 100

avg = sum(scorearr) / int(examsu)

print(avg)