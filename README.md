# Пример как писать тесты в [Yandex.Contest](https://contest.yandex.ru/)


Делюсь своим опытом как проходить тесты в Яндекс Контест.
Уже после прохождения теста, который я провалил,
решил повторить чисто для проверки сколько времени уйдет на написание кода, если уже знаешь что писать.

## Тест поиска плотности заказов
**Задача (файл src/test/java/test)**  
> Задан список заказов с координатами (целые положительные числа)
Задана площадь прямоугольника.
Найти наибольшее число заказов, которые вмещаются в данный прямоугольник и вывести, это число
и их список 

Допустим мы за 5 секунд поняли что надо делать и поняли что написать в коде.
А дальше чисто набираем код ручками. Итак, судя по коммитам в этом репозитарии:
 - 25 минут ушло на написание кода - когда уже знаешь что писать - причем в среде IDEA, которая подсказывает и 50% синтаксических ошибок исправляет на лету, а не в редакторе Контест.Яндекс - там еще надо будет добавить минут 5-10 на отлов ошибок по невнимательности.
 - 10 минут на правки ошибок в IDEA.

Это не считая времени которое бы потратилось на тесты в Яндексе - там каждый запуск - 1-5 минут.
При исправлении каждой ошибки это еще 15-20 минут!
Причем еще на правильный вывод (убрать пробел в конце строки) еще ушло минут 10.
Вообще нужно уже иметь заготовленные шаблоны для ввода и вывода, так как даже на их правильное написание,
включая обработку замыкающих пробелов в списках при выводе, может уйти 5-10 минут!

Итого уже почти час (45мин) ушел на то, чтобы просто написать и отладить одну задачу...

А еще нужно было подумать - что писать!
Понять текст задачи, придумать алгоритм...

## Тест квадрата 2*N+1 "шашки и диагональ нулей"
**Задача (файл src/test/java/test_cube2)**  
> Дано число N, создать квадрат (матрицы, массив) со сторонами 2*N+1, в котором
> по диагонали клетки с 0-ми, клетки как в шашках - черно-белые (для ориентира),
> и в белых клетках ставим положительные увеличивающиеся числа (от 1) по ходу перебора по строкам,
> а в черные отрицательные уменьшающиеся (от -1) по вертикали.

Пример решения для N=2:  
0 1 -4 2 -7  
3 0 4 -6 5  
-1 6 0 7 -8  
8 -3 9 0 10  
-2 11 -5 12 0  

Это простая задача, чисто математика и в индексах не ошибиться.
Попробовал ее чисто набрать уже после окончания тестирования Яндекса. 
Ушло тоже около 30 минут. А вот при прохождении теста я ее даже не начал, так как:
- потратил минут 20 только на правильный ввод вывод
- зашился на 4-м тесте, допустив ошибку в понимании задачи

## Выводы
1. Иметь заготовки ввода-вывода.
2. Писать в среде разработки.
3. Тестировать тоже в ней на ошибки синтаксиса и логики
4. После прочтения задачи пойти пройтись "до кухни" чтобы мысли заработали ))


https://contest.yandex.ru/
