# 입력
intB, intA = map(int, input().split())

# 출력
while intB > intA - 1 :
    if intB % 2 == 0 :
        print(intB, end = " ")
    intB -= 1