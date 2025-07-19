# 입력
strBundle = input().split()
strVoca1 = strBundle[0]
strVoca2 = strBundle[1]

# 단어 길이 계산
intLenVoca1 = len(strVoca1)
intLenVoca2 = len(strVoca2)

# 단어 길이 비교
if intLenVoca1 > intLenVoca2 :
    print(strVoca1, intLenVoca1, sep = " ")
elif intLenVoca2 > intLenVoca1 :
    print(strVoca2, intLenVoca2, sep = " ")
else :
    print("same")