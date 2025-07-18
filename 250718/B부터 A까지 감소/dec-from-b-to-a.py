# 입력
num1, num2 = map(int, input().split())

# 반복문
for i in range(num2, num1 - 1, -1) :
    print(i, end = " ")