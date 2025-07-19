# 입력
str1 = input()

# 문자 대체
strChange = str1[:1] + "a" + str1[2:-2] + "a" + str1[-1]
print(strChange)