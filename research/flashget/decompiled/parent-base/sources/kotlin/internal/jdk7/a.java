package kotlin.internal.jdk7;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import java.util.List;
import kd.f;
import kotlin.Metadata;
import kotlin.internal.l;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: JDK7PlatformImplementations.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/internal/jdk7/a;", "Lkotlin/internal/l;", "<init>", "()V", "", "version", "", "e", "(I)Z", "", "cause", "exception", "Lkotlin/k2;", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "d", "(Ljava/lang/Throwable;)Ljava/util/List;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class a extends l {

    /* compiled from: JDK7PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/internal/jdk7/a$a;", "", "<init>", "()V", "", "b", "Ljava/lang/Integer;", "sdkVersion", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    /* renamed from: kotlin.internal.jdk7.a$a, reason: collision with other inner class name */
    private static final class C1057a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final C1057a f75103a = new C1057a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        @f
        public static final Integer sdkVersion;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName(ProtectedSandApp.s("掄\u0001")).getField(ProtectedSandApp.s("掅\u0001")).get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                sdkVersion = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            sdkVersion = num2;
        }

        private C1057a() {
        }
    }

    private final boolean e(int version) {
        Integer num = C1057a.sdkVersion;
        return num == null || num.intValue() >= version;
    }

    @Override // kotlin.internal.l
    public void a(@fg.l Throwable cause, @fg.l Throwable exception) {
        l0.p(cause, ProtectedSandApp.s("掋\u0001"));
        l0.p(exception, ProtectedSandApp.s("掌\u0001"));
        if (e(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }

    @Override // kotlin.internal.l
    @fg.l
    public List<Throwable> d(@fg.l Throwable exception) {
        l0.p(exception, ProtectedSandApp.s("掌\u0001"));
        if (!e(19)) {
            return super.d(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        l0.o(suppressed, ProtectedSandApp.s("掍\u0001"));
        return kotlin.collections.l.t(suppressed);
    }
}
