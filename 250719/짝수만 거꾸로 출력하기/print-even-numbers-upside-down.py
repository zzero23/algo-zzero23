# 입력
intCount = int(input())
arrayInt = list(map(int, input().split()))

for i in range(intCount-1, -1, -1) :
    if arrayInt[i] % 2 == 0 :
        print(arrayInt[i], end = " ")