DATA tab;
INPUT X;
CARDS;
20
30
60
80
120
;
RUN;

Data tab2 ;
PUT n;
SET tab NOBS = n;
PUT n;
STOP;
RUN;

/*--------------------------------------------------------------------------*/

PROC FORMAT;
INVALUE note 'A' = 5 'B' = 4 'C' = 2;

DATA ETUD;
INPUT nom $ (note1-note4) (note.) ;
CARDS;
Etu1 A A C B
;
PROC PRINT DATA = ETUD;