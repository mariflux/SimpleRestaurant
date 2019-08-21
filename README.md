# SimpleRestaurant

Tresc zadania\
Celem zadania jest stworzenie symulacji preznie działajacej restauracji. Restauracja zaczyna z pewnym zasobem dan,
co pewien interwał przygotowuje kolejne dania, a w miedzyczasie klienci składaja zamówienia. Problemem jest fakt, ze
głodny tłum składa zamówienia w nierównych odstepach czasu, a kucharz nie zawsze jest w stanie ugotowac wystarczajaco
duzo posiłków. Wtedy restauracja traci pieniadze z niewykonanego zamówienia. Chcemy sprawdzic, jak duzo restauracja
zarabia w stosunku do tego, ile traci na nieprzygotowanych daniach. Menu symulowanej restauracji wyglada nastepujaco: \
• Lody - 8pln, \
• Gyros - 12pln,\
• Tortilla - 13pln,\
• Pizza - 18pln,\
• Stek - 30pln.\
Rozwiazanie wzorcowe składa sie z 4 klas:\
• Restaurant , która przechowuje informacje o aktualnych zasobach, zarobionych oraz straconych pieniadzach.\
• HungryCrowd , która odpowiada za składanie zamówien do restauracji.\
• Dish , która jest enumem reprezentujacym odpowiednie danie z menu.\
• Main , która tworzy obiekty restauracji, tłumu i uruchamia ich symulacje.\
Przykładowa konfiguracja:\
• Restauracja zaczyna z 3 daniami kazdego rodzaju. Co 5 sekund swojego cyklu przygotowuje po 1 daniu z kazdego
rodzaju.\
• Tłum składa zamówienia co 1-4 sekund. Zamówienie to jeden rodzaj dania zamówiony 2-6 razy.\
Przykładowy output:\
Successfully ordered 5 Pizza\
Couldn’t order 2 Pizza\
Money earned|lost: 90|36 Current stock: 6 Steak 6 Tortilla 1 Pizza 6 IceCream 6 Gyros\
Successfully ordered 4 Gyros\
Couldn’t order 2 Pizza\
Couldn’t order 5 Pizza\
Money earned|lost: 138|162 Current stock: 7 Steak 7 Tortilla 2 Pizza 7 IceCream 3 Gyros\
Couldn’t order 5 Gyros\
Successfully ordered 2 Pizza\
Couldn’t order 3 Pizza\
Money earned|lost: 174|276 Current stock: 8 Steak 8 Tortilla 1 Pizza 8 IceCream 4 Gyros
