# armstrong number is when you count the digit of numbers and their sum of power to the number of digit is same as the original number
def armstrong(x):
    arm = 0
    original = x 
    num = len(str(x))
    while x>0:
        digit = x%10
        arm +=  digit ** num
        x //= 10
    print(arm)
    return original == arm

print(armstrong(153))