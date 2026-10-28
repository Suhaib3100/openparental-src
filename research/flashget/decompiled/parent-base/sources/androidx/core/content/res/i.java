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
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.x0;
import androidx.annotation.y;
import androidx.core.content.res.f;
import androidx.core.content.res.i;
import androidx.core.graphics.v0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26134a = "ResourcesCompat";

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f26135b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    @b0("sColorStateCacheLock")
    private static final WeakHashMap<e, SparseArray<d>> f26136c = new WeakHashMap<>(0);

    /* renamed from: d, reason: collision with root package name */
    private static final Object f26137d = new Object();

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.c
    public static final int f26138e = 0;

    /* compiled from: ResourcesCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        static Drawable a(Resources resources, int i4, Resources.Theme theme) {
            return resources.getDrawable(i4, theme);
        }

        static Drawable b(Resources resources, int i4, int i5, Resources.Theme theme) {
            return resources.getDrawableForDensity(i4, i5, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    @x0(23)
    static class b {
        private b() {
        }

        static int a(Resources resources, int i4, Resources.Theme theme) {
            return resources.getColor(i4, theme);
        }

        @o0
        static ColorStateList b(@o0 Resources resources, @androidx.annotation.n int i4, @q0 Resources.Theme theme) {
            return resources.getColorStateList(i4, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    @x0(29)
    static class c {
        private c() {
        }

        static float a(@o0 Resources resources, @q int i4) {
            return resources.getFloat(i4);
        }
    }

    /* compiled from: ResourcesCompat.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f26139a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f26140b;

        /* renamed from: c, reason: collision with root package name */
        final int f26141c;

        d(@o0 ColorStateList colorStateList, @o0 Configuration configuration, @q0 Resources.Theme theme) {
            this.f26139a = colorStateList;
            this.f26140b = configuration;
            this.f26141c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* compiled from: ResourcesCompat.java */
    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Resources f26142a;

        /* renamed from: b, reason: collision with root package name */
        final Resources.Theme f26143b;

        e(@o0 Resources resources, @q0 Resources.Theme theme) {
            this.f26142a = resources;
            this.f26143b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f26142a.equals(eVar.f26142a) && Objects.equals(this.f26143b, eVar.f26143b);
        }

        public int hashCode() {
            return Objects.hash(this.f26142a, this.f26143b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static abstract class f {
        @c1({c1.a.LIBRARY})
        @o0
        public static Handler e(@q0 Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public final void c(final int i4, @q0 Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.k
                @Override // java.lang.Runnable
                public final void run() {
                    i.f.this.f(i4);
                }
            });
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public final void d(@o0 final Typeface typeface, @q0 Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.j
                @Override // java.lang.Runnable
                public final void run() {
                    i.f.this.g(typeface);
                }
            });
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i4);

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(@o0 Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    public static final class g {

        /* compiled from: ResourcesCompat.java */
        @x0(23)
        static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final Object f26144a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f26145b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f26146c;

            private a() {
            }

            @SuppressLint({"BanUncheckedReflection"})
            static void a(@o0 Resources.Theme theme) {
                synchronized (f26144a) {
                    if (!f26146c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f26145b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        f26146c = true;
                    }
                    Method method = f26145b;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            f26145b = null;
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

            static void a(@o0 Resources.Theme theme) {
                theme.rebase();
            }
        }

        private g() {
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

    private static void a(@o0 e eVar, @androidx.annotation.n int i4, @o0 ColorStateList colorStateList, @q0 Resources.Theme theme) {
        synchronized (f26137d) {
            try {
                WeakHashMap<e, SparseArray<d>> weakHashMap = f26136c;
                SparseArray<d> sparseArray = weakHashMap.get(eVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(eVar, sparseArray);
                }
                sparseArray.append(i4, new d(colorStateList, eVar.f26142a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(@o0 Resources.Theme theme) {
        synchronized (f26137d) {
            try {
                Iterator<e> it = f26136c.keySet().iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (next != null && theme.equals(next.f26143b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r2.f26141c == r5.hashCode()) goto L22;
     */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList c(@androidx.annotation.o0 androidx.core.content.res.i.e r5, @androidx.annotation.n int r6) {
        /*
            java.lang.Object r0 = androidx.core.content.res.i.f26137d
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.i$e, android.util.SparseArray<androidx.core.content.res.i$d>> r1 = androidx.core.content.res.i.f26136c     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            androidx.core.content.res.i$d r2 = (androidx.core.content.res.i.d) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f26140b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f26142a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f26143b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f26141c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f26141c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f26139a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.i.c(androidx.core.content.res.i$e, int):android.content.res.ColorStateList");
    }

    @q0
    public static Typeface d(@o0 Context context, @y int i4) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i4, new TypedValue(), 0, null, null, false, true);
    }

    @androidx.annotation.l
    public static int e(@o0 Resources resources, @androidx.annotation.n int i4, @q0 Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getColor(i4, theme);
    }

    @q0
    public static ColorStateList f(@o0 Resources resources, @androidx.annotation.n int i4, @q0 Resources.Theme theme) throws Resources.NotFoundException {
        e eVar = new e(resources, theme);
        ColorStateList c5 = c(eVar, i4);
        if (c5 != null) {
            return c5;
        }
        ColorStateList n4 = n(resources, i4, theme);
        if (n4 == null) {
            return resources.getColorStateList(i4, theme);
        }
        a(eVar, i4, n4, theme);
        return n4;
    }

    @q0
    public static Drawable g(@o0 Resources resources, @v int i4, @q0 Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawable(i4, theme);
    }

    @q0
    public static Drawable h(@o0 Resources resources, @v int i4, int i5, @q0 Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawableForDensity(i4, i5, theme);
    }

    public static float i(@o0 Resources resources, @q int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(resources, i4);
        }
        TypedValue m4 = m();
        resources.getValue(i4, m4, true);
        if (m4.type == 4) {
            return m4.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i4) + " type #0x" + Integer.toHexString(m4.type) + " is not valid");
    }

    @q0
    public static Typeface j(@o0 Context context, @y int i4) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i4, new TypedValue(), 0, null, null, false, false);
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static Typeface k(@o0 Context context, @y int i4, @o0 TypedValue typedValue, int i5, @q0 f fVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i4, typedValue, i5, fVar, null, true, false);
    }

    public static void l(@o0 Context context, @y int i4, @o0 f fVar, @q0 Handler handler) throws Resources.NotFoundException {
        fVar.getClass();
        if (context.isRestricted()) {
            fVar.c(-4, handler);
        } else {
            p(context, i4, new TypedValue(), 0, fVar, handler, false, false);
        }
    }

    @o0
    private static TypedValue m() {
        ThreadLocal<TypedValue> threadLocal = f26135b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @q0
    private static ColorStateList n(Resources resources, int i4, @q0 Resources.Theme theme) {
        if (o(resources, i4)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i4), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean o(@o0 Resources resources, @androidx.annotation.n int i4) {
        TypedValue m4 = m();
        resources.getValue(i4, m4, true);
        int i5 = m4.type;
        return i5 >= 28 && i5 <= 31;
    }

    private static Typeface p(@o0 Context context, int i4, @o0 TypedValue typedValue, int i5, @q0 f fVar, @q0 Handler handler, boolean z4, boolean z5) {
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        Typeface q4 = q(context, resources, typedValue, i4, i5, fVar, handler, z4, z5);
        if (q4 != null || fVar != null || z5) {
            return q4;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i4) + " could not be retrieved.");
    }

    private static Typeface q(@o0 Context context, Resources resources, @o0 TypedValue typedValue, int i4, int i5, @q0 f fVar, @q0 Handler handler, boolean z4, boolean z5) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i4) + "\" (" + Integer.toHexString(i4) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            if (fVar != null) {
                fVar.c(-3, handler);
            }
            return null;
        }
        Typeface l4 = v0.l(resources, i4, charSequence2, typedValue.assetCookie, i5);
        if (l4 != null) {
            if (fVar != null) {
                fVar.d(l4, handler);
            }
            return l4;
        }
        if (z5) {
            return null;
        }
        try {
            if (charSequence2.toLowerCase().endsWith(".xml")) {
                f.b b5 = androidx.core.content.res.f.b(resources.getXml(i4), resources);
                if (b5 != null) {
                    return v0.g(context, b5, resources, i4, charSequence2, typedValue.assetCookie, i5, fVar, handler, z4);
                }
                if (fVar != null) {
                    fVar.c(-3, handler);
                }
                return null;
            }
            Typeface i6 = v0.i(context, resources, i4, charSequence2, typedValue.assetCookie, i5);
            if (fVar != null) {
                if (i6 != null) {
                    fVar.d(i6, handler);
                } else {
                    fVar.c(-3, handler);
                }
            }
            return i6;
        } catch (IOException | XmlPullParserException unused) {
            if (fVar != null) {
                fVar.c(-3, handler);
            }
            return null;
        }
    }
}
