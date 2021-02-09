# import sqlite3
#
# # DB 연결
# con = sqlite3.connect('sample')
# cur = con.cursor()
#
# user_id = input('아이디를 입력해주세요. >> ')
# user_name = input('이름을 입력해주세요. >> ')
# user_email = input('이메일을 입력해주세요. >> ')
# user_birth_year = int(input('태어난 년도를 입력해주세요. >> '))
#
#
# # sql
# sql_insert = 'insert into usertable values (\'{}\',\'{}\',\'{}\',{})'.format(
#     user_id, user_name, user_email, user_birth_year)
# cur.execute(sql_insert)
#
# con.commit()
# con.close()

import pymysql
project_db = pymysql.connect(host='127.0.0.1', db='open', user='aia', password='aia')

cursor1=project_db.cursor()

sql_select = 'select * from member'
cursor1.execute(sql_select)

while True :

    row = cursor1.fetchone()

    if row==None :
        break;
    print(row)

project_db.close()
