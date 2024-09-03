SELECT
    ED.ID
    , COALESCE(PED.COUNT, 0) AS CHILD_COUNT
FROM
    ECOLI_DATA AS ED
    LEFT JOIN (
        SELECT
            PARENT_ID, COUNT(*) AS COUNT
        FROM
            ECOLI_DATA
        GROUP BY
            PARENT_ID
        HAVING
            PARENT_ID IS NOT NULL
    ) PED
    ON ED.ID = PED.PARENT_ID
ORDER BY
    ID