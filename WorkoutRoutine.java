public class WorkoutRoutine {
    private String title;
    private int durationMinutes;
    private String type;
    private int caloriesBurned;
    private String difficulty;

    public WorkoutRoutine(String title, int durationMinutes, String type, int caloriesBurned, String difficulty) {
        this.title = title;
        this.durationMinutes = durationMinutes;
        this.type = type;
        this.caloriesBurned = caloriesBurned;
        this.difficulty = difficulty;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getCaloriesBurned() { return caloriesBurned; }
    public void setCaloriesBurned(int caloriesBurned) { this.caloriesBurned = caloriesBurned; }

    public String getDifficulty() { return difficulty; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }

    @Override
    public String toString() {
        return "WorkoutRoutine{title='" + title + "', duration=" + durationMinutes +
                " min, type='" + type + "', calories=" + caloriesBurned +
                ", difficulty='" + difficulty + "'}";
    }
}
