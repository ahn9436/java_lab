class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.gender = gender;
        this.email = email;
        this.name = name;
    }

    //Getter
    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    // Setter
    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author[name=" +  name + ", email=" + email + ", gender=" + gender + "]";
    }

    public static void main(String[] args) {
        //Create Author
        Author author1 = new Author("John Doe", "Skibidi@hotwheel.com", 'c');
        Author author2 = new Author("Camera Man", "KaiCenet@yahoo.com", 'o');
        Author author3 = new Author("Ksi", "Wow.com", 'c');
        Author author4 = new Author("Mean", "Kitifat@gmail.com", 'k');
        Author author5 = new Author("Jane Doe", "Roblox@hotwheel.com", 'm');

        //Display
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);
        System.out.println(author4);
        System.out.println(author5);


        //Set new value thing
        author1.setEmail("joHnCene@man.com");
        System.out.println("\nAfter updating");
        System.out.println(author1);

    }
}