# 입력
intA, intB = map(int, input().split())

# 연산
intA += intB
intB += intA

# 출력
print(intA, intB, sep = " ")