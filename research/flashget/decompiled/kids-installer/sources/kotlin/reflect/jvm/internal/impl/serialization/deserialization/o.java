package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;

/* compiled from: DeserializedClassDataFinder.kt */
/* loaded from: classes5.dex */
public final class o implements h {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final m0 f26246a;

    public o(@d5.d m0 m0Var) {
        l0.p(m0Var, ProtectedSandApp.s("呀"));
        this.f26246a = m0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.h
    @d5.e
    public g a(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        g a6;
        l0.p(bVar, ProtectedSandApp.s("呁"));
        m0 m0Var = this.f26246a;
        kotlin.reflect.jvm.internal.impl.name.c h5 = bVar.h();
        l0.o(h5, ProtectedSandApp.s("呂"));
        for (kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var : o0.c(m0Var, h5)) {
            if ((l0Var instanceof p) && (a6 = ((p) l0Var).M0().a(bVar)) != null) {
                return a6;
            }
        }
        return null;
    }
}
