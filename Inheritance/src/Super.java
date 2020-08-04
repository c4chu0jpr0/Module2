public class Super {
    private String a="Tuấn";
    Super(){
        this.a="ABC";
    }
    Super(String a){
        this.a = a;
    }
    public void speak(){
        System.out.println("haha");
    }

    @Override
    public String toString() {
        return "Super{" +
                "a='" + a + '\'' +
                '}';
    }
}
