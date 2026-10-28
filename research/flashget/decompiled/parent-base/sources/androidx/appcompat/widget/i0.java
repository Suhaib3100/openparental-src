package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.c1;
import androidx.collection.a3;
import androidx.collection.c3;
import androidx.collection.g1;
import f.a;
import f.b;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourceManagerInternal.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f1875i = false;

    /* renamed from: m, reason: collision with root package name */
    private static i0 f1879m;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, c3<ColorStateList>> f1881a;

    /* renamed from: b, reason: collision with root package name */
    private a3<String, e> f1882b;

    /* renamed from: c, reason: collision with root package name */
    private c3<String> f1883c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, androidx.collection.e1<WeakReference<Drawable.ConstantState>>> f1884d = new WeakHashMap<>(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f1885e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1886f;

    /* renamed from: g, reason: collision with root package name */
    private f f1887g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f1874h = "ResourceManagerInternal";

    /* renamed from: k, reason: collision with root package name */
    private static final String f1877k = "appcompat_skip_skip";

    /* renamed from: l, reason: collision with root package name */
    private static final String f1878l = "android.graphics.drawable.VectorDrawable";

    /* renamed from: j, reason: collision with root package name */
    private static final PorterDuff.Mode f1876j = PorterDuff.Mode.SRC_IN;

    /* renamed from: n, reason: collision with root package name */
    private static final c f1880n = new c(6);

    /* compiled from: ResourceManagerInternal.java */
    static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.i0.e
        public Drawable a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 XmlPullParser xmlPullParser, @androidx.annotation.o0 AttributeSet attributeSet, @androidx.annotation.q0 Resources.Theme theme) {
            try {
                return androidx.appcompat.graphics.drawable.a.C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    private static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.i0.e
        public Drawable a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 XmlPullParser xmlPullParser, @androidx.annotation.o0 AttributeSet attributeSet, @androidx.annotation.q0 Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.f(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    private static class c extends g1<Integer, PorterDuffColorFilter> {
        public c(int i4) {
            super(i4);
        }

        private static int a(int i4, PorterDuff.Mode mode) {
            return mode.hashCode() + ((i4 + 31) * 31);
        }

        PorterDuffColorFilter b(int i4, PorterDuff.Mode mode) {
            return get(Integer.valueOf(a(i4, mode)));
        }

        PorterDuffColorFilter c(int i4, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(a(i4, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.i0.e
        public Drawable a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 XmlPullParser xmlPullParser, @androidx.annotation.o0 AttributeSet attributeSet, @androidx.annotation.q0 Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    a.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    private interface e {
        Drawable a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 XmlPullParser xmlPullParser, @androidx.annotation.o0 AttributeSet attributeSet, @androidx.annotation.q0 Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public interface f {
        @androidx.annotation.q0
        Drawable a(@androidx.annotation.o0 i0 i0Var, @androidx.annotation.o0 Context context, @androidx.annotation.v int i4);

        @androidx.annotation.q0
        ColorStateList b(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4);

        boolean c(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4, @androidx.annotation.o0 Drawable drawable);

        @androidx.annotation.q0
        PorterDuff.Mode d(int i4);

        boolean e(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4, @androidx.annotation.o0 Drawable drawable);
    }

    /* compiled from: ResourceManagerInternal.java */
    private static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.i0.e
        public Drawable a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 XmlPullParser xmlPullParser, @androidx.annotation.o0 AttributeSet attributeSet, @androidx.annotation.q0 Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.i.f(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private void a(@androidx.annotation.o0 String str, @androidx.annotation.o0 e eVar) {
        if (this.f1882b == null) {
            this.f1882b = new a3<>();
        }
        this.f1882b.put(str, eVar);
    }

    private synchronized boolean b(@androidx.annotation.o0 Context context, long j4, @androidx.annotation.o0 Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            androidx.collection.e1<WeakReference<Drawable.ConstantState>> e1Var = this.f1884d.get(context);
            if (e1Var == null) {
                e1Var = new androidx.collection.e1<>();
                this.f1884d.put(context, e1Var);
            }
            e1Var.p(j4, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void c(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4, @androidx.annotation.o0 ColorStateList colorStateList) {
        if (this.f1881a == null) {
            this.f1881a = new WeakHashMap<>();
        }
        c3<ColorStateList> c3Var = this.f1881a.get(context);
        if (c3Var == null) {
            c3Var = new c3<>();
            this.f1881a.put(context, c3Var);
        }
        c3Var.b(i4, colorStateList);
    }

    private void d(@androidx.annotation.o0 Context context) {
        if (this.f1886f) {
            return;
        }
        this.f1886f = true;
        Drawable j4 = j(context, b.a.f73821a);
        if (j4 == null || !q(j4)) {
            this.f1886f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4) {
        if (this.f1885e == null) {
            this.f1885e = new TypedValue();
        }
        TypedValue typedValue = this.f1885e;
        context.getResources().getValue(i4, typedValue, true);
        long e4 = e(typedValue);
        Drawable i5 = i(context, e4);
        if (i5 != null) {
            return i5;
        }
        f fVar = this.f1887g;
        Drawable a5 = fVar == null ? null : fVar.a(this, context, i4);
        if (a5 != null) {
            a5.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e4, a5);
        }
        return a5;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized i0 h() {
        i0 i0Var;
        synchronized (i0.class) {
            try {
                if (f1879m == null) {
                    f1879m = new i0();
                }
                i0Var = f1879m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i0Var;
    }

    private synchronized Drawable i(@androidx.annotation.o0 Context context, long j4) {
        androidx.collection.e1<WeakReference<Drawable.ConstantState>> e1Var = this.f1884d.get(context);
        if (e1Var == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> i4 = e1Var.i(j4);
        if (i4 != null) {
            Drawable.ConstantState constantState = i4.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            e1Var.s(j4);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter b5;
        synchronized (i0.class) {
            c cVar = f1880n;
            b5 = cVar.b(i4, mode);
            if (b5 == null) {
                b5 = new PorterDuffColorFilter(i4, mode);
                cVar.c(i4, mode, b5);
            }
        }
        return b5;
    }

    private ColorStateList n(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4) {
        c3<ColorStateList> c3Var;
        WeakHashMap<Context, c3<ColorStateList>> weakHashMap = this.f1881a;
        if (weakHashMap == null || (c3Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return c3Var.i(i4);
    }

    private static void p(@androidx.annotation.o0 i0 i0Var) {
    }

    private static boolean q(@androidx.annotation.o0 Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4) {
        int next;
        a3<String, e> a3Var = this.f1882b;
        if (a3Var == null || a3Var.isEmpty()) {
            return null;
        }
        c3<String> c3Var = this.f1883c;
        if (c3Var != null) {
            String i5 = c3Var.i(i4);
            if ("appcompat_skip_skip".equals(i5) || (i5 != null && this.f1882b.get(i5) == null)) {
                return null;
            }
        } else {
            this.f1883c = new c3<>();
        }
        if (this.f1885e == null) {
            this.f1885e = new TypedValue();
        }
        TypedValue typedValue = this.f1885e;
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        long e4 = e(typedValue);
        Drawable i6 = i(context, e4);
        if (i6 != null) {
            return i6;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i4);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1883c.b(i4, name);
                e eVar = this.f1882b.get(name);
                if (eVar != null) {
                    i6 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i6 != null) {
                    i6.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e4, i6);
                }
            } catch (Exception unused) {
            }
        }
        if (i6 == null) {
            this.f1883c.b(i4, "appcompat_skip_skip");
        }
        return i6;
    }

    private Drawable v(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4, boolean z4, @androidx.annotation.o0 Drawable drawable) {
        ColorStateList m4 = m(context, i4);
        if (m4 == null) {
            f fVar = this.f1887g;
            if ((fVar == null || !fVar.e(context, i4, drawable)) && !x(context, i4, drawable) && z4) {
                return null;
            }
            return drawable;
        }
        if (a0.a(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setTintList(m4);
        PorterDuff.Mode o4 = o(i4);
        if (o4 == null) {
            return drawable;
        }
        drawable.setTintMode(o4);
        return drawable;
    }

    static void w(Drawable drawable, r0 r0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (!a0.a(drawable) || drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z4 = r0Var.f2037d;
            if (z4 || r0Var.f2036c) {
                drawable.setColorFilter(g(z4 ? r0Var.f2034a : null, r0Var.f2036c ? r0Var.f2035b : f1876j, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public synchronized Drawable j(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4) {
        return k(context, i4, false);
    }

    synchronized Drawable k(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4, boolean z4) {
        Drawable r4;
        try {
            d(context);
            r4 = r(context, i4);
            if (r4 == null) {
                r4 = f(context, i4);
            }
            if (r4 == null) {
                r4 = androidx.core.content.d.getDrawable(context, i4);
            }
            if (r4 != null) {
                r4 = v(context, i4, z4, r4);
            }
            if (r4 != null) {
                a0.b(r4);
            }
        } catch (Throwable th) {
            throw th;
        }
        return r4;
    }

    synchronized ColorStateList m(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4) {
        ColorStateList n4;
        n4 = n(context, i4);
        if (n4 == null) {
            f fVar = this.f1887g;
            n4 = fVar == null ? null : fVar.b(context, i4);
            if (n4 != null) {
                c(context, i4, n4);
            }
        }
        return n4;
    }

    PorterDuff.Mode o(int i4) {
        f fVar = this.f1887g;
        if (fVar == null) {
            return null;
        }
        return fVar.d(i4);
    }

    public synchronized void s(@androidx.annotation.o0 Context context) {
        androidx.collection.e1<WeakReference<Drawable.ConstantState>> e1Var = this.f1884d.get(context);
        if (e1Var != null) {
            e1Var.c();
        }
    }

    synchronized Drawable t(@androidx.annotation.o0 Context context, @androidx.annotation.o0 d1 d1Var, @androidx.annotation.v int i4) {
        try {
            Drawable r4 = r(context, i4);
            if (r4 == null) {
                r4 = d1Var.a(i4);
            }
            if (r4 == null) {
                return null;
            }
            return v(context, i4, false, r4);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void u(f fVar) {
        this.f1887g = fVar;
    }

    boolean x(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4, @androidx.annotation.o0 Drawable drawable) {
        f fVar = this.f1887g;
        return fVar != null && fVar.c(context, i4, drawable);
    }
}
