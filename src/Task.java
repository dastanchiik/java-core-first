public class Task {
//    private int quantity;
    private String questions;

    public Task( String questions) {
//        this.quantity = quantity;
        this.questions = questions;
    }

//    public int getQuantity() {
//        return quantity;
//    }

//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Task:" +
//                "количество = " + quantity +
                " вопросы = " + questions + '\'' +
                '}';
    }
}
