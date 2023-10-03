DATA tab;
INFILE "/home/u63575294/Exo/DEVOIR SAS 2013/file.txt" DLM = "," FIRSTOBS = 2;
INPUT t1-t3;
RUN;
PROC PRINT DATA = tab;

/*--------------------------------------------------------------------------*/

DATA tab;
INPUT X Y;
CARDS;
2 1
9 2
38 3
27 4
74 10
;
PROC PRINT DATA = tab;

/*--------------------------------------------------------------------------*/

DATA tab2; /*MA METHODE*/
Somme = 0;
DO i = 1 TO B;
	SET TAB NOBS = B POINT = i ;
	Somme = Somme + Y;
END;
OUTPUT;
KEEP Somme;
STOP;
PROC PRINT DATA = tab2;


DATA tab2; /*METHODE CORRIGÉ*/
SET tab;
y2 + y;
KEEP y2;
PROC PRINT DATA = tab2;

/*--------------------------------------------------------------------------*/

DATA tab3;
Array c{8} X1-X8;
DO i = 1 TO 8;
	DO j = 1 TO 8;
		c{j} = log(i+j);
		END;
	OUTPUT;
END;
PROC PRINT DATA = tab3;

