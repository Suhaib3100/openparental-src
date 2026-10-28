package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ServiceLoader;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.w;
import kotlin.f0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;

/* compiled from: BuiltInsLoader.kt */
/* loaded from: classes7.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final C1072a f75661a = C1072a.f75662a;

    /* compiled from: BuiltInsLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.a$a, reason: collision with other inner class name */
    public static final class C1072a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C1072a f75662a = new C1072a();

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private static final b0<a> f75663b = c0.b(f0.PUBLICATION, C1073a.f75664b);

        /* compiled from: BuiltInsLoader.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.a$a$a, reason: collision with other inner class name */
        static final class C1073a extends n0 implements ld.a<a> {

            /* renamed from: b, reason: collision with root package name */
            public static final C1073a f75664b = new C1073a(0);

            C1073a() {
                super(0);
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke() {
                ServiceLoader load = ServiceLoader.load(a.class, a.class.getClassLoader());
                l0.m(load);
                a aVar = (a) w.E2(load);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException(ProtectedSandApp.s("杴\u0001"));
            }
        }

        private C1072a() {
        }

        @fg.l
        public final a a() {
            return f75663b.getValue();
        }
    }

    @fg.l
    m0 a(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l h0 h0Var, @fg.l Iterable<? extends rd.b> iterable, @fg.l rd.c cVar, @fg.l rd.a aVar, boolean z4);
}
