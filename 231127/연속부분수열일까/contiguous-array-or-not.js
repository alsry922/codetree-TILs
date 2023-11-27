const fs = require('fs');
const input = 
    fs.readFileSync(0).toString().trim().split('\n');
const [n1, n2] = input[0].split(' ').map(ele => Number.parseInt(ele));
const A = input[1].split(' ').map(ele => Number.parseInt(ele));
const B = input[2].split(' ').map(ele => Number.parseInt(ele));

const firstEleIdx = A.findIndex(ele => ele === B[0]);
let answer = 'Yes';
B.forEach((ele, index) => {
    if (ele !== A[firstEleIdx + index]) {
        answer = 'No';
    }
});

console.log(answer);