package OOP.Sem2.ex1;

import java.util.List;

// Описать человека с возможностью заведения животных
// Добавить методы по изменению параметров
// Сделать добавление животных интерактивным
// Вывести в консолоь
    public class Human extends Animals {
        private List<Animals> pets;
        private String name;
        public String getName() {
            return name;
        }

        public List<Animals> getPets() {
            return pets;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Human(List<Animals> pets, String name) {
            this.pets = pets;
            this.name = name;
        }
        @Override
        void tellAboutYourself() {
            System.out.println("Я - человек");
        }
    }

