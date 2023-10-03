LIBNAME repdata "/home/u63575294/Revisions/PARTIE 2";
DATA enfants;
	SET repdata.enfants;
RUN;

PROC FORMAT;
VALUE cheveuxn 1 = "brun" 2 = "chatain" 3 = "blond";
RUN;

PROC SORT DATA = enfants;
BY cheveux taille;
FORMAT cheveux cheveuxn.;
RUN;