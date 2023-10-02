DATA meteo;
INPUT sta $ t1-t3;
t = t1;
OUTPUT;
t = t2;
OUTPUT;
t = t3;
OUTPUT;
CARDS;
sta1 20 18 15.4
sta2 17 15 9
;
PROC PRINT;