SELECT * FROM Cinema
WHERE id%2=1 AND description!="boring" -- In SQL <> symbol can be used to denote !=
ORDER BY rating DESC;