# 입력
intA, intB = map(int, input().split())

# 연산
intPlus = intA + intB
intMinus = intA - intB

dblShare = intPlus / intMinus

# 출력
print(f"{dblShare:.2f}")