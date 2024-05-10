public class UserInfo {
    private String username;
    private String password;
    private String gender;
    private int age;
    private int userId;
    private float weight;
    private float height;
    private float bmi;
    private float bmr;
    private float tdee;

    // Constructor
    public UserInfo() {
        // Default constructor
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    // Calculate and set BMI
    public void setBMI() {
        if (height != 0 && weight != 0) {
            this.bmi = weight / (height * height);
        } else {
            this.bmi = 0; // Handle division by zero or invalid data
        }
    }
    
    // Calculate and set BMR using the Harris-Benedict equation
    public void setBMR() {
        if (gender.equalsIgnoreCase("male")) {
            this.bmr = 88.362f + (13.397f * weight) + (4.799f * height) - (5.677f * age);
        } else {
            this.bmr = 447.593f + (9.247f * weight) + (3.098f * height) - (4.330f * age);
        }
    }

    // Calculate and set TDEE based on BMR and activity level
    public void setTDEE() {
        // Example calculation, adjust according to your requirements
        float activityFactor = 1.2f; // Sedentary activity level
        this.tdee = bmr * activityFactor;
    }


    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }
    public int getUserId() {
        return userId;
    }

    public float getHeight() {
        return height;
    }
    
    public float getBMI() {
        return bmi;
    }
    public float getBMR() {
        return bmr;
    }
    public float getTDEE() {
        return tdee;
    }
}
