package iuh.fit.task_observer;

public interface TaskSubject {
    void registerMember(TaskObserver observer);
    void removeMember(TaskObserver observer);
    void notifyMembers();
}

