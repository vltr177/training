# Вам дается текстовый файл, содержащий некоторое количество непустых строк.
# На основе него сгенерируйте новый текстовый файл, содержащий те же строки в обратном порядке.

# Пример входного файла:
# ab
# c
# dde
# ff

﻿# Пример выходного файла:
# ff
# dde
# c
# ab

with open('dataset.txt') as f, open('result.txt', 'w') as w:
    x = f.read().splitlines()
#    print(x)
    x.reverse()
#    print(x)
    content = '\n'.join(x)
    w.write(content)
