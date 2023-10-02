DATA poids;
SET enfants;
KEEP prenom poids;
PROC SORT DATA=poids;
BY prenom;
PROC PRINT; RUN;

DATA taille;
SET enfants;
KEEP prenom taille;
PROC SORT DATA=taille;
BY prenom;
PROC PRINT; RUN;

DATA genre;
SET enfants;
KEEP prenom genre;
PROC SORT DATA=genre;
BY prenom;
PROC PRINT; RUN;

DATA fusion_BY;
merge poids taille genre;
BY prenom; RUN;
PROC PRINT; RUN;