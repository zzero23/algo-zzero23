# 입력
intA, intB = map(int, input().split())

# 첫번째 숫자 출력
print(intA, end = " ")

# 반복 및 조건문
while intA < intB :
    if intA % 2 != 0 :
        intA *= 2
        if intA > intB :
            break
        else :
            print(intA, end = " ")
    else :
        intA += 3
        if intA > intB :
            break
        else :
            print(intA, end = " ")
        
    
    