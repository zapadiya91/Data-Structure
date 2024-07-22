const http = require('http');
const fs=require('fs');
const port = 3000;

const server = http.createServer((req, res) => {
  res.writeHead(200, { 'Content-Type': 'text/plain' });

  if (req.url === '/' || req.url === '/home') {
    fs.readFile('Home.txt',(err,data)=>{
    res.end(data.toString());
  })
  } else if (req.url === '/about') {
    fs.readFile('About.txt',(err,data)=>{
      res.end(data.toString());
    })
  } else if (req.url === '/contact') {
    fs.readFile('Contact.txt',(err,data)=>{
      res.end(data.toString());
    })
  } else if (req.url === '/services') {
    fs.readFile('Services.txt',(err,data)=>{
      res.end(data.toString());
    })
  } else if (req.url === '/products') {
    fs.readFile('Products.txt',(err,data)=>{
      res.end(data.toString());
    })
  } else {
    res.end('404 - Page Not Found');
  }
});

server.listen(port, () => {
  console.log(`Server running at http://localhost:${port}/`);
});
