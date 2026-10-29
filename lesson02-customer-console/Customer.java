public class Customer {
        int id;
        String name;
        String phone;
        int level;

        public Customer(int id, String name, String phone, int level){
            this.id = id;
            this.name = name;
            this.phone = phone;
            this.level = level;
        }

        @Override
        public String toString(){
            return id + " "+ name + " "+ phone + " "+ level;
        }
}
