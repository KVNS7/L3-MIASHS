DATA Tab;
DO i = 1 TO 400;
	x = RANNOR(3);
	OUTPUT;
END;
PROC PRINT DATA = Tab;

PROC GCHART DATA = Tab;
VBAR x;
RUN;

/*--------------------------------------------------------------------------*/

DATA Tab;
SET Tab;
y = 0;
	IF x > 0 THEN y = log(x);
	ELSE y = 0;
PROC PRINT DATA = Tab;

/*--------------------------------------------------------------------------*/

DATA Tab2;
SET tab;
OUTPUT;
IF x > 0.1 THEN OUTPUT;
PROC PRINT DATA = Tab2;
RUN;