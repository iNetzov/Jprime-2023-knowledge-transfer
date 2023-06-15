public class Snippets {
}

class Psmv {
    //    'psvm'
    public static void main(String[] args) {

    }
}

class Sout {
    public static void main(String[] args) {
//        'sout'
        System.out.println();
        System.out.println();
    }
}

class SoutV {
    public static void main(String[] args) {
//        'soutv'
        String a = "SoutV";
        String b  =  "b";
        System.out.println("b = " + b);

        System.out.println("a = " + a);
        System.out.println("a = " + a);
    }
}

class Serr {
    public static void main(String[] args) {
//        'serr'
        System.err.println();
        System.err.println();
    }
}

class SoutAndSerrOnVar {
    public static void main(String[] args) {
        String tst = "Test";
//        tst.sout
//        tst.serr
        System.out.println(tst);
        System.err.println(tst);
        System.out.println(tst);
        System.err.println(tst);
    }
}

class ForI {
    public static void main(String[] args) {
//        fori
        for (int i = 0; i < 150; i++) {

        }
        for (int j = 0; j < 1999; j++) {

        }
    }
}

class Inn {
    public static void main(String[] args) {
//        Inn
        if (args != null) {

        }
        if (args != null) {

        }
    }
}

class Ifn {
    public static void main(String[] args) {
//        Ifn
        if (args == null) {

        }
    }
}

class St {
    public static void main(String[] args) {
//        St >> String
//        String

    }
}

class thr {
    public static void main(String[] args) {
//        thr >> throw new
        throw new IllegalArgumentException();
//        throw new IllegalArgumentException();
    }
}

class Iter {
    public static void main(String[] args) {
//        'iter'
        for (String arg : args) {

        }
        for (String arg : args) {
        }
    }
}

class FixMe {
//        'fixme'
    // FIXME: 15.6.2023
    // FIXME: 15.6.2023
    //  TODO

}

class customSnippet {
//    custom snippet
//    soutI

public static void main(String[] args) {
    System.out.println("HelloWorld");
}
}



