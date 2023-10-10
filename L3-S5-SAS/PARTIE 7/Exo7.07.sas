DATA taba;
INPUT x y t;
CARDS;
1 3 8
2 4 6
;

DATA tabb;
INPUT x z t;
CARDS;
1 5 1
2 3 .
;

PROC SORT DATA = tabb;
BY x;

DATA tab;
UPDATE taba tabb UPDATEMODE = NOMISSINGCHECK;
BY x;
PROC PRINT DATA = tab;


