proc format;
INVALUE grade 'A'=4 'B'=3 'C'=2 'D'=1 'F'=0;

Data tab;
INPUT prenom $ (note1-note3) (:grade.);
z = MEAN(of note1-note3);
CARDS;
Frank   A B F
Samuel  A B C
Sara    A C B
Elise   B . A
;

PROC PRINT DATA = tab;