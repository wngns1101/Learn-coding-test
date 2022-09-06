# 행과 열 입력
case = list(map(int, input().split(" ")))

# 최대값 저장할 변수 초기화
cardmax = 0

#입력받은 값으로 반복문
for x in range(case[0]):
    card = list(map(int, input().split(" ")))
    cardmin = min(card)

#한 행의 최솟값이 최댓값보다 크면 최댓값 바꾸기
    if(cardmin > cardmax):
        cardmax = cardmin

#출력
print(cardmax)