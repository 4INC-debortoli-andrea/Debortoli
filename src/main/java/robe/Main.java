package robe;

class Animale {
    void emettiSuono() {
        System.out.println("Qualche suono generico");
    }
}

class Cane extends Animale {
    void abbaia() {
        System.out.println("Woof!");
    }
}



