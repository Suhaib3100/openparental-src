package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: Key.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: f, reason: collision with root package name */
    public static int f1803f = -1;

    /* renamed from: g, reason: collision with root package name */
    static final String f1804g = "alpha";

    /* renamed from: h, reason: collision with root package name */
    static final String f1805h = "elevation";

    /* renamed from: i, reason: collision with root package name */
    static final String f1806i = "rotation";

    /* renamed from: j, reason: collision with root package name */
    static final String f1807j = "rotationX";

    /* renamed from: k, reason: collision with root package name */
    static final String f1808k = "rotationY";

    /* renamed from: l, reason: collision with root package name */
    static final String f1809l = "transformPivotX";

    /* renamed from: m, reason: collision with root package name */
    static final String f1810m = "transformPivotY";

    /* renamed from: n, reason: collision with root package name */
    static final String f1811n = "transitionPathRotate";

    /* renamed from: o, reason: collision with root package name */
    static final String f1812o = "scaleX";

    /* renamed from: p, reason: collision with root package name */
    static final String f1813p = "scaleY";

    /* renamed from: q, reason: collision with root package name */
    static final String f1814q = "wavePeriod";

    /* renamed from: r, reason: collision with root package name */
    static final String f1815r = "waveOffset";

    /* renamed from: s, reason: collision with root package name */
    static final String f1816s = "waveVariesBy";

    /* renamed from: t, reason: collision with root package name */
    static final String f1817t = "translationX";

    /* renamed from: u, reason: collision with root package name */
    static final String f1818u = "translationY";

    /* renamed from: v, reason: collision with root package name */
    static final String f1819v = "translationZ";

    /* renamed from: w, reason: collision with root package name */
    static final String f1820w = "progress";

    /* renamed from: x, reason: collision with root package name */
    static final String f1821x = "CUSTOM";

    /* renamed from: a, reason: collision with root package name */
    int f1822a;

    /* renamed from: b, reason: collision with root package name */
    int f1823b;

    /* renamed from: c, reason: collision with root package name */
    String f1824c;

    /* renamed from: d, reason: collision with root package name */
    protected int f1825d;

    /* renamed from: e, reason: collision with root package name */
    HashMap<String, androidx.constraintlayout.widget.a> f1826e;

    public f() {
        int i5 = f1803f;
        this.f1822a = i5;
        this.f1823b = i5;
        this.f1824c = null;
    }

    public abstract void a(HashMap<String, x> hashMap);

    abstract void b(HashSet<String> hashSet);

    abstract void c(Context context, AttributeSet attributeSet);

    boolean d(String str) {
        String str2 = this.f1824c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void e(HashMap<String, Integer> hashMap) {
    }

    public abstract void f(String str, Object obj);

    boolean g(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    float h(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    int i(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
