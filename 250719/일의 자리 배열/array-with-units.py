# 입력
arrayInt = list(map(int, input().split()))
arrayResult = []

# 반복문
for i in range(8) :
    intSum = arrayInt[i] + arrayInt[i + 1]
    if intSum > 9 : # 두 수의 합이 10 이상일 경우
        intSum -= 10
    arrayInt.append(intSum)

# 출력
for i in range(len(arrayInt)) :
    print(arrayInt[i], end = " ")