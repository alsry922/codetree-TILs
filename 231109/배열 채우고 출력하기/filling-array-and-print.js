const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(' ');
const reverse = [...input].reverse().join('');

console.log(reverse);