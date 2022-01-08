//Функция принимает два отсортированных от меньшего к большему ArrayList одинакового размера
// [a1, a2, ..., an], [b1, b2, ..., bn]. В результате выполнения функции в первом(!) ArrayList
// (в данном случае это А) должны содержаться элементы обоих ArrayList, также отсортированные
// от меньшего к большему. Второй ArrayList должен остаться неизменненным.

import java.util.ArrayList;
import java.util.Arrays;


public class Test {
    static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int aIterLil = a.size()-1;

        a.ensureCapacity(a.size() + b.size());
        a.addAll(b);

        int bIter = b.size() - 1;
        int aIterBig = a.size() - 1;

        while (aIterLil  >= 0 && bIter >= 0) {
            Integer aLastNumber = a.get(aIterLil);
            Integer bLastNumber = b.get(bIter);

            if (aLastNumber > bLastNumber) {
                a.set(aIterBig, aLastNumber);
                --aIterLil;
            } else {
                a.set(aIterBig, bLastNumber);
                --bIter;
            }
            --aIterBig;
        }

        // we must added all b[i] < a[1]
        while (bIter >= 0) {
            a.set(aIterBig, b.get(bIter));
            --bIter;
            --aIterBig;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(2, 3, 4));
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(1, 6));
        System.out.println(a);
        System.out.println(b);
        merge(a, b);
        System.out.println(a);
    }
}
