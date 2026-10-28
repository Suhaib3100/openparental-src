package kotlin.reflect.jvm.internal.impl.utils;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* loaded from: classes5.dex */
public class WrappedValues {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f26654a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f26655b = false;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th) {
            super(ProtectedSandApp.s("壯"), th);
        }
    }

    static class a {
        a() {
        }

        public String toString() {
            return ProtectedSandApp.s("声");
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f26656a;

        /* synthetic */ b(Throwable th, a aVar) {
            this(th);
        }

        private static /* synthetic */ void a(int i5) {
            String s5 = i5 != 1 ? ProtectedSandApp.s("壱") : ProtectedSandApp.s("売");
            Object[] objArr = new Object[i5 != 1 ? 3 : 2];
            String s6 = ProtectedSandApp.s("壳");
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("壴");
            } else {
                objArr[0] = s6;
            }
            if (i5 != 1) {
                objArr[1] = s6;
            } else {
                objArr[1] = ProtectedSandApp.s("壵");
            }
            if (i5 != 1) {
                objArr[2] = ProtectedSandApp.s("壶");
            }
            String format = String.format(s5, objArr);
            if (i5 == 1) {
                throw new IllegalStateException(format);
            }
        }

        @d5.d
        public Throwable b() {
            Throwable th = this.f26656a;
            if (th == null) {
                a(1);
            }
            return th;
        }

        public String toString() {
            return this.f26656a.toString();
        }

        private b(@d5.d Throwable th) {
            if (th == null) {
                a(0);
            }
            this.f26656a = th;
        }
    }

    private static /* synthetic */ void a(int i5) {
        String s5 = (i5 == 1 || i5 == 2) ? ProtectedSandApp.s("壸") : ProtectedSandApp.s("壷");
        Object[] objArr = new Object[(i5 == 1 || i5 == 2) ? 2 : 3];
        String s6 = ProtectedSandApp.s("壹");
        if (i5 == 1 || i5 == 2) {
            objArr[0] = s6;
        } else if (i5 != 3) {
            objArr[0] = ProtectedSandApp.s("壺");
        } else {
            objArr[0] = ProtectedSandApp.s("壻");
        }
        if (i5 == 1 || i5 == 2) {
            objArr[1] = ProtectedSandApp.s("壼");
        } else {
            objArr[1] = s6;
        }
        if (i5 != 1 && i5 != 2) {
            if (i5 == 3) {
                objArr[2] = ProtectedSandApp.s("壿");
            } else if (i5 != 4) {
                objArr[2] = ProtectedSandApp.s("壽");
            } else {
                objArr[2] = ProtectedSandApp.s("壾");
            }
        }
        String format = String.format(s5, objArr);
        if (i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @d5.d
    public static <V> Object b(@d5.e V v5) {
        if (v5 == null && (v5 = (V) f26654a) == null) {
            a(1);
        }
        return v5;
    }

    @d5.d
    public static Object c(@d5.d Throwable th) {
        if (th == null) {
            a(3);
        }
        return new b(th, null);
    }

    @d5.e
    public static <V> V d(@d5.d Object obj) {
        if (obj == null) {
            a(4);
        }
        return (V) e(f(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.e
    public static <V> V e(@d5.d Object obj) {
        if (obj == 0) {
            a(0);
        }
        if (obj == f26654a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.e
    public static <V> V f(@d5.e Object obj) {
        if (!(obj instanceof b)) {
            return obj;
        }
        Throwable b6 = ((b) obj).b();
        if (f26655b && c.a(b6)) {
            throw new WrappedProcessCanceledException(b6);
        }
        l0.p(b6, ProtectedSandApp.s("夀"));
        throw b6;
    }
}
