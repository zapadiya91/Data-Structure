const { log } = require('console');
const fs=require('fs');

// fs.exists('Lab17_2.js',(exists)=>{
//     console.log(exists?'found':'notfound');
//   });

// fs.stat('Lab17_3.js',(err,data)=>{
//     console.log(err);
//     console.log(data);
// })

// fs.readFile('readMe.txt',(err,data)=>{
//     if(err) 
//         {throw err};
//     console.log(data.toString());
// })

// const data='this is message from you.'
// fs.writeFile('message.txt', data, (err) => {
//   if (err) throw err;
//   console.log('The file has been saved!');
// }); 

// fs.rename('./read.txt','./readMe.txt',(err)=>{
//     if(err){
//         throw err;
//     }
// });

// fs.appendFile('message.txt','it is appended.',(err)=>{
//     if(err){
//         throw err;
//     }
// })
// fs.unlink('message.txt',(err)=>{
//     if(err){
//         throw err;
//     }
//     else{
//     console.log("file deleted");
//     }
// })
