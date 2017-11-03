todo = ""            
while (True):
    a = str(input())
    todo += a
    todo += "\n"
    if (a == "   "):
        break
contador = 0;

resultado = ""
todoSeparado = todo.replace("\n", " ").split(" ")
for i in todoSeparado:
    if ((contador + len(i)) > 72):
        resultado += "\n"
        contador = 0
    resultado += i + " ";
    contador += len(i) + 1

print((resultado[:-1]))



    
