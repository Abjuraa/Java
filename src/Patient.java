public class Patient {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email) {
        setName(name);
        setEmail(email);
        showInformation();
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public String getHeight() {
        return this.height + " Mts.";
    }

    public String getBlood() {
        return this.blood;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() < 10) {
            System.out.println("El numero celular debe tener 10 caracteres.");
        } else if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        }
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void showInformation() {
        System.out.println("El nombre del paciente es " + getName() + " y esta registrado con el correo " + getEmail());
    }
}
