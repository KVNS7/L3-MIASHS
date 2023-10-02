DATA tab;
INPUT pays $ @37 X Y;
CARDS;
Belgique "données à vérifier"       166 23
France "l'année 1982 est manquante" 191 21
;
PROC PRINT;
RUN;