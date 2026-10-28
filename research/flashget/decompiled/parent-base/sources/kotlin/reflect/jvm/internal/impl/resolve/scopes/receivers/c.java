package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: ContextReceiver.kt */
/* loaded from: classes7.dex */
public final class c extends a implements f {

    /* renamed from: c, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.descriptors.a f78027c;

    /* renamed from: d, reason: collision with root package name */
    @m
    private final kotlin.reflect.jvm.internal.impl.name.f f78028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @l h0 h0Var, @m kotlin.reflect.jvm.internal.impl.name.f fVar, @m h hVar) {
        super(h0Var, hVar);
        l0.p(aVar, ProtectedSandApp.s("竍\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("竎\u0001"));
        this.f78027c = aVar;
        this.f78028d = fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f
    @m
    public kotlin.reflect.jvm.internal.impl.name.f a() {
        return this.f78028d;
    }

    @l
    public kotlin.reflect.jvm.internal.impl.descriptors.a d() {
        return this.f78027c;
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("竏\u0001") + this.f78027c + ProtectedSandApp.s("竐\u0001");
    }
}
