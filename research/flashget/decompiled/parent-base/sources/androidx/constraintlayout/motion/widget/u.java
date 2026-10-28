package androidx.constraintlayout.motion.widget;

/* compiled from: OnSwipe.java */
/* loaded from: classes.dex */
public class u {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    public static final int D = 4;
    public static final int E = 5;
    public static final int F = 6;
    public static final int G = 7;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final int N = 4;
    public static final int O = 5;
    public static final int P = 6;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static final int T = 3;
    public static final int U = 4;
    public static final int V = 5;
    public static final int W = 6;
    public static final int X = 7;

    /* renamed from: t, reason: collision with root package name */
    public static final int f23616t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f23617u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f23618v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f23619w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f23620x = 2;

    /* renamed from: y, reason: collision with root package name */
    public static final int f23621y = 3;

    /* renamed from: z, reason: collision with root package name */
    public static final int f23622z = 0;

    /* renamed from: a, reason: collision with root package name */
    private int f23623a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f23624b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f23625c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f23626d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f23627e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f23628f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f23629g = -1;

    /* renamed from: h, reason: collision with root package name */
    private float f23630h = 4.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f23631i = 1.2f;

    /* renamed from: j, reason: collision with root package name */
    private boolean f23632j = true;

    /* renamed from: k, reason: collision with root package name */
    private float f23633k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private int f23634l = 0;

    /* renamed from: m, reason: collision with root package name */
    private float f23635m = 10.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f23636n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    private float f23637o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    private float f23638p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    private float f23639q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    private int f23640r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f23641s = 0;

    public u A(boolean moveWhenScrollAtTop) {
        this.f23632j = moveWhenScrollAtTop;
        return this;
    }

    public u B(int flags) {
        this.f23634l = flags;
        return this;
    }

    public u C(int mode) {
        this.f23628f = mode;
        return this;
    }

    public u D(int rotationCenterId) {
        this.f23629g = rotationCenterId;
        return this;
    }

    public u E(int springBoundary) {
        this.f23640r = springBoundary;
        return this;
    }

    public u F(float springDamping) {
        this.f23636n = springDamping;
        return this;
    }

    public u G(float springMass) {
        this.f23637o = springMass;
        return this;
    }

    public u H(float springStiffness) {
        this.f23638p = springStiffness;
        return this;
    }

    public u I(float springStopThreshold) {
        this.f23639q = springStopThreshold;
        return this;
    }

    public u J(int side) {
        this.f23625c = side;
        return this;
    }

    public u K(int side) {
        this.f23624b = side;
        return this;
    }

    public u L(int side) {
        this.f23626d = side;
        return this;
    }

    public int a() {
        return this.f23641s;
    }

    public int b() {
        return this.f23623a;
    }

    public float c() {
        return this.f23633k;
    }

    public float d() {
        return this.f23635m;
    }

    public int e() {
        return this.f23627e;
    }

    public float f() {
        return this.f23631i;
    }

    public float g() {
        return this.f23630h;
    }

    public boolean h() {
        return this.f23632j;
    }

    public int i() {
        return this.f23634l;
    }

    public int j() {
        return this.f23628f;
    }

    public int k() {
        return this.f23629g;
    }

    public int l() {
        return this.f23640r;
    }

    public float m() {
        return this.f23636n;
    }

    public float n() {
        return this.f23637o;
    }

    public float o() {
        return this.f23638p;
    }

    public float p() {
        return this.f23639q;
    }

    public int q() {
        return this.f23625c;
    }

    public int r() {
        return this.f23624b;
    }

    public int s() {
        return this.f23626d;
    }

    public void t(int autoCompleteMode) {
        this.f23641s = autoCompleteMode;
    }

    public u u(int dragDirection) {
        this.f23623a = dragDirection;
        return this;
    }

    public u v(int dragScale) {
        this.f23633k = dragScale;
        return this;
    }

    public u w(int dragThreshold) {
        this.f23635m = dragThreshold;
        return this;
    }

    public u x(int id2) {
        this.f23627e = id2;
        return this;
    }

    public u y(int maxAcceleration) {
        this.f23631i = maxAcceleration;
        return this;
    }

    public u z(int maxVelocity) {
        this.f23630h = maxVelocity;
        return this;
    }
}
