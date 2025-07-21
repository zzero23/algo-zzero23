# 입력
intAmath, intAeng = map(int, input().split())
intBmath, intBeng = map(int, input().split())

# 조건문
if intAmath > intBmath :
    print("A")
elif intAmath == intBmath :
    if intAeng > intBeng :
        print("A")
    else :
        print("B")
else :
    print("B")