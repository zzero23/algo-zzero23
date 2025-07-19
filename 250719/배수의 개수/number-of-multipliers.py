# 입력
arrayNum = []

for i in range(10) :
    intNum = int(input())
    arrayNum.append(intNum)

intCount3 = 0;
intCount5 = 0;

for i in arrayNum :
    if i % 3 == 0 :
        intCount3 += 1
    if i % 5 == 0 :
        intCount5 += 1
    else :
        continue

print(intCount3, intCount5, sep = " ")