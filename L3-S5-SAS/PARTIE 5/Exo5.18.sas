PROC FORMAT;
PICTURE resume low-140='petit' 141-155='moyen' 155-high='grand';

DATA donnees;
INPUT taille @@;
CARDS;
132 141 155 189 132 145 172
;
PROC PRINT;
FORMAT taille resume.;
RUN;