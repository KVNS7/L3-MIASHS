DATA tab;
INPUT x @@;
y+1;
z+x;
CARDS; 
2 1 3 2
;
PROC PRINT DATA = tab;
RUN;
