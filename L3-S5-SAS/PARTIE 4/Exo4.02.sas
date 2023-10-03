DATA fcts; 
SET nombres;
a = ABS(x);
b = EXP(x);
c = INT(y);
d = LOG(y);
e = LOG10(y);
f = SIGN(y);
g = SQRT(x);

PROC PRINT DATA = nombres;
PROC PRINT DATA = fcts;
RUN;