SELECT x,y,z,
CASE 
    WHEN x+y > z AND x+z > y AND y+z > x THEN "Yes" -- Sum of 2 sides alwys greater than 3rd side
    ELSE "No"
END AS 'triangle'
FROM Triangle;