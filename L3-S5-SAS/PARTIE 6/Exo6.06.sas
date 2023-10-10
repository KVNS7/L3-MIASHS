DATA tab;
x = '15may1982'd;
OUTPUT;
PROC PRINT DATA = tab;
FORMAT x date9.;