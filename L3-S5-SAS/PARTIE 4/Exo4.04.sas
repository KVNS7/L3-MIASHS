DATA tab;
DO i = 1 to 2000000;
	OUTPUT;
END;

DATA tab2;
DO i = 1 to 1000;
	OUTPUT;
END;

DATA tab3;
SET tab tab2;
RUN;

PROC APPEND BASE = tab DATA = tab2;
RUN;


RUN;