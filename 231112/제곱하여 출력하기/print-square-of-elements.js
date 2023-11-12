const fs = require('fs');
const inputs = fs.readFileSync(0).toString().trim().split('\n');
const arr = inputs[1].split(' ').map(ele => Number.parseInt(ele));

const resultArr = arr.map(ele => ele ** 2);

const print = resultArr.join(' ').replace('[', '').replace(']', '');
console.log(print);