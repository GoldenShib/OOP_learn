class SinhVien {
    private String ten;
    private int tuoi;

    public SinhVien(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
