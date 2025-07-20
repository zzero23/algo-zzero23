# 입력
intHeight, intWeight = map(int, input().split())

# 연산
intBMI = int((10000 * intWeight) / intHeight ** 2)

# 출력
print(intBMI)

# 조건문
if intBMI >= 25 :
    print("Obesity")