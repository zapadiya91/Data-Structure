const http=require('http');

const server=http.createServer((req,res)=>{
    res.statusCode=200;
    res.setHeader('contact-type','application');
    res.end('Hello ! ')
});

server.listen(3000,()=>{
    console.log('server is runnig');
});