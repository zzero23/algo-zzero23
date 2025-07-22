# 입력
intA, intB = map(int, input().split())

# 출력
for i in range(intB, intA - 1, -1) :
    print(i, end = " ")