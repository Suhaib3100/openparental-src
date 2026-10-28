package ze;

/* compiled from: MutableLong.java */
/* loaded from: classes6.dex */
public class g extends Number implements Comparable<g>, a<Number> {

    /* renamed from: c, reason: collision with root package name */
    private static final long f93834c = 62986528375L;

    /* renamed from: b, reason: collision with root package name */
    private long f93835b;

    public g() {
    }

    public void a(long j4) {
        this.f93835b += j4;
    }

    public void b(Number number) {
        this.f93835b = number.longValue() + this.f93835b;
    }

    public long c(long j4) {
        long j5 = this.f93835b + j4;
        this.f93835b = j5;
        return j5;
    }

    public long d(Number number) {
        long longValue = number.longValue() + this.f93835b;
        this.f93835b = longValue;
        return longValue;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f93835b;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(g gVar) {
        return ye.c.c(this.f93835b, gVar.f93835b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && this.f93835b == ((g) obj).longValue();
    }

    public void f() {
        this.f93835b--;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f93835b;
    }

    public long g() {
        long j4 = this.f93835b - 1;
        this.f93835b = j4;
        return j4;
    }

    public long h(long j4) {
        long j5 = this.f93835b;
        this.f93835b = j4 + j5;
        return j5;
    }

    public int hashCode() {
        long j4 = this.f93835b;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public long i(Number number) {
        long j4 = this.f93835b;
        this.f93835b = number.longValue() + j4;
        return j4;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f93835b;
    }

    public long j() {
        long j4 = this.f93835b;
        this.f93835b = j4 - 1;
        return j4;
    }

    public long k() {
        long j4 = this.f93835b;
        this.f93835b = 1 + j4;
        return j4;
    }

    @Override // ze.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long getValue() {
        return Long.valueOf(this.f93835b);
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f93835b;
    }

    public void m() {
        this.f93835b++;
    }

    public long n() {
        long j4 = this.f93835b + 1;
        this.f93835b = j4;
        return j4;
    }

    public void o(long j4) {
        this.f93835b = j4;
    }

    @Override // ze.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void setValue(Number number) {
        this.f93835b = number.longValue();
    }

    public void q(long j4) {
        this.f93835b -= j4;
    }

    public void r(Number number) {
        this.f93835b -= number.longValue();
    }

    public Long s() {
        return Long.valueOf(longValue());
    }

    public String toString() {
        return String.valueOf(this.f93835b);
    }

    public g(long j4) {
        this.f93835b = j4;
    }

    public g(Number number) {
        this.f93835b = number.longValue();
    }

    public g(String str) {
        this.f93835b = Long.parseLong(str);
    }
}
