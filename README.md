# SpringHelloWorldProject

Hello World проект

## Использованные инструменты

* [H2 Database Engine](http://www.h2database.com/html/main.html)
* [Maven](https://maven.apache.org/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [MyBatis](http://www.mybatis.org/mybatis-3/)

## Скачивание

* 1.1 Скачиваем этот репозиторий на свой локальный компьютер, используя `https://github.com/eldar128/SpringHelloWorldProject` либо через кнопку **Clone or download** затем **Download ZIP**

## Запуск

* 2.1 Заходим в папку *SpringHelloWorldProject*

* 2.2 Запускаем команду `mvn spring-boot:run`

* 2.3 Ждем когда запуститься сервер

## Проверка

* 3.1 После запуска сервера заходим в браузере по адресу: `http://localhost:8080/`

* 3.2 И видим результат

## Изменение данных

* 4.1 Вводим в новом окне адрес: `http://localhost:8080/h2`

* 4.2 Нажимаем на кнопку **Connect** (Убедитесь, что в качестве JDBC URL используется jdbc:h2:mem:testdb)

* 4.3 В поле **SQL Statement** вводим запрос: `UPDATE message SET text = 'ASD' WHERE id = 1`

* 4.4 Нажимаем на кнопку **Run**

* 4.5 После обновляем страницу `http://localhost:8080/` и видим, что сообщение изменилось