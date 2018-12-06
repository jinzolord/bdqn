package cn.tcbd.entity;

public class TMenu {

    private int id, parentId;
    private String menuName, menuUrl;

    @Override
    public String toString() {
        return "TMenu{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", menuName='" + menuName + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public TMenu() {
    }

    public TMenu(int id, int parentId, String menuName, String menuUrl) {
        this.id = id;
        this.parentId = parentId;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
    }
}
