class People{
    private int edad;
    private String name;
    private int phone;

    public People(){

    }
    public People(int edad, String name, int phone) {
        this.edad = edad;
        this.name = name;
        this.phone = phone;
    }

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

    public String ToString() {
        return "";
    }
}

class Cliente extends People{
    private int credito;

    public Cliente(){}

    public Cliente(int credito, int edad, String name, int phone) {
        super(edad,name,phone);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String ToString(){
        String datos = "Edad: "+ getEdad() + " Nombre: "+ getName() + " Phone: " + getPhone() + " Credito: "+getCredito() ;
        return datos;
    }
}

class Trabajador extends People{
    private int salario;

    public Trabajador() {

    }
    public Trabajador(int salario, int edad, String name, int phone){
        super(edad,name,phone);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    @Override
    public String ToString(){
        return "Edad: "+ getEdad() + " Nombre: "+ getName() + " Phone: " + getPhone()+ " Salario"+getSalario() ;
    }
}
