# В этой задаче вам необходимо воспользоваться API сайта numbersapi.com

# Вам дается набор чисел. Для каждого из чисел необходимо узнать, существует ли интересный математический факт об этом числе.
# Для каждого числа выведите Interesting, если для числа существует интересный факт, и Boring иначе.
# Выводите информацию об интересности чисел в таком же порядке, в каком следуют числа во входном файле.
# Пример запроса к интересному числу:
# http://numbersapi.com/31/math?json=true
# Пример запроса к скучному числу:
# http://numbersapi.com/999/math?json=true
# Пример входного файла:
# 31
# 999
# 1024
# 502
# ﻿Пример выходного файла:
# Interesting
# Boring
# Interesting
# Boring

import requests
import json

with open('dataset.txt') as f:
    x = f.read().splitlines()

for i in x:
    api_url = 'http://numbersapi.com/'+ i + '/math'
    params = {
       'json': 'true'
    }
    res = requests.get(api_url, params = params)
    # print (res.status_code)
    # print (res.headers["Content-Type"])
    data = res.json()
    # print (data)
    if (data['found']) == True:
        print('Interesting')
    else:
        print('Boring')
