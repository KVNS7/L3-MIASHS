DATA Tab2;
DO obsnum = 1 TO num BY 2;
	SET tab NOBS = num POINT = obsnum;
	OUTPUT;
END;
STOP;
PROC PRINT DATA = Tab2;


DATA Tab3;
a = 3;
SET tab POINT = a;
OUTPUT;
STOP;
PROC PRINT DATA = Tab3;


DATA Tab4;
a = 2;
SET tab POINT = a;
OUTPUT;
a = 3;
SET Tab2 POINT = a;
OUTPUT;
STOP;
PROC PRINT DATA = Tab4;



DATA Tab5;
SET tab NOBS = num POINT = obsnum;
DO i = num TO 1 BY -1;
	SET tab POINT = i;
	OUTPUT;
END;
STOP;
PROC PRINT DATA = Tab5 (KEEP = x);
RUN;