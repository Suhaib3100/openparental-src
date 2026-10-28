package ze;

/* compiled from: MutableDouble.java */
/* loaded from: classes6.dex */
public class d extends Number implements Comparable<d>, a<Number> {

    /* renamed from: c, reason: collision with root package name */
    private static final long f93828c = 1587163916;

    /* renamed from: b, reason: collision with root package name */
    private double f93829b;

    public d() {
    }

    public void a(double d5) {
        this.f93829b += d5;
    }

    public void b(Number number) {
        this.f93829b = number.doubleValue() + this.f93829b;
    }

    public double c(double d5) {
        double d6 = this.f93829b + d5;
        this.f93829b = d6;
        return d6;
    }

    public double d(Number number) {
        double doubleValue = number.doubleValue() + this.f93829b;
        this.f93829b = doubleValue;
        return doubleValue;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f93829b;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        return Double.compare(this.f93829b, dVar.f93829b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && Double.doubleToLongBits(((d) obj).f93829b) == Double.doubleToLongBits(this.f93829b);
    }

    public void f() {
        this.f93829b -= 1.0d;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) this.f93829b;
    }

    public double g() {
        double d5 = this.f93829b - 1.0d;
        this.f93829b = d5;
        return d5;
    }

    public double h(double d5) {
        double d6 = this.f93829b;
        this.f93829b = d5 + d6;
        return d6;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f93829b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public double i(Number number) {
        double d5 = this.f93829b;
        this.f93829b = number.doubleValue() + d5;
        return d5;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f93829b;
    }

    public double j() {
        double d5 = this.f93829b;
        this.f93829b = d5 - 1.0d;
        return d5;
    }

    public double k() {
        double d5 = this.f93829b;
        this.f93829b = 1.0d + d5;
        return d5;
    }

    @Override // ze.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Double getValue() {
        return Double.valueOf(this.f93829b);
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.f93829b;
    }

    public void m() {
        this.f93829b += 1.0d;
    }

    public double n() {
        double d5 = this.f93829b + 1.0d;
        this.f93829b = d5;
        return d5;
    }

    public boolean o() {
        return Double.isInfinite(this.f93829b);
    }

    public boolean p() {
        return Double.isNaN(this.f93829b);
    }

    public void q(double d5) {
        this.f93829b = d5;
    }

    @Override // ze.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void setValue(Number number) {
        this.f93829b = number.doubleValue();
    }

    public void s(double d5) {
        this.f93829b -= d5;
    }

    public void t(Number number) {
        this.f93829b -= number.doubleValue();
    }

    public String toString() {
        return String.valueOf(this.f93829b);
    }

    public Double u() {
        return Double.valueOf(doubleValue());
    }

    public d(double d5) {
        this.f93829b = d5;
    }

    public d(Number number) {
        this.f93829b = number.doubleValue();
    }

    public d(String str) {
        this.f93829b = Double.parseDouble(str);
    }
}
