package le;

import android.annotation.SuppressLint;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kd.n;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.z0;
import kotlinx.coroutines.debug.internal.g;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sun.misc.Signal;
import sun.misc.SignalHandler;

/* compiled from: AgentPremain.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0010"}, d2 = {"Lle/b;", "", "<init>", "()V", "", "args", "Ljava/lang/instrument/Instrumentation;", "instrumentation", "Lkotlin/k2;", "d", "(Ljava/lang/String;Ljava/lang/instrument/Instrumentation;)V", "b", "", "Z", "enableCreationStackTraces", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"all"})
@IgnoreJRERequirement
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final b f81456a = new b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final boolean enableCreationStackTraces;

    /* compiled from: AgentPremain.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lle/b$a;", "Ljava/lang/instrument/ClassFileTransformer;", "<init>", "()V", "Ljava/lang/ClassLoader;", "loader", "", "className", "Ljava/lang/Class;", "classBeingRedefined", "Ljava/security/ProtectionDomain;", "protectionDomain", "", "classfileBuffer", "a", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements ClassFileTransformer {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final a f81458a = new a();

        private a() {
        }

        @m
        public byte[] a(@m ClassLoader loader, @l String className, @m Class<?> classBeingRedefined, @l ProtectionDomain protectionDomain, @m byte[] classfileBuffer) {
            if (loader == null || !l0.g(className, ProtectedSandApp.s("褥\u0001"))) {
                return null;
            }
            kotlinx.coroutines.debug.internal.a.f79647a.b(true);
            return kotlin.io.a.p(ProtectedSandApp.a(loader, ProtectedSandApp.s("褦\u0001")));
        }
    }

    static {
        Object a5;
        try {
            z0.Companion companion = z0.INSTANCE;
            String property = System.getProperty(ProtectedSandApp.s("褧\u0001"));
            a5 = property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null;
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            a5 = a1.a(th);
        }
        Boolean bool = (Boolean) (z0.i(a5) ? null : a5);
        enableCreationStackTraces = bool != null ? bool.booleanValue() : g.f79700a.u();
    }

    private b() {
    }

    private final void b() {
        try {
            Signal.handle(new Signal(ProtectedSandApp.s("褨\u0001")), new SignalHandler() { // from class: le.a
                public final void a(Signal signal) {
                    b.c(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Signal signal) {
        g gVar = g.f79700a;
        if (gVar.A()) {
            gVar.f(System.out);
        } else {
            System.out.println((Object) ProtectedSandApp.s("褩\u0001"));
        }
    }

    @n
    public static final void d(@m String args, @l Instrumentation instrumentation) {
        kotlinx.coroutines.debug.internal.a.f79647a.b(true);
        instrumentation.addTransformer(a.f81458a);
        g gVar = g.f79700a;
        gVar.L(enableCreationStackTraces);
        gVar.y();
        f81456a.b();
    }
}
