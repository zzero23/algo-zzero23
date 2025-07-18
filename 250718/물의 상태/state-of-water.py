# 입력
water = int(input())

# 조건
if water < 0 :
    print("ice")
elif water >= 100 :
    print("vapor")
elif water >= 0 and water < 100 :
    print("water")