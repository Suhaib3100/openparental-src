package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.j0;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;

/* compiled from: BuiltInsLoader.kt */
/* loaded from: classes5.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final C0268a f23885a = C0268a.f23886a;

    /* compiled from: BuiltInsLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.a$a, reason: collision with other inner class name */
    public static final class C0268a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0268a f23886a = new C0268a();

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private static final Lazy<a> f23887b;

        /* compiled from: BuiltInsLoader.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0269a extends Lambda implements q3.a<a> {

            /* renamed from: p, reason: collision with root package name */
            public static final C0269a f23888p = new C0269a();

            C0269a() {
                super(0);
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a n() {
                Object E2;
                ServiceLoader load = ServiceLoader.load(a.class, a.class.getClassLoader());
                l0.o(load, ProtectedSandApp.s("耧"));
                E2 = j0.E2(load);
                a aVar = (a) E2;
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException(ProtectedSandApp.s("耨"));
            }
        }

        static {
            Lazy<a> b6;
            b6 = d0.b(LazyThreadSafetyMode.PUBLICATION, C0269a.f23888p);
            f23887b = b6;
        }

        private C0268a() {
        }

        @d5.d
        public final a a() {
            return f23887b.getValue();
        }
    }

    @d5.d
    m0 a(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d h0 h0Var, @d5.d Iterable<? extends w3.b> iterable, @d5.d w3.c cVar, @d5.d w3.a aVar, boolean z5);
}
