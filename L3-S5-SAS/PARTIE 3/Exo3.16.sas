DATA fusion;
MERGE garcons tab2;
PROC PRINT DATA = fusion;

DATA fusion2;
MERGE tab3 bruns;
PROC PRINT DATA = fusion2;
RUN;