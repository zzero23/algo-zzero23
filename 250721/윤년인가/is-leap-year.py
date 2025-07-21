# 입력
intY = int(input())

# 조건문
if intY % 4 == 0 :
    if intY % 100 == 0 and intY % 400 != 0 :
        print("false")
    else :
        print("true")
else :
    print("false")