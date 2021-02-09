# 모듈은 내장 모듈과 외부 모듈로 구분
# 내장 모듈은 파이썬 내부에서 제공해주는 모듈
# 외부 모듈은 프로그래머가 설치해서 사용하는 모듈

import math

print('hello')
print(math.pi)
print(math.floor(123.456))

# math 모듈에서 floor 함수만 로드
from math import floor

print(float(123.456))

#로드하는 모듈의 별칭 정의
import math as m
print(m.pi)

import random

# random()
print(random.uniform(10,20))

print(random.randrange(10)) #정수값랜덤
print(random.randrange(10,20))

import sys
print(sys.argv)
print(sys.getwindowsversion())

import os
print(os.name)
print(os.getcwd())
print(os.listdir())


import datetime

print('NOW TIME~')
now=datetime.datetime.now()
print(now.year, end=".")
print(now.month, end=".")
print(now.day, end=".")
print(now.hour, end=".")
print(now.minute, end=".")
print(now.second, end=".")
print(now)

after = now + datetime.timedelta(weeks=1, days=1, hours=1, minutes=1, seconds=1)
print(after.strftime('%Y.%m.%d.%H:%M:%S'))

output = now.replace(year=(now.year+1))
print(output)

import time
for i in range(5):
    print(i)

from urllib import request
target = request.urlopen('http://google.com')
output = target.read()
print(output)




from bs4 import BeautifulSoup
