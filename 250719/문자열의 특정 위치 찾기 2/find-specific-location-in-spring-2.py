# 배열
arrFruit = ["apple", "banana", "grape", "blueberry", "orange"]

# 변수
intCount = 0

# 입력
char1 = input()

# 반복 및 조건문
for i in arrFruit :
    if i[2] == char1 or i[3] == char1 :
        print(i)
        intCount += 1
    else :
        continue

# 출력
print(intCount)