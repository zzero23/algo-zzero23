# 입력
intA, intB = map(int, input().split())

# 변수 정의
intTotal = 0

# 반복 및 조건문
for i in range(intA, intB + 1, 1) :
    if i % 2 == 0 :
        intTotal += i
    else : 
        continue

print(intTotal)