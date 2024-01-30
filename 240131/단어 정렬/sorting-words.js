const fs = require('fs');
let [inputCount, ...inputs] = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
inputCount = Number.parseInt(inputCount);
inputs.sort();
inputs.forEach(ele => console.log(ele));