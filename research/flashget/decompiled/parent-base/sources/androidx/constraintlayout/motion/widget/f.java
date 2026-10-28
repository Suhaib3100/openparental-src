package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: Key.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: f, reason: collision with root package name */
    public static int f23308f = -1;

    /* renamed from: a, reason: collision with root package name */
    int f23329a;

    /* renamed from: b, reason: collision with root package name */
    int f23330b;

    /* renamed from: c, reason: collision with root package name */
    String f23331c;

    /* renamed from: d, reason: collision with root package name */
    protected int f23332d;

    /* renamed from: e, reason: collision with root package name */
    HashMap<String, androidx.constraintlayout.widget.a> f23333e;
    public static final String A = "motionProgress";
    public static final String B = "transitionEasing";
    public static final String C = "visibility";

    /* renamed from: g, reason: collision with root package name */
    public static final String f23309g = "alpha";

    /* renamed from: h, reason: collision with root package name */
    public static final String f23310h = "elevation";

    /* renamed from: i, reason: collision with root package name */
    public static final String f23311i = "rotation";

    /* renamed from: j, reason: collision with root package name */
    public static final String f23312j = "rotationX";

    /* renamed from: k, reason: collision with root package name */
    public static final String f23313k = "rotationY";

    /* renamed from: l, reason: collision with root package name */
    public static final String f23314l = "transformPivotX";

    /* renamed from: m, reason: collision with root package name */
    public static final String f23315m = "transformPivotY";

    /* renamed from: n, reason: collision with root package name */
    public static final String f23316n = "transitionPathRotate";

    /* renamed from: o, reason: collision with root package name */
    public static final String f23317o = "scaleX";

    /* renamed from: p, reason: collision with root package name */
    public static final String f23318p = "scaleY";

    /* renamed from: q, reason: collision with root package name */
    public static final String f23319q = "wavePeriod";

    /* renamed from: r, reason: collision with root package name */
    public static final String f23320r = "waveOffset";

    /* renamed from: s, reason: collision with root package name */
    public static final String f23321s = "wavePhase";

    /* renamed from: t, reason: collision with root package name */
    public static final String f23322t = "waveVariesBy";

    /* renamed from: u, reason: collision with root package name */
    public static final String f23323u = "translationX";

    /* renamed from: v, reason: collision with root package name */
    public static final String f23324v = "translationY";

    /* renamed from: w, reason: collision with root package name */
    public static final String f23325w = "translationZ";

    /* renamed from: x, reason: collision with root package name */
    public static final String f23326x = "progress";

    /* renamed from: y, reason: collision with root package name */
    public static final String f23327y = "CUSTOM";

    /* renamed from: z, reason: collision with root package name */
    public static final String f23328z = "curveFit";

    public f() {
        int i4 = f23308f;
        this.f23329a = i4;
        this.f23330b = i4;
        this.f23331c = null;
    }

    public abstract void a(HashMap<String, androidx.constraintlayout.motion.utils.d> splines);

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract f clone();

    public f c(f src) {
        this.f23329a = src.f23329a;
        this.f23330b = src.f23330b;
        this.f23331c = src.f23331c;
        this.f23332d = src.f23332d;
        this.f23333e = src.f23333e;
        return this;
    }

    abstract void d(HashSet<String> attributes);

    public int e() {
        return this.f23329a;
    }

    abstract void f(Context context, AttributeSet attrs);

    boolean g(String constraintTag) {
        String str = this.f23331c;
        if (str == null || constraintTag == null) {
            return false;
        }
        return constraintTag.matches(str);
    }

    public void h(int pos) {
        this.f23329a = pos;
    }

    public void i(HashMap<String, Integer> interpolation) {
    }

    public abstract void j(String tag, Object value);

    public f k(int id2) {
        this.f23330b = id2;
        return this;
    }

    boolean l(Object value) {
        return value instanceof Boolean ? ((Boolean) value).booleanValue() : Boolean.parseBoolean(value.toString());
    }

    float m(Object value) {
        return value instanceof Float ? ((Float) value).floatValue() : Float.parseFloat(value.toString());
    }

    int n(Object value) {
        return value instanceof Integer ? ((Integer) value).intValue() : Integer.parseInt(value.toString());
    }
}
