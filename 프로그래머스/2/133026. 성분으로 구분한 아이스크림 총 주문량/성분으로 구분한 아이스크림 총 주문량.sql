-- 코드를 입력하세요
SELECT a.INGREDIENT_TYPE , SUM(b.TOTAL_ORDER) as 'TOTAL_ORDER'
FROM ICECREAM_INFO as a
JOIN FIRST_HALF as b ON a.FLAVOR = b.FLAVOR
GROUP BY a.INGREDIENT_TYPE

ORDER BY TOTAL_ORDER ASC
