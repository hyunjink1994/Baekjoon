SELECT HD.DEPT_ID, HD.DEPT_NAME_EN, ROUND(AVG(SAL),0) AS "AVG_SAL"
FROM HR_EMPLOYEES AS HE
LEFT JOIN HR_DEPARTMENT AS HD
    ON HE.DEPT_ID = HD.DEPT_ID
GROUP BY HD.DEPT_ID , HD.DEPT_NAME_EN
ORDER BY AVG_SAL DESC