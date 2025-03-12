package iuh.fit.task_observer;

public class TeamMember implements TaskObserver {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " nhận thông báo: Trạng thái task - " + status);
    }
}
