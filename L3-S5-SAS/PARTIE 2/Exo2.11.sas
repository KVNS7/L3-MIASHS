DATA tab;
INPUT x $ @@;
CARDS;
o n n o
;

PROC FORMAT;
VALUE $ rep o = 'oui' n = 'non';

PROC PRINT;
FORMAT x $rep.;
RUN;