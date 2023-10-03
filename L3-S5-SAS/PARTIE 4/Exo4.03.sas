DATA tab;
DO x = 0.01 TO 1 BY 0.01;
	y = log(x);
	OUTPUT tab;
END;
RUN;
PROC PRINT DATA = tab;

DATA tab;
DO i = 1 TO 10; 
	x = rand('binomial', 0.4, 10);
	OUTPUT;
END;
RUN;
PROC PRINT DATA = tab;