# 입력
intMid, intFin = map(int, input().split())

# 변수 정의
intMoney = 0

# 조건문
if intMid >= 90 :
    if intFin >= 95 :
        intMoney = 100000
    elif intFin >= 90 :
        intMoney = 50000
    else :
        intMoney = 0

# 출력
print(intMoney)