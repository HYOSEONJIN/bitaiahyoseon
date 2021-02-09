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
