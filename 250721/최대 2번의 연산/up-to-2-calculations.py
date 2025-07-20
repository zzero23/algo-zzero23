# 입력
intA = int(input())

# 조건문
if intA % 2 == 0 :
    intA //= 2
if intA % 2 != 0 :
    intA = (intA + 1) // 2

# 출력
print(intA)