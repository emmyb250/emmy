//BYIRINGIRO EMMANUEL
package question_three;

public class Teacher {
    private String id;
    private String name;
    private String subject;

    public Teacher(String id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
