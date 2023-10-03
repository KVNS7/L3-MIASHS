DATA tab;
x = PROBBNML(0.8, 60, 32);
PROC PRINT DATA = tab;

DATA tab;
x = 1 - PROBBNML(0.8, 60, 57);
PROC PRINT DATA = tab;



DATA tab;
DO i = 0 TO 20;
	x = PROBBNML(0.6, 20, i);
	OUTPUT;
END;
PROC PRINT DATA = tab;
RUN;