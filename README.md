
# Alex’s Confidence Problem

## Problem Description

Alex is a 12th-grade student preparing for an interview to apply to the University of Houston.  To pass the interview, Alex needs at least **80 confidence points**. Otherwise, if his confidence is below 80, he will fail the interview.

Initially, Alex has **0 confidence points**, and he can perform the following actions in order to change his confidence level:

-   📘 **Practice Problems**: Alex found a book containing **20 problems**.
    -   For each of the first **6 problems**, Alex gains **8 confidence points**.
    -   For problems **7 to 13**, he gains **10 confidence points per problem**.
    -   For problems **14 to 20**, he gains **14 confidence points per problem**.
        
-   🎮 **Games**: Alex has **6 games** on his phone. If Alex plays **b games**, he gets distracted and loses **20 confidence points per game**.
    
-   🍽️ **Favorite Dishes**: Alex has **4 favorite dishes**. If he eats at least **2 dishes**, his current confidence increases by **15%**.
----------
## Input
Three integers:
-   `a` (0 ≤ a ≤ 20) – number of problems Alex has solved
-   `b` (0 ≤ b ≤ 6) – number of games Alex has played
-   `c` (0 ≤ c ≤ 4) – number of favorite dishes Alex has eaten
----------
## Output
-   Print `"INVALID"` if the input values are not valid.
-   Print `"PASS"` if Alex passes the interview.
-   Print `"FAIL"` if Alex cannot pass the interview.
----------
## Example
**Input:** `14 2 2`       
**Output:** `PASS` 
**Explanation:**

1.  After solving 14 problems, Alex now has `6 * 8 + 7 * 10 + 1 * 14 = 132` confidence points
2.  After playing 2 games, Alex now has `132 – 2 * 20 = 92`  confidence points   
3.  After eating 2 dishes, Alex now has `92 + 92 * 15% = 105.8` confidence points
    
Since `105.8 ≥ 80`, Alex passes the interview → output **PASS** 