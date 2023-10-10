DATA Tab;
ARRAY c{4} X1-X4;
DO j = 1 TO 20;
	DO i = 1 TO 4;
		c{i} = COS(i+j);
	END;
	OUTPUT;
END;
PROC PRINT DATA = Tab;