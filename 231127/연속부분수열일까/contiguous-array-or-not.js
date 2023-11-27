const fs = require('fs');
const input = 
    fs.readFileSync(0).toString().trim().split('\n');
const [n1, n2] = input[0].split(' ').map(ele => Number.parseInt(ele));
const A = input[1].split(' ').map(ele => Number.parseInt(ele));
const B = input[2].split(' ').map(ele => Number.parseInt(ele));

let answer = 'No';
for (let AIdx = 0; AIdx < A.length; AIdx++) {
    let index = AIdx;
    let count = 0;
    for (let BIdx = 0; BIdx < B.length; BIdx++) {
        if (A[index] !== B[BIdx]) break;
        index++;
        count++;
    }
    if (count === B.length) {
        answer = 'Yes';
        break;
    }
}

console.log(answer);