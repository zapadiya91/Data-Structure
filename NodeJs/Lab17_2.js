const path=require('path');

console.log(path.join('/abc','/dyz'));
console.log(path.normalize('/abc/njdb/gfhgdf/yiygi/..'));
console.log(path.resolve('/abc','/xyz'));
console.log(path.relative('/abc/edf','/abc/uvw'));
console.log(path.dirname("/foo/abc.txt"));
console.log(path.basename('/foo/abc.txt'));
console.log(path.extname('/foo/abc.txt'));
