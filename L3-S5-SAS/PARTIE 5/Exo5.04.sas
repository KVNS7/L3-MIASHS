DATA Tab2;
SET Tab NOBS = counter END = last_obs;
nombre = counter;
KEEP nombre;
IF last_obs THEN OUTPUT;