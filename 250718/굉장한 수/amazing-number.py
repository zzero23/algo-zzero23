# 입력
numN = int(input())

# 조건문
if (numN % 2 != 0 and numN % 3 == 0) or (numN % 2 == 0 and numN % 5 == 0) :
    print("true")
else :
    print("false")
