DATA tab;
INPUT x @@;
RETAIN y 0;
y = y+x;
CARDS;
1 3 6 7 9
;
PROC PRINT DATA = tab;
RUN;