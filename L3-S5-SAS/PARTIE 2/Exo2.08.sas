DATA TabNotes;
INPUT note1 note2 @@;
CARDS;
12 15 16 08 11 09
19 18 06 04
;
PROC PRINT data = TabNotes LABEL;
LABEL note1 = "Notes du premier examen" note2 = "Notes du deuxieme examen";
RUN;