import math

def solution(progresses, speeds):
    answer = []

    while(len(progresses) != 0 ):
        requireDays = int(math.ceil((100 - progresses[0]) / speeds[0]))

        k = [x * requireDays for x in speeds]
        progresses = [x+y for x,y in zip(progresses,k)]

        count = 0;
        while(len(progresses) >0 and progresses[0] >= 100):
            count+=1
            progresses.pop(0)
            speeds.pop(0)
        answer.append(count)
    return answer