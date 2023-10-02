DATA tab;
INPUT pays $ :12. genre $ nb typ $ :11. val;
CARDS;
Irlande Femmes 598 Services 79.3
Irlande Hommes 931 Agriculture 15.6
Luxembourg Femmes 56 Industries 6.6
Luxembourg Hommes 56 Services 91.1
;
PROC PRINT;
RUN;