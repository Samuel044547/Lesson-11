import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Problem 1
// esep 1
//        int i = 19;
//        while (i < 35) {
//            i++;
//            System.out.println(i);
//        }
// esep 2
//        Scanner in = new Scanner(System.in);
//        System.out.println("Сан енгізініз=");
//        int b = in.nextInt();
//        int q = 9;
//        if (b > 10) {
//            while (q < b) {
//                b++;
//                System.out.println(b);
//            }
//        } else {
//            System.out.println("10-нан үлкен сан енгізініз ");
//        }
// esep 3
//        Scanner in1 = new Scanner(System.in);
//        System.out.println("Сан енгізініз=");
//        int w = in1.nextInt();
//        if (w < 50) {
//            while (w < 51) {
//                System.out.println(w);
//                w++;
//            }
//        } else {
//            System.out.println("50-денінгі сан енгізініз ");
//        }
// esep 4
//        Scanner in2 = new Scanner(System.in);
//        System.out.println("Бастапқы сан=");
//        int a = in2.nextInt();
//        Scanner in3 = new Scanner(System.in);
//        System.out.println("Аяқтау саны=");
//        int b1 = in3.nextInt();
//        do {
//            a++;
//            System.out.println(a + " ");
//        } while (a < b1);


// Problem 2
// esep 1
//        int q1 = 0;
//        while (q1 < 20) {
//            q1++;
//            double dana = 20.4;
//            System.out.println("Дана бағасы " + q1 * dana + "тг");
//        }


// Problem 3
//        int q2 = 0;
//        while (q2 < 10) {
//            q2++;
//            System.out.println(q2 + "*" + 7 + "=" + q2 * 7);
//        }


// Problem 4
//        int q3 = 0;
//        while (q3 < 9) {
//            q3++;
//            System.out.println(q3 + "*" + 9 + "=" + q3 * 9);
//        }


// Problem 5
//Scanner san= new Scanner(System.in);
//System.out.println("Қай санға көбейту=");
//int san4=san.nextInt();
//Scanner san2= new Scanner(System.in);
//int san1=0;
//System.out.println("Қанша рет көбейту=");
//int san3=san2.nextInt();
//while (san1<san3){
//    san1++;
//    System.out.println(san1+"*"+san4+"="+san1*san4);
//}


// Problem 6
//        Scanner x1=new Scanner(System.in);
//        System.out.println("x мәнбер=");
//        int x=x1.nextInt();
//        int t=x+2;
//        System.out.println("t="+t);
//        int e=4;
//        while (e<28){
//            e++;
//            double y=Math.pow(2*(t+e),2)+5.5*(e+t)-2;
//            System.out.println("y="+y);
//        }


// Problem 7
// esep 1
//int n1=100;
//        int n2=0;
//        while (n1<=500){
//            n2=n2+n1;
//            n1++;
//        }
//        System.out.println("100+500 Бүтін сандар қосындысы="+n2);
// esep 2
//        Scanner san0=new Scanner(System.in);
//        System.out.println("a мән бер=");
//        int a=san0.nextInt();
//        int q1=0;
//        while (a<=500){
//            q1=q1+a;
//            a++;
//        }
//        System.out.println("a мен 500 Бүтін сандар қосындысы="+q1);
// esep 3
//     int  sun =0;
//      int a2=10;
//      Scanner ipput= new Scanner(System.in);
//      System.out.println("n мән бер=");
//       int b=ipput.nextInt();
//       while (a2<b){
//           System.out.println(a2);
//           sun=sun+a2;
//           a2++;
//       }
//        System.out.println("10 мен n Бүтін сандар қосындысы="+sun);
//        // esep 4
//        Scanner sum=new Scanner(System.in);
//        System.out.println("n мән бер=");
//        int n=sum.nextInt();
//        Scanner sum2 =new Scanner(System.in);
//        System.out.println("m мән бер=");
//        int m=sum2.nextInt();
//        int sun1=0;
//        while (n<=m){
//            sun1=sun1+m;
//            n++;
//        }
//        System.out.println("m мен n Бүтін сандар қосындысы="+sun1);


// Problem 8
        // 1 esep
//  int san=0;
//  int san1=1000;
//  int summa=0;
//  int san0=san1-san;
//  while (san<=san1){
//    summa=summa+san;
//    san++;
//  }
//   System.out.println("1 мен 1000 арифметикалық ортасы="+summa/san0);
// 2 esep
//        Scanner m = new  Scanner(System.in);
//        System.out.println("b-ға мән бер=");
//        int san3=m.nextInt();
//        int san4=100;
//        int sum=0;
//        int san5=san3-san4;
//        if (100<san3){
//        while (san4<=san3){
//            sum=sum+san4;
//            san4++;
//        }}else{
//            System.out.println("100-ден үлкен сан енгізініз");
//        }
//        System.out.println("100 мен b арифметикалық ортасы="+sum/san5);
// 3 esep
//        Scanner m1 = new  Scanner(System.in);
//        System.out.println("a-ға мән бер=");
//        int a=m1.nextInt();
//        int b=200;
//        int sum1=0;
//        int ar=b-a;
//        if (200>a){
//        while (a<=b){
//            sum1=sum1+a;
//            a++;
//        }}else{
//            System.out.println("200-дан кіші сан енгізініз");
//        }
//        System.out.println("a мен 200 арифметикалық ортасы="+sum1/ar);
// 4 esep
//        Scanner a0=new Scanner(System.in);
//        System.out.println("a-ға мән бер=");
//        int a1= a0.nextInt();
//        Scanner b0=new Scanner(System.in);
//        System.out.println("b-ға мән бер=");
//        int b1=b0.nextInt();
//        int sum0=0;
//        int ar1=b1-a1;
//        while (a1<=b1){
//            sum0=sum0+a1;
//            a1++;
//        }
//        System.out.println("a мен b арифметикалық ортасы="+sum0/ar1);


// Problem 9
        // 1 esep
//        int n=20;
//        int m0=40;
//        int man=0;
//        while (n<=m0) {
//            man = man + n;
//            n++;
//        }
//        System.out.println("20-дан 40-қа дейінгі барлық сандар кубының қосындысы="+man*man);
//       // 2 esep
//        Scanner a=new Scanner(System.in);
//        System.out.println("a-ға мән бер=");
//        int n1=a.nextInt();
//        int m1=50;
//        int man1=0;
//        while (n1<=m1) {
//            man1 = man1 + n1;
//            n1++;
//        }
//        System.out.println("a-дан 50-ге дейінгі барлық сандар кубының қосындысы="+man1*man1);
// 3 esep
//        Scanner a1=new Scanner(System.in);
//        System.out.println("n-ге мән бер=");
//        int n2=a1.nextInt();
//        int m2=1;
//        int man2=0;
//        while (m2<=n2) {
//           man2 = man2 + m2;
//            m2++;
//        }
//        System.out.println("1-дeн n-ге дейінгі барлық сандар кубының қосындысы="+man2*man2);
// 4 esep
//        Scanner a2=new Scanner(System.in);
//        System.out.println("a-ғa мән бер=");
//        int n3=a2.nextInt();
//        Scanner b1=new Scanner(System.in);
//        System.out.println("b-ғa мән бер=");
//        int m3=b1.nextInt();
//        int man3=0;
//        while (n3<=m3) {
//            man3 = man3 + n3;
//            n3++;
//        }
//        System.out.println("1-дeн n-ге дейінгі барлық сандар кубының қосындысы="+man3*man3);


// Problem 10
//     Scanner q1=new Scanner(System.in);
//    System.out.println("n-ге мән бер=");
//    int w=q1.nextInt();
//     double di=0;
//   int q=1;
//   while (q<=w){
//    di=di+(double) 1/q;
//    q++;
//   }
//    System.out.println(di);


// Problem 11
//        Scanner q2=new Scanner(System.in);
//        System.out.println("n-ге мән бер=");
//        int w1=q2.nextInt();
//        double di1=0;
//        double q0=1;
//        while (q0<=w1){
//            di1=di1+(double) 1/(q0*q0);
//            q0++;
//        }
//        System.out.println(di1);


// Problem 12
//        Scanner q3=new Scanner(System.in);
//        System.out.println("n-ге мән бер=");
//        int n=q3.nextInt();
//        int i=1;
//        int f=1;
//        while (i<=n){
//            f=f*i;
//            i++;
//        }
//        System.out.println(f);


// Problem 13
//    int san=12345;
//    while (san!=0){
//    int t=san %10;
//    san=san/10;
//    System.out.print(t);
//     }


// Problem 14
//        int san1=123456;
//    int sum1=0;
//        while (san1!=0){
//            int t=san1 %10;
//            sum1=sum1+t;
//            san1=san1/10;
//            System.out.println(sum1);
//        }


// Problem 15
//        int san2=123456;
//      Scanner d3=new Scanner(System.in);
//      System.out.println("n=");
//      int n1=d3.nextInt();
//       int i1=0;
//        int sum3=0;
//        while (i1<n1){
//            int t=san2 %10;
//            sum3=sum3+t;
//            san2=san2/10;
//            i1++;
//        }
//        System.out.print(sum3);


// Problem 16
// esep 1-a
// for(int i = 20; i<=35; i++ ){
//     System.out.println(i);
// }
// esep 1-b
//        Scanner q=new Scanner(System.in);
//  System.out.println("b=");
//  int b=q.nextInt();
//  for(int i=10;i<=b;i++){
//    System.out.println("b="+i);
//  }
// esep 1-c
//       Scanner q1=new Scanner(System.in);
//       System.out.println("a=");
//        int a=q1.nextInt();
//        for(int i=a;i<=50;i++){
//            System.out.println("b="+i);
//        }
// esep 1-d
//        Scanner q2=new Scanner(System.in);
//        System.out.println("a=");
//        int a0=q2.nextInt();
//        Scanner q3=new Scanner(System.in);
//        System.out.println("b=");
//        int b0=q3.nextInt();
//        for(int i=a0;i<=b0;i++){
//            System.out.println("b="+i);
//        }
// esep 2
//        int f=1;
//       double z=20.4;
//       if (f<20){
//        for (int i=1;i<=20;i++){
//             double z0=i*z;
//            System.out.println("Дана "+i+"="+z0+"tg");
//        }}else{
//           System.out.println("Error");
//       }
// esep 3
//    for (int i=1;i<=10;i++){
//    System.out.println(i+"*"+7+"="+7*i);
//   }
// esep 4
//        for (int i=1;i<=9;i++) {
//            System.out.println(i + "*" + 9 + "=" + 9 * i);
//        }
// esep 5
//        Scanner q5=new Scanner(System.in);
//        System.out.println("m=");
//        int m=q5.nextInt();
//        Scanner q6=new Scanner(System.in);
//        System.out.println("n=");
//        int n=q6.nextInt();
//        for (int i=m;i<=n;i++) {
//            System.out.println(m + "*" + n + "=" + m * n);
//        }
// esep 6
//        Scanner q7=new Scanner(System.in);
//        System.out.println("x=");
//        int x=q7.nextInt();
//        if (4<x){
//        for (int i=4;i<=x;i++){
//        int t=x+2;
//        double y=(2*t)+(5.5*t)-2;
//        System.out.println("y="+y);
//  }}else{
//            System.out.println("Error");
//        }
// esep 7
// esep 7-a
//        System.out.println("Problem 7");
//        System.out.println("Problem 7-a");
//        int w1=0;
//        for (int i=100;i<=500;i++) {
//            w1=w1+i;
//        }
//        System.out.println("100_+_500"+w1);
// esep 7-b
//        System.out.println("Problem 7-b");
//        Scanner q8=new Scanner(System.in);
//        System.out.println("a=");
//        int a2=q8.nextInt();
//        int w0=0;
//        for (int i=a2;i<=500;i++) {
//            w0=w0+i;
//        }
//        System.out.println("a_+_500"+w0);
// esep 7-c
//        System.out.println("Problem 7-c");
//        Scanner q9=new Scanner(System.in);
//        System.out.println("a=");
//        int a3=q9.nextInt();
//        int w2=0;
//       for (int i=10;i<=a3;i++) {
//            w2=w2+i;
//        }
//        System.out.println("10_+_b"+w2);
//        System.out.println("Problem 7-d");
// esep 7-d
//        Scanner q01=new Scanner(System.in);
//        System.out.println("a=");
//        int a4=q01.nextInt();
//        Scanner q02=new Scanner(System.in);
//        System.out.println("a=");
//        int a5=q02.nextInt();
//        int w3=0;
//        for (int i=a4;i<=a5;i++) {
//            w3=w3+i;
//        }
//        System.out.println("a_+_b"+w3);
// esep 8
//        System.out.println("Problem 8");
//        System.out.println("Problem 8-a");
//        int n1=0;
//        int n2=1000;
//        int n3=n2-n1;
//        int s=0; double s0=0;
//        for(int i=n1;i<=1000;i++){
//          s=s+i;
//        s0=s/n3;
//        }
//        System.out.println(s0);
// esep 8-b
//        System.out.println("Problem 8-b");
//        Scanner q02=new Scanner(System.in);
//        System.out.println("b=");
//        int n4=q02.nextInt();
//        int n5=100;
//        int n6=n4-n5;
//        int s1=0; double s2=0;
//        for(int i=n5;i<=n4;i++){
//            s1=s1+i;
//            s2=s1/n6;
//        }
//        System.out.println(s2);
// esep 8-c
//        System.out.println("Problem 8-b");
//        Scanner q03=new Scanner(System.in);
//        System.out.println("b=");
//        int n7=q03.nextInt();
//        int n8=200;
//        int n9=n8-n7;
//        int s3=0; double s4=0;
//        for(int i=n7;i<=n8;i++){
//            s3=s3+i;
//            s4=s3/n9;
//        }
//        System.out.println(s4);
// esep 8-d
//        System.out.println("Problem 8-d");
//        Scanner q04=new Scanner(System.in);
//        System.out.println("a=");
//        int n10=q04.nextInt();
//        Scanner q05= new Scanner(System.in);
//        System.out.println("b=");
//        int n11=q05.nextInt();
//        int n12=n11-n10;
//        int s5=0; double s6=0;
//        for(int i=n10;i<=n11;i++){
//            s5=s5+i;
//            s6=s5/n12;
//        }
//        System.out.println(s6);
// Problem  9
// esep 9-a
//       System.out.println("Problem 9");
//       System.out.println("esep 9-a");
//       int n13=0;
//       for (int i=20;i<=40;i++){
//       n13=n13+i;
//       }
//       System.out.println(n13*n13);
// esep 9-b
//        System.out.println("Problem 9");
//        System.out.println("esep 9-b");
//        Scanner q6=new Scanner(System.in);
//        System.out.println("a=");
//        int n14=0; int n15=q6.nextInt();
//        for (int i=n15;i<=50;i++){
//            n14=n14+i;
//        }
//        System.out.println(n14*n14);
// esep 9-c
//        System.out.println("Problem 9");
//        System.out.println("esep 9-c");
//        Scanner q7=new Scanner(System.in);
//        System.out.println("a=");
//        int n16=0; int n17=q7.nextInt();
//        for (int i=1;i<=n17;i++){
//            n16=n16+i*i;
//        }
//        System.out.println(n16);
// esep 9-d
//        System.out.println("Problem 9");
//        System.out.println("esep 9-b");
//        Scanner q8=new Scanner(System.in);
//        System.out.println("a=");
//        Scanner q9=new Scanner(System.in);
//        System.out.println("b=");
//        int n18=0;
//        int n19=q8.nextInt(); int n20=q9.nextInt();
//        for (int i=n19;i<=n20;i++){
//            n18=n18+i*i;
//        }
//        System.out.println(n18);
// Problem 10
//        System.out.println("Problem 10");
//        Scanner q11=new Scanner(System.in);
//        System.out.println("n=");
//        int n21=q11.nextInt(); double n22=0;
//        for (int i=1;i<=n21;i++){
//           n22=n22+(double)1/i;
//        }
//        System.out.println(n22);
// Problem 11
//        System.out.println("Problem 11");
//        double n24=0;
//        for (int i=1;i<=8;i++){
//            n24=n24+(double) 1/(3*i);
//            System.out.println(i);
//        }
//        System.out.println(n24);
//Problem 12
//        System.out.println("Problem 12");
//        Scanner q12=new Scanner(System.in);
//        System.out.println("n=");
//        int n25=q12.nextInt(); int n26=1;
//        for (int i=1;i<=n25;i++){
//        n26=n26*i;
//        System.out.println(i);
//        }
//        System.out.println(n26);
// Problem 13
        System.out.println("Problem 13");
          int san=12345; int s0=0;
          for (;san!=0;){
          int d=san%10;
          san=san/10;
          System.out.println(d);
          }
// Problem 14
        System.out.println("Problem 14");
        int san1=123456; int s1=0;
        for (;san1!=0;){
            int d=san1%10;
            s1=s1+d;
            san1=san1/10;
            System.out.println(s1);
        }
//Problem 15
        int san3=123456;
       Scanner vox=new Scanner(System.in);
       System.out.println("n=");
       int l=vox.nextInt();
       int s2=0; int s4=0;
       for(int i=s2;i<=l;i++){
           int d=san3%10;
           s4=s4+d;
           san3=san3/10;
       }
       System.out.println(s4);
    }}
