#큰 수의 법칙

n, m, k = map(int, input().split(" "))
data = list(map(int, input().split(" ")))

data.sort()

count = 0
sum = 0

no1 = data[n-1]
no2 = data[n-2]

while True:
    for i in range(k):
        if(m == 0):
            break
        sum += no1
        m -= 1
    if(m == 0):
        break
    sum += no2
    m -= 1

print(sum)