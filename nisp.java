import java.util.*;

public class nisp {
    public static List<String> nispA() {
        //making list of string at the first line of function;
        List<String> ans = new ArrayList<String>();

        for (int x=1; x<=7; x++) {
            String temp = "";   //creating a temp local variable to store one line of output temporarily;
            int h = 5+x;
            if (x==5) {
                h = 3;
            }
            for (int y=1; y<=h; y++) {
                if (x+y==8) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            if (x==5) {
                temp += " * * * ";
            }
            temp += "*";
            for (int ihmt = 8-x; ihmt>0; ihmt--) {
                temp += " ";
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispB() {
        List<String> ans = new ArrayList<String>();
        for (int x=1; x<=7; x++) {
            String temp = "";
            if (x==1 || x==4 || x==7) {
                for (int i=1; i<7; i++) {
                    temp += "* ";
                }
            }
            else {
                temp += "* ";
            }
            if (x!=1 & x!=4 & x!=7) {
                for (int i=1; i<5; i++) {
                    temp += "  ";
                }
                temp += "  *";
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispC() {
        List<String> ans = new ArrayList<String>();
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=7; y++) {
                if (((x==1 || x==7) & (y==3 || y==4 || y==5 || y==6)) || ((x==2 || x==6) & (y==2 || y==7)) || ((x==3 || x==4 || x==5) & (y==1))) {
                    temp += "* ";
                }
                else {
                    temp += "  ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispD() {
        List<String> ans = new ArrayList<String>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i=3; i<=11; i=i+2) {
            list.add(i);
        }
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (y==1 || ((x==1 || x==7) & list.contains(y)) || ((x==2 || x==6) & y==12) || ((x==3 || x==4 || x==5) & y==13) ) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispE() {
        List<String> ans = new ArrayList<String>();
        List<Integer> listx = new ArrayList<Integer>();
        listx.add(1);
        listx.add(4);
        listx.add(7);
        List<Integer> listy = new ArrayList<Integer>();
        for (int i=3; i<=13; i=i+2) {
            listy.add(i);
        }
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (y==1 || (listx.contains(x) & listy.contains(y))) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispF() {
        List<String> ans = new ArrayList<String>();
        List<Integer> listx = new ArrayList<Integer>();
        listx.add(1);
        listx.add(4);
        List<Integer> listy = new ArrayList<Integer>();
        for (int i=3; i<=13; i=i+2) {
            listy.add(i);
        }
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (y==1 || (listx.contains(x) & listy.contains(y))) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispG() {
        List<String> ans = new ArrayList<String>();
        List<Integer> listx = new ArrayList<Integer>();
        listx.add(1);
        listx.add(7);
        List<Integer> listy = new ArrayList<Integer>();
        for (int i=5; i<=11; i=i+2) {
            listy.add(i);
        }
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if ((listx.contains(x) & listy.contains(y)) || (x==2 & (y==3 || y==13)) || (x==3 & y==1) || (x==4 & (y==1 || y==7 || y==9 || y==11 || y==13)) || (x==5 & (y==1 || y==7 || y==13)) || (x==6 & (y==3 || y==13))) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispH() {
        List<String> ans = new ArrayList<String>();
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (y==1 || y==13 || (x==4 & (y==3 || y==5 || y==7 || y==9 || y==11))) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispI() {
        List<String> ans = new ArrayList<String>();
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (((x==1 || x==7) & (y==1 || y==3 || y==5 || y==7 || y==9 || y==11 || y==13)) || y==7) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispJ() {
        List<String> ans = new ArrayList<String>();
        List<Integer> listx = new ArrayList<Integer>();
        for (int i=1; i<=13; i=i+2) {
            listx.add(i);
        }
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if ((x==1 & listx.contains(y)) || (x!=7 & y==7) || (x==7 & (y==3 || y==5)) || (x==6 & y==1)) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispK() {
        List<String> ans = new ArrayList<String>();
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (y==3 || ((x==1 || x==7) & y==1) || ((x==1 || x==7) & (y==11 || y==13)) || ((x==2 || x==6) & y==9) || ((x==3 || x==5) & y==7) || (x==4 & y==5)) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispL() {
        List<String> ans = new ArrayList<String>();
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (y==1 || (x==7 & (y==3 || y==5 || y==7 || y==9 || y==11 || y==13))) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispM() {
        List<String> ans = new ArrayList<String>();
        List<Integer> listx = new ArrayList<Integer>();
        for (int i=1; i<=6; i++) {
            listx.add(i);
        }
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (y==1 || y==13 || (listx.contains(x) & (y==x+1 || y==13-x))) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispN() {
        List<String> ans = new ArrayList<String>();
        List<Integer> listx = new ArrayList<Integer>();
        for (int i=1; i<=7; i++) {
            listx.add(i);
        }
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (y==1 || y==13 || (listx.contains(x) & (y==2*x-1))) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispO() {
        List<String> ans = new ArrayList<String>();
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (((x==1 || x==7) & (y==5 || y==7 || y==9)) || ((x==2 || x==6) & (y==3 || y==11)) || ((x==3 || x==4 || x==5) & (y==1 || y==13))) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispP() {
        List<String> ans = new ArrayList<String>();
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (y==1 || (x==1 & (y==3 || y==5 || y==7 || y==9 || y==11)) || ((x==2 || x==3) & y==13) || (x==4 & (y==3 || y==5 || y==7 || y==9 || y==11))) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispQ() {
        List<String> ans = new ArrayList<String>();
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (((x==1 || x==7) & (y==5 || y==7 || y==9)) || ((x==2 || x==6) & (y==3 || y==11)) || ((x==3 || x==4 || x==5) & (y==1 || y==13)) || (x==5 & y==9) || (x==7 & y==13)) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispR() {
        List<String> ans = new ArrayList<String>();
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (y==1 || ((x==1 || x==4) & (y==3 || y==5 || y==7 || y==9 || y==11)) || ((x==2 || x==3) & y==13) || (x==5 & y==5) || (x==6 & (y==7 || y==13)) || (x==7 & (y==9 || y==11))) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispS() {
        List<String> ans = new ArrayList<String>();
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (((x==1 || x==4 || x==7) & (y==3 || y==5 || y==7 || y==9 || y==11)) || ((x==2 || x==6) & (y==1 || y==13)) || (x==3 & y==1) || (x==5 & y==13)) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispT() {
        List<String> ans = new ArrayList<String>();
        List<Integer> listy = new ArrayList<Integer>();
        for (int i=1; i<=13; i=i+2) {
            listy.add(i);
        }
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if ((x==1 & listy.contains(y)) || y==7) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispU() {
        List<String> ans = new ArrayList<String>();
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (((x==1 || x==2 || x==3 || x==4 || x==5 || x==6) & (y==1 || y==13)) || (x==7 & (y==3 || y==5 || y==7 || y==9 || y==11))) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispV() {
        List<String> ans = new ArrayList<String>();
        List<Integer> listx = new ArrayList<Integer>();
        for (int i=1; i<=7; i++) {
            listx.add(i);
        }
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (listx.contains(x) & (y==x || y==14-x)) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispW() {
        List<String> ans = new ArrayList<String>();
        List<Integer> listx = new ArrayList<Integer>();
        for (int i=2; i<=7; i++) {
            listx.add(i);
        }
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (y==1 || y==13 || (listx.contains(x) & (y==9-x || y==5+x))) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispX() {
        List<String> ans = new ArrayList<String>();
        List<Integer> listy = new ArrayList<Integer>();
        for (int i=1; i<=13; i=i+2) {
            listy.add(i);
        }
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (y==listy.get(x-1) || y==listy.get(7-x)) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispY() {
        List<String> ans = new ArrayList<String>();
        List<Integer> listy = new ArrayList<Integer>();
        for (int i=1; i<=13; i=i+2) {
            listy.add(i);
        }
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (x<=4 & (y==listy.get(x-1) || y==listy.get(7-x)) || (x>=4 & y==7)) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static List<String> nispZ() {
        List<String> ans = new ArrayList<String>();
        List<Integer> listy = new ArrayList<Integer>();
        for (int i=1; i<=13; i=i+2) {
            listy.add(i);
        }
        for (int x=1; x<=7; x++) {
            String temp = "";
            for (int y=1; y<=13; y++) {
                if (((x==1 || x==7) & listy.contains(y)) || y==listy.get(7-x)) {
                    temp += "*";
                }
                else {
                    temp += " ";
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static void main(String args[]) {
        System.out.println();   //just for a clear visibility ;)

        //taking input and giving output>>>

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name >>> ");
        String YN = sc.nextLine();
        sc.close();
        
        //if use next(); >>> Problem : input >>> "hello world"     output >>> "hello"
        //if use nextLine(); >>> No Problem... gives output whatentered !!!
        
        System.out.println();   //just for a space of line for clear visibility ;)

        String[] splitted = YN.split(" ");
        int len = splitted.length;
        for (int lm=0; lm<len; lm++) {
            String tempStr = splitted[lm];
            for (int lstval=0; lstval<7; lstval++) {
                for (int mn=0; mn<tempStr.length(); mn++) {
                    Character temp = tempStr.charAt(mn);
                    if (temp == 'A' || temp == 'a') {
                        List<String> a = nispA();
                        System.out.print(a.get(lstval));
                    }
                    else if (temp == 'B' || temp == 'b') {
                        List<String> b = nispB();
                        System.out.print(b.get(lstval));
                    }
                    else if (temp == 'C' || temp == 'c') {
                        List<String> c = nispC();
                        System.out.print(c.get(lstval));
                    }
                    else if (temp == 'D' || temp == 'd') {
                        List<String> d = nispD();
                        System.out.print(d.get(lstval));
                    }
                    else if (temp == 'E' || temp == 'e') {
                        List<String> e = nispE();
                        System.out.print(e.get(lstval));
                    }
                    else if (temp == 'F' || temp == 'e') {
                        List<String> f = nispF();
                        System.out.print(f.get(lstval));
                    }
                    else if (temp == 'G' || temp == 'g') {
                        List<String> g = nispG();
                        System.out.print(g.get(lstval));
                    }
                    else if (temp == 'H' || temp == 'h') {
                        List<String> h = nispH();
                        System.out.print(h.get(lstval));
                    }
                    else if (temp == 'I' || temp == 'i') {
                        List<String> i = nispI();
                        System.out.print(i.get(lstval));
                    }
                    else if (temp == 'J' || temp == 'j') {
                        List<String> j = nispJ();
                        System.out.print(j.get(lstval));
                    }
                    else if (temp == 'K' || temp == 'k') {
                        List<String> k = nispK();
                        System.out.print(k.get(lstval));
                    }
                    else if (temp == 'L' || temp == 'l') {
                        List<String> l = nispL();
                        System.out.print(l.get(lstval));
                    }
                    else if (temp == 'M' || temp == 'm') {
                        List<String> m = nispM();
                        System.out.print(m.get(lstval));
                    }
                    else if (temp == 'N' || temp == 'n') {
                        List<String> n = nispN();
                        System.out.print(n.get(lstval));
                    }
                    else if (temp == 'O' || temp == 'o') {
                        List<String> o = nispO();
                        System.out.print(o.get(lstval));
                    }
                    else if (temp == 'P' || temp == 'p') {
                        List<String> p = nispP();
                        System.out.print(p.get(lstval));
                    }
                    else if (temp == 'Q' || temp == 'q') {
                        List<String> q = nispQ();
                        System.out.print(q.get(lstval));
                    }
                    else if (temp == 'R' || temp == 'r') {
                        List<String> r = nispR();
                        System.out.print(r.get(lstval));
                    }
                    else if (temp == 'S' || temp == 's') {
                        List<String> s = nispS();
                        System.out.print(s.get(lstval));
                    }
                    else if (temp == 'T' || temp == 't') {
                        List<String> t = nispT();
                        System.out.print(t.get(lstval));
                    }
                    else if (temp == 'U' || temp == 'u') {
                        List<String> u = nispU();
                        System.out.print(u.get(lstval));
                    }
                    else if (temp == 'V' || temp == 'v') {
                        List<String> v = nispV();
                        System.out.print(v.get(lstval));
                    }
                    else if (temp == 'W' || temp == 'w') {
                        List<String> w = nispW();
                        System.out.print(w.get(lstval));
                    }
                    else if (temp == 'X' || temp == 'x') {
                        List<String> x = nispX();
                        System.out.print(x.get(lstval));
                    }
                    else if (temp == 'Y' || temp == 'y') {
                        List<String> y = nispY();
                        System.out.print(y.get(lstval));
                    }
                    else if (temp == 'Z' || temp == 'z') {
                       List<String> z = nispZ();
                       System.out.print(z.get(lstval));
                    }
                    else {
                        System.out.println("Names must be only of alphabets !!!");
                        break;
                    }
                    System.out.print("  ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }
}