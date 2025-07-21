# 입력
intA = int(input())

# 조건문
if intA % 2 != 0 :
    intA += 3
if intA % 3 == 0 :
    intA /= 3

# 출력
print(int(intA))