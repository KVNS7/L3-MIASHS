DATA notes;
INPUT note1 note2 note3 @@;
CARDS;
12 15 16 08 11 09
19 18 06 04
;
PROC PRINT DATA = notes LABEL;
LABEL 
note1 = 'note du premier examen'
note2 = 'note du deuxième examen';
RUN;
