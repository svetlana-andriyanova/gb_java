package Task6;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

//Создать множество ноутбуков.

//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        HashSet<Notebook> shop = new HashSet<>();
        addNoteBook(shop);
        HashMap<String, String> filters = new HashMap<>();
        startMenu(filters);
        System.out.println(runFilter(shop, filters));
    }

    public static HashSet<Notebook> addNoteBook(HashSet<Notebook> product) {
        Notebook Lenovo = new Notebook("Lenovo", "Idea Pad", "8Gb", "1TB", "Linux", "black");
        Notebook Mac = new Notebook("Apple", "MacBook Pro", "16Gb", "2TB", "Unix", "grey");
        Notebook Acer = new Notebook("Aser", "Aspire", "16Gb", "2TB", "Windows10", "grey");
        Notebook Asus = new Notebook("Asus", "Vivo book",  "8Gb", "512GB", "Windows10", "red");

        product.add(Lenovo);
        product.add(Mac);
        product.add(Acer);
        product.add(Asus);

        return product;
    }

    public static HashMap<String, String> startMenu(HashMap<String, String> filters) {
        try (Scanner isScanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("Введите цифру, соответствующую критерию поиска");
                System.out.println("1. Выберите производителя");
                System.out.println("2. Выберите объем жесткого диска");
                System.out.println("3. Выберите объем оперативной памяти");
                System.out.println("4. Выберите операционную систему");
                System.out.println("Для выхода нажмите 0");
                choice = isScanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Введите название производителя, либо Enter для перехода к следующему пункту");
                        String brand = new Scanner(System.in).nextLine();
                        filters.put("brand", brand);
                        break;
                    case 2:
                        System.out.println("Введите объем жесткого диска, либо Enter для перехода к следующему пункту");
                        String hardDisk = new Scanner(System.in).nextLine();
                        filters.put("hardDisk", hardDisk);
                        break;
                    case 3:
                        System.out.println("Введите объем оперативной памяти, либо Enter для перехода к следующему пункту");
                        String operativeMemory = new Scanner(System.in).nextLine();
                        filters.put("operativeMemory", operativeMemory);
                        break;
                    case 4:
                        System.out.println("Введите операционную систему, либо Enter для перехода к следующему пункту");
                        String system = new Scanner(System.in).nextLine();
                        filters.put("system", system);
                        break;
                    default:
                        break;
                }
            } while (choice > 0);
        }
        return filters;
    }

    public static List<Notebook> runFilter(HashSet<Notebook> product, HashMap<String, String> filters) {
        List<Notebook> productSelect = new ArrayList<>();

        for (Notebook notebook : product) {
            String filterBrand = filters.get("brand");
            if (filterBrand != null
                    && !filterBrand.equals(notebook.getBrand())) {
                continue;
            } 

            String filterModel = filters.get("model");
            if (filterModel != null
                    && !filterModel.equals(notebook.getModel())) {
                continue;
            }

            String filterOperativeMemory = filters.get("operativeMemory");
            if (filterOperativeMemory != null
                    && !filterOperativeMemory.equals(notebook.getOperativeMemory())) {
                continue;
            }

            String filterSSD = filters.get("ssd");
            if (filterSSD != null
                    && !filterSSD.equals(notebook.getSSD())) {
                continue;
            }

            String filterOS = filters.get("os");
            if (filterOS != null
                    && !filterOS.equals(notebook.getOS())) {
                continue;
            }

            productSelect.add(notebook);
        }

        return productSelect;
    }
}