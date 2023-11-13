# POST TEST
Java Basic

1. Apakah Java merupakan singkatan dari JavaScript?
    ```
    Tidak
    ```
2. Bagaimana menuliskan variabel dengan angka bernilai 7?
   ```
   int = 7;
   ```
3. Bagaimana perintah untuk menampilkan output “Hello World”?
   ```
   System.out.println("Hello World");
   ```
4. Bagaimana penulisan kode untuk menampilkan output angka 1 hingga 29?
   ```
     int num = 0;

        do {
            num++;
            System.out.println(num);
        } while (num < 29);
   ```
5. Indeks pada array pada Java dimulai dari?
    ```
    pada index 0
    ```
6. Bagaimana penulisan kode untuk menampilkan output Nama Anda. Jika terdapat range 1-100 bilangan dan ketika angka merupakan kelipatan dari tanggal hari ini, maka yang tampil adalah Nama Anda, selain dari itu adalah angkanya?
   ```
   import java.time.LocalDateTime;

    public class App {
        public static void main(String[] args) {

        String myName = "Hazpi Nurafgan";
        int i = 0;
        while (i < 100) {
            i++;
            if ((i % LocalDateTime.now().getDayOfMonth()) == 0) {
                System.out.println(myName);
            } else {
                System.out.println(i);
            }

        }
        }

    }
   ```
7. Bagaimana penulisan untuk membuat method pada Java?
    ```
        <!-- 
        AccessModifier TipeData nameMethod(tipeDataParams nameParams){
            // code...
        } 
        -->

        example :
          public int sumNum(int x, int y) {
            return x + y;
        }
    ```

8. Bagaimana perintah untuk memanggil method pada Java?
    ```
    public class App {
        public static void main(String[] args) {

            App app = new App();
            System.out.println(app.sumNum(5, 5));
        }

        public int sumNum(int x, int y) {
            return x + y;
        }

    }
    ```

