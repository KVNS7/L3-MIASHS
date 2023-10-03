PROC GCHART DATA = enfants;
PIE cheveux / DISCRETE VALUE = INSIDE SLICE = OUTSIDE;


PROC SORT DATA = enfants;
BY genre;
PROC GCHART DATA = enfants;
VBAR poids;
BY genre;

