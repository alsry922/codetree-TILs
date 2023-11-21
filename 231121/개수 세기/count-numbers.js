const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');
const [n, m] = input[0].split(' ').map(ele => Number.parseInt(ele));
const arr = input[1].split(' ').map(ele => Number.parseInt(ele));
let count = 0;
arr.forEach(ele => {
    if (ele === m) {
        count++;
    }
});
console.log(count);