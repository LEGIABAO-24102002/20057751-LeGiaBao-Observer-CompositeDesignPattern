package iuh.fit.task_observer;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        TeamMember member1 = new TeamMember("Xuan Manh Tien");
        task.registerMember(member1);
        task.setStatus("Chưa Hoàn thành");

        TeamMember member2 = new TeamMember("Le Cao Tu");
        task.registerMember(member2);
        task.setStatus("Hoàn thành");

    }
}
