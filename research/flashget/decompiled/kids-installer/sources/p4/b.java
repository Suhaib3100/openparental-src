package p4;

import android.annotation.SuppressLint;
import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.debug.internal.h;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p3.n;
import sun.misc.Signal;
import sun.misc.SignalHandler;

/* compiled from: AgentPremain.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000f"}, d2 = {"Lp4/b;", "", "", "args", "Ljava/lang/instrument/Instrumentation;", "instrumentation", "Lkotlin/m2;", "d", "b", "", "Z", "enableCreationStackTraces", "<init>", "()V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"all"})
@IgnoreJRERequirement
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final b f32252a = new b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final boolean enableCreationStackTraces;

    /* compiled from: AgentPremain.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000f"}, d2 = {"Lp4/b$a;", "Ljava/lang/instrument/ClassFileTransformer;", "Ljava/lang/ClassLoader;", "loader", "", "className", "Ljava/lang/Class;", "classBeingRedefined", "Ljava/security/ProtectionDomain;", "protectionDomain", "", "classfileBuffer", "a", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements ClassFileTransformer {

        /* renamed from: a, reason: collision with root package name */
        @d
        public static final a f32254a = new a();

        private a() {
        }

        @e
        public byte[] a(@d ClassLoader loader, @d String className, @e Class<?> classBeingRedefined, @d ProtectionDomain protectionDomain, @e byte[] classfileBuffer) {
            if (!l0.g(className, ProtectedSandApp.s("椚"))) {
                return null;
            }
            kotlinx.coroutines.debug.internal.a.f27621a.b(true);
            return kotlin.io.a.p(ProtectedSandApp.CAasmrtiA(ProtectedSandApp.s("椛")));
        }
    }

    static {
        Object a6;
        try {
            Result.a aVar = Result.f27242p;
            String property = System.getProperty(ProtectedSandApp.s("検"));
            a6 = Result.b(property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            a6 = a1.a(th);
        }
        Boolean bool = (Boolean) (Result.i(a6) ? null : a6);
        enableCreationStackTraces = bool != null ? bool.booleanValue() : h.f27675a.u();
    }

    private b() {
    }

    private final void b() {
        try {
            Signal.handle(new Signal(ProtectedSandApp.s("椝")), new SignalHandler() { // from class: p4.a
                public final void a(Signal signal) {
                    b.c(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Signal signal) {
        h hVar = h.f27675a;
        if (hVar.z()) {
            hVar.f(System.out);
        } else {
            System.out.println((Object) ProtectedSandApp.s("椞"));
        }
    }

    @n
    public static final void d(@e String str, @d Instrumentation instrumentation) {
        kotlinx.coroutines.debug.internal.a.f27621a.b(true);
        instrumentation.addTransformer(a.f32254a);
        h hVar = h.f27675a;
        hVar.K(enableCreationStackTraces);
        hVar.x();
        f32252a.b();
    }
}
