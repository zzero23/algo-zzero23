# 입력
numA, numB, numC = map(int, input().split())

midNum = 0
# B A C
# 조건문
if numA > numB :
    if numB > numC :
        midNum = numB
    elif numA > numC :
        midNum = numC
    else :
        midNum = numA
else : 
    if numA > numC :
        midNum = numA
    elif numB > numC :
        midNum = numC
    else :
        midNum = numB

print(midNum)