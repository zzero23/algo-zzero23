# 입력
intA, intB = map(int, input().split())

intResult = 0

# 조건문
if intA > intB :
    intResult = intA - intB
else : 
    intResult = intB - intA

# 출력
print(intResult)