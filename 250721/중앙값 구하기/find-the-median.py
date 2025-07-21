# 입력
intA, intB, intC = map(int, input().split())

#조건문
if intA > intB :
    if intB > intC :
        print(intB)
    else :
        if intC > intA :
            print(intA)
        else :
            print(intC)
else :
    if intA > intC :
        print(intA)
    else :
        if intC > intB :
            print(intB)
        else :
            print(intC)