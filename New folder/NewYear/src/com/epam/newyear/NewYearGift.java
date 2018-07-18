package com.epam.newyear;

import com.epam.newyear.gift.candy.Candy;
import com.epam.newyear.gift.candy.concrete.AlenushkaChocolate;
import com.epam.newyear.gift.candy.concrete.BearInTheNorthComfit;
import com.epam.newyear.gift.candy.concrete.JujInMarmComfit;

/**
 * 
 * @author Alexander Lotsmanov
 *         <p>
 *         <b>�������</b>
 *         <dl>
 *         <dt>����� ����������</dt>
 *         <dd>
 *         <ol>
 *         <li>��� ������ ���� �������������� � ���������������
 *         <em><b>Java Code Convention</b></em></li>
 *         <li>������� ������������ ������, ������ ���� ����������� � ������,
 *         ������� ��������� � ������
 *         <b>com.epam.firstname_lastname.java.lesson_number.task_number</b>,<br>
 *         ��������: <b>com.epam.anton_ostrenko.java.lesson2.task2</b>.</li>
 *         <li>�����, ������� �������� main-�����, ������ ����� �����������
 *         ��������. ������ ������ main �������� ������ ��� ������, � ��������
 *         �������� �����, ���������� ��������� ��� ������� ����� ������.</li>
 *         <li>� ����������� � ������ ��������� ��� ��� � ����� ������. ��
 *         ����������� ��������� �������������� ����������� � ����.</li>
 *         <li>������������: ������, ������������, ����������, �����������,
 *         ������������.</li>
 *         <li>������ �����, ����� � ���������� ������ ����� ������������� �����
 *         �������� � ������������� ������. ���������� ����� ���������, �����
 *         ������ ���������� ��� ������� ������.</li>
 *         <li>������������ ������ ����������� ������ �����, ����� ��� �����
 *         �����.</li>
 *         <li>������ ������ ���� �������� ��������� �� �������.</li>
 *         <li>� ������ ������ ������ ���� ���� � ������, ������� �� ����������
 *         ������������. ��������� ������ ��������� ������� ��������� ������� �
 *         ���������� ���������� �������, ���������� �� � �����-�� �����
 *         ��������</li>
 *         <li>� �������� �������� ��� �������� ������ ������������ ������� ���
 *         ������������ ����������� ��������� ������ ��� ������� ��� ��������
 *         (�����, ������� �������� ������ ��� �������� ��������� � ������������
 *         ����������� �������� ��� ������ � ��� (����������, �������� � �.�.)).
 *         </li>
 *         </ol>
 *         </dd>
 *         <dt>������� �1</dt>
 *         <dd><em>&quot;���������� �������&quot;</em></dd>
 * 
 *         <dt>�������� ���������� �������</dt>
 *         <dd>���������� �������� ������ � ������ ���������. ������� ���������
 *         ��������-������. ������� ������� ������� � ������������ ��� ����.</dd>
 * 
 *         <dt>�������� �������������� ���������� �������</dt>
 *         <dd>
 *         ��������, �� ������� ���������� �������, ����� ���������
 *         ��������������:
 *         <dl>
 *         <dt>Name</dt>
 *         <dd>�������� ��������</dd>
 * 
 *         <dt>Energy</dt>
 *         <dd>������������ (����)</dd>
 * 
 *         <dt>Type</dt>
 *         <dd>(������ ���� ���������) � ��� �������� (��������, ����, �����,
 *         ������� [� �������� ���� ���])</dd>
 * 
 *         <dt>Ingredients</dt>
 *         <dd>(������ ���� ���������) � �����������: ����, ����� (� �),
 *         �������� (� �), ������� (� �)</dd>
 * 
 *         <dt>NutritionalValue</dt>
 *         <dd>������� ��������: ����� (� ��.), ���� (� ��.) � �������� (� ��.)
 *         <br>
 *         <em>(� ��������: 1 � ����� �������� 9,3 ����, 1 � ��������� � 4,1 ����, 1 � ������ � 4,1 ����. ��������: <a href="www.AzbukaDiet.ru">www.AzbukaDiet.ru</a>)</em>
 *         </dd>
 * 
 *         <dt>Production</dt>
 *         <dd>�����������-������������</dd>
 *         </dl>
 *         ������� �������� ��������� ������� <b>&quot;Candy&quot;</b></dd>
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
        System.out.println("������� ������� ������:");
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
            System.out.println("�� ������� " + candy.getWeight() + " ������ "
                    + candy.getName() + ". � ���������� �� �������� "
                    + candy.getEnergy() + " ����!\n");
        }
        System.out.println("\n����� ��� ��������� ���������: " + weight
                + " �����. � ���������� �� �������� " + energy + " ����!");
    }

}

class Source {
    private static final int INIT_CANDY_COUNT = 3;
    private Source(){}
    public static Candy[] getGift() {
        Candy[] candies = new Candy[INIT_CANDY_COUNT];
        candies[0] = new BearInTheNorthComfit("����� �� ������",
                "������� ����� �. �. ��������");
        candies[1] = new JujInMarmComfit("�������� � ���������",
                "����� ������.");
        candies[2] = new AlenushkaChocolate("��������",
                "������� ������� �������");
        return candies;
    }
}
