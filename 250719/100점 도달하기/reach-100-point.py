# 입력
intScore = int(input())

# 반복 및 조건문
for i in range(intScore, 101, 1) :
    if i >= 90 :
        print("A", end = " ")
    elif i >= 80 :
        print("B", end = " ")
    elif i >= 70 :
        print("C", end = " ")
    elif i >= 60 :
        print("D", end = " ")
    else :
        print("F", end = " ")