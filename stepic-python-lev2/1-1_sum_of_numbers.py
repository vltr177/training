# Реализуйте программу, которая принимает последовательность чисел и выводит их сумму.

# Вашей программе на вход подается последовательность строк.
# Первая строка содержит число n (1 ≤ n ≤ 100).
# В следующих n строках содержится по одному целому числу.
# Выведите одно число – сумму данных n чисел.

arg = int(input())
value = []
for i in range(arg):
    value.append(int(input()))
print(sum(value))
