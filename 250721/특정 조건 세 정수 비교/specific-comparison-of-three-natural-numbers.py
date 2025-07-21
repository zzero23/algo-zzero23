# 입력
intA, intB, intC = map(int, input().split())

# 최소값 찾기
intMin = 0;

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

# 조건문 1
if intA == intMin :
    print(1, end = " ")
else :
    print(0, end = " ")

# 조건문 2
if intA == intB == intC :
    print(1)
else :
    print(0)