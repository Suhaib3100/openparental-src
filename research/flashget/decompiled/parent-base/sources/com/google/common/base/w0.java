package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: Throwables.java */
@o
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    @d9.c
    private static final String f55068a = ProtectedSandApp.s("\uf3b1");

    /* renamed from: b, reason: collision with root package name */
    @d9.d
    @d9.c
    static final String f55069b = ProtectedSandApp.s("\uf3b2");

    /* renamed from: c, reason: collision with root package name */
    @zc.a
    @d9.c
    private static final Object f55070c;

    /* renamed from: d, reason: collision with root package name */
    @zc.a
    @d9.c
    private static final Method f55071d;

    /* renamed from: e, reason: collision with root package name */
    @zc.a
    @d9.c
    private static final Method f55072e;

    /* compiled from: Throwables.java */
    class a extends AbstractList<StackTraceElement> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f55073b;

        a(Throwable th) {
            this.f55073b = th;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StackTraceElement get(int i4) {
            Method method = w0.f55071d;
            Objects.requireNonNull(method);
            Object obj = w0.f55070c;
            Objects.requireNonNull(obj);
            return (StackTraceElement) w0.m(method, obj, this.f55073b, Integer.valueOf(i4));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Method method = w0.f55072e;
            Objects.requireNonNull(method);
            Object obj = w0.f55070c;
            Objects.requireNonNull(obj);
            return ((Integer) w0.m(method, obj, this.f55073b)).intValue();
        }
    }

    static {
        Object h4 = h();
        f55070c = h4;
        f55071d = h4 == null ? null : g();
        f55072e = h4 != null ? k(h4) : null;
    }

    private w0() {
    }

    public static List<Throwable> e(Throwable th) {
        th.getClass();
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th);
        boolean z4 = false;
        Throwable th2 = th;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th);
            if (th == th2) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uf3b3"), th);
            }
            if (z4) {
                th2 = th2.getCause();
            }
            z4 = !z4;
        }
    }

    @zc.a
    @d9.c
    public static <X extends Throwable> X f(Throwable th, Class<X> cls) {
        try {
            return cls.cast(th.getCause());
        } catch (ClassCastException e4) {
            e4.initCause(th);
            throw e4;
        }
    }

    @zc.a
    @d9.c
    private static Method g() {
        return i(ProtectedSandApp.s("\uf3b4"), Throwable.class, Integer.TYPE);
    }

    @zc.a
    @d9.c
    private static Object h() {
        try {
            return Class.forName(ProtectedSandApp.s("\uf3b2"), false, null).getMethod(ProtectedSandApp.s("\uf3b5"), null).invoke(null, null);
        } catch (ThreadDeath e4) {
            throw e4;
        } catch (Throwable unused) {
            return null;
        }
    }

    @zc.a
    @d9.c
    private static Method i(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName(ProtectedSandApp.s("\uf3b1"), false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e4) {
            throw e4;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable j(Throwable th) {
        boolean z4 = false;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return th;
            }
            if (cause == th2) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uf3b3"), cause);
            }
            if (z4) {
                th2 = th2.getCause();
            }
            z4 = !z4;
            th = cause;
        }
    }

    @zc.a
    @d9.c
    private static Method k(Object obj) {
        try {
            Method i4 = i(ProtectedSandApp.s("\uf3b6"), Throwable.class);
            if (i4 == null) {
                return null;
            }
            i4.invoke(obj, new Throwable());
            return i4;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @d9.c
    public static String l(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @d9.c
    public static Object m(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw q(e5.getCause());
        }
    }

    @d9.c
    private static List<StackTraceElement> n(Throwable th) {
        th.getClass();
        return new a(th);
    }

    @d9.c
    @Deprecated
    public static List<StackTraceElement> o(Throwable th) {
        return p() ? n(th) : Collections.unmodifiableList(Arrays.asList(th.getStackTrace()));
    }

    @d9.c
    @Deprecated
    public static boolean p() {
        return (f55071d == null || f55072e == null) ? false : true;
    }

    @d9.c
    @f9.a
    @Deprecated
    public static RuntimeException q(Throwable th) {
        w(th);
        throw new RuntimeException(th);
    }

    @d9.c
    @Deprecated
    public static <X extends Throwable> void r(@zc.a Throwable th, Class<X> cls) throws Throwable {
        if (th != null) {
            v(th, cls);
        }
    }

    @d9.c
    @Deprecated
    public static void s(@zc.a Throwable th) {
        if (th != null) {
            w(th);
        }
    }

    @d9.c
    public static <X extends Throwable> void t(@zc.a Throwable th, Class<X> cls) throws Throwable {
        r(th, cls);
        s(th);
    }

    @d9.c
    public static <X1 extends Throwable, X2 extends Throwable> void u(@zc.a Throwable th, Class<X1> cls, Class<X2> cls2) throws Throwable, Throwable {
        cls2.getClass();
        r(th, cls);
        t(th, cls2);
    }

    @d9.c
    public static <X extends Throwable> void v(Throwable th, Class<X> cls) throws Throwable {
        th.getClass();
        if (cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    public static void w(Throwable th) {
        th.getClass();
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
