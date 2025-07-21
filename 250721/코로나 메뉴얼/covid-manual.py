# 입력
strState1, strTemp1 = input().split()
strState2, strTemp2 = input().split()
strState3, strTemp3 = input().split()

# 조건문
if strState1 == "Y" and int(strTemp1) >= 37 :
    if (strState2 == "Y" and int(strTemp2) >= 27) or (strState3 == "Y" and int(strTemp3) >= 27) :
        print("E")
    else :
        print("N")
else :
    if (strState2 == "Y" and int(strTemp2) >= 27) and (strState3 == "Y" and int(strTemp3) >= 27) :
        print("E")
    else :
        print("N")