# 입력
intA, intB, intC = map(int, input().split())

# 변수 정의
intMin = 0

# 최소값 찾기
if intA > intB :
    if intB > intC :
        intMin = intC
    else :
        intMin = intB
else :
    if intA > intC :
        intMin = intC
    else :
        intMin = intA

# 출력
print(intMin)