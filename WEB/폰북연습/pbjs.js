// 정보 저장할 함수
var phoneinfo = [];

// 집어넣기 위한 생성자 함수!
function Pinfo(name, pnum, ftype) {
    this.Sname = name;
    this.Snum = pnum;
    this.Stype = ftype;
}




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

    var info = new Pinfo(iname, inum, itype);
    console.log(itype + ' : ' + inum + ' : ', itype);

    // 배열에 저장
    phoneinfo.push(info);
    console.log('phoneinfo', phoneinfo);

    document.querySelector('#phonebookinput').reset();
    alert('등록완료!');

    // 리스트 출력
    addlist();

    return false;
}

/*리스트 추가해주는 함수*/
function addlist() {

    /*tbody가져오기 <tr><td> 들어있는 것*/
    var listrow = document.getElementById('listrow');

    var tbody = '';

    for (var i = 0; i < phoneinfo.length; i++) {

        tbody += '<tr>';
        tbody += '<td>' + i + '</td>';
        tbody += '<td>' + phoneinfo[i].Sname + '</td>';
        tbody += '<td>' + phoneinfo[i].Snum + '</td>';
        tbody += '<td>' + phoneinfo[i].Stype + '</td>';
        tbody += '<td><a href="javascript:editinfo(' + i + ')">수정</a> <a href="javascript:delinfo(' + i + ')">삭제</a></td>';
        tbody += '</tr>';

    }

    listrow.innerHTML = tbody;


}


/*삭제기능*/
function delinfo(index) {

    var delChk = confirm('삭제하시겠습니까?');

    if (delChk) {
        phoneinfo.splice(index, 1);

        alert('삭제완료!');

        addlist();
    }
}

/*수정하기*/
function editinfo(index) {
    console.log(index);
    console.log(phoneinfo[index]);

    // 수정화면 캐스팅
    var editDiv = document.querySelector('div.edit_div');
    editDiv.style.display = 'block';

    // form 안에 있는 input 캐스팅
    var ename = document.querySelector('#ename');
    var eenum = document.querySelector('#enum');
    var etype = document.querySelector('#etype');
    var idx = document.querySelector('#index');

    // 수정칸에 원래 이름이랑 정보들을 넣어주는 기능이다.
    idx.value = index;
    ename.value=phoneinfo[index].Sname;
    eenum.value=phoneinfo[index].Snum;
    etype.value=phoneinfo[index].Stype;

}

function editinfoSubmit() {

    // 캐스팅
    var eidx = document.querySelector('#index').value;
    var ename = document.querySelector('#ename');
    var eenum = document.querySelector('#enum');
    var etype = document.querySelector('#etype');


    // 스페이스입력하면 원래 정보로 함.
    if (ename.value.trim().length < 1) {
        ename = phoneinfo[eidx].Sname;
    }
    if (eenum.value.trim().length < 1) {
        eenum = phoneinfo[eidx].Snum;
    }

    console.log(eidx);
    console.log(phoneinfo[eidx]);

    // 문제 없으면 수정
    phoneinfo[eidx].Sname = ename.value;
    phoneinfo[eidx].Snum = eenum.value;
    phoneinfo[eidx].Stype = etype.value;

    alert('수정되었습니다.');

    addlist();

    document.querySelector('div.edit_div').style.display = 'none';

    return false;

}


/*수정창끄기*/
function editClose() {
    var editDiv = document.querySelector('div.edit_div');
    editDiv.style.display = 'none';
}
