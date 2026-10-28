package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: ContextClassReceiver.kt */
/* loaded from: classes7.dex */
public final class b extends a implements f {

    /* renamed from: c, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f78025c;

    /* renamed from: d, reason: collision with root package name */
    @m
    private final kotlin.reflect.jvm.internal.impl.name.f f78026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l h0 h0Var, @m kotlin.reflect.jvm.internal.impl.name.f fVar, @m h hVar) {
        super(h0Var, hVar);
        l0.p(eVar, ProtectedSandApp.s("竉\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("竊\u0001"));
        this.f78025c = eVar;
        this.f78026d = fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f
    @m
    public kotlin.reflect.jvm.internal.impl.name.f a() {
        return this.f78026d;
    }

    @l
    public String toString() {
        return getType() + ProtectedSandApp.s("立\u0001") + this.f78025c + ProtectedSandApp.s("竌\u0001");
    }
}
