package androidx.work;

import androidx.annotation.c1;
import androidx.annotation.o0;

/* compiled from: Logger.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static s f36609a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final String f36610b = "WM-";

    /* renamed from: c, reason: collision with root package name */
    private static final int f36611c = 23;

    /* renamed from: d, reason: collision with root package name */
    private static final int f36612d = 20;

    /* compiled from: Logger.java */
    public static class a extends s {

        /* renamed from: e, reason: collision with root package name */
        private int f36613e;

        public a(int loggingLevel) {
            this.f36613e = loggingLevel;
        }

        @Override // androidx.work.s
        public void a(String tag, String message, Throwable... throwables) {
            if (this.f36613e > 3 || throwables == null || throwables.length < 1) {
                return;
            }
            Throwable th = throwables[0];
        }

        @Override // androidx.work.s
        public void b(String tag, String message, Throwable... throwables) {
            if (this.f36613e > 6 || throwables == null || throwables.length < 1) {
                return;
            }
            Throwable th = throwables[0];
        }

        @Override // androidx.work.s
        public void d(String tag, String message, Throwable... throwables) {
            if (this.f36613e > 4 || throwables == null || throwables.length < 1) {
                return;
            }
            Throwable th = throwables[0];
        }

        @Override // androidx.work.s
        public void g(String tag, String message, Throwable... throwables) {
            if (this.f36613e > 2 || throwables == null || throwables.length < 1) {
                return;
            }
            Throwable th = throwables[0];
        }

        @Override // androidx.work.s
        public void h(String tag, String message, Throwable... throwables) {
            if (this.f36613e > 5 || throwables == null || throwables.length < 1) {
                return;
            }
            Throwable th = throwables[0];
        }
    }

    public s(int loggingLevel) {
    }

    public static synchronized s c() {
        s sVar;
        synchronized (s.class) {
            try {
                if (f36609a == null) {
                    f36609a = new a(3);
                }
                sVar = f36609a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    public static synchronized void e(s logger) {
        synchronized (s.class) {
            f36609a = logger;
        }
    }

    public static String f(@o0 String tag) {
        int length = tag.length();
        StringBuilder a5 = androidx.fragment.app.a.a(23, "WM-");
        int i4 = f36612d;
        if (length >= i4) {
            a5.append(tag.substring(0, i4));
        } else {
            a5.append(tag);
        }
        return a5.toString();
    }

    public abstract void a(String tag, String message, Throwable... throwables);

    public abstract void b(String tag, String message, Throwable... throwables);

    public abstract void d(String tag, String message, Throwable... throwables);

    public abstract void g(String tag, String message, Throwable... throwables);

    public abstract void h(String tag, String message, Throwable... throwables);
}
