PROC FORMAT;
	PICTURE phonenum other = '90 00 00 00 00';
	
DATA telephone;
INPUT tel @@;
CARDS;
0245703265 125643512 123
;
PROC PRINT DATA = telephone;
FORMAT tel phonenum.;
RUN;