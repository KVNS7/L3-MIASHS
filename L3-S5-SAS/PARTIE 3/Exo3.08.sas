DATA garcons chatains blonds;
SET ENFANTS;
IF genre = "M" THEN OUTPUT garcons;
IF cheveux = 2 THEN OUTPUT chatains;
IF cheveux = 3 THEN OUTPUT blonds;

PROC PRINT DATA = garcons;
PROC PRINT DATA = chatains;
PROC PRINT DATA = blonds;
RUN;