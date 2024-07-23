def numberCrown(n: int) -> None:
    for i in range(1,n+1):
        for j in range(1,i+1):
            print(j,end=" ")
        spaces = 2 * (n - i)
        for _ in range(spaces):
            print(" ", end=" ")
        # Print the decreasing sequence
        for j in range(i, 0, -1):
            print(j, end=" ")
        print()
numberCrown(3)