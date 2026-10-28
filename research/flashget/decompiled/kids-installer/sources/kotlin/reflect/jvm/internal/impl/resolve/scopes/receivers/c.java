package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: ContextReceiver.kt */
/* loaded from: classes6.dex */
public final class c extends a implements f {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.a f26042c;

    /* renamed from: d, reason: collision with root package name */
    @d5.e
    private final kotlin.reflect.jvm.internal.impl.name.f f26043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d h0 h0Var, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.e h hVar) {
        super(h0Var, hVar);
        l0.p(aVar, ProtectedSandApp.s("蜃"));
        l0.p(h0Var, ProtectedSandApp.s("蜄"));
        this.f26042c = aVar;
        this.f26043d = fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f
    @d5.e
    public kotlin.reflect.jvm.internal.impl.name.f a() {
        return this.f26043d;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.a d() {
        return this.f26042c;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("蜅") + this.f26042c + ProtectedSandApp.s("蜆");
    }
}
