DATA europe;
INFILE "/home/u63575294/Revisions/PARTIE 1/europe.txt" ;
INPUT pays $ population superficie pib date monnaie $ ; RUN ;
PROC PRINT data = europe;
RUN ;