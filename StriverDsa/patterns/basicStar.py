
def pattern1(n):
    for i in range(n):
        for j in range(n):
            print("*",end=" ")
        print(" ")

def main():
    pattern1(5)

main()