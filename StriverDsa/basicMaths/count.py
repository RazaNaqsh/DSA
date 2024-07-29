class Solution:
    def evenlyDivides (self, N):
        count = 0
        original= N
        while N > 0 :
            digit = N % 10
            if digit != 0 and original % digit == 0:
                count += 1
            N = N // 10
        return count

