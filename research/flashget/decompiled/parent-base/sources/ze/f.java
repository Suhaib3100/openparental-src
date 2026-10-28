package ze;

/* compiled from: MutableInt.java */
/* loaded from: classes6.dex */
public class f extends Number implements Comparable<f>, a<Number> {

    /* renamed from: c, reason: collision with root package name */
    private static final long f93832c = 512176391864L;

    /* renamed from: b, reason: collision with root package name */
    private int f93833b;

    public f() {
    }

    public void a(int i4) {
        this.f93833b += i4;
    }

    public void b(Number number) {
        this.f93833b = number.intValue() + this.f93833b;
    }

    public int c(int i4) {
        int i5 = this.f93833b + i4;
        this.f93833b = i5;
        return i5;
    }

    public int d(Number number) {
        int intValue = number.intValue() + this.f93833b;
        this.f93833b = intValue;
        return intValue;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f93833b;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return ye.c.b(this.f93833b, fVar.f93833b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f93833b == ((f) obj).intValue();
    }

    public void f() {
        this.f93833b--;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f93833b;
    }

    public int g() {
        int i4 = this.f93833b - 1;
        this.f93833b = i4;
        return i4;
    }

    public int h(int i4) {
        int i5 = this.f93833b;
        this.f93833b = i4 + i5;
        return i5;
    }

    public int hashCode() {
        return this.f93833b;
    }

    public int i(Number number) {
        int i4 = this.f93833b;
        this.f93833b = number.intValue() + i4;
        return i4;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f93833b;
    }

    public int j() {
        int i4 = this.f93833b;
        this.f93833b = i4 - 1;
        return i4;
    }

    public int k() {
        int i4 = this.f93833b;
        this.f93833b = i4 + 1;
        return i4;
    }

    @Override // ze.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        return Integer.valueOf(this.f93833b);
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f93833b;
    }

    public void m() {
        this.f93833b++;
    }

    public int n() {
        int i4 = this.f93833b + 1;
        this.f93833b = i4;
        return i4;
    }

    public void o(int i4) {
        this.f93833b = i4;
    }

    @Override // ze.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void setValue(Number number) {
        this.f93833b = number.intValue();
    }

    public void q(int i4) {
        this.f93833b -= i4;
    }

    public void r(Number number) {
        this.f93833b -= number.intValue();
    }

    public Integer s() {
        return Integer.valueOf(intValue());
    }

    public String toString() {
        return String.valueOf(this.f93833b);
    }

    public f(int i4) {
        this.f93833b = i4;
    }

    public f(Number number) {
        this.f93833b = number.intValue();
    }

    public f(String str) {
        this.f93833b = Integer.parseInt(str);
    }
}
