# Вам дана последовательность строк.
# Выведите строки, содержащие "cat" в качестве слова.

# Sample Input:
# cat
# catapult and cat
# catcat
# concat
# Cat
# "cat"
# !cat?
# Sample Output:
# cat
# catapult and cat
# "cat"
# !cat?

import sys
import re

pattern = r'\bcat\b'

for line in sys.stdin:
  line = line.rstrip()
  if len(re.findall(pattern,line)) >= 1:
    print (line)
