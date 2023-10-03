DATA TabNotes;
INPUT note1 note2 @@;
SET TabNotes;
LABEL note1 = "Notes du premier examen" note2 = "Notes du deuxieme examen";
CARDS;
12 15 16 08 11 09
19 18 06 04
;
PROC PRINT DATA = TabNotes LABEL;
RUN;