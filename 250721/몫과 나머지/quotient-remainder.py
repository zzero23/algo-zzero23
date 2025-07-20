# 입력
intA, intB = map(int, input().split())

# 연산
intShare = intA // intB
intRemain = intA % intB

# 출력
print(f"{intShare}...{intRemain}")