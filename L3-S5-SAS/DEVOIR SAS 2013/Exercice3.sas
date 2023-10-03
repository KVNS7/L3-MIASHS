DATA tab;
INPUT date :DATE7. @@;
CARDS;
13feb78 19nov1868 25aug2004 15mar93
;
RUN;
PROC PRINT DATA = tab;
FORMAT date DATE9.;


DATA tab2;
SET tab;
IF MONTH(date) = 3;
PROC PRINT DATA = tab2;
FORMAT date DATE9.;

/*--------------------------------------------------------------------------*/

DATA tab3;
x = '12apr83'd + 7999;
PROC PRINT DATA = tab3;
FORMAT x DATE9.;

/*--------------------------------------------------------------------------*/

DATA tab ;
INPUT d : date7. @@ ;
CARDS;
13feb78 19nov1868 25aug2004
;
RUN;
PROC PRINT data = tab;
FORMAT d DATE7.;