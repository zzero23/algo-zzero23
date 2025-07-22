intA, intB = map(int, input().split())

for i in range(intA, intB+1, 1) :
    if i % 2 != 0 :
        print(i, end = " ")
    else :
        continue