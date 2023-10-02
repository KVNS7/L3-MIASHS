PROC SORT DATA = enfants (WHERE = (genre = 'M')) OUT = garcons_poids;
BY poids;
RUN;