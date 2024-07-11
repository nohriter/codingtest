-- 코드를 입력하세요
SELECT RI.REST_ID,
RI.REST_NAME,
RI.FOOD_TYPE,
RI.FAVORITES,
RI.ADDRESS,
ROUND(AVG(RR.REVIEW_SCORE), 2) as SCORE
FROM REST_INFO as RI
INNER JOIN REST_REVIEW as RR
ON RI.REST_ID = RR.REST_ID
GROUP BY RI.REST_NAME
HAVING RI.ADDRESS like '서울%'
ORDER BY SCORE DESC, FAVORITES DESC;