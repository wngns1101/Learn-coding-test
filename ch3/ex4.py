# n, k 입력
n, k = map(int, input().split(" "))

# 갯수를 셀 변수 count 선언
count = 0

# n이 1이 될 때까지 무한 반복
while True:

# n이 1이면 탈출
    if(n == 1):
        break

# n이 k의 제곱이면 n을 k로 나누고 카운트 증가
    if(n % k == 0):
        n = n / k
        count += 1

# n이 k의 제곱이 아니라면 n-1을 하고 카운트 증가
    else:
        n = n-1
        count += 1
# 카운트 출력
print(count)