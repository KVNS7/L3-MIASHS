DATA meteo;
INPUT station $ @;
DO i = 1 TO 3;
	INPUT temp @;
	OUTPUT;
END;
KEEP station temp;
CARDS;
sta1 20 18 15.4
sta2 17 15
;
PROC PRINT DATA = meteo;


DATA meteo2;
INPUT station $ n @;
DO i = 1 TO n;
	INPUT temp @;
	OUTPUT;
END;
KEEP station temp;
CARDS;
Sta1 3 17 16.5 8
Sta2 2 10.5 14
PROC PRINT DATA = meteo2;