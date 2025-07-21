# 입력
intA = int(input())
intB, intC, intD, intE = map(int, input().split())

# 변수 정의
intResult = 0

# 조건문
intResult = 1 if intA > intB else 0
print(intResult)

intResult = 1 if intA > intC else 0
print(intResult)

intResult = 1 if intA > intD else 0
print(intResult)

intResult = 1 if intA > intE else 0
print(intResult)