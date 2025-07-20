# 입력
intN = int(input())

# 반복문
for i in range(1, intN + 1, 1) :
    intA, intB = map(int, input().split())
    
    # 변수 정의
    intTotal = 0;

    for j in range(intA, intB + 1, 1) :
        if j % 2 == 0 :
            intTotal += j
        else :
            continue
    print(intTotal)