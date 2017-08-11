state=[]
n=int(input())
while n>0:
    if (n**0.5)%1==0:
        state.append(1)
    else:
        state.append(0)
    n=int(input())
    
for s in state:
    if s==0:
        print("no")
    else:
        print("yes")
            
