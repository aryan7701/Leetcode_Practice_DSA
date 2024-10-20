class Solution:
    def findKthBit(self, n: int, k: int) -> str:
        def find_kth_bit_in_sn(n, k):
            if n == 1:
                return "0"
            
            length_of_sn = (1 << n) - 1  # 2^n - 1
            
            middle = (length_of_sn // 2) + 1
            
            if k == middle:
                return "1"
            elif k < middle:
                return find_kth_bit_in_sn(n - 1, k)
            else:
                
                mirrored_position = length_of_sn - k + 1
                bit = find_kth_bit_in_sn(n - 1, mirrored_position)
                return "1" if bit == "0" else "0"
        
        return find_kth_bit_in_sn(n, k)