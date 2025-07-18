# 입력
numY = int(input())
# 조건문
if numY % 4 == 0 :
    if numY % 100 != 0 and numY % 400 != 0 :
        print("true")
    else :
        print("false")
else :
    print("false")