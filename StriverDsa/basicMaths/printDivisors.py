import math

def printDivisorsBF(x):
    divisors = []
    for i in range(1,x+1):
        if x % i == 0:
            divisors.append(i)
    print(divisors)

def printDivisors(x):
    sqrt_n = int(math.sqrt(x))
    divisors = []
    for i in range(1,sqrt_n + 1):
        if x % i == 0:
            divisors.append(i)
            if (x//i) != i:
                divisors.append(x//i)
        divisors.sort()
    print(divisors)
    
printDivisors(36)