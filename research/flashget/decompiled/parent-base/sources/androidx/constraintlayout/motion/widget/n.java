package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.motion.utils.d;
import androidx.constraintlayout.widget.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: MotionConstrainedPoint.java */
/* loaded from: classes.dex */
class n implements Comparable<n> {
    public static final boolean F = false;
    static final int G = 1;
    static final int H = 2;

    /* renamed from: d, reason: collision with root package name */
    int f23466d;

    /* renamed from: q, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.e f23479q;

    /* renamed from: s, reason: collision with root package name */
    private float f23481s;

    /* renamed from: t, reason: collision with root package name */
    private float f23482t;

    /* renamed from: u, reason: collision with root package name */
    private float f23483u;

    /* renamed from: v, reason: collision with root package name */
    private float f23484v;

    /* renamed from: w, reason: collision with root package name */
    private float f23485w;
    public static final String E = "MotionPaths";
    static String[] I = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: b, reason: collision with root package name */
    private float f23464b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    int f23465c = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23467e = false;

    /* renamed from: f, reason: collision with root package name */
    private float f23468f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private float f23469g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f23470h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f23471i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    private float f23472j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    private float f23473k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private float f23474l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    private float f23475m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    private float f23476n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    private float f23477o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    private float f23478p = 0.0f;

    /* renamed from: r, reason: collision with root package name */
    private int f23480r = 0;

    /* renamed from: x, reason: collision with root package name */
    private float f23486x = Float.NaN;

    /* renamed from: y, reason: collision with root package name */
    private float f23487y = Float.NaN;

    /* renamed from: z, reason: collision with root package name */
    private int f23488z = -1;
    LinkedHashMap<String, androidx.constraintlayout.widget.a> A = new LinkedHashMap<>();
    int B = 0;
    double[] C = new double[18];
    double[] D = new double[18];

    private boolean e(float a5, float b5) {
        return (Float.isNaN(a5) || Float.isNaN(b5)) ? Float.isNaN(a5) != Float.isNaN(b5) : Math.abs(a5 - b5) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> splines, int mFramePosition) {
        for (String str : splines.keySet()) {
            androidx.constraintlayout.motion.utils.d dVar = splines.get(str);
            str.getClass();
            char c5 = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c5 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c5 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c5 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c5 = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c5 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c5 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c5 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c5 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c5 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c5 = org.apache.commons.lang3.m.f86065d;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    dVar.g(mFramePosition, Float.isNaN(this.f23470h) ? 0.0f : this.f23470h);
                    break;
                case 1:
                    dVar.g(mFramePosition, Float.isNaN(this.f23471i) ? 0.0f : this.f23471i);
                    break;
                case 2:
                    dVar.g(mFramePosition, Float.isNaN(this.f23476n) ? 0.0f : this.f23476n);
                    break;
                case 3:
                    dVar.g(mFramePosition, Float.isNaN(this.f23477o) ? 0.0f : this.f23477o);
                    break;
                case 4:
                    dVar.g(mFramePosition, Float.isNaN(this.f23478p) ? 0.0f : this.f23478p);
                    break;
                case 5:
                    dVar.g(mFramePosition, Float.isNaN(this.f23487y) ? 0.0f : this.f23487y);
                    break;
                case 6:
                    dVar.g(mFramePosition, Float.isNaN(this.f23472j) ? 1.0f : this.f23472j);
                    break;
                case 7:
                    dVar.g(mFramePosition, Float.isNaN(this.f23473k) ? 1.0f : this.f23473k);
                    break;
                case '\b':
                    dVar.g(mFramePosition, Float.isNaN(this.f23474l) ? 0.0f : this.f23474l);
                    break;
                case '\t':
                    dVar.g(mFramePosition, Float.isNaN(this.f23475m) ? 0.0f : this.f23475m);
                    break;
                case '\n':
                    dVar.g(mFramePosition, Float.isNaN(this.f23469g) ? 0.0f : this.f23469g);
                    break;
                case 11:
                    dVar.g(mFramePosition, Float.isNaN(this.f23468f) ? 0.0f : this.f23468f);
                    break;
                case '\f':
                    dVar.g(mFramePosition, Float.isNaN(this.f23486x) ? 0.0f : this.f23486x);
                    break;
                case '\r':
                    dVar.g(mFramePosition, Float.isNaN(this.f23464b) ? 1.0f : this.f23464b);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.A.containsKey(str2)) {
                            androidx.constraintlayout.widget.a aVar = this.A.get(str2);
                            if (dVar instanceof d.b) {
                                ((d.b) dVar).n(mFramePosition, aVar);
                                break;
                            } else {
                                aVar.k();
                                Objects.toString(dVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
            }
        }
    }

    public void b(View view) {
        this.f23466d = view.getVisibility();
        this.f23464b = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f23467e = false;
        this.f23468f = view.getElevation();
        this.f23469g = view.getRotation();
        this.f23470h = view.getRotationX();
        this.f23471i = view.getRotationY();
        this.f23472j = view.getScaleX();
        this.f23473k = view.getScaleY();
        this.f23474l = view.getPivotX();
        this.f23475m = view.getPivotY();
        this.f23476n = view.getTranslationX();
        this.f23477o = view.getTranslationY();
        this.f23478p = view.getTranslationZ();
    }

    public void c(d.a c5) {
        d.C0398d c0398d = c5.f24046c;
        int i4 = c0398d.f24174c;
        this.f23465c = i4;
        int i5 = c0398d.f24173b;
        this.f23466d = i5;
        this.f23464b = (i5 == 0 || i4 != 0) ? c0398d.f24175d : 0.0f;
        d.e eVar = c5.f24049f;
        this.f23467e = eVar.f24201m;
        this.f23468f = eVar.f24202n;
        this.f23469g = eVar.f24190b;
        this.f23470h = eVar.f24191c;
        this.f23471i = eVar.f24192d;
        this.f23472j = eVar.f24193e;
        this.f23473k = eVar.f24194f;
        this.f23474l = eVar.f24195g;
        this.f23475m = eVar.f24196h;
        this.f23476n = eVar.f24198j;
        this.f23477o = eVar.f24199k;
        this.f23478p = eVar.f24200l;
        this.f23479q = androidx.constraintlayout.core.motion.utils.e.c(c5.f24047d.f24161d);
        d.c cVar = c5.f24047d;
        this.f23486x = cVar.f24166i;
        this.f23480r = cVar.f24163f;
        this.f23488z = cVar.f24159b;
        this.f23487y = c5.f24046c.f24176e;
        for (String str : c5.f24050g.keySet()) {
            androidx.constraintlayout.widget.a aVar = c5.f24050g.get(str);
            if (aVar.n()) {
                this.A.put(str, aVar);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(n o4) {
        return Float.compare(this.f23481s, o4.f23481s);
    }

    void f(n points, HashSet<String> keySet) {
        if (e(this.f23464b, points.f23464b)) {
            keySet.add("alpha");
        }
        if (e(this.f23468f, points.f23468f)) {
            keySet.add("elevation");
        }
        int i4 = this.f23466d;
        int i5 = points.f23466d;
        if (i4 != i5 && this.f23465c == 0 && (i4 == 0 || i5 == 0)) {
            keySet.add("alpha");
        }
        if (e(this.f23469g, points.f23469g)) {
            keySet.add("rotation");
        }
        if (!Float.isNaN(this.f23486x) || !Float.isNaN(points.f23486x)) {
            keySet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f23487y) || !Float.isNaN(points.f23487y)) {
            keySet.add("progress");
        }
        if (e(this.f23470h, points.f23470h)) {
            keySet.add("rotationX");
        }
        if (e(this.f23471i, points.f23471i)) {
            keySet.add("rotationY");
        }
        if (e(this.f23474l, points.f23474l)) {
            keySet.add("transformPivotX");
        }
        if (e(this.f23475m, points.f23475m)) {
            keySet.add("transformPivotY");
        }
        if (e(this.f23472j, points.f23472j)) {
            keySet.add("scaleX");
        }
        if (e(this.f23473k, points.f23473k)) {
            keySet.add("scaleY");
        }
        if (e(this.f23476n, points.f23476n)) {
            keySet.add("translationX");
        }
        if (e(this.f23477o, points.f23477o)) {
            keySet.add("translationY");
        }
        if (e(this.f23478p, points.f23478p)) {
            keySet.add("translationZ");
        }
    }

    void g(n points, boolean[] mask, String[] custom) {
        mask[0] = mask[0] | e(this.f23481s, points.f23481s);
        mask[1] = mask[1] | e(this.f23482t, points.f23482t);
        mask[2] = mask[2] | e(this.f23483u, points.f23483u);
        mask[3] = mask[3] | e(this.f23484v, points.f23484v);
        mask[4] = e(this.f23485w, points.f23485w) | mask[4];
    }

    void h(double[] data, int[] toUse) {
        int i4 = 0;
        float[] fArr = {this.f23481s, this.f23482t, this.f23483u, this.f23484v, this.f23485w, this.f23464b, this.f23468f, this.f23469g, this.f23470h, this.f23471i, this.f23472j, this.f23473k, this.f23474l, this.f23475m, this.f23476n, this.f23477o, this.f23478p, this.f23486x};
        for (int i5 : toUse) {
            if (i5 < 18) {
                data[i4] = fArr[r5];
                i4++;
            }
        }
    }

    int i(String name, double[] value, int offset) {
        androidx.constraintlayout.widget.a aVar = this.A.get(name);
        if (aVar.p() == 1) {
            value[offset] = aVar.k();
            return 1;
        }
        int p4 = aVar.p();
        aVar.l(new float[p4]);
        int i4 = 0;
        while (i4 < p4) {
            value[offset] = r1[i4];
            i4++;
            offset++;
        }
        return p4;
    }

    int j(String name) {
        return this.A.get(name).p();
    }

    boolean k(String name) {
        return this.A.containsKey(name);
    }

    void l(float x4, float y4, float w4, float h4) {
        this.f23482t = x4;
        this.f23483u = y4;
        this.f23484v = w4;
        this.f23485w = h4;
    }

    public void m(Rect rect, View view, int rotation, float prevous) {
        l(rect.left, rect.top, rect.width(), rect.height());
        b(view);
        this.f23474l = Float.NaN;
        this.f23475m = Float.NaN;
        if (rotation == 1) {
            this.f23469g = prevous - 90.0f;
        } else {
            if (rotation != 2) {
                return;
            }
            this.f23469g = prevous + 90.0f;
        }
    }

    public void n(Rect cw, androidx.constraintlayout.widget.d constraintSet, int rotation, int viewId) {
        l(cw.left, cw.top, cw.width(), cw.height());
        c(constraintSet.q0(viewId));
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    if (rotation != 4) {
                        return;
                    }
                }
            }
            float f4 = this.f23469g + 90.0f;
            this.f23469g = f4;
            if (f4 > 180.0f) {
                this.f23469g = f4 - 360.0f;
                return;
            }
            return;
        }
        this.f23469g -= 90.0f;
    }

    public void o(View view) {
        l(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        b(view);
    }
}
