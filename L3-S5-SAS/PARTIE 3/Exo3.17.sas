DATA poids;
SET enfants;
KEEP prenom poids;
PROC SORT DATA = poids;
BY prenom;
PROC PRINT DATA = poids;

DATA taille;
SET enfants;
KEEP prenom taille;
PROC SORT DATA = taille;
BY prenom;
PROC PRINT DATA = taille;

DATA genre;
SET enfants;
KEEP prenom genre;
PROC SORT DATA = genre;
BY prenom;
PROC PRINT DATA = genre;

DATA fusion_by;
MERGE poids taille genre;
BY prenom;
PROC PRINT DATA = fusion_by;
RUN;