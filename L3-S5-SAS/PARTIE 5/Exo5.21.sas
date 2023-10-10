PROC FORMAT;
PICTURE km 	1-99='000000'
			100-high ='>100 kilomètres' (NOEDIT);
			
DATA temp;
INPUT nom $ distance;
CARDS;
Marc 19
Anne 258
Christophe 600
Sophie 27
;
PROC PRINT DATA = temp;
FORMAT distance km.;