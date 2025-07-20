# 입력
intN = int(input())

# 반복문
for i in range(0, intN + 5, 2) :
    for j in range(0, i + 1, 1) :
        print("*", end = "")
    print("")