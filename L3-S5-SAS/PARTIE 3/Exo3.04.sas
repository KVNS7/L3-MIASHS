DATA bruns;
SET enfants;
WHERE cheveux = 1;
RUN;

DATA garcons;
SET enfants;
WHERE genre = 'M';
RUN;

DATA mini_1m60;
SET enfants;
WHERE taille > 160;
RUN;

DATA brun_max_1m50;
SET enfants;
WHERE cheveux =1 AND taille < 150;
RUN;
