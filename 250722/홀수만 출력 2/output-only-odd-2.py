# 입력
intB, intA = map(int, input().split())

# 출력
for i in range(intB, intA - 1, -1) :
    if i % 2 != 0 :
        print(i, end = " ")
    else :
        continue