package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: MotionKeyTrigger.java */
/* loaded from: classes.dex */
public class h extends b {

    /* renamed from: e0, reason: collision with root package name */
    public static final int f22139e0 = 301;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f22140f0 = 302;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f22141g0 = 303;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f22142h0 = 304;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f22143i0 = 305;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f22144j0 = 306;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f22145k0 = 307;

    /* renamed from: l0, reason: collision with root package name */
    public static final int f22146l0 = 308;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f22147m0 = 309;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f22148n0 = 310;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f22149o0 = 311;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f22150p0 = 312;

    /* renamed from: q0, reason: collision with root package name */
    public static final int f22151q0 = 5;
    private int A;
    private String B;
    private String C;
    private int D;
    private int E;
    float F;
    private boolean G;
    private boolean H;
    private boolean I;
    private float J;
    private float K;
    private boolean L;
    int M;
    int N;
    int O;
    androidx.constraintlayout.core.motion.utils.f P;
    androidx.constraintlayout.core.motion.utils.f Q;

    /* renamed from: y, reason: collision with root package name */
    private int f22152y = -1;

    /* renamed from: z, reason: collision with root package name */
    private String f22153z = null;

    /* renamed from: d0, reason: collision with root package name */
    public static final String f22138d0 = "CROSS";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f22137c0 = "triggerReceiver";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f22136b0 = "negativeCross";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f22135a0 = "positiveCross";
    private static final String R = "KeyTrigger";
    public static final String S = "viewTransitionOnCross";
    public static final String T = "viewTransitionOnPositiveCross";
    public static final String U = "viewTransitionOnNegativeCross";
    public static final String V = "postLayout";
    public static final String W = "triggerSlack";
    public static final String X = "triggerCollisionView";
    public static final String Y = "triggerCollisionId";
    public static final String Z = "triggerID";

    public h() {
        int i4 = b.f22105m;
        this.A = i4;
        this.B = null;
        this.C = null;
        this.D = i4;
        this.E = i4;
        this.F = 0.1f;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = Float.NaN;
        this.L = false;
        this.M = i4;
        this.N = i4;
        this.O = i4;
        this.P = new androidx.constraintlayout.core.motion.utils.f();
        this.Q = new androidx.constraintlayout.core.motion.utils.f();
        this.f22120k = 5;
        this.f22121l = new HashMap<>();
    }

    private void x(String str, androidx.constraintlayout.core.motion.f fVar) {
        boolean z4 = str.length() == 1;
        if (!z4) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f22121l.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z4 || lowerCase.matches(str)) {
                androidx.constraintlayout.core.motion.b bVar = this.f22121l.get(str2);
                if (bVar != null) {
                    bVar.a(fVar);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.core.motion.utils.w
    public int a(String str) {
        char c5;
        str.getClass();
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c5 = '\t';
                    break;
                }
                c5 = 65535;
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c5 = '\n';
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        switch (c5) {
            case 0:
                return 309;
            case 1:
                return 302;
            case 2:
                return 307;
            case 3:
                return 308;
            case 4:
                return 310;
            case 5:
                return 306;
            case 6:
                return 303;
            case 7:
                return 305;
            case '\b':
                return 301;
            case '\t':
                return 304;
            case '\n':
                return 311;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i4, int i5) {
        if (i4 == 307) {
            this.E = i5;
            return true;
        }
        if (i4 == 308) {
            this.D = u(Integer.valueOf(i5));
            return true;
        }
        if (i4 == 311) {
            this.A = i5;
            return true;
        }
        switch (i4) {
            case 301:
                this.O = i5;
                return true;
            case 302:
                this.N = i5;
                return true;
            case 303:
                this.M = i5;
                return true;
            default:
                return super.b(i4, i5);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean c(int i4, float f4) {
        if (i4 != 305) {
            return false;
        }
        this.F = f4;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean d(int i4, boolean z4) {
        if (i4 != 304) {
            return false;
        }
        this.L = z4;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean e(int i4, String str) {
        if (i4 == 309) {
            this.C = str;
            return true;
        }
        if (i4 == 310) {
            this.B = str;
            return true;
        }
        if (i4 != 312) {
            return super.e(i4, str);
        }
        this.f22153z = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, p> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: g */
    public b clone() {
        return new h().h(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
    }

    public void v(float f4, androidx.constraintlayout.core.motion.f fVar) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public h h(b bVar) {
        super.h(bVar);
        h hVar = (h) bVar;
        this.f22152y = hVar.f22152y;
        this.f22153z = hVar.f22153z;
        this.A = hVar.A;
        this.B = hVar.B;
        this.C = hVar.C;
        this.D = hVar.D;
        this.E = hVar.E;
        this.F = hVar.F;
        this.G = hVar.G;
        this.H = hVar.H;
        this.I = hVar.I;
        this.J = hVar.J;
        this.K = hVar.K;
        this.L = hVar.L;
        this.P = hVar.P;
        this.Q = hVar.Q;
        return this;
    }
}
