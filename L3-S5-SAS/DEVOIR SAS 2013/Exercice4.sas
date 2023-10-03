DATA tab1;
INPUT x @1 y;
CARDS;
-2 9 13 11
6
7
;
PROC PRINT DATA = tab1;

/*--------------------------------------------------------------------------*/

DATA tab2;
INPUT x ;
IF x>5 THEN INPUT;
CARDS ;
8 6 2
7 12
4
3
2
;
PROC PRINT DATA = tab2;

/*--------------------------------------------------------------------------*/

Data tab3 ;
x='f';
DO m = 1 TO 4;
end;
x='va6';
output;
x='d18';
PROC PRINT DATA = tab3;

/*--------------------------------------------------------------------------*/

DATA tab4 ;
INPUT x 3.1 y 3.;
CARDS;
72 193
86.2 541
6 81351
;

PROC PRINT DATA = tab4;