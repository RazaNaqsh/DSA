def getNumberPattern(n: int) -> None:
    size = 2*n-1
    for i in range(size):
        for j in range(size):
            top = i
            left = j
            right = size - j - 1
            bottom = size - i - 1
            min_dist = min(top,bottom,right,left)
            print(n-min_dist,end="")
        print()

getNumberPattern(4)