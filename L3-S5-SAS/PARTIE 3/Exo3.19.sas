DATA meteo;
INPUT sta $ t1-t3;
t = t1;
OUTPUT;
t = t2;
OUTPUT;
t = t3;
OUTPUT;
CARDS;
Sta1 20 18 15.4
Sta2 17 15 9
;
PROC PRINT DATA = meteo (KEEP = sta t);
RUN;