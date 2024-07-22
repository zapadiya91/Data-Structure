const http = require('http');

const port = 3000;

const server = http.createServer((req, res) => {
  res.writeHead(200, { 'Content-Type': 'text/plain' });

  if (req.url === '/' || req.url === '/home') {
    res.end('This is the Home Page');
  } else if (req.url === '/about') {
    res.end('This is the About Page');
  } else if (req.url === '/contact') {
    res.end('Contact us');
  } else if (req.url === '/services') {
    res.end('Sorry ! no services found.');
  } else if (req.url === '/products') {
    res.end('NO products are available !');
  } else {
    res.end('404 - Page Not Found');
  }
});

server.listen(port, () => {
  console.log(`Server running at http://localhost:${port}/`);
});
