package ze;

/* compiled from: MutableShort.java */
/* loaded from: classes6.dex */
public class i extends Number implements Comparable<i>, a<Number> {

    /* renamed from: c, reason: collision with root package name */
    private static final long f93838c = -2135791679;

    /* renamed from: b, reason: collision with root package name */
    private short f93839b;

    public i() {
    }

    public void a(Number number) {
        this.f93839b = (short) (number.shortValue() + this.f93839b);
    }

    public void b(short s4) {
        this.f93839b = (short) (this.f93839b + s4);
    }

    public short c(Number number) {
        short shortValue = (short) (number.shortValue() + this.f93839b);
        this.f93839b = shortValue;
        return shortValue;
    }

    public short d(short s4) {
        short s5 = (short) (this.f93839b + s4);
        this.f93839b = s5;
        return s5;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f93839b;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return ye.c.d(this.f93839b, iVar.f93839b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f93839b == ((i) obj).shortValue();
    }

    public void f() {
        this.f93839b = (short) (this.f93839b - 1);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f93839b;
    }

    public short g() {
        short s4 = (short) (this.f93839b - 1);
        this.f93839b = s4;
        return s4;
    }

    public short h(Number number) {
        short s4 = this.f93839b;
        this.f93839b = (short) (number.shortValue() + s4);
        return s4;
    }

    public int hashCode() {
        return this.f93839b;
    }

    public short i(short s4) {
        short s5 = this.f93839b;
        this.f93839b = (short) (s4 + s5);
        return s5;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f93839b;
    }

    public short j() {
        short s4 = this.f93839b;
        this.f93839b = (short) (s4 - 1);
        return s4;
    }

    public short k() {
        short s4 = this.f93839b;
        this.f93839b = (short) (s4 + 1);
        return s4;
    }

    @Override // ze.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Short getValue() {
        return Short.valueOf(this.f93839b);
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f93839b;
    }

    public void m() {
        this.f93839b = (short) (this.f93839b + 1);
    }

    public short n() {
        short s4 = (short) (this.f93839b + 1);
        this.f93839b = s4;
        return s4;
    }

    @Override // ze.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void setValue(Number number) {
        this.f93839b = number.shortValue();
    }

    public void p(short s4) {
        this.f93839b = s4;
    }

    public void q(Number number) {
        this.f93839b = (short) (this.f93839b - number.shortValue());
    }

    public void r(short s4) {
        this.f93839b = (short) (this.f93839b - s4);
    }

    public Short s() {
        return Short.valueOf(shortValue());
    }

    @Override // java.lang.Number
    public short shortValue() {
        return this.f93839b;
    }

    public String toString() {
        return String.valueOf((int) this.f93839b);
    }

    public i(short s4) {
        this.f93839b = s4;
    }

    public i(Number number) {
        this.f93839b = number.shortValue();
    }

    public i(String str) {
        this.f93839b = Short.parseShort(str);
    }
}
