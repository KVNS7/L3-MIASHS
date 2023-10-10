PROC FORMAT;
PICTURE feet other='0000000009' (mult=5280);

DATA feet;
INPUT miles @@;
FORMAT miles feet.;
CARDS;
1  1.5  2
;

PROC PRINT DATA = feet;
FORMAT miles feet.;