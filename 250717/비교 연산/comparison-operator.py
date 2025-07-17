# 입력
num1, num2 = map(int, input().split())
# [조건 1] A가 B보다 같거나 큰가?
if num1 >= num2 :
    print(1)
else :
    print(0)
# [조건 2] A가 B보다 큰가?
if num1 > num2 :
    print(1)
else :
    print(0)
# [조건 3] B가 A보다 크거나 같은가?
if num2 >= num1 :
    print(1)
else :
    print(0)
# [조건 4] B가 A보다 큰가?
if num2 > num1 :
    print(1)
else :
    print(0)
# [조건 5] A와 B가 같은가?
if num1 == num2 :
    print(1)
else :
    print(0)
# [조건 6] A와 B가 다른가?
if num1 != num2 : 
    print(1)
else :
    print(0)