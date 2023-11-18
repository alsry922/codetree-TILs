const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split(' ').map(ele => Number.parseInt(ele));

while (arr.length < 10) {
    arr.push(arr[arr.length-1] + (2 * arr[arr.length-2]));
}

console.log(arr.join(' '));