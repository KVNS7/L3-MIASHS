DATA tab;
a = PROBT(1.4, 4);
PROC PRINT DATA = tab;

DATA tab;
DO i = 5 TO 20;
	a = PROBT(1, i);
	OUTPUT;
END;
PROC PRINT DATA = tab;
RUN;