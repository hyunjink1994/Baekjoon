def solution(operations):
    answer = []
    oper = []
    int_arr =[]
    for i in range(len(operations)):
        tmp_oper, tmp_int = operations[i].split()
        oper.append(tmp_oper)
        int_arr.append(int(tmp_int))

    queueArr = []
    for i in range(len(operations)):
        if(oper[i] == 'I'):
            queueArr.append(int_arr[i])
        elif(oper[i] == 'D'):
            if(len(queueArr) == 0 ):
                continue
            if(int_arr[i] == 1):
                queueArr.remove(max(queueArr))
            elif(int_arr[i] == -1):
                queueArr.remove(min(queueArr))

    if(len(queueArr) == 0):
        answer = [0,0]
        return answer
    answer.append(max(queueArr))
    answer.append(min(queueArr))
    return answer