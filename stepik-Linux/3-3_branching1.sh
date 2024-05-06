# Напишите скрипт на bash, который принимает на вход один аргумент (целое число от 0 до бесконечности), который будет обозначать число студентов в аудитории. В зависимости от значения числа нужно вывести разные сообщения. 
# Соответствие входа и выхода должно быть таким:
# 0 -->  No students
# 1 -->  1 student
# 2 -->  2 students
# 3 -->  3 students
# 4 -->  4 students
# 5 и больше --> A lot of students

#!/bin/bash

var1=$1

if [[ $1 -ge 2 && $1 -le 4 ]]
then
	echo "$1 students"
elif [[ $1 -gt 4 ]]
then
	echo "A lot of students"
else
	case $1 in
		0)
			echo "No students"
			;;
		1)
			echo "1 student"
			;;
		*)
			echo "Wrong value!"
			;;
	esac
fi
