cases = input()

lines = []

input()

first_line = True

while(first_line or this_line != "" ):
	first_line = False
	this_line = input()
	lines.append(this_line)

lines.pop(len(lines)-1)
print(lines)

max_line = 0
min_line = 1000

for i in lines:
	if (len(i) > max_line):
		max_line = len(i)
	if (len(i) < min_line):
		min_line = len(i)

#print(str(max_line) + " " + str(min_line))

largo = min_line + max_line

### PROCESADO ###

posibles = []

for i in lines:
	for j in lines:
		if (largo == (len(i) + len(j))):
			posibles.append(i+j)

print(posibles)

for i in posibles:
	if 
