DATA nombres;
INPUT x y @@;
CARDS;
5 5 2 -3 -4 7.12 8 1.6 2 0
;
PROC PRINT DATA = nombres;

DATA calculs;
SET nombres;
a = x + y;
b = x - y;
c = x**y;
d = MIN(x,y);
e = MAX(x,y);
f = x*y;
g = x/y;
PROC PRINT DATA = calculs;
RUN;