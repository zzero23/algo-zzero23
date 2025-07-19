# 입력
intCount = int(input())
arrayInt = list(map(int, input().split()))

# 반복문
for i in range(0, intCount, 1) :
    intResult = arrayInt[i] ** 2
    print(intResult, end = " ")