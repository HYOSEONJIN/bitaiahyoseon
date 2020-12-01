/*전화번호를 저장하는 함수*/

function savesubmit() {
    /*alert('OK');*/

    var iname = document.getElementById('fname').value;
    var inum = document.getElementById('pnum').value;
    var itype = document.getElementById('ftype').value;

    console.log('이름', itype, '번호', inum, '친구타입', itype);



    var check = false;

    // 오류검사 시작

    // 오류 1) 아무것도 입력하지 않은 경우
    if (iname.trim().length < 1) {
        document.querySelector('#fname+div.msg').style.display = 'block';
        check = true;
    }
    if (inum.trim().length < 1) {
        document.querySelector('#pnum+div.msg').style.display = 'block';
        check = true;
    }

    // 잘못 입력받은 후 경고메세지 none 처리와 함께 받은 값은 ''로 처리해준다
    fname.addEventListener('focus', function () {
        document.querySelector('#fname+div.msg').style.display = 'none';
        iname.value = '';
    });

    pnum.addEventListener('focus', function () {
        document.querySelector('#pnum+div.msg').style.display = 'none';
        inum.value = '';
    });


    if (check) {
        return false;
    }
    return false;


}
