import itertools

def solution(nums):
    answer = 0
    numSet = list(set(nums))

    c = int(len(nums)/2)

    if(c > len(numSet)):
        return len(numSet)
    else:
        return c