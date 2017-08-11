def reverse_add(str_x, count):
    global pal
    str_rev_x=""
    for i in reversed(str_x):
        str_rev_x+=i
    x, rev_x = int(str_x), int(str_rev_x)
    suma=str(x+rev_x)
    rev_suma=""
    for i in reversed(suma):
        rev_suma+=i
    count+=1
    if suma==rev_suma:
        pal=[suma, count]
    else:
        reverse_add(suma,count)
    
       
palyndroms=[]
cases=int(input())
for case in range(cases):
    n=str(input())
    pal=[]
    reverse_add(n,0)
    palyndroms.append(pal)

for i in palyndroms:
    print(i[1],i[0])
