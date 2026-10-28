package ze;

/* compiled from: MutableFloat.java */
/* loaded from: classes6.dex */
public class e extends Number implements Comparable<e>, a<Number> {

    /* renamed from: c, reason: collision with root package name */
    private static final long f93830c = 5787169186L;

    /* renamed from: b, reason: collision with root package name */
    private float f93831b;

    public e() {
    }

    public void a(float f4) {
        this.f93831b += f4;
    }

    public void b(Number number) {
        this.f93831b = number.floatValue() + this.f93831b;
    }

    public float c(float f4) {
        float f5 = this.f93831b + f4;
        this.f93831b = f5;
        return f5;
    }

    public float d(Number number) {
        float floatValue = number.floatValue() + this.f93831b;
        this.f93831b = floatValue;
        return floatValue;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f93831b;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        return Float.compare(this.f93831b, eVar.f93831b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && Float.floatToIntBits(((e) obj).f93831b) == Float.floatToIntBits(this.f93831b);
    }

    public void f() {
        this.f93831b -= 1.0f;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f93831b;
    }

    public float g() {
        float f4 = this.f93831b - 1.0f;
        this.f93831b = f4;
        return f4;
    }

    public float h(float f4) {
        float f5 = this.f93831b;
        this.f93831b = f4 + f5;
        return f5;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f93831b);
    }

    public float i(Number number) {
        float f4 = this.f93831b;
        this.f93831b = number.floatValue() + f4;
        return f4;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f93831b;
    }

    public float j() {
        float f4 = this.f93831b;
        this.f93831b = f4 - 1.0f;
        return f4;
    }

    public float k() {
        float f4 = this.f93831b;
        this.f93831b = 1.0f + f4;
        return f4;
    }

    @Override // ze.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Float getValue() {
        return Float.valueOf(this.f93831b);
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.f93831b;
    }

    public void m() {
        this.f93831b += 1.0f;
    }

    public float n() {
        float f4 = this.f93831b + 1.0f;
        this.f93831b = f4;
        return f4;
    }

    public boolean o() {
        return Float.isInfinite(this.f93831b);
    }

    public boolean p() {
        return Float.isNaN(this.f93831b);
    }

    public void q(float f4) {
        this.f93831b = f4;
    }

    @Override // ze.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void setValue(Number number) {
        this.f93831b = number.floatValue();
    }

    public void s(float f4) {
        this.f93831b -= f4;
    }

    public void t(Number number) {
        this.f93831b -= number.floatValue();
    }

    public String toString() {
        return String.valueOf(this.f93831b);
    }

    public Float u() {
        return Float.valueOf(floatValue());
    }

    public e(float f4) {
        this.f93831b = f4;
    }

    public e(Number number) {
        this.f93831b = number.floatValue();
    }

    public e(String str) {
        this.f93831b = Float.parseFloat(str);
    }
}
