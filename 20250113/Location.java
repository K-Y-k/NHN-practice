/* x, y 좌표로 구성된 위치 클래스로 묶음 */
public class Location {
    private int x;
    private int y;

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getLocation() {
        return this.x + ", " + this.y;
    }
}
