import math

def solution(brown, yellow):
    answer = []

    kapes = brown+yellow

    loopRange = math.floor(math.sqrt(kapes))

    for i in range(loopRange, 1, -1):
        if(kapes % i == 0):
            col = i
            row = int(kapes/i)
            if((col-2) * (row-2) == yellow):
                answer.append(row)
                answer.append(col)
                break
    return answer