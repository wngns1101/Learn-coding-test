#그리디 알고리즘 예제 3-1

# 화폐의 액수
n = int(input())

# 동전의 갯수
a = 0

# 동전 금액
array = [500, 100, 50, 10]

for x in array:
    a += n // x
    n = n % x

print(a)