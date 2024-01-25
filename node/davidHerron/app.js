const http = require('http');
const url = require('url');

http.createServer( (req, res) => {
    const urlP = url.parse(req.url, true);
    res.writeHead(200, {'content-Type': 'text/plain'});
    if (urlP.query['n']) {
        let fibo = fibonacci(urlP.query['n']);
        res.end('Fibonacci ' + urlP.query['n'] +'='+ fibo);
    } else {
        res.end('USAGE: http://127.0.0.1:3000?n=## where ## is the Fibonacci number desired');
    }
}).listen(3000, "127.0.0.1");

console.log('Server running as http://127.0.0.1:3000')

function fibonacci(n) {
    if (n == 1 || n == 2) 
        return 1
    else {
        return fibonacci(n - 1) + fibonacci(n - 2)
    }
} 