DATA tab;
SET tab;
LABEL x1 = "lab1" x2 = "lab2";
INPUT code $ x1 1. x2 1. x3 1.;
CARDS;
trh 562 divers
keza2 654 vom
;
PROC PRINT DATA = tab LABEL;
RUN;

/*--------------------------------------------------------------------------*/

DATA tab2;
SET tab;
KEEP code x1;
WHERE x2 > 3;
PROC PRINT DATA = tab2;


DATA tab3;
SET tab;
KEEP code x2;
PROC PRINT DATA = tab3;

/*--------------------------------------------------------------------------*/

PROC SORT DATA = tab2;
BY code;
PROC SORT DATA = tab3;
BY code;

DATA tab4;
MERGE tab2 (IN = A) tab3;
BY code;
IF A;
PROC PRINT DATA = tab4;

/*--------------------------------------------------------------------------*/

DATA T5 T6 T7;
SET tab;
WHERE (x2 > 5);
SELECT (x1);
WHEN(5) OUTPUT T5;
WHEN(6) OUTPUT T6;
WHEN(7) OUTPUT T7;
OTHERWISE;
END;

PROC PRINT DATA = T5;
PROC PRINT DATA = T6;
PROC PRINT DATA = T7;







