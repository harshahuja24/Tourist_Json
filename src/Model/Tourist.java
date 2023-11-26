package Model;

public class Tourist {
   private int user_id;
   private String name;
   private String surname;
   private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public Tourist(String name,String surname, int age, int user_id){
      this.name=name;
      this.surname=surname;
      this.age=age;
      this.user_id=user_id;
    }
        public String toString(){

        return "User name:"+this.name+" Surname:"+this.surname+" Age:"+this.age+" User ID:"+this.user_id;
    }
}
