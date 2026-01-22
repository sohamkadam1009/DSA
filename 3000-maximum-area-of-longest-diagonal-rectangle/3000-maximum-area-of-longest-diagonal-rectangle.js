/**
 * @param {number[][]} dimensions
 * @return {number}
 */
var areaOfMaxDiagonal = function(dimensions) {
    let maxDiagonalLength = 0;
    let index = 0;
    for(let i =0;i<dimensions.length;i++) {
        const length = dimensions[i][0];
        const width = dimensions[i][1];
        diagonalLength = Math.sqrt((length*length) + (width*width));
        if(diagonalLength>maxDiagonalLength) {
            const maxDiagonalLength = diagonalLength;
            index = i;
        }
    }

    return dimensions[index][0] * dimensions[index][1];
};