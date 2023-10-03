DATA tab;
INPUT X Y;
CARDS;
2 8 
4 99
12 200
1 400
6 28
12 49
100 1000
;
PROC PRINT DATA = tab;
RUN;

/*-----------------------------MA SOLUTION---------------------------------------------*/

DATA tab2;
SET tab;
WHERE (X > 3);
IF (Y > 100) THEN OUTPUT;


PROC PRINT DATA = tab2;
RUN;

DATA tab3;
SET tab;
WHERE (X > 5);
IF (Y <= 100) THEN OUTPUT;


PROC PRINT DATA = tab3;
RUN;

/*-------------------------------SOLUTION CORRECTION-----------------------------------*/

Data tab2 tab3 ;
set tab ; where X>3 ;
select ;
when(Y>100) output tab2 ;
when(X>5) output tab3 ; otherwise ; end ;
PROC PRINT DATA = tab2;
PROC PRINT DATA = tab3;