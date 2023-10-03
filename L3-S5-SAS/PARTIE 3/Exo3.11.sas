DATA garcons filles;
SET enfants;
WHERE taille < 150;
SELECT (genre);
WHEN ("F") OUTPUT filles;
OTHERWISE OUTPUT garcons;
END;

PROC PRINT DATA = garcons;
PROC PRINT DATA = filles;
RUN;