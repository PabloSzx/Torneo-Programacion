n=input()
lenght=[]
while n!="":
    ones="1"
    while int(ones)%int(n)!=0:
        ones=ones+"1"
    lenght.append(len(ones))
    n=input()

for l in lenght:
    print(l)
    
