PROC FORMAT;
VALUE genref 1 = 'masculin' 2 = 'feminin';
RUN;

DATA donnees;
INPUT genre @@;
CARDS;
1 2 2 2 1 2
;
RUN;
PROC PRINT;
FORMAT genre genref.;
RUN;