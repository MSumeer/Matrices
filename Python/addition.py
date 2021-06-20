A = [[1,2,3],
    [4,5,6]]
B = [[7,8,9],
    [9,8,7]]
answer = [[0,0,0],[0,0,0]]
y = 0
for a,b in (A,B):
    for i in range(len(a)):
        answer[y][i] = a[i] + b[i]
    y+=1

print(answer)