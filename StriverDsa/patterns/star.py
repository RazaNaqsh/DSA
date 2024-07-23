def nStarTriangle(n: int) -> None:
    for i in range(1,n+1):
        for j in range(n-i):
            print(" ",end="")
        for k in range(2*i-1):
            print("*",end="")
        print(" ")
    
def nStarTriangle2(n: int) -> None:
    for i in range(1,n+1):
        for k in range(1,i):
            print(" ",end="")
        for j in range((2*n)-(2*i)+1):
            print("*",end="")
        print()
        
nStarTriangle2(3)