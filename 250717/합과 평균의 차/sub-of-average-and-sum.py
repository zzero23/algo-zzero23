# 입력
a, b, c = map(int, input().split())
# 연산
sum1 = a + b + c
avg = int(sum1 / 3)
result = int(sum1 - avg)
# 출력
print(f"{sum1}\n{avg}\n{result}")