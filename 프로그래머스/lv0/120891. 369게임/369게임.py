def solution(order):
    result = 0
    order = list(str(order))
    for i in range(len(order)):
        if order[i] == '3' or order[i] == '6' or order[i] == '9':
            result += 1
    return result