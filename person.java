public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String email;
    private String jobTitle;
    private String company;
    private String emergencyContactName;
    private String emergencyContactPhone;
  
    //Constructor
    public Person(String firstName, String lastName, int age, String address, String city, String state, String zipCode, String phoneNumber, String email, String jobTitle, String company, String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.jobTitle = jobTitle;
        this.company = company;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }
  
    //Getters and Setters
    public String getFirstName() {
        return firstName;
    }
  
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
  
    public String getLastName() {
        return lastName;
    }
  
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
  
    public int getAge() {
        return age;
    }
  
    public void setAge(int age) {
        this.age = age;
    }
  
    public String getAddress() {
        return address;
    }
  
    public void setAddress(String address) {
        this.address = address;
    }
  
    public String getCity() {
        return city;
    }
  
    public void setCity(String city) {
        this.city = city;
    }
  
    public String getState() {
        return state;
    }
  
    public void setState(String state) {
        this.state = state;
    }
  
    public String getZipCode() {
        return zipCode;
    }
  
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
  
    public String getPhoneNumber() {
        return phoneNumber;
    }
  
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
  
    public String getEmail() {
        return email;
    }
  
    public void setEmail(String email) {
        this.email = email;
    }
  
    public String getJobTitle() {
        return jobTitle;
    }
  
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

