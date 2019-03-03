import java.util.ArrayList;
import java.util.List;

public class Main  {

    public static void main(String[] args) {
        List <? extends Fruit> list1 = new ArrayList<>();

//        Почему не работает нижняя строчка? Что вообще можно записать в этот список?
//        list1.add(new Apple());


        List <? super Fruit> list2 = new ArrayList<>();
        list2.add(new Fruit());
        list2.add(new Apple());
        list2.add(new Jonathan());

        List <?> list3 = new ArrayList<>();
//        Почему не работает нижняя строчка? Что вообще можно записать в этот список?
//        list3.add(new Apple());




    }




}
