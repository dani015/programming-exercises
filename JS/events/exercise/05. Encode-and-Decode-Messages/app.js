function encodeAndDecodeMessages() {
    document.getElementById('main').addEventListener('click', function (e) {
        const encode = document.querySelectorAll('button')[0];
        const decode = document.querySelectorAll('button')[1];

        let textAreaEncode = document.querySelectorAll('textarea')[0];
        const textAreaDecode = document.querySelectorAll('textarea')[1];

        let encoded = '';
        let decoded = '';

        if(e.target === encode) {
            for (let i = 0; i < textAreaEncode.value.length; i++) {
                let val = textAreaEncode.value.charCodeAt(i) + 1;
                encoded += String.fromCharCode(val);
            }
            textAreaDecode.value = encoded;
            textAreaEncode.value = '';
        }

        if(e.target === decode) {
            for (let i = 0; i < textAreaDecode.value.length; i++) {
                let val = textAreaDecode.value.charCodeAt(i) - 1;
                decoded += String.fromCharCode(val);
            }
            textAreaDecode.value = decoded;
        }

    })
}