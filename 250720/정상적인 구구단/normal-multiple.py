# 입력
intN = int(input())

# 반복문
for i in range(1, intN + 1, 1) :
    for j in range(1, intN + 1, 1) :
        if j == intN :
            print(f"{i} * {j} = {i*j}", end = " ")
        else :
            print(f"{i} * {j} = {i*j}", end = ", ")
    print("")