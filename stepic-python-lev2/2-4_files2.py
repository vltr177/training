# Вам дана в архиве (ссылка) файловая структура, состоящая из директорий и файлов.
# Вам необходимо распаковать этот архив, и затем найти в данной в файловой структуре все директории, в которых есть хотя бы один файл с расширением ".py". 
# Ответом на данную задачу будет являться файл со списком таких директорий, отсортированных в лексикографическом порядке.

import os
import os.path

os.chdir('main')
result = []
#root = os.getcwd()

for current_dir, dirs, files in os.walk('.'):
    for file in files:
        if file[-3:] == '.py':
            result.append(str('main' + current_dir[1:]))
uni_result = list(set(result))
uni_result.sort()

with open('result.txt', 'w') as w:
    content = '\n'.join(uni_result)
    w.write(content)
