class Solution:
    def parseBoolExpr(self, s: str) -> bool:
        return all(len(s:=re.sub(r'([&|!])\([tf,]+\)',lambda m:'tft'[m[1]=='|':]['tf'[m[1]=='&'] in m[0]],s))>1 for _ in s) or s>'f'