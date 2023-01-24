package model;

import java.util.ArrayList;

    public class Child extends Parent {
        public String first_name;
        public ArrayList<Hobbies> hobbies;
        public int age;

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public ArrayList<Hobbies> getHobbies() {
            return hobbies;
        }

        public void setHobbies(ArrayList<Hobbies> hobbies) {
            this.hobbies = hobbies;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Child(String house_address, String family_name, String first_name, ArrayList<Hobbies> hobbies, int age) {
            super(house_address, family_name);
            this.first_name = first_name;
            this.hobbies = hobbies;
            this.age = age;
        }

        public Child(String house_address, String family_name) {
            super(house_address, family_name);
        }

    }