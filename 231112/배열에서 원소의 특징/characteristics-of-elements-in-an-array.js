const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split(' ').map(ele => Number.parseInt(ele));
const firstIdxOfThreeMul = arr.findIndex(ele => ele % 3 === 0)
console.log(arr[firstIdxOfThreeMul-1]);