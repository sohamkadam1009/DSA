/**
 * @param {number[]} nums
 * @return {number}
 */
var minimumPairRemoval = function(nums) {
    let index= 0;
    let operations = 0;
    
    function nonDecreasing(arr) {
        for(let i=1;i<arr.length;i++) {
        //check if the array is in increasing order
        if(arr[i] < arr[i-1]) return false;
    }
    return true;
    }

    while(!nonDecreasing(nums)) {
        let MinSum= Infinity;
        for(let i=0;i<nums.length-1;i++) {
            const PairSum = nums[i] + nums[i+1];
            if(PairSum < MinSum) {
                MinSum = PairSum;
                index = i;
            }
        }

        nums.splice(index,2,MinSum);
        operations++;
    }

    return operations; 
};