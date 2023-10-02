PROC SORT DATA = enfants OUT = enfants_age;
BY age;
PROC PRINT DATA = enfants_age;
RUN;