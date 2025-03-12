package iuh.fit.task_observer;

import java.util.ArrayList;
import java.util.List;

public class Task implements TaskSubject {
    private String status;
    private List<TaskObserver> members = new ArrayList<>();

    public void setStatus(String status) {
        this.status = status;
        notifyMembers();
    }

    @Override
    public void registerMember(TaskObserver observer) {
        members.add(observer);
    }

    @Override
    public void removeMember(TaskObserver observer) {
        members.remove(observer);
    }

    @Override
    public void notifyMembers() {
        members.forEach(member -> member.update(status));
    }
}
