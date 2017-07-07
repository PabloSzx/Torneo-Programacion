
mat[][]
pn[][] //inicializar con ceros



public void 
for (int i= 0; i<mat.length; i++){
	for (int j = 0; j<mat[i].length; j++){
		if (mat[i][j] == "*"){
			pn[i][j] = -300;
			pn[i][j-1]++;
			pn[i][j+1]++;
			pn[i+1][j]++;
			pn[i-1][j]++;
			pn[i-1][j-1]++;
			pn[i-1][j+1]++;
			pn[i+1][j-1]++;
			pn[i+1][j+1]++;
		}
	}
}

