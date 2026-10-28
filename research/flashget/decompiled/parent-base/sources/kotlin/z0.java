package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: Result.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 \u0014*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001e\u0006B\u0013\b\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0087\b¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a\u0088\u0001\u0005\u0092\u0001\u0004\u0018\u00010\u0004¨\u0006\u001f"}, d2 = {"Lkotlin/z0;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "k", "(Ljava/lang/Object;)Ljava/lang/String;", "", "h", "(Ljava/lang/Object;)I", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Ljava/lang/Object;", "g", "()V", "j", "(Ljava/lang/Object;)Z", "isSuccess", "i", "isFailure", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kd.g
@c1(version = "1.3")
/* loaded from: classes7.dex */
public final class z0<T> implements Serializable {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object value;

    /* compiled from: Result.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0087\b¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\n\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/z0$a;", "", "<init>", "()V", "T", "value", "Lkotlin/z0;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "exception", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.z0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @kd.i(name = "failure")
        @kotlin.internal.f
        private final <T> Object a(Throwable exception) {
            kotlin.jvm.internal.l0.p(exception, ProtectedSandApp.s("蕵\u0001"));
            return z0.b(a1.a(exception));
        }

        @kd.i(name = "success")
        @kotlin.internal.f
        private final <T> Object b(T value) {
            return z0.b(value);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: Result.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/z0$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Throwable;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Serializable {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        @kd.f
        public final Throwable exception;

        public b(@fg.l Throwable th) {
            kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("蕶\u0001"));
            this.exception = th;
        }

        public boolean equals(@fg.m Object other) {
            return (other instanceof b) && kotlin.jvm.internal.l0.g(this.exception, ((b) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("蕷\u0001") + this.exception + ')';
        }
    }

    @w0
    private /* synthetic */ z0(Object obj) {
        this.value = obj;
    }

    public static final /* synthetic */ z0 a(Object obj) {
        return new z0(obj);
    }

    @fg.l
    @w0
    public static <T> Object b(@fg.m Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof z0) && kotlin.jvm.internal.l0.g(obj, ((z0) obj2).value);
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.l0.g(obj, obj2);
    }

    @fg.m
    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).exception;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final T f(Object obj) {
        if (obj instanceof b) {
            return null;
        }
        return obj;
    }

    @w0
    public static /* synthetic */ void g() {
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean i(Object obj) {
        return obj instanceof b;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof b);
    }

    @fg.l
    public static String k(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return ProtectedSandApp.s("蕸\u0001") + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    public int hashCode() {
        return h(this.value);
    }

    /* renamed from: l, reason: from getter */
    public final /* synthetic */ Object getValue() {
        return this.value;
    }

    @fg.l
    public String toString() {
        return k(this.value);
    }
}
