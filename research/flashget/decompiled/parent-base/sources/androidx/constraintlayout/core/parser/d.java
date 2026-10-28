package androidx.constraintlayout.core.parser;

/* compiled from: CLElement.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: g, reason: collision with root package name */
    protected static int f22606g = 80;

    /* renamed from: h, reason: collision with root package name */
    protected static int f22607h = 2;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f22608b;

    /* renamed from: c, reason: collision with root package name */
    protected long f22609c = -1;

    /* renamed from: d, reason: collision with root package name */
    protected long f22610d = Long.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    protected c f22611e;

    /* renamed from: f, reason: collision with root package name */
    private int f22612f;

    public d(char[] cArr) {
        this.f22608b = cArr;
    }

    public void A(int i4) {
        this.f22612f = i4;
    }

    public void D(long j4) {
        this.f22609c = j4;
    }

    protected String F(int i4, int i5) {
        return "";
    }

    protected String G() {
        return "";
    }

    protected void b(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append(' ');
        }
    }

    public String c() {
        String str = new String(this.f22608b);
        long j4 = this.f22610d;
        if (j4 != Long.MAX_VALUE) {
            long j5 = this.f22609c;
            if (j4 >= j5) {
                return str.substring((int) j5, ((int) j4) + 1);
            }
        }
        long j6 = this.f22609c;
        return str.substring((int) j6, ((int) j6) + 1);
    }

    public d f() {
        return this.f22611e;
    }

    protected String h() {
        return h.f22618d ? android.support.v4.media.c.a(new StringBuilder(), q(), " -> ") : "";
    }

    public long i() {
        return this.f22610d;
    }

    public float j() {
        if (this instanceof f) {
            return ((f) this).j();
        }
        return Float.NaN;
    }

    public int l() {
        if (this instanceof f) {
            return ((f) this).l();
        }
        return 0;
    }

    public int m() {
        return this.f22612f;
    }

    public long p() {
        return this.f22609c;
    }

    protected String q() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public boolean r() {
        return this.f22610d != Long.MAX_VALUE;
    }

    public boolean s() {
        return this.f22609c > -1;
    }

    public String toString() {
        long j4 = this.f22609c;
        long j5 = this.f22610d;
        if (j4 > j5 || j5 == Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.f22609c);
            sb.append("-");
            return android.support.v4.media.session.b.a(sb, this.f22610d, ")");
        }
        return q() + " (" + this.f22609c + " : " + this.f22610d + ") <<" + new String(this.f22608b).substring((int) this.f22609c, ((int) this.f22610d) + 1) + ">>";
    }

    public boolean v() {
        return this.f22609c == -1;
    }

    public void w(c cVar) {
        this.f22611e = cVar;
    }

    public void x(long j4) {
        if (this.f22610d != Long.MAX_VALUE) {
            return;
        }
        this.f22610d = j4;
        if (h.f22618d) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        c cVar = this.f22611e;
        if (cVar != null) {
            cVar.H(this);
        }
    }
}
