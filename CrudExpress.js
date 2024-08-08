const express = require('express');
const path = require('path');
const bodyParser = require('body-parser');

const app=express();

app.use(bodyParser.urlencoded({extended:false}));

let students=[
    {
        id:543,
        name:'darshan'
    },
    {
        id:435,
        name:'arjun'
    },
    {
        id:473,
        name:'dixit'
    },
    {
        id:343,
        name:'haresh'
    }

];

app.get('/students/get',(req,res)=>{
   res.send(students);
})

app.get('/students/get/:index',(req,res)=>{
    res.send(students[req.params.index]);
})

app.get('/students/get/id/:id',(req,res)=>{
    let index= students.findIndex((i)=>(i.id==req.params.id));
    res.send(students[index]);
})

app.get('/students/get/search/:srh',(req,res)=>{
    let result = students.filter((i)=>{
        if(i.name.includes(req.params.srh)){
            return true;
        }
    })
    res.send(result);
})

app.post('/students/post',(req,res)=>{
    students.push(req.body);
    res.send('added successfully !');
})

app.patch('/students/patch/:index',(req,res)=>{
  students[req.params.index]=req.body
  res.send('update successfully !')
});

app.delete('/students/delete/:index',(req,res)=>{
    students.splice(req.params.index,1);
    res.send('deleted successfully !')
});


app.listen(3000,()=>{
    console.log('server started !')
});