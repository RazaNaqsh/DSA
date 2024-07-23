def alphaHill(n: int):
    for i in range(1,n+1):
        for j in range(n,i,-1):
            print("*",end=" ")
        for k in range(1,i+1):
            print(chr(64+k),end=" ")
        for l in range(1,i):
            print(chr(64+i-l),end=" ")
        print()
        
def alphaTriangle(n: int):
    for i in range(1,n+1):
        for j in range(i):
            print(chr(64+n-j),end=" ")
        print()

alphaTriangle(3)