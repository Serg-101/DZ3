public class Human {
    private String FirsName;
    private String LastName;
    private Integer Age;
    private Sex sex;

    public Human(String firsName, String lastName, Integer age, Sex sex) {
        FirsName = firsName;
        LastName = lastName;
        Age = age;
        this.sex = sex;
    }

    public String getFirsName() {
        return FirsName;
    }

    public void setFirsName(String firsName) {
        FirsName = firsName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        String sts;
        if(sex.equals(Sex.Mal)){
            sts = " M";
        }
        else {
            sts = " F";
        }
        return  FirsName + " " +  //super.toString();
                LastName + " " + Age + sts;
    }
}
