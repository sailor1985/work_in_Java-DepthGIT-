package DZ_to_Sem6;

public class HardDisc {
    private final int size;

    @Override
    public String toString() {
        return String.format("hard size: %d", size);
    }

    public HardDisc(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
