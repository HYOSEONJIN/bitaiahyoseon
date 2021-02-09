import sys
import io

sys.stdout = io.TextIOWrapper(sys.stdout.detach(), encoding = 'utf-8')
sys.stderr = io.TextIOWrapper(sys.stderr.detach(), encoding = 'utf-8')


# 설치 안해도 그냥 내장되어있었음 pip list해도안나오지만..
import sqlite3

# db연결
con = sqlite3.connect('sample')

# 커서생성
cur = con.cursor()

# sql
sql_select = 'Select * from userTable'

cur.execute(sql_select)
print('아이디\t이름\t이메일\t생년')
print('-----------------------------------')

while True:
    # 커서의 한줄을 가져오는 함수 fetchone : 행이 없으면 NONE 반환
    row = cur.fetchone()

    if row :
        break;

    print(row)
    print('{}\t{}\t{}\t{}'.format(row[0], row[1], row[2], row[3]))

con.close()
