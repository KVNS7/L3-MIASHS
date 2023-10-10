DATA taba;
INPUT x y t;
CARDS;
1 3 8
2 4 6
;

DATA tabb;
INPUT x z t;
CARDS;
2 5 1
1 3 1
;

PROC SORT DATA = tabb;
BY x;

DATA tab;
UPDATE taba tabb;
BY x;
PROC PRINT DATA = tab;