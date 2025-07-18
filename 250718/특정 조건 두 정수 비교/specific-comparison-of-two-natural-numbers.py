# 입력
num1, num2 = map(int, input().split())

# 조건문 1
if num1 < num2 :
    result1 = 1
else :
    result1 = 0

# 조건문 2
if num1 == num2 :
    result2 = 1
else :
    result2 = 0

# 출력
print(result1, result2, sep = " ")