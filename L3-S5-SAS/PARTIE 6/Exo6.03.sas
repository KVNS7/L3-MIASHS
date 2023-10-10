DATA tab;
INPUT date :date7. @@;
CARDS;
8jan89 7feb54 22mar60 15apr73 29may75 28jun00
5jul23 7aug17 2sep4 19oct81 30nov98 13dec61
;
PROC PRINT DATA = tab;
FORMAT date date9.;

DATA tab2;
DO i = 1 TO 365 BY 31;
	OUTPUT;
END;
PROC PRINT DATA = tab2;
FORMAT i date7.;
RUN;