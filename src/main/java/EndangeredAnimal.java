ublic class EndangeredAnimal {
    private double age;
    private String health;
    public static final String DATABASE_TYPE = "endangered_animal";

    public EndangeredAnimal(String name, double age, String health) {
        if (DatabaseManagement.nameValidation(name)) {
            this.name = name;
        }
        if (DatabaseManagement.ageValidation(age)) {
            this.age = age;
        }
        this.health = health;
        this.type = DATABASE_TYPE;
    }

    public double getAge() {
        return this.age;
    }

    public void setAge(double age) {
        if (DatabaseManagement.ageValidation(age)) {
            this.age = age;
        }
    }

    public String getHealth() {
        return this.health;
    }

    public void setHealth(String health) {
        this.health = health;
    }
}