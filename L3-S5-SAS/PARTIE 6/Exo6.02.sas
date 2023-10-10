DATA tab;
DO i = 1 TO 36 BY 2;
	j=i;
	OUTPUT;
END;
PROC PRINT DATA = tab;
FORMAT i date7.;
RUN: