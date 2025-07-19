# 입력
intN, intM = map(int, input().split())

# 출력
for i in range(1, intN + 1, 1) :
    for j in range(1, intM + 1, 1) :
        print("*", end = " ")
    print("")