def checkOddEven(i,j):
    return (i+j) % 2 == 0
def nBinaryTriangle(n: int) -> None:
    for i in range(1,n+1):
        for j in range(1,i+1):
            print((i+j)%2,end=" ")
        print()

nBinaryTriangle(3)