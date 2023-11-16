const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split(' ').map(ele => Number.parseInt(ele));
const zeroIdx = arr.findIndex((ele) => ele === 0);
const result = [];
for (let i = 0; i < zeroIdx; i++) {
    if(arr[i] % 2 !== 0) {
        result.push(arr[i]+3);
    } else {
        result.push(arr[i] / 2);
    }
}
console.log(result.join(' '));