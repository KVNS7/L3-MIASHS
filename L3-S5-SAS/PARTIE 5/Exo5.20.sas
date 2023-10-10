PROC FORMAT;
PICTURE resume low-140='000' (PREFIX = 'petit ') 141-155='0m00' 155-high='000 grand';

DATA donnees;
INPUT taille @@;
CARDS;
132 141 155 189 132 145 172
;
PROC PRINT;
FORMAT taille resume.;
RUN;