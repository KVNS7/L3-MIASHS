LIBNAME repdata "/home/u63575294/Revisions/PARTIE 1";

DATA fic1 ;
	SET repdata.europe;
RUN;

PROC PRINT data=fic1;
RUN;

PROC CONTENTS;
RUN;