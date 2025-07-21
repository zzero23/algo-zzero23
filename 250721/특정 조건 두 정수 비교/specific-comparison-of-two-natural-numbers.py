# 입력
intA, intB = map(int, input().split())

# 변수 정의
intCase1 = 0;
intCase2 = 0;

# 조건문
if intA < intB :
    intCase1 = 1;
else : 
    intCase1 = 0;

if intA == intB :
    intCase2 = 1;
else :
    intCase2 = 0;

# 출력
print(intCase1, intCase2, sep = " ")