public class Tryfinally {
    public static void main(String[] args) {
        People bride;
        bride = marry();
        System.out.println(bride.getState());//结果受finally影响，输出dead(改变引用无影响，不改变引用改变属性有影响)
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
//            people.setState("dead");//result: dead
            people = new People();
            people.setState("haha");//result: happy
        }
    }
}