package com.epam.newyear;

import com.epam.newyear.gift.candy.Candy;
import com.epam.newyear.gift.candy.concrete.AlenushkaChocolate;
import com.epam.newyear.gift.candy.concrete.BearInTheNorthComfit;
import com.epam.newyear.gift.candy.concrete.JujInMarmComfit;

/**
 * 
 * @author Alexander Lotsmanov
 *         <p>
 *         <b>Задание</b>
 *         <dl>
 *         <dt>Общие требования</dt>
 *         <dd>
 *         <ol>
 *         <li>Код должен быть отформатирован и соответствовать
 *         <em><b>Java Code Convention</b></em></li>
 *         <li>Решение поставленной задачи, должно быть реализовано в классе,
 *         который находится в пакете
 *         <b>com.epam.firstname_lastname.java.lesson_number.task_number</b>,<br>
 *         например: <b>com.epam.anton_ostrenko.java.lesson2.task2</b>.</li>
 *         <li>Класс, который содержит main-метод, должен иметь осмысленное
 *         название. Внутри метода main создайте объект его класса, у которого
 *         вызовете метод, являющийся стартовым для решения вашей задачи.</li>
 *         <li>В комментарии к классу пропишите своё имя и номер задачи. По
 *         возможности добавлять содержательные комментарии к коду.</li>
 *         <li>Использовать: классы, наследование, интерфейсы, полиморфизм,
 *         инкапсуляция.</li>
 *         <li>Каждый класс, метод и переменная должны иметь исчерпывающее смысл
 *         название и информативный состав. Необходимо точно продумать, какие
 *         классы необходимы для решения задачи.</li>
 *         <li>Наследование должно применяться только тогда, когда это имеет
 *         смысл.</li>
 *         <li>Классы должны быть грамотно разложены по пакетам.</li>
 *         <li>В каждом классе должны быть поля и методы, которые вы посчитаете
 *         необходимыми. Программа должна создавать объекты различных классов в
 *         выделенной предметной области, объединять их в какой-то набор
 *         объектов</li>
 *         <li>В качестве структур для хранения данных использовать массивы или
 *         организовать собственную структуру данных как обертку над массивом
 *         (класс, который содержит массив для хранения элементов и обеспечивает
 *         необходимые действия для работы с ним (добавление, удаление и т.д.)).
 *         </li>
 *         </ol>
 *         </dd>
 *         <dt>Вариант №1</dt>
 *         <dd><em>&quot;Новогодний подарок&quot;</em></dd>
 * 
 *         <dt>Описание предметной области</dt>
 *         <dd>Определить иерархию конфет и прочих сладостей. Создать несколько
 *         объектов-конфет. Собрать детский подарок с определением его веса.</dd>
 * 
 *         <dt>Основные характеристики предметной области</dt>
 *         <dd>
 *         Сладости, из которых собираются подарки, имеют следующие
 *         характеристики:
 *         <dl>
 *         <dt>Name</dt>
 *         <dd>название сладости</dd>
 * 
 *         <dt>Energy</dt>
 *         <dd>калорийность (ккал)</dd>
 * 
 *         <dt>Type</dt>
 *         <dd>(должно быть несколько) – тип сладости (карамель, ирис, вафля,
 *         шоколад [с начинкой либо нет])</dd>
 * 
 *         <dt>Ingredients</dt>
 *         <dd>(должно быть несколько) – ингредиенты: вода, сахар (в г),
 *         фруктоза (в г), ванилин (в г)</dd>
 * 
 *         <dt>NutritionalValue</dt>
 *         <dd>пищевая ценность: белки (в гр.), жиры (в гр.) и углеводы (в гр.)
 *         <br>
 *         <em>(К сведению: 1 г жиров выделяет 9,3 ккал, 1 г углеводов – 4,1 ккал, 1 г белков – 4,1 ккал. Источник: <a href="www.AzbukaDiet.ru">www.AzbukaDiet.ru</a>)</em>
 *         </dd>
 * 
 *         <dt>Production</dt>
 *         <dd>предприятие-изготовитель</dd>
 *         </dl>
 *         Вершину иерархии сладостей назвать <b>&quot;Candy&quot;</b></dd>
 * 
 *         </dl>
 */
public class NewYearGift {

    private Candy[] candies;

    public NewYearGift() {
        collectGift();
    }

    private void collectGift() {
        candies = Source.getGift();
        System.out.println("Детский подарок собран:");
        int count = 0;
        for (Candy candy : candies) {
            System.out.println(++count + ". \"" + candy.getName() + "\"");
        }
        System.out.println();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        NewYearGift app = new NewYearGift();
        app.startApp();
    }

    public void startApp() {
        double weight = 0.0;
        double energy = 0.0;
        for (Candy candy : candies) {
            System.out.println(candy);
            candy.eat();
            weight += candy.getWeight();
            energy += candy.getEnergy();
            System.out.println("Вы скушали " + candy.getWeight() + " грамма "
                    + candy.getName() + ". В результате вы получили "
                    + candy.getEnergy() + " ккал!\n");
        }
        System.out.println("\nОбщий вес съеденных сладостей: " + weight
                + " грамм. В результате вы получили " + energy + " ккал!");
    }

}

class Source {
    private static final int INIT_CANDY_COUNT = 3;
    private Source(){}
    public static Candy[] getGift() {
        Candy[] candies = new Candy[INIT_CANDY_COUNT];
        candies[0] = new BearInTheNorthComfit("Мишка на севере",
                "Фабрика имени Н. К. Крупской");
        candies[1] = new JujInMarmComfit("Карамель в мармеладе",
                "Алекс инкорп.");
        candies[2] = new AlenushkaChocolate("Аленушка",
                "Фабрика Красный Октябрь");
        return candies;
    }
}
