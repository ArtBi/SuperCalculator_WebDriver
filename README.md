# SuperCalculator_WebDriver
Напишите тест для демо приложения.
http://juliemr.github.io/protractor-demo/
 
Типы данных - Целые отрицательные и положительные числа.
Тесты должны включать по одному положительному тест кейсу на каждое пересечение групп
(сложение, вычитание, умножение, деление) (Целые отрицательные) (Целые положительные числа)
и специальные отрицательные тесты : деление на ноль, сложение букв , пустых значений.
 
Примеры :
 
Положительные :
            "Сложение"
            Сложение отрицательных -1 + (-2)= -3
            Сложение положительных и отрицательных 1 + (-2) = -1
            
Отрицательные :
            wef + gfds = NaN
           
            
Требования :
Язык - Java 8
Build system - any (Maven,Gradle,etc)
Test framework - TestNG
 
Страничка должны быть построена с помощью паттерна PageObject (без PageFactory)
История результата должена быть представлена класслом ResultHistory, которые реализует LoadableComponent
Кнопки и поля select должны быть обёрнуты в классы, напрмер CalculatorOperator, FirstNumberImput, SecondNumberInput
Элементы компонента  ResultHistory (ряды) должны быть обёрнуты в класс TableRow
Структура такая Page содержит компонент и элементы страницы, компонент содержит элементы компонента
TestNG xml файл должен содержать два Test Suite : положительные тесты, отрицательные тесты
 
Будет плюсом использование FluentInterface
 
Ссылки с информацией :
 
LoadableComponent :  https://github.com/SeleniumHQ/selenium/wiki/LoadableComponent
PageObject : https://github.com/SeleniumHQ/selenium/wiki/PageObjects
TestNG : http://testng.org/doc/index.html
Fluent_interface :   https://ru.wikipedia.org/wiki/Fluent_interface

Test Suites: NegativeSuite.xml	и PositiveSuite.xml
