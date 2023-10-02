DATA nombres;
INPUT x y @@;
CARDS;
5 5 2 -3 -4 7.12 8 1.6 2 0
;
RUN;
PROC PRINT;

/*
DATA tab;
INFILE "fichiers.txt" dlm = ",";
INPUT x y;
*/

DATA calculs;
SET nombres;
a = x + y;
b = x - y;
c = x**y;
d = min(x,y);
e = max(x,y);
f = x*y;
g = x/y;
RUN;
PROC PRINT;