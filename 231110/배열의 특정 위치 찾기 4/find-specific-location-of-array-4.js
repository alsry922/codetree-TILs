const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(' ');
const arr = input.map((ele) => Number.parseInt(ele));

let cnt = 0;
let sum = 0;

for (let i = 0; i < 10; i++) {
    if (arr[i] === 0) {
        break;
    }
    if (arr[i] % 2 === 0) {
        cnt++;
        sum += arr[i];
    }
}

console.log(cnt, sum);