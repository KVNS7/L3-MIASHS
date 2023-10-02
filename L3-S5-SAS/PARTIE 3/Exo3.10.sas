DATA petits moyens grands;
SET enfants;
SELECT;
WHEN(taille < 150) OUTPUT petits;
WHEN(taille < 160) OUTPUT moyens;
OTHERWISE OUTPUT grands;
END;
RUN;