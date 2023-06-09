# Персональное задание (вариант 10)

Сервис должен принимать один параметр (строка) и вернуть результат проверки предоставленной параметром строки на полином («палиндром»/«не палиндром»).

# Стадии выполнения (задания)

Данный раздел содержит требования к определенной стадии выполнения персонального задания.

В свою очередь, требования каждой стадии соответствует техническому заданию соответствующей лабораторной работы.

## 1. Intro
Необходимо:
- Создать и запустить локально простой веб/REST сервис, используя любой открытый (например, в открытом доступе в сети  интернет) пример с использованием Java stack: Spring (Spring Boot)/maven/gradle/Jersey/Spring MVC.
- Добавить GET endpoint, принимающий входные параметры в качестве queryParams в URL и возвращающий результат в виде JSON согласно варианту.

## 2. Error logging/handling
Необходимо:
- Добавить валидацию входных параметров с возвращением 400 ошибки.
- Добавить обработку внутренних unchecked ошибок с возвратом 500 ошибки.
- Добавить логирование действий и ошибок.
- Написать unit test.

## 3. Collections intro, project structure
Необходимо:
- Добавить простейший кэш в виде in-memory Map для сервиса. Map должна содержаться в отдельном бине/классе, который должен добавляться в основной сервис с помощью dependency injection механизм Spring.

## 4. Concurrency
Необходимо:
- Добавить сервис для подсчёта обращений к основному сервису. Счётчик должен быть реализован в виде отдельного класса, доступ к которому должен быть синхронизирован.
- Используя jmeter/postman или любые другие средства сконфигурировать нагрузочный тест и убедиться, что счётчик обращений работает правильно при большой нагрузке.

## 5. Functional programming with Java 8
Необходимо:
- Преобразовать исходный сервис для работы со списком параметров для bulk операций используя Java 8 лямбда выражения.
- Добавить POST метод для вызова bulk операции и передачи списка параметров в виде JSON.

## 6. Functional filtering and mapping
Необходимо:
- Добавить аггрегирующий функционал (подсчёт макс, мин, средних значений) для входных параметров и результатов с использованием Java 8 map/filters функций. Расширить результат POST соотвественно.

## 7. Data persistence
Необходимо:
- Добавить возможность сохранения всех результатов вычислений в базе данных или файле, используя стандартные persistence фреймворки Java (Spring Data/Hibernate/MyBatis).

## 8. Asynchronous calls
Необходимо:
- Добавить возможность асинхронного вызова сервиса используя future, возвращать статус вызова REST сервиса не дожидаясь результатов подсчётов. Результаты подсчётов должны быть представлены в БД по предопределённой ID.
