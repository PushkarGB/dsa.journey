-- SELECT
--     s.machine_id,
--     ROUND(AVG(e.timestamp - s.timestamp),3) as processing_time
-- FROM Activity s
-- JOIN Activity e
--     ON s.machine_id = e.machine_id
--    AND s.process_id = e.process_id
--    AND s.activity_type = 'start'
--    AND e.activity_type = 'end'
-- Group by machine_id;

SELECT
    machine_id,
    ROUND(AVG(processing_time), 3) AS processing_time
FROM (
    SELECT
        machine_id,
        process_id,
        MAX(timestamp) - MIN(timestamp) AS processing_time
    FROM Activity
    GROUP BY machine_id, process_id
) AS t
GROUP BY machine_id;