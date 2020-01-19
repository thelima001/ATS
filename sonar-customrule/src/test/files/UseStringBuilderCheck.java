class MyClass {

    public String toString(String a, String b, String c){  // Noncompliant
        return a+b+c;
    }

    public String toString(String a, String b, String c){
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        sb.append(c);
        return sb.toString();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("aa");
        return sb.toString();
    }
}