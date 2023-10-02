PROC SORT DATA = enfants;
BY cheveux;
PROC PRINT DATA = enfants;
BY cheveux;
RUN;