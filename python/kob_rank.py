from urllib import request
from bs4 import BeautifulSoup as bs
import re

url = 'https://sports.news.naver.com/kbaseball/record/index.nhn?category=kbo'

target = request.urlopen(url)

soup = bs(target, 'html.parser')

print(soup.title)
print(soup.title.string)

print(soup.img)
print(soup.img.src)



# 검색 함수
# find() : 해당 태그의 첫번째 태그의 정보만 반환
# find_all() : 여러개의 태그 정보를 반환

print(soup.find('a'))
print(soup.find('a', class_='logo'))
print(soup.find(id='team_LG'))

tag_1 = soup.find_all(text='순위')
print(tag_1)

tag_2 = soup.find_all(text=re.compile('순위'))
print(tag_2)




print('-------------------------')
for tag in soup.find_all('a', attrs={'class', 'logo'}):
    print(tag)