class Solution {
    public String intToRoman(int num) {
        // Mapping of integer values to Roman numeral symbols
        Map<Integer, String> Roman = new LinkedHashMap<Integer, String>() {{
            put(1000, "M");
            put(900, "CM");
            put(500, "D");
            put(400, "CD");
            put(100, "C");
            put(90, "XC");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }};
        
        StringBuilder result = new StringBuilder();  // Initialize a StringBuilder to store the resulting Roman numeral
        
        // Iterate through the Roman map in descending order of keys
        for (Map.Entry<Integer, String> entry : Roman.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();
            int count = num / value;  // Get the count of times the value can be used
            result.append(String.valueOf(symbol).repeat(count));  // Append the symbol to the result string count number of times
            num %= value;  // Update num by taking the remainder after division by the current value
        }
        
        return result.toString();
    }
}