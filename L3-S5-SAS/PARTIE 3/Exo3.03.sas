PROC PRINT DATA = Tab3;

PROC APPEND BASE = Tab3 DATA = Tab1;
PROC PRINT DATA = Tab3;
RUN;

PROC DELETE DATA = Tab3;