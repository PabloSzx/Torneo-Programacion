cases = int(input())

lines = []

input()

first_line = True

while(first_line or this_line != "" ):
	first_line = False
	this_line = input()
	lines.append(this_line)

lines.pop(len(lines)-1)
# print(lines)

max_line = 0
min_line = 1000

for i in lines:
	if (len(i) > max_line):
		max_line = len(i)
	if (len(i) < min_line):
		min_line = len(i)

largo = min_line + max_line

### PROCESADO ###

posibles = []

for i in lines:
	for j in lines:
		if (largo == (len(i) + len(j))):
			posibles.append(i+j)

# print(posibles)

cantidadPosibles = {}

for i in posibles:
    cantidadPosibles[i] = 0

for i in posibles:
    cantidadPosibles[i]+=1


for i in range(cases):
    nombre_maximo = ""
    maximo = -1

    for i, j in cantidadPosibles.items():
        if (j > maximo):
            nombre_maximo = i
            maximo = j

    print(nombre_maximo)
    cantidadPosibles.pop(nombre_maximo)
