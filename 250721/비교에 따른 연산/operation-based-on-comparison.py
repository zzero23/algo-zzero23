# 입력 
intA, intB = map(int, input().split())

# 조건문
if intA > intB :
    print(intA * intB)
else :
    print(intB // intA)