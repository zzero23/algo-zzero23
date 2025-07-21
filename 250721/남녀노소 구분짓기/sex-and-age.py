# 입력
intSex = int(input())
intAge = int(input())

if intSex == 0 : # 남자
    if intAge >= 19 : # 성인
        print("MAN")
    else :
        print("BOY")    
else :
    if intAge >= 19 :
        print("WOMAN")
    else :
        print("GIRL")