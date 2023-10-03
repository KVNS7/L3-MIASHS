DATA bruns;
SET enfants;
WHERE cheveux = 1;
PROC PRINT DATA = bruns;

DATA Genre_M;
SET enfants;
WHERE genre = "M";
PROC PRINT DATA = Genre_M;

DATA plus1m60;
SET enfants;
WHERE taille > 160;
PROC PRINT DATA = plus1m60;

DATA brunsMoins150;
SET enfants;
WHERE cheveux = 1 AND taille < 150;
PROC PRINT DATA = brunsMoins150;
RUN;