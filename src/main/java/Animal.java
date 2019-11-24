


public abstract class Animal implements DatabaseManagement {
    protected int id;
    protected String name;
    protected String type;
    private static final int MIN_NAME_LENGTH = 1;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(DatabaseManagement.nameValidation(name)) {
            this.name = name;
        }
    }

    public String getType() {
        return this.type;
    }