DATA europe ;
INPUT pays $ population superficie pib date monnaie $ ; CARDS ;
Allemagne 82 356854 23950 1957 euro
Autriche 8.1 8358 26680 1995 euro
Espagne 47 505992 18106 1986 euro
France 67 643801 25825 1957 euro
Royaume-Uni 66 244820 27074 1957 livre sterling
;
RUN ;
PROC PRINT data = europe ;
RUN;
