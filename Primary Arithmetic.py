strn,strm=1,2
carry=[]
while strn!="0" and strm!="0":
    strn,strm=map(str, input().split())
    n=[]
    m=[]
    for i in strn:
        n.append(int(i))
    for i in strm:
        m.append(int(i))
    cont=0
    for i in reversed(range(len(n))):
        try:
            if n[i]+m[i]>9:
                cont+=1
                n[i-1]+=(n[i]+m[i])//10
        except IndexError:
                break
    carry.append(cont)

for i in carry[:-1]:
    if i==0:
        print("No carry operation.")
    else:
        print(i,"No carry operations.")
                
