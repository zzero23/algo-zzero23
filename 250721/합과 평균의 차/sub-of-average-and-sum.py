# 입력 
intA, intB, intC = map(int, input().split())

# 연산
intPlus = intA + intB + intC
intAverage = int(intPlus / 3)
intMinus = intPlus - intAverage

# 출력
print(f"{intPlus}\n{intAverage}\n{intMinus}")