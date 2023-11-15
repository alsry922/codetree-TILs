const fs = require('fs');
const num = Number.parseInt(fs.readFileSync(0).toString().trim());

let arr = [];
arr.push(num);
for (let i = 1; i < 10; i++) {
    arr[i] = arr[i-1] + num;
}

let count = 0;
let result = [];
for (let i = 0; i < 10; i++) {
    if (arr[i] % 5 === 0) {
        count++;
    }
    result.push(arr[i]);
}

console.log(result.join(' '));