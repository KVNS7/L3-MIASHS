DATA garcons filles;
SET enfants;
SELECT(genre);
WHEN('F') OUTPUT filles;
OTHERWISE OUTPUT garcons;
END;
RUN;