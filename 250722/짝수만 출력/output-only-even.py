# 입력
intA, intB = map(int, input().split())

# 출력
while intA < intB + 1 :
    if intA % 2 == 0 :
        print(intA, end = " ")
    intA += 1