import itertools

def solution(numbers):
    answer = ''
    str_numbers = [str(x) for x in numbers]
    str_numbers.sort(key=lambda x: x*3, reverse=True)

    return str(int(''.join(str_numbers)))