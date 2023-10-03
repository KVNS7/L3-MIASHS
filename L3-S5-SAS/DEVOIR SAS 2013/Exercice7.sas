DATA tab1;
DO i = 1 TO 20;
	IF MOD(i,2) = 1 THEN X = 1;
	ELSE X = 2;
	OUTPUT;
END;
KEEP X;
PROC PRINT DATA = tab1;

/*--------------------------------------------------------------------------*/

DATA tab2;
OUTPUT;
y = 2;
SET tab1;
OUTPUT;

PROC PRINT DATA = tab2;

/*--------------------------------------------------------------------------*/

DATA tab3;
SET tab1;
y + x;
z = z + x;

PROC PRINT DATA = tab3;