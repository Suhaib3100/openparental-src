package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: FlexibleTypeDeserializer.kt */
/* loaded from: classes5.dex */
public interface s {

    /* compiled from: FlexibleTypeDeserializer.kt */
    public static final class a implements s {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final a f26256a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.s
        @d5.d
        public h0 a(@d5.d a.q qVar, @d5.d String str, @d5.d p0 p0Var, @d5.d p0 p0Var2) {
            l0.p(qVar, ProtectedSandApp.s("呉"));
            l0.p(str, ProtectedSandApp.s("告"));
            l0.p(p0Var, ProtectedSandApp.s("呋"));
            l0.p(p0Var2, ProtectedSandApp.s("呌"));
            throw new IllegalArgumentException(ProtectedSandApp.s("呍"));
        }
    }

    @d5.d
    h0 a(@d5.d a.q qVar, @d5.d String str, @d5.d p0 p0Var, @d5.d p0 p0Var2);
}
