line=input()
output=[]
while line!="":
    i,j=map(int, line.split())
    pasos=0
    for x in range(i,j+1):
        cont=1
        while x!=1:
            if x%2==0:
                x/=2
            else:
                x=3*x+1
            cont+=1
        if cont>pasos:
            pasos=cont
    output.append([i,j,pasos])
    line=input()

for i,j,pasos in output:
    print(i,j,pasos)
    
