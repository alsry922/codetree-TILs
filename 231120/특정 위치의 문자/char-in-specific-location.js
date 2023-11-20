const fs = require('fs');
const input = fs.readFileSync(0).toString().trim();
const arr = ['L', 'E', 'B', 'R', 'O', 'S'];
const index = arr.findIndex(ele => ele == input);
console.log(index === -1 ? 'None' : index);