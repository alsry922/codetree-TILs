const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split(' ').map(ele => Number.parseInt(ele));
const zeroIdx = arr.findIndex(ele => ele === 0);

const sum3 = arr.slice(zeroIdx-3, zeroIdx).reduce((acc, curr) => acc + curr);
console.log(sum3);