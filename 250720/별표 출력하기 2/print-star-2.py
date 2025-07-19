# 입력
intN = int(input())

for i in range(intN, 0, -1) :
    for j in range(i, 0, -1) :
        print("*", end = " ") 
    print("")