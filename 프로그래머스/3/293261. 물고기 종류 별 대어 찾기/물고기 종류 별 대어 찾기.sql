SELECT FI.ID AS ID , FNI.FISH_NAME AS FISH_NAME, FI.LENGTH AS LENGTH
FROM FISH_INFO AS FI
JOIN FISH_NAME_INFO AS FNI ON FI.FISH_TYPE = FNI.FISH_TYPE
WHERE FI.FISH_TYPE IN 
    (SELECT FISH_TYPE 
     FROM FISH_INFO 
     GROUP BY FISH_TYPE 
     HAVING LENGTH = MAX(LENGTH)
    )
ORDER BY FI.ID ASC