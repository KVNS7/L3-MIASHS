DATA metier;
INPUT pays $ :12. genre $ nb typ $ :12. val;
CARDS;
Irlande Femmes 598 Services 79.3
Irlande Hommes 931 Agriculture 15.6
Luxembourg Femmes 56 Industrie 6.6
Luxembourg Femmes 56 Services 92.1
;
PROC PRINT;
RUN;