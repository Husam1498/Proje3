package proje3linkedlist;
public class Bagliliste {

    Node head;
    int es;

    public Bagliliste() {
        head = null;
        es = 0;
    }

    public void add(Node n) {
        if (head == null) {
            head = n;
            es++;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = n;
            es++;
        }
    }

    public void veriSetiYazdir() {

        Node tmp = head;
        System.out.print("Veri Seti:[");
        while (tmp != null) {
            if (tmp.next == null) {
                System.out.print(tmp.data);
                tmp = tmp.next;
            } else {
                System.out.print(tmp.data + ",");
                tmp = tmp.next;
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public boolean ara(int aranan) {
        Node tmp = head;
        boolean sonuc = false;
        while (tmp != null) {
            if (tmp.data == aranan) {
                sonuc = true;
                return sonuc;
            }
            tmp = tmp.next;
        }
        return sonuc;
    }

    public void normalizasyonHesaplaYazdir() {
        Node tmp = head;
        if (tmp != null) {
            int min = tmp.data;
            int max = tmp.data;
            while (tmp != null) {//max ve min araması yapılır
                if (tmp.data > max) {
                    max = tmp.data;
                }
                if (tmp.data < min) {
                    min = tmp.data;
                }
                tmp = tmp.next;
            }
            tmp = head;//Eski değerleri için node ilk değere atam yaptım BU daha önce hesaplanan değerlerin tekrar min ve max değerlerine göre tekrar hesaplama yapması için
            System.out.print("Normalizason:[");
            while (tmp != null) {
                double norm;
                if (tmp.next == null) {
                    norm = (double) (tmp.data - min) / (max - min);
                    System.out.print(norm);
                    tmp = tmp.next;
                } else {
                    norm = (double) (tmp.data - min) / (max - min);
                    System.out.print(norm + ",");
                    tmp = tmp.next;
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
