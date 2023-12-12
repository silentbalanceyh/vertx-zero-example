
class MainA{
    public static void main(String[] args){
        System.out.println("Main A");
    }
}

class MainB{
    public static void main(String... args){
        System.out.println("Main B");
    }
}

class MainC{
    public static void main(String args){
        System.out.println("Main C");
    }
}

class MainD{
    static void main(String[] args){
        System.out.println("Main D");
    }
}

class MainE{
    public static synchronized void main(String[] args){
        System.out.println("Main E");
    }
}

class MainF{
    public static final void main(String... args){
        System.out.println("Main F");
    }
}

class MainG{
    public void main(String[] args){
        System.out.println("Main G");
    }
}

interface MainH{
    static void main(String[] args){
        System.out.println("Main H");
    }
}

class MainI{
    public static int main(String[] args){
        System.out.println("Main I");
        return 0;
    }
}