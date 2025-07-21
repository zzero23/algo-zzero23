# 입력
intN = int(input())

# 조건문
if (intN % 2 != 0 and intN % 3 == 0) or (intN % 2 == 0 and intN % 5 == 0) :
    print("true")
else :
    print("false")