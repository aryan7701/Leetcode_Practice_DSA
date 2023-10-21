/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    
	return function(x) {
        if(!functions.length){return x}
        for(let ind = functions.length -1;ind>=0;ind--){
            x = functions[ind](x)
        }
        return x
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */