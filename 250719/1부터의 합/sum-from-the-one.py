# 입력
intN = int(input())

# 변수
intSum = 0

# 반복 및 조건문
for i in range(1, 101, 1) :
    intSum += i
    if intSum >= intN :
        print(i)
        break