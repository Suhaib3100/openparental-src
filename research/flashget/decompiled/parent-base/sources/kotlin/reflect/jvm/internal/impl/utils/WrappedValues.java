package kotlin.reflect.jvm.internal.impl.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.jvm.internal.l0;

/* loaded from: classes7.dex */
public class WrappedValues {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f78662a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f78663b;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th) {
            super(ProtectedSandApp.s("脨\u0001"), th);
        }
    }

    static class a {
        a() {
        }

        public String toString() {
            return ProtectedSandApp.s("脩\u0001");
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f78664a;

        /* synthetic */ b(Throwable th, a aVar) {
            this(th);
        }

        private static /* synthetic */ void a(int i4) {
            String s4 = i4 != 1 ? ProtectedSandApp.s("脪\u0001") : ProtectedSandApp.s("脫\u0001");
            Object[] objArr = new Object[i4 != 1 ? 3 : 2];
            String s5 = ProtectedSandApp.s("脬\u0001");
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("脭\u0001");
            } else {
                objArr[0] = s5;
            }
            if (i4 != 1) {
                objArr[1] = s5;
            } else {
                objArr[1] = ProtectedSandApp.s("脮\u0001");
            }
            if (i4 != 1) {
                objArr[2] = ProtectedSandApp.s("脯\u0001");
            }
            String format = String.format(s4, objArr);
            if (i4 == 1) {
                throw new IllegalStateException(format);
            }
        }

        @l
        public Throwable b() {
            Throwable th = this.f78664a;
            if (th == null) {
                a(1);
            }
            return th;
        }

        public String toString() {
            return this.f78664a.toString();
        }

        private b(@l Throwable th) {
            if (th == null) {
                a(0);
            }
            this.f78664a = th;
        }
    }

    private static /* synthetic */ void a(int i4) {
        String s4 = (i4 == 1 || i4 == 2) ? ProtectedSandApp.s("脱\u0001") : ProtectedSandApp.s("脰\u0001");
        Object[] objArr = new Object[(i4 == 1 || i4 == 2) ? 2 : 3];
        String s5 = ProtectedSandApp.s("脲\u0001");
        if (i4 == 1 || i4 == 2) {
            objArr[0] = s5;
        } else if (i4 != 3) {
            objArr[0] = ProtectedSandApp.s("脳\u0001");
        } else {
            objArr[0] = ProtectedSandApp.s("脴\u0001");
        }
        if (i4 == 1 || i4 == 2) {
            objArr[1] = ProtectedSandApp.s("脵\u0001");
        } else {
            objArr[1] = s5;
        }
        if (i4 != 1 && i4 != 2) {
            if (i4 == 3) {
                objArr[2] = ProtectedSandApp.s("脸\u0001");
            } else if (i4 != 4) {
                objArr[2] = ProtectedSandApp.s("脶\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("脷\u0001");
            }
        }
        String format = String.format(s4, objArr);
        if (i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @l
    public static <V> Object b(@m V v4) {
        if (v4 == null && (v4 = (V) f78662a) == null) {
            a(1);
        }
        return v4;
    }

    @l
    public static Object c(@l Throwable th) {
        if (th == null) {
            a(3);
        }
        return new b(th, null);
    }

    @m
    public static <V> V d(@l Object obj) {
        if (obj == null) {
            a(4);
        }
        return (V) e(f(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public static <V> V e(@l Object obj) {
        if (obj == 0) {
            a(0);
        }
        if (obj == f78662a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public static <V> V f(@m Object obj) {
        if (!(obj instanceof b)) {
            return obj;
        }
        Throwable b5 = ((b) obj).b();
        if (f78663b && d.a(b5)) {
            throw new WrappedProcessCanceledException(b5);
        }
        l0.p(b5, ProtectedSandApp.s("脹\u0001"));
        throw b5;
    }
}
