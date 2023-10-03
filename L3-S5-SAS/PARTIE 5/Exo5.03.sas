data tab;
infile cards dlm=';'; input x @@;
CARDS4;
8;6;17
9;12;13
;;;;
PROC PRINT DATA = tab;
RUN;