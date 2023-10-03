DATA nomgenre;
SET enfants;
KEEP prenom genre;
PROC PRINT DATA = nomgenre;

DATA nompoids;
SET enfants;
KEEP prenom poids;
PROC PRINT DATA = nompoids;
RUN;