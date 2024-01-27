const fs = require('fs');
let [count, array] = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
count = Number.parseInt(count);
array = array.split(' ').map(ele => Number.parseInt(ele));
sortedArray = [...array].sort((a, b) => a - b);
reverseSortedArray = [...array].sort((a, b) => b - a);
console.log(sortedArray.join(' '));
console.log(reverseSortedArray.join(' '));