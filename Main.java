public class Main {
    public static void main(String[] args) {
        User user1 = new User("Nurali", 18, 175, 80, "Похудение");
        User user2 = new User("Ali", 30, 180, 60, "Набор массы");

        WorkoutRoutine routine1 = new WorkoutRoutine("Cardio Blast", 40, "Кардио", 350, "Средний");
        WorkoutRoutine routine2 = new WorkoutRoutine("Strength Training", 60, "Силовая", 500, "Тяжёлый");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(routine1);
        System.out.println(routine2);

        FitnessApp app = new FitnessApp();
        app.compareRoutines(routine1, routine2);
    }
}
