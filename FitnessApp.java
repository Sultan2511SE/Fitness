public class FitnessApp {
    public void compareRoutines(WorkoutRoutine r1, WorkoutRoutine r2) {
        if (r1.getCaloriesBurned() > r2.getCaloriesBurned()) {
            System.out.println(r1.getTitle() + " Сжигает больше калорий чем " + r2.getTitle());
        } else if (r1.getCaloriesBurned() < r2.getCaloriesBurned()) {
            System.out.println(r2.getTitle() + " Сжигает больше калорий чем " + r1.getTitle());
        } else {
            System.out.println("Обе тренировки сжигают одинаковое количество калорий");
        }
    }
}
