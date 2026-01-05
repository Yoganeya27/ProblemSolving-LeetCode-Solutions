SELECT DISTINCT author_id AS id FROM Views -- Distinct is used to avoid repetition.
WHERE author_id=viewer_id
ORDER BY author_id ASC;