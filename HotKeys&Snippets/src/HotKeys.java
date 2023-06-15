import java.util.Scanner;

public class HotKeys {
}


class Ctrl_Plus {
    public static void main(String[] args) {
//      ctrl + '+' >> to fold the method.
    }
}

class Ctrl_Minus {
    public static void main(String[] args) {
//      ctrl + '-' >> to collapse the method.
    }
}

class Ctrl_D {
    public static void main(String[] args) {
//      ctrl+D >> to duplicate a line.
        System.out.println("hhii");
        System.out.println("hhii");
        System.out.println("hhii");
        System.out.println("hhii");
        System.out.println("hhii");
    }
}

class Ctrl_Shift_Space {
    public static void main(String[] args) {
        String name = "Ecommerce";
//ctrl + shift+ space >> to smart code completion.
    }

}

class Ctrl_Alt_L {
    public static void main(String[] args) {
        //ctrl + Alt + L >> Reformat Bad Code.
        String                  name =                    "Bad Code"                  ;
    }
}

class Ctrl_Alt_O {
    public static void main(String[] args) {
//        Comment the line below and execute command Ctrl+ Alt + O to remove not used imports
        Scanner scanner = new Scanner(System.in);
    }
}

class Ctrl_Alt_T {
    public static void main(String[] args) {
//        Ctrl+ Alt + T to surround the line/ lines with block try/cathe , if/else , switch, ect

        System.out.println("surround me");
    }
}

class Ctrl_Shift_F {
    public static void main(String[] args) {
//        Ctrl+shift+F find in all files in a project.
//        NOTE: it is CaseInsensitive.
//        search for 'findME'.
    }
}

class Ctrl_R {
    public static void main(String[] args) {
//        Ctrl + R >> replaces arg in a single file.

// Try this: --> ReplaceMeOnce

    }
}

class Ctrl_Shift_R {
    public static void main(String[] args) {
//        Ctrl + Shift + R >> replaces arg in  all project file.
// try this --> ReplaceAllInstances
    }
}

class Ctrl_E {
    public static void main(String[] args) {
//        Ctrl + E >> show recently opened files.
    }
}

class Ctrl_Shift_E {
    public static void main(String[] args) {
//       Ctrl + Shift + E >> Show only edited files
    }
}

class Ctrl_B {
    public static void main(String[] args) {
//        Ctrl + B >> go to declaration of a given method.
        System.err.println();
    }
}

class Ctrl_F12 {
//    Ctrl + F12  >> Show class structure
}

class Ctrl_Shift_F12 {
//    Ctrl + Shift + F12 >> hides menus and leave only code screen.
}

class Ctrl_Ctrl {
    //    Ctrl + Ctrl >> runs Run command like terminal.
//    Can start ping 10.10.19.178 (your Ip address).

}

class Ctrl_Shift_UpArrow_DownArrow {
    public static void main(String[] args) {
//        Ctrl + Shift + upArrow >> move line up.
//        Ctrl + Shift + downArrow >> move line down.
        System.out.println("up");
        System.out.println("middle");
        System.out.println("down");
    }
}

class Ctrl_Shift_J {
    public static void main(String[] args) {
        System.out.println("Join1");
        System.out.println("Join2");
        System.out.println("Join3");
    }
}

class Ctrl_Shift_U {
    public static void main(String[] args) {
//      Ctrl + Shift + U >> makes given arg lower or upper case.
        System.out.println("this is lowercase");
    }
}

class Shift_Shift {
//    Shift + Shift >> Search for file names in the whole project.
}

class Ctrl_N {
//    Ctrl + N >> go directly to class search.
}

class Ctrl_G {
//   Ctrl + G >>  go on a certain line in the file. ${LineNumber:SymbolNumber}
}

class Ctrl_Shift_F8 {
//    Ctrl + Shift + F8 >> go to breakpoints view.
}

class Ctrl_Alt_V {
    public static void main(String[] args) {
//        Ctrl + Alt + V >> extract arg into variable.
        String hello_world = "hello world";
        System.out.println(hello_world);

    }
}

class Ctrl_Alt_M {
    public static void main(String[] args) {
//        Ctrl + Alt + M >> extract  into method.
        System.out.println("hello world");
    }
}

class Ctrl_Alt_C {

    public static final String HELLO_WORLD = "hello world";

    public static void main(String[] args) {
//        Ctrl + Alt + C >> extract arg into CONSTANT.
        System.out.println(HELLO_WORLD);
    }
}

class Ctrl_Alt_P {
    public static void main(String[] args) {
//        Ctrl + Alt + P >> extract parameters.
        String args1 = "args1";
    }
}

class Ctrl_Shift_T {
    public static void main(String[] args) {
//     Ctrl + Shift + T >> Generate Unit tests.
        System.out.println("Generate tests");
    }
}
class Ctrl_Shift_F6 {
    class Ctrl_Shift_C {
        //   Ctrl + Shift + C >> Copy reference of an object/file

        //C:\Users\ivaylo.netsov\Desktop\hotfix&Snippets\demo\src\HotKeys.java
    }

    public static void main(String[] args) {
//        Ctrl + Shift + F6 >> change method params
        print("1");
    }

    public static void print(String a) {
        System.out.println(a);
    }
}
class Ctrl_Shift_Alt_T {
    public static void main(String[] args) {
//        Ctrl + Shift + F6 >> change method params
        print("SomeObj".getClass().getSimpleName(), "SomeStr", 1);
    }

    public static void print(Object c, String a, Integer b) {
        System.out.println(a + " " + b + " " + c);
    }
}