function solve(obj) {
    const validMethods = ['GET', 'POST', 'DELETE', 'CONNECT'];
    const validVersion = ['HTTP/0.9','HTTP/1.0','HTTP/1.1','HTTP/2.0',]
    const messageValidate = ['<', '>', '\\', '&', '\'', '\"'];
    const message = obj.message;
    if(!obj.hasOwnProperty('method')){
        throw new Error('Invalid request header: Invalid Method');
    }
    if(!validMethods.includes(obj.method)){
        throw new Error('Invalid request header: Invalid Method');
    }

    if(!obj.hasOwnProperty('uri')) {
        throw new Error('Invalid request header: Invalid URI');
    }
    if (obj.uri == '' || obj.uri.includes(' ')) {
        throw new Error('Invalid request header: Invalid URI');
    }

    if(!obj.hasOwnProperty('version')) {
        throw new Error('Invalid request header: Invalid Version');
    }
    if (!validVersion.includes(obj.version)) {
        throw new Error('Invalid request header: Invalid Version');
    }
    if(!obj.hasOwnProperty('message')) {
        throw new Error('Invalid request header: Invalid Message');
    }
    if(message.includes('<') || message.includes('>') || message.includes('\\') || message.includes('&') || message.includes('\'') || message.includes('\"')) {
        throw new Error('Invalid request header: Invalid Message');
    }


    return obj;
}

console.log(solve({
        method: 'GET',
        uri: 'svn.public.catalog',
        version: 'HTTP/1.1',
        message: 'aspls'
    }
));