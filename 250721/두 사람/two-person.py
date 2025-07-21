# 입력
strAge1, strSex1 = input().split()
strAge2, strSex2 = input().split()

# 조건문
if (int(strAge1) >= 19 and strSex1 == "M") or (int(strAge2) >= 19 and strSex2 == "M") :
    print(1)
else :
    print(0)