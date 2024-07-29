import math

def checkPrimeBF(x):
    count = 0 
    for i in range(1,x+1):
        if x % i == 0:
            count += 1
    return count == 2

def checkPrime(x):
    count = 0
    sqrt_n = int(math.sqrt(x))
    for i in range(1,sqrt_n +1):
        if x % i == 0:
            count += 1
            if x//i != i:
                count += 1
    return count ==2
        



print(checkPrime(11))