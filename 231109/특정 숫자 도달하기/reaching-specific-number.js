const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(' ');
const arr = input.map((ele) => Number.parseInt(ele));

let sum = 0;
let length = 0;

for (index in arr) {
    if (arr[index] >= 250) break;
    sum += arr[index];
    length = Number.parseInt(index)+1;
}

console.log(sum, (sum/length).toFixed(1))