DATA garcons chatains;
SET enfants;
IF genre = 'M' THEN OUTPUT garcons;
IF cheveux = 2 THEN OUTPUT chatains;
RUN;
PROC PRINT DATA = garcons;
PROC PRINT DATA = chatains;