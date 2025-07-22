# 입력
intN = int(input())

# 변수 정의
intCount = 1
# 출력
while intCount < intN + 1 :
    if intCount % 3 == 0 :
        print(intCount, end = " ")
    intCount += 1