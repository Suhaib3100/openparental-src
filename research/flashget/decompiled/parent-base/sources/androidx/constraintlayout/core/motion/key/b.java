package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.p;
import androidx.constraintlayout.core.motion.utils.w;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: MotionKey.java */
/* loaded from: classes.dex */
public abstract class b implements w {

    /* renamed from: m, reason: collision with root package name */
    public static int f22105m = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f22117h;

    /* renamed from: i, reason: collision with root package name */
    int f22118i;

    /* renamed from: j, reason: collision with root package name */
    String f22119j;

    /* renamed from: k, reason: collision with root package name */
    public int f22120k;

    /* renamed from: l, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.core.motion.b> f22121l;

    /* renamed from: p, reason: collision with root package name */
    public static final String f22108p = "rotationZ";

    /* renamed from: q, reason: collision with root package name */
    public static final String f22109q = "rotationX";

    /* renamed from: r, reason: collision with root package name */
    public static final String f22110r = "transitionPathRotate";

    /* renamed from: s, reason: collision with root package name */
    public static final String f22111s = "scaleX";

    /* renamed from: t, reason: collision with root package name */
    public static final String f22112t = "scaleY";

    /* renamed from: u, reason: collision with root package name */
    public static final String f22113u = "translationX";

    /* renamed from: v, reason: collision with root package name */
    public static final String f22114v = "translationY";

    /* renamed from: w, reason: collision with root package name */
    public static final String f22115w = "CUSTOM";

    /* renamed from: x, reason: collision with root package name */
    public static final String f22116x = "visibility";

    /* renamed from: n, reason: collision with root package name */
    public static final String f22106n = "alpha";

    /* renamed from: o, reason: collision with root package name */
    public static final String f22107o = "elevation";

    public b() {
        int i4 = f22105m;
        this.f22117h = i4;
        this.f22118i = i4;
        this.f22119j = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i4, int i5) {
        if (i4 != 100) {
            return false;
        }
        this.f22117h = i5;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean c(int i4, float f4) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean d(int i4, boolean z4) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean e(int i4, String str) {
        if (i4 != 101) {
            return false;
        }
        this.f22119j = str;
        return true;
    }

    public abstract void f(HashMap<String, p> hashMap);

    @Override // 
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract b clone();

    public b h(b bVar) {
        this.f22117h = bVar.f22117h;
        this.f22118i = bVar.f22118i;
        this.f22119j = bVar.f22119j;
        this.f22120k = bVar.f22120k;
        return this;
    }

    public abstract void i(HashSet<String> hashSet);

    public int j() {
        return this.f22117h;
    }

    boolean k(String str) {
        String str2 = this.f22119j;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void l(String str, int i4, float f4) {
        this.f22121l.put(str, new androidx.constraintlayout.core.motion.b(str, i4, f4));
    }

    public void m(String str, int i4, int i5) {
        this.f22121l.put(str, new androidx.constraintlayout.core.motion.b(str, i4, i5));
    }

    public void n(String str, int i4, String str2) {
        this.f22121l.put(str, new androidx.constraintlayout.core.motion.b(str, i4, str2));
    }

    public void o(String str, int i4, boolean z4) {
        this.f22121l.put(str, new androidx.constraintlayout.core.motion.b(str, i4, z4));
    }

    public void p(int i4) {
        this.f22117h = i4;
    }

    public void q(HashMap<String, Integer> hashMap) {
    }

    public b r(int i4) {
        this.f22118i = i4;
        return this;
    }

    boolean s(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    float t(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    int u(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
