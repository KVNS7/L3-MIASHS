DATA taba;
INPUT x y t;
CARDS;
1 3 8
2 4 6
;

DATA tabb;
MISSING _ a;
INPUT x y t;
CARDS;
2 a .
1 3 _
;

PROC SORT DATA = tabb;
BY X;

DATA tab;
UPDATE taba tabb;
BY x;
PROC PRINT DATA = tab;