SELECT il.ITEM_ID , il.ITEM_NAME, il.RARITY
FROM ITEM_INFO AS il
    JOIN (
        SELECT it.ITEM_ID, ii.RARITY FROM (
            SELECT * FROM ITEM_INFO
            WHERE ITEM_INFO.RARITY LIKE 'RARE'
        ) AS ii
         JOIN ITEM_TREE AS it
         ON ii.ITEM_ID = it.PARENT_ITEM_ID
         ) as bb
    ON il.ITEM_ID = bb.ITEM_ID
    
ORDER BY il.ITEM_ID DESC