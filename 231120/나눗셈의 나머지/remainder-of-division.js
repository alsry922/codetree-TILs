const fs = require('fs');
let [a, b] = fs.readFileSync(0).toString().trim().split(' ').map(ele => Number.parseInt(ele));
let countArr = new Array(b).fill(0);
while (a > 1) {
    [a, remainder] = [Number.parseInt(a / b), a % b];
    countArr[remainder]++;
}
const result = countArr.reduce((arr, curr) => {
    return arr + curr ** 2;
}, 0)
console.log(result);