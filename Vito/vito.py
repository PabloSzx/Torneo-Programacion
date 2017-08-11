cases = int(input())


def dist(a, b): 
	return abs(a - b)

for i in range(cases):
	line = input()
	
	values = line.split(" ")

	min_street = 30001
	max_street = -1
	
	relatives = values[0]
	values.pop(0)
	
	for j in values:
		if (int(j) > max_street):
			max_street = int(j)
		if (int(j) < min_street):
			min_street = int(j)

	#print(max_street)
	#print(min_street)



	casas = {}

	for j in range(min_street, max_street + 1):
		casas[j] = 0
		

	for j, k in casas.items():
		total = 0
		for l in values:
			total += dist(int(l), int(j))
		
		casas[j] = total

	dist_min_casa = 15000001
	min_casa = -1

	for j, k in casas.items():
		if int(j) < dist_min_casa:
			dist_min_casa = k
			min_casa = j
			
print(min_casa)



				
		
