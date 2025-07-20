start, end = map(int, input().split())


intCount3 = 0;

# 반복문
for i in range(start, end+1, 1) :
    # 약수 개수 변수
    intCount = 0;

    for j in range(1, i+1, 1) :
        if i % j == 0 :
            intCount += 1
        else :
            continue

    if intCount == 3 :
        intCount3 += 1
    else :
        continue

print(intCount3)
