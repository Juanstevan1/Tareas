public class Poo {
    public static void main(String[] args) {
        People persona1 = new People();

        persona1.setEdad(15);
        persona1.setName("Bodoque");
        persona1.setPhone(1454);

        System.out.println("Edad: "+persona1.getEdad()+" Nombre: "+ persona1.getName()+ " telefono: "+persona1.getPhone());
    }
}

class People{
    private int edad;
    private String name;
    private int phone;

    public int getEdad() {
        return edad;
    }

    public int getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
