# 입력
intRow, intCol = map(int, input().split())

# 연산
intRow += 8
intCol *= 3
intExtent = intRow * intCol

# 출력 
print(f"{intRow}\n{intCol}\n{intExtent}")