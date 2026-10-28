package ze;

/* compiled from: MutableByte.java */
/* loaded from: classes6.dex */
public class c extends Number implements Comparable<c>, a<Number> {

    /* renamed from: c, reason: collision with root package name */
    private static final long f93826c = -1585823265;

    /* renamed from: b, reason: collision with root package name */
    private byte f93827b;

    public c() {
    }

    public void a(byte b5) {
        this.f93827b = (byte) (this.f93827b + b5);
    }

    public void b(Number number) {
        this.f93827b = (byte) (number.byteValue() + this.f93827b);
    }

    @Override // java.lang.Number
    public byte byteValue() {
        return this.f93827b;
    }

    public byte c(byte b5) {
        byte b6 = (byte) (this.f93827b + b5);
        this.f93827b = b6;
        return b6;
    }

    public byte d(Number number) {
        byte byteValue = (byte) (number.byteValue() + this.f93827b);
        this.f93827b = byteValue;
        return byteValue;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f93827b;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        return ye.c.a(this.f93827b, cVar.f93827b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f93827b == ((c) obj).byteValue();
    }

    public void f() {
        this.f93827b = (byte) (this.f93827b - 1);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f93827b;
    }

    public byte g() {
        byte b5 = (byte) (this.f93827b - 1);
        this.f93827b = b5;
        return b5;
    }

    public byte h(byte b5) {
        byte b6 = this.f93827b;
        this.f93827b = (byte) (b5 + b6);
        return b6;
    }

    public int hashCode() {
        return this.f93827b;
    }

    public byte i(Number number) {
        byte b5 = this.f93827b;
        this.f93827b = (byte) (number.byteValue() + b5);
        return b5;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f93827b;
    }

    public byte j() {
        byte b5 = this.f93827b;
        this.f93827b = (byte) (b5 - 1);
        return b5;
    }

    public byte k() {
        byte b5 = this.f93827b;
        this.f93827b = (byte) (b5 + 1);
        return b5;
    }

    @Override // ze.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Byte getValue() {
        return Byte.valueOf(this.f93827b);
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f93827b;
    }

    public void m() {
        this.f93827b = (byte) (this.f93827b + 1);
    }

    public byte n() {
        byte b5 = (byte) (this.f93827b + 1);
        this.f93827b = b5;
        return b5;
    }

    public void o(byte b5) {
        this.f93827b = b5;
    }

    @Override // ze.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void setValue(Number number) {
        this.f93827b = number.byteValue();
    }

    public void q(byte b5) {
        this.f93827b = (byte) (this.f93827b - b5);
    }

    public void r(Number number) {
        this.f93827b = (byte) (this.f93827b - number.byteValue());
    }

    public Byte s() {
        return Byte.valueOf(byteValue());
    }

    public String toString() {
        return String.valueOf((int) this.f93827b);
    }

    public c(byte b5) {
        this.f93827b = b5;
    }

    public c(Number number) {
        this.f93827b = number.byteValue();
    }

    public c(String str) {
        this.f93827b = Byte.parseByte(str);
    }
}
