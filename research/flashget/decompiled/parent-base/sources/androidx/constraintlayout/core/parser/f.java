package androidx.constraintlayout.core.parser;

/* compiled from: CLNumber.java */
/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: i, reason: collision with root package name */
    float f22614i;

    public f(char[] cArr) {
        super(cArr);
        this.f22614i = Float.NaN;
    }

    public static d H(char[] cArr) {
        return new f(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.d
    protected String F(int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        b(sb, i4);
        float j4 = j();
        int i6 = (int) j4;
        if (i6 == j4) {
            sb.append(i6);
        } else {
            sb.append(j4);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.d
    protected String G() {
        float j4 = j();
        int i4 = (int) j4;
        if (i4 == j4) {
            return android.support.v4.media.a.a("", i4);
        }
        return "" + j4;
    }

    public boolean I() {
        float j4 = j();
        return ((float) ((int) j4)) == j4;
    }

    public void K(float f4) {
        this.f22614i = f4;
    }

    @Override // androidx.constraintlayout.core.parser.d
    public float j() {
        if (Float.isNaN(this.f22614i)) {
            this.f22614i = Float.parseFloat(c());
        }
        return this.f22614i;
    }

    @Override // androidx.constraintlayout.core.parser.d
    public int l() {
        if (Float.isNaN(this.f22614i)) {
            this.f22614i = Integer.parseInt(c());
        }
        return (int) this.f22614i;
    }

    public f(float f4) {
        super(null);
        this.f22614i = f4;
    }
}
