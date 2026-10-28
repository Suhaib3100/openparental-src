package kotlin.internal.jdk7;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.internal.PlatformImplementations;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import p3.f;

/* compiled from: JDK7PlatformImplementations.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "()V", "addSuppressed", "", "cause", "", "exception", "getSuppressed", "", "sdkIsNullOrAtLeast", "", "version", "", "ReflectSdkVersion", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.internal.jdk7.a, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public class JDK7PlatformImplementations extends PlatformImplementations {

    /* compiled from: JDK7PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion;", "", "()V", "sdkVersion", "", "Ljava/lang/Integer;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    /* renamed from: kotlin.internal.jdk7.a$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d
        public static final a f23344a = new a();

        /* renamed from: b, reason: collision with root package name */
        @e
        @f
        public static final Integer f23345b;

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        static {
            /*
                kotlin.internal.jdk7.a$a r0 = new kotlin.internal.jdk7.a$a
                r0.<init>()
                kotlin.internal.jdk7.JDK7PlatformImplementations.a.f23344a = r0
                r0 = 0
                java.lang.String r1 = "㽆"
                java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)     // Catch: java.lang.Throwable -> L27
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L27
                java.lang.String r2 = "㽇"
                java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L27
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L27
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L27
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L27
                if (r2 == 0) goto L27
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L27
                goto L28
            L27:
                r1 = r0
            L28:
                if (r1 == 0) goto L36
                int r2 = r1.intValue()
                if (r2 <= 0) goto L32
                r2 = 1
                goto L33
            L32:
                r2 = 0
            L33:
                if (r2 == 0) goto L36
                r0 = r1
            L36:
                kotlin.internal.jdk7.JDK7PlatformImplementations.a.f23345b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.jdk7.JDK7PlatformImplementations.a.<clinit>():void");
        }

        private a() {
        }
    }

    private final boolean e(int i5) {
        Integer num = a.f23345b;
        return num == null || num.intValue() >= i5;
    }

    @Override // kotlin.internal.PlatformImplementations
    public void a(@d Throwable th, @d Throwable th2) {
        l0.p(th, ProtectedSandApp.s("㽎"));
        l0.p(th2, ProtectedSandApp.s("㽏"));
        if (e(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }

    @Override // kotlin.internal.PlatformImplementations
    @d
    public List<Throwable> d(@d Throwable th) {
        List<Throwable> t5;
        l0.p(th, ProtectedSandApp.s("㽐"));
        if (!e(19)) {
            return super.d(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        l0.o(suppressed, ProtectedSandApp.s("㽑"));
        t5 = p.t(suppressed);
        return t5;
    }
}
