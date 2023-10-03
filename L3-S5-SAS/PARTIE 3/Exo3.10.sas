DATA petits moyens grands;
SET enfants;
SELECT;
WHEN (taille<150) OUTPUT petits;
WHEN (taille<160) OUTPUT moyens;
OTHERWISE OUTPUT grands;
END;

PROC PRINT DATA = petits;
PROC PRINT DATA = moyens;
PROC PRINT DATA = grands;
RUN;