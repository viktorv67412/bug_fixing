package bug_1;

public enum CustomEnum {
    //PLEASE uncomment

    ACTION_ONE(5) {
        public int f(){
            return this.i;
        }
    },
    ACTION_TWO(1) {
                public void print(){
                    System.out.println(this.i);
                }
    },
    ECTION_THREE(2) {
        public void print(){
            System.out.println("");
        }
    };

    public int i;

    CustomEnum(int i) {
        this.i = i;
    }
}
