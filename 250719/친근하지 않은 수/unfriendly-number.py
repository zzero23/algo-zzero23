# 입력
intN = int(input())

# 변수 정의
intCount = 0
# 반복 및 조건문
for i in range(1, intN + 1, 1) :
    if i % 2 == 0 or i % 3 == 0 or i % 5 == 0 :
        continue
    else :
        intCount += 1

# 출력
print(intCount)