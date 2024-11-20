class Solution:
    def takeCharacters(self, s: str, k: int) -> int:
        
        positions_a = {0: len(s)}
        positions_b = {0: len(s)}
        positions_c = {0: len(s)}
        
        n = len(s)
        count_a = 0
        
        
        for i in range(n - 1, -1, -1):
            if s[i] == 'a':
                count_a += 1
                positions_a[count_a] = i
        
        count_b = 0
        
        for i in range(n - 1, -1, -1):
            if s[i] == 'b':
                count_b += 1
                positions_b[count_b] = i
        
        count_c = 0
        
        for i in range(n - 1, -1, -1):
            if s[i] == 'c':
                count_c += 1
                positions_c[count_c] = i
        
        
        if k == 0:
            return 0
        
        
        if count_a < k or count_b < k or count_c < k:
            return -1
        
        
        a_count = 0
        b_count = 0
        c_count = 0
        result = -1
        
        
        result = n - min(positions_a.get(max(0, k - a_count)), 
                         min(positions_b.get(max(0, k - b_count)), 
                             positions_c.get(max(0, k - c_count))))
        
        
        for i in range(n - 1):
            if s[i] == 'a':
                a_count += 1
            elif s[i] == 'b':
                b_count += 1
            else:
                c_count += 1
            
            result = min(result, i + 1 + n - min(positions_a.get(max(0, k - a_count)), 
                                                 min(positions_b.get(max(0, k - b_count)), 
                                                     positions_c.get(max(0, k - c_count)))))
        
        return result