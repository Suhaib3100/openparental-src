package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: ContextClassReceiver.kt */
/* loaded from: classes6.dex */
public final class b extends a implements f {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f26040c;

    /* renamed from: d, reason: collision with root package name */
    @d5.e
    private final kotlin.reflect.jvm.internal.impl.name.f f26041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d h0 h0Var, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.e h hVar) {
        super(h0Var, hVar);
        l0.p(eVar, ProtectedSandApp.s("蛿"));
        l0.p(h0Var, ProtectedSandApp.s("蜀"));
        this.f26040c = eVar;
        this.f26041d = fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f
    @d5.e
    public kotlin.reflect.jvm.internal.impl.name.f a() {
        return this.f26041d;
    }

    @d5.d
    public String toString() {
        return getType() + ProtectedSandApp.s("蜁") + this.f26040c + ProtectedSandApp.s("蜂");
    }
}
