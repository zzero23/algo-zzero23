# 입력 
intA, intB = map(int, input().split())

# 위치 교환
intA, intB = intB, intA

# 출력
print(intA, intB, sep = " ")