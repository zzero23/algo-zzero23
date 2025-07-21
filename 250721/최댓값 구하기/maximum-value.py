# 입력
intA, intB, intC = map(int, input().split())

# 조건문
if intA > intB :
    if intA > intC :
        print(intA)
    else :
        print(intC)
else :
    if intB > intC :
        print(intB)
    else :
        print(intC)