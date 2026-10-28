package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.b0;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.v;
import androidx.annotation.x0;
import androidx.annotation.y;
import androidx.core.content.res.f;
import androidx.core.content.res.i;
import androidx.core.graphics.l2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4645a = "ResourcesCompat";

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f4646b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    @b0("sColorStateCacheLock")
    private static final WeakHashMap<f, SparseArray<e>> f4647c = new WeakHashMap<>(0);

    /* renamed from: d, reason: collision with root package name */
    private static final Object f4648d = new Object();

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.c
    public static final int f4649e = 0;

    /* compiled from: ResourcesCompat.java */
    @x0(15)
    static class a {
        private a() {
        }

        @u
        static Drawable a(Resources resources, int i5, int i6) {
            return resources.getDrawableForDensity(i5, i6);
        }
    }

    /* compiled from: ResourcesCompat.java */
    @x0(21)
    static class b {
        private b() {
        }

        @u
        static Drawable a(Resources resources, int i5, Resources.Theme theme) {
            return resources.getDrawable(i5, theme);
        }

        @u
        static Drawable b(Resources resources, int i5, int i6, Resources.Theme theme) {
            return resources.getDrawableForDensity(i5, i6, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    @x0(23)
    static class c {
        private c() {
        }

        @u
        static int a(Resources resources, int i5, Resources.Theme theme) {
            return resources.getColor(i5, theme);
        }

        @u
        @o0
        static ColorStateList b(@o0 Resources resources, @androidx.annotation.n int i5, @q0 Resources.Theme theme) {
            return resources.getColorStateList(i5, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    @x0(29)
    static class d {
        private d() {
        }

        @u
        static float a(@o0 Resources resources, @androidx.annotation.q int i5) {
            float f6;
            f6 = resources.getFloat(i5);
            return f6;
        }
    }

    /* compiled from: ResourcesCompat.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f4650a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f4651b;

        /* renamed from: c, reason: collision with root package name */
        final int f4652c;

        e(@o0 ColorStateList colorStateList, @o0 Configuration configuration, @q0 Resources.Theme theme) {
            this.f4650a = colorStateList;
            this.f4651b = configuration;
            this.f4652c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* compiled from: ResourcesCompat.java */
    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        final Resources f4653a;

        /* renamed from: b, reason: collision with root package name */
        final Resources.Theme f4654b;

        f(@o0 Resources resources, @q0 Resources.Theme theme) {
            this.f4653a = resources;
            this.f4654b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f4653a.equals(fVar.f4653a) && androidx.core.util.l.a(this.f4654b, fVar.f4654b);
        }

        public int hashCode() {
            return androidx.core.util.l.b(this.f4653a, this.f4654b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static abstract class g {
        @c1({c1.a.LIBRARY})
        @o0
        public static Handler e(@q0 Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public final void c(final int i5, @q0 Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.l
                @Override // java.lang.Runnable
                public final void run() {
                    i.g.this.f(i5);
                }
            });
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public final void d(@o0 final Typeface typeface, @q0 Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.k
                @Override // java.lang.Runnable
                public final void run() {
                    i.g.this.g(typeface);
                }
            });
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i5);

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(@o0 Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    public static final class h {

        /* compiled from: ResourcesCompat.java */
        @x0(23)
        static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final Object f4655a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f4656b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f4657c;

            private a() {
            }

            @SuppressLint({"BanUncheckedReflection"})
            static void a(@o0 Resources.Theme theme) {
                synchronized (f4655a) {
                    if (!f4657c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f4656b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        f4657c = true;
                    }
                    Method method = f4656b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            f4656b = null;
                        }
                    }
                }
            }
        }

        /* compiled from: ResourcesCompat.java */
        @x0(29)
        static class b {
            private b() {
            }

            @u
            static void a(@o0 Resources.Theme theme) {
                theme.rebase();
            }
        }

        private h() {
        }

        public static void a(@o0 Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private i() {
    }

    private static void a(@o0 f fVar, @androidx.annotation.n int i5, @o0 ColorStateList colorStateList, @q0 Resources.Theme theme) {
        synchronized (f4648d) {
            WeakHashMap<f, SparseArray<e>> weakHashMap = f4647c;
            SparseArray<e> sparseArray = weakHashMap.get(fVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(fVar, sparseArray);
            }
            sparseArray.append(i5, new e(colorStateList, fVar.f4653a.getConfiguration(), theme));
        }
    }

    public static void b(@o0 Resources.Theme theme) {
        synchronized (f4648d) {
            Iterator<f> it = f4647c.keySet().iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next != null && theme.equals(next.f4654b)) {
                    it.remove();
                }
            }
        }
    }

    @q0
    private static ColorStateList c(@o0 f fVar, @androidx.annotation.n int i5) {
        e eVar;
        Resources.Theme theme;
        synchronized (f4648d) {
            SparseArray<e> sparseArray = f4647c.get(fVar);
            if (sparseArray != null && sparseArray.size() > 0 && (eVar = sparseArray.get(i5)) != null) {
                if (eVar.f4651b.equals(fVar.f4653a.getConfiguration()) && (((theme = fVar.f4654b) == null && eVar.f4652c == 0) || (theme != null && eVar.f4652c == theme.hashCode()))) {
                    return eVar.f4650a;
                }
                sparseArray.remove(i5);
            }
            return null;
        }
    }

    @q0
    public static Typeface d(@o0 Context context, @y int i5) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i5, new TypedValue(), 0, null, null, false, true);
    }

    @androidx.annotation.l
    public static int e(@o0 Resources resources, @androidx.annotation.n int i5, @q0 Resources.Theme theme) throws Resources.NotFoundException {
        return c.a(resources, i5, theme);
    }

    @q0
    public static ColorStateList f(@o0 Resources resources, @androidx.annotation.n int i5, @q0 Resources.Theme theme) throws Resources.NotFoundException {
        f fVar = new f(resources, theme);
        ColorStateList c6 = c(fVar, i5);
        if (c6 != null) {
            return c6;
        }
        ColorStateList n5 = n(resources, i5, theme);
        if (n5 == null) {
            return c.b(resources, i5, theme);
        }
        a(fVar, i5, n5, theme);
        return n5;
    }

    @q0
    public static Drawable g(@o0 Resources resources, @v int i5, @q0 Resources.Theme theme) throws Resources.NotFoundException {
        return b.a(resources, i5, theme);
    }

    @q0
    public static Drawable h(@o0 Resources resources, @v int i5, int i6, @q0 Resources.Theme theme) throws Resources.NotFoundException {
        return b.b(resources, i5, i6, theme);
    }

    public static float i(@o0 Resources resources, @androidx.annotation.q int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(resources, i5);
        }
        TypedValue m5 = m();
        resources.getValue(i5, m5, true);
        if (m5.type == 4) {
            return m5.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i5) + " type #0x" + Integer.toHexString(m5.type) + " is not valid");
    }

    @q0
    public static Typeface j(@o0 Context context, @y int i5) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i5, new TypedValue(), 0, null, null, false, false);
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static Typeface k(@o0 Context context, @y int i5, @o0 TypedValue typedValue, int i6, @q0 g gVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i5, typedValue, i6, gVar, null, true, false);
    }

    public static void l(@o0 Context context, @y int i5, @o0 g gVar, @q0 Handler handler) throws Resources.NotFoundException {
        gVar.getClass();
        if (context.isRestricted()) {
            gVar.c(-4, handler);
        } else {
            p(context, i5, new TypedValue(), 0, gVar, handler, false, false);
        }
    }

    @o0
    private static TypedValue m() {
        ThreadLocal<TypedValue> threadLocal = f4646b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @q0
    private static ColorStateList n(Resources resources, int i5, @q0 Resources.Theme theme) {
        if (o(resources, i5)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i5), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean o(@o0 Resources resources, @androidx.annotation.n int i5) {
        TypedValue m5 = m();
        resources.getValue(i5, m5, true);
        int i6 = m5.type;
        return i6 >= 28 && i6 <= 31;
    }

    private static Typeface p(@o0 Context context, int i5, @o0 TypedValue typedValue, int i6, @q0 g gVar, @q0 Handler handler, boolean z5, boolean z6) {
        Resources resources = context.getResources();
        resources.getValue(i5, typedValue, true);
        Typeface q5 = q(context, resources, typedValue, i5, i6, gVar, handler, z5, z6);
        if (q5 != null || gVar != null || z6) {
            return q5;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i5) + " could not be retrieved.");
    }

    private static Typeface q(@o0 Context context, Resources resources, @o0 TypedValue typedValue, int i5, int i6, @q0 g gVar, @q0 Handler handler, boolean z5, boolean z6) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i5) + "\" (" + Integer.toHexString(i5) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            if (gVar != null) {
                gVar.c(-3, handler);
            }
            return null;
        }
        Typeface j5 = l2.j(resources, i5, charSequence2, typedValue.assetCookie, i6);
        if (j5 != null) {
            if (gVar != null) {
                gVar.d(j5, handler);
            }
            return j5;
        }
        if (z6) {
            return null;
        }
        try {
            if (charSequence2.toLowerCase().endsWith(".xml")) {
                f.b b6 = androidx.core.content.res.f.b(resources.getXml(i5), resources);
                if (b6 != null) {
                    return l2.e(context, b6, resources, i5, charSequence2, typedValue.assetCookie, i6, gVar, handler, z5);
                }
                if (gVar != null) {
                    gVar.c(-3, handler);
                }
                return null;
            }
            Typeface g5 = l2.g(context, resources, i5, charSequence2, typedValue.assetCookie, i6);
            if (gVar != null) {
                if (g5 != null) {
                    gVar.d(g5, handler);
                } else {
                    gVar.c(-3, handler);
                }
            }
            return g5;
        } catch (IOException | XmlPullParserException unused) {
            if (gVar != null) {
                gVar.c(-3, handler);
            }
            return null;
        }
    }
}
