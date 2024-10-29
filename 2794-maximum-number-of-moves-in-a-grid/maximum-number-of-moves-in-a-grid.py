class Solution:
    def maxMoves(self, grid: List[List[int]]) -> int:
        
        m, n = len(grid), len(grid[0])
        
        
        directions = [(-1, 1), (0, 1), (1, 1)]
        
        
        memo = {}
        
        
        def dfs(row, col):
        
            if col == n - 1:
                return 0
            
            if (row, col) in memo:
                return memo[(row, col)]
            
            max_moves = 0
            current_value = grid[row][col]
            
            
            for dr, dc in directions:
                new_row, new_col = row + dr, col + dc
                
                if 0 <= new_row < m and 0 <= new_col < n and grid[new_row][new_col] > current_value:
                    
                    max_moves = max(max_moves, 1 + dfs(new_row, new_col))
            
            memo[(row, col)] = max_moves
            return max_moves
        
        result = 0
        for i in range(m):
            result = max(result, dfs(i, 0))
        
        return result