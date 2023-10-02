DATA europe;
INPUT pays $ population superficie pib date monnaie $;
CARDS;
Allemagne 82 356854 23950 1957 euro
Autriche 8.1 88358 26680 1995 euro
;
RUN;
PROC PRINT data = europe;
RUN;