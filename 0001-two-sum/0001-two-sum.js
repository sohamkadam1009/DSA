/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    //brute force soln:time complexity is o(n^2)
    // for(let i=0;i<nums.length;i++) {
    //     for(let j=i+1;j<nums.length;j++) {
    //         const sum = nums[i] + nums[j];
    //         const index = [i,j];
    //         if(sum===target) return index; 
    //     }
    // }

    const map = new Map();

    for(let i=0;i<nums.length;i++) {
        //calculate the complement
        const complement = target - nums[i];
        if(map.has(complement)) return [map.get(complement),i] //map.get(complement) will return the complemen's index, i-> current index
        //store the number in the map {number,index}
        map.set(nums[i],i);
    }
};