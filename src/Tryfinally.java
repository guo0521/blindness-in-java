public class Tryfinally {
    public static void main(String[] args) {
        People bride;
        bride = marry();
        System.out.println(bride.getState());//结果受finally影响，输出dead
    }
    private static People marry() {
        People people = new People();
        people.setState("happy");;
        try{
            int b=4/0;
            return people;
        }catch(Exception e){
            return people;
        }finally {
            people = new People();
            people.setState("haha");
        }
    }
}