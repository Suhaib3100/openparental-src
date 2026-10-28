package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;

/* compiled from: DeserializedClassDataFinder.kt */
@r1({"SMAP\nDeserializedClassDataFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/DeserializedClassDataFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* loaded from: classes7.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final m0 f78253a;

    public n(@fg.l m0 m0Var) {
        l0.p(m0Var, ProtectedSandApp.s("粃\u0001"));
        this.f78253a = m0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.h
    @fg.m
    public g a(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
        g a5;
        l0.p(bVar, ProtectedSandApp.s("粄\u0001"));
        m0 m0Var = this.f78253a;
        kotlin.reflect.jvm.internal.impl.name.c h4 = bVar.h();
        l0.o(h4, ProtectedSandApp.s("粅\u0001"));
        for (kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var : o0.c(m0Var, h4)) {
            if ((l0Var instanceof o) && (a5 = ((o) l0Var).I0().a(bVar)) != null) {
                return a5;
            }
        }
        return null;
    }
}
