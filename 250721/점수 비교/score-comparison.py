# 입력
intAmath, intAeng = map(int, input().split())
intBmath, intBeng = map(int, input().split())

# 조건문
if (intAmath > intBmath) and (intAeng > intBeng) :
    print(1)
else :
    print(0)