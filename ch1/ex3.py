# 시간 복잡도 예제 O(N*N)표기법

array = [3, 5, 1, 2, 4]
temp = 0

for i in array:
    for j in array:
        temp = i * j
        print(temp)