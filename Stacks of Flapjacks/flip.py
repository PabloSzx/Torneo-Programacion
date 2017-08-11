pila = input()
lista_pila = pila.split();
lista_pila = transformar_lista(lista_pila)

lista_pila_duplicada = duplicar_lista(lista_pila)

ordenado = True
while (ordenado):

    indice = lista_pila.index(max(lista_pila))
    if (indice != (len(lista_pila) - 1) or indice != 0):
        lista_pila = flip(lista_pila, indice)







def maximo(lista, mx):
    


def flip(lista_pila, indice):
    aux = []

    lista_pila_aux = duplicar_lista(lista_pila)

    for i in reversed(range(indice)):
        aux.append(lista_pila_aux[i])

    j = 0;
    for i in range(indice):
        lista_pila_aux[i] = aux[j]
        j+=1

    return lista_pila_aux

def transformar_lista(lista):
    aux = []
    for i in lista:
        aux.append(int(i))

    return aux

def duplicar_lista(lista):
    return lista[:]
