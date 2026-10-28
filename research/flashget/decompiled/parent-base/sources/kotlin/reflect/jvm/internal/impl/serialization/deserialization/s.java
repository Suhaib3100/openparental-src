package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: FlexibleTypeDeserializer.kt */
/* loaded from: classes7.dex */
public interface s {

    /* compiled from: FlexibleTypeDeserializer.kt */
    public static final class a implements s {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f78265a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.s
        @fg.l
        public kotlin.reflect.jvm.internal.impl.types.h0 a(@fg.l a.q qVar, @fg.l String str, @fg.l p0 p0Var, @fg.l p0 p0Var2) {
            l0.p(qVar, ProtectedSandApp.s("粎\u0001"));
            l0.p(str, ProtectedSandApp.s("粏\u0001"));
            l0.p(p0Var, ProtectedSandApp.s("粐\u0001"));
            l0.p(p0Var2, ProtectedSandApp.s("粑\u0001"));
            throw new IllegalArgumentException(ProtectedSandApp.s("粒\u0001"));
        }
    }

    @fg.l
    kotlin.reflect.jvm.internal.impl.types.h0 a(@fg.l a.q qVar, @fg.l String str, @fg.l p0 p0Var, @fg.l p0 p0Var2);
}
