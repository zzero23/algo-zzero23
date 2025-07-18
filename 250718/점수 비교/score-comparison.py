# 입력
mathA, engA = map(int, input().split())
mathB, engB = map(int, input().split())

# 조건문
if (mathA > mathB and engA > engB) :
    print("1")
else :
    print("0")