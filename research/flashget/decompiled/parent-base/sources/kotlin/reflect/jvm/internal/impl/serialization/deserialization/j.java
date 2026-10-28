package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: ContractDeserializer.kt */
/* loaded from: classes7.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final a f78219a = a.f78220a;

    /* compiled from: ContractDeserializer.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f78220a = new a();

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private static final j f78221b = new C1188a();

        /* compiled from: ContractDeserializer.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.j$a$a, reason: collision with other inner class name */
        public static final class C1188a implements j {
            C1188a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.j
            @fg.m
            public q0 a(@fg.l a.i iVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @fg.l f0 f0Var) {
                l0.p(iVar, ProtectedSandApp.s("籚\u0001"));
                l0.p(zVar, ProtectedSandApp.s("籛\u0001"));
                l0.p(gVar, ProtectedSandApp.s("籜\u0001"));
                l0.p(f0Var, ProtectedSandApp.s("籝\u0001"));
                return null;
            }
        }

        private a() {
        }

        @fg.l
        public final j a() {
            return f78221b;
        }
    }

    @fg.m
    q0<a.InterfaceC1077a<?>, Object> a(@fg.l a.i iVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @fg.l f0 f0Var);
}
