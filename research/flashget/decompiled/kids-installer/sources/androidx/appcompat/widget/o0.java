package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.c1;
import e.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourceManagerInternal.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f1278i = false;

    /* renamed from: m, reason: collision with root package name */
    private static o0 f1282m;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, androidx.collection.j<ColorStateList>> f1284a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.collection.i<String, e> f1285b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.collection.j<String> f1286c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, androidx.collection.f<WeakReference<Drawable.ConstantState>>> f1287d = new WeakHashMap<>(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f1288e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1289f;

    /* renamed from: g, reason: collision with root package name */
    private f f1290g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f1277h = "ResourceManagerInternal";

    /* renamed from: k, reason: collision with root package name */
    private static final String f1280k = "appcompat_skip_skip";

    /* renamed from: l, reason: collision with root package name */
    private static final String f1281l = "android.graphics.drawable.VectorDrawable";

    /* renamed from: j, reason: collision with root package name */
    private static final PorterDuff.Mode f1279j = PorterDuff.Mode.SRC_IN;

    /* renamed from: n, reason: collision with root package name */
    private static final c f1283n = new c(6);

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes2.dex */
    static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.o0.e
        public Drawable a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 XmlPullParser xmlPullParser, @androidx.annotation.o0 AttributeSet attributeSet, @androidx.annotation.q0 Resources.Theme theme) {
            try {
                return androidx.appcompat.graphics.drawable.a.C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes2.dex */
    private static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.o0.e
        public Drawable a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 XmlPullParser xmlPullParser, @androidx.annotation.o0 AttributeSet attributeSet, @androidx.annotation.q0 Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.e(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes2.dex */
    private static class c extends androidx.collection.g<Integer, PorterDuffColorFilter> {
        public c(int i5) {
            super(i5);
        }

        private static int a(int i5, PorterDuff.Mode mode) {
            return mode.hashCode() + ((i5 + 31) * 31);
        }

        PorterDuffColorFilter b(int i5, PorterDuff.Mode mode) {
            return get(Integer.valueOf(a(i5, mode)));
        }

        PorterDuffColorFilter c(int i5, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(a(i5, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes2.dex */
    static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.o0.e
        public Drawable a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 XmlPullParser xmlPullParser, @androidx.annotation.o0 AttributeSet attributeSet, @androidx.annotation.q0 Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
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
        boolean a(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5, @androidx.annotation.o0 Drawable drawable);

        @androidx.annotation.q0
        PorterDuff.Mode b(int i5);

        @androidx.annotation.q0
        Drawable c(@androidx.annotation.o0 o0 o0Var, @androidx.annotation.o0 Context context, @androidx.annotation.v int i5);

        @androidx.annotation.q0
        ColorStateList d(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5);

        boolean e(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5, @androidx.annotation.o0 Drawable drawable);
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes2.dex */
    private static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.o0.e
        public Drawable a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 XmlPullParser xmlPullParser, @androidx.annotation.o0 AttributeSet attributeSet, @androidx.annotation.q0 Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.i.e(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private void a(@androidx.annotation.o0 String str, @androidx.annotation.o0 e eVar) {
        if (this.f1285b == null) {
            this.f1285b = new androidx.collection.i<>();
        }
        this.f1285b.put(str, eVar);
    }

    private synchronized boolean b(@androidx.annotation.o0 Context context, long j5, @androidx.annotation.o0 Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        androidx.collection.f<WeakReference<Drawable.ConstantState>> fVar = this.f1287d.get(context);
        if (fVar == null) {
            fVar = new androidx.collection.f<>();
            this.f1287d.put(context, fVar);
        }
        fVar.p(j5, new WeakReference<>(constantState));
        return true;
    }

    private void c(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5, @androidx.annotation.o0 ColorStateList colorStateList) {
        if (this.f1284a == null) {
            this.f1284a = new WeakHashMap<>();
        }
        androidx.collection.j<ColorStateList> jVar = this.f1284a.get(context);
        if (jVar == null) {
            jVar = new androidx.collection.j<>();
            this.f1284a.put(context, jVar);
        }
        jVar.a(i5, colorStateList);
    }

    private void d(@androidx.annotation.o0 Context context) {
        if (this.f1289f) {
            return;
        }
        this.f1289f = true;
        Drawable j5 = j(context, a.d.f22427a);
        if (j5 == null || !q(j5)) {
            this.f1289f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5) {
        if (this.f1288e == null) {
            this.f1288e = new TypedValue();
        }
        TypedValue typedValue = this.f1288e;
        context.getResources().getValue(i5, typedValue, true);
        long e6 = e(typedValue);
        Drawable i6 = i(context, e6);
        if (i6 != null) {
            return i6;
        }
        f fVar = this.f1290g;
        Drawable c6 = fVar == null ? null : fVar.c(this, context, i5);
        if (c6 != null) {
            c6.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e6, c6);
        }
        return c6;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized o0 h() {
        o0 o0Var;
        synchronized (o0.class) {
            if (f1282m == null) {
                f1282m = new o0();
            }
            o0Var = f1282m;
        }
        return o0Var;
    }

    private synchronized Drawable i(@androidx.annotation.o0 Context context, long j5) {
        androidx.collection.f<WeakReference<Drawable.ConstantState>> fVar = this.f1287d.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> j6 = fVar.j(j5);
        if (j6 != null) {
            Drawable.ConstantState constantState = j6.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.u(j5);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i5, PorterDuff.Mode mode) {
        PorterDuffColorFilter b6;
        synchronized (o0.class) {
            c cVar = f1283n;
            b6 = cVar.b(i5, mode);
            if (b6 == null) {
                b6 = new PorterDuffColorFilter(i5, mode);
                cVar.c(i5, mode, b6);
            }
        }
        return b6;
    }

    private ColorStateList n(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5) {
        androidx.collection.j<ColorStateList> jVar;
        WeakHashMap<Context, androidx.collection.j<ColorStateList>> weakHashMap = this.f1284a;
        if (weakHashMap == null || (jVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return jVar.j(i5);
    }

    private static void p(@androidx.annotation.o0 o0 o0Var) {
    }

    private static boolean q(@androidx.annotation.o0 Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5) {
        int next;
        androidx.collection.i<String, e> iVar = this.f1285b;
        if (iVar == null || iVar.isEmpty()) {
            return null;
        }
        androidx.collection.j<String> jVar = this.f1286c;
        if (jVar != null) {
            String j5 = jVar.j(i5);
            if ("appcompat_skip_skip".equals(j5) || (j5 != null && this.f1285b.get(j5) == null)) {
                return null;
            }
        } else {
            this.f1286c = new androidx.collection.j<>();
        }
        if (this.f1288e == null) {
            this.f1288e = new TypedValue();
        }
        TypedValue typedValue = this.f1288e;
        Resources resources = context.getResources();
        resources.getValue(i5, typedValue, true);
        long e6 = e(typedValue);
        Drawable i6 = i(context, e6);
        if (i6 != null) {
            return i6;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i5);
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
                this.f1286c.a(i5, name);
                e eVar = this.f1285b.get(name);
                if (eVar != null) {
                    i6 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i6 != null) {
                    i6.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e6, i6);
                }
            } catch (Exception unused) {
            }
        }
        if (i6 == null) {
            this.f1286c.a(i5, "appcompat_skip_skip");
        }
        return i6;
    }

    private Drawable v(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5, boolean z5, @androidx.annotation.o0 Drawable drawable) {
        ColorStateList m5 = m(context, i5);
        if (m5 == null) {
            f fVar = this.f1290g;
            if ((fVar == null || !fVar.e(context, i5, drawable)) && !x(context, i5, drawable) && z5) {
                return null;
            }
            return drawable;
        }
        if (e0.a(drawable)) {
            drawable = drawable.mutate();
        }
        androidx.core.graphics.drawable.d.o(drawable, m5);
        PorterDuff.Mode o5 = o(i5);
        if (o5 == null) {
            return drawable;
        }
        androidx.core.graphics.drawable.d.p(drawable, o5);
        return drawable;
    }

    static void w(Drawable drawable, x0 x0Var, int[] iArr) {
        if (!e0.a(drawable) || drawable.mutate() == drawable) {
            boolean z5 = x0Var.f1408d;
            if (z5 || x0Var.f1407c) {
                drawable.setColorFilter(g(z5 ? x0Var.f1405a : null, x0Var.f1407c ? x0Var.f1406b : f1279j, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public synchronized Drawable j(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5) {
        return k(context, i5, false);
    }

    synchronized Drawable k(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5, boolean z5) {
        Drawable r5;
        d(context);
        r5 = r(context, i5);
        if (r5 == null) {
            r5 = f(context, i5);
        }
        if (r5 == null) {
            r5 = androidx.core.content.d.i(context, i5);
        }
        if (r5 != null) {
            r5 = v(context, i5, z5, r5);
        }
        if (r5 != null) {
            e0.b(r5);
        }
        return r5;
    }

    synchronized ColorStateList m(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5) {
        ColorStateList n5;
        n5 = n(context, i5);
        if (n5 == null) {
            f fVar = this.f1290g;
            n5 = fVar == null ? null : fVar.d(context, i5);
            if (n5 != null) {
                c(context, i5, n5);
            }
        }
        return n5;
    }

    PorterDuff.Mode o(int i5) {
        f fVar = this.f1290g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i5);
    }

    public synchronized void s(@androidx.annotation.o0 Context context) {
        androidx.collection.f<WeakReference<Drawable.ConstantState>> fVar = this.f1287d.get(context);
        if (fVar != null) {
            fVar.b();
        }
    }

    synchronized Drawable t(@androidx.annotation.o0 Context context, @androidx.annotation.o0 f1 f1Var, @androidx.annotation.v int i5) {
        Drawable r5 = r(context, i5);
        if (r5 == null) {
            r5 = f1Var.d(i5);
        }
        if (r5 == null) {
            return null;
        }
        return v(context, i5, false, r5);
    }

    public synchronized void u(f fVar) {
        this.f1290g = fVar;
    }

    boolean x(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5, @androidx.annotation.o0 Drawable drawable) {
        f fVar = this.f1290g;
        return fVar != null && fVar.a(context, i5, drawable);
    }
}
