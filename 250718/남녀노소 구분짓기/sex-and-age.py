# 입력
gender = int(input())
age = int(input())

# 조건문
if gender == 0 : # 남자
    if age >= 19 :
        print("MAN")
    else :
        print("BOY")
else : # 여자
    if age >= 19 :
        print("WOMAN")
    else :
        print("GIRL")
