PROC FORMAT;
PICTURE teleph other='09 99 99 99 99' (PREFIX='(+33) ');

DATA telephone2;
INPUT tel @@;
CARDS;
0245703265 125643512 123
;
PROC PRINT DATA = telephone;
FORMAT tel teleph.;
RUN;