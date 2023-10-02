DATA notes;
SET notes;
LABEL 
note1 = 'note du premier examen'
note2 = 'note du deuxième examen';
PROC PRINT LABEL;
RUN;

