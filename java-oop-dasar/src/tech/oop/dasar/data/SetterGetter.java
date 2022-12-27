package tech.oop.dasar.data;

public class SetterGetter {

    private String id;
    private boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        //ini bisa menjadi validation setter
        if (id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
