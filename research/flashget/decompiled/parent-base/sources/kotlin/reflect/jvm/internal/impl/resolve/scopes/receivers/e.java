package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: ImplicitClassReceiver.kt */
/* loaded from: classes7.dex */
public class e implements g, j {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f78030a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final e f78031b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f78032c;

    public e(@l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @m e eVar2) {
        l0.p(eVar, ProtectedSandApp.s("竜\u0001"));
        this.f78030a = eVar;
        this.f78031b = eVar2 == null ? this : eVar2;
        this.f78032c = eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
    @l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 getType() {
        p0 r4 = this.f78030a.r();
        l0.o(r4, ProtectedSandApp.s("竝\u0001"));
        return r4;
    }

    public boolean equals(@m Object obj) {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f78030a;
        e eVar2 = obj instanceof e ? (e) obj : null;
        return l0.g(eVar, eVar2 != null ? eVar2.f78030a : null);
    }

    public int hashCode() {
        return this.f78030a.hashCode();
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("竞\u0001") + getType() + '}';
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j
    @l
    public final kotlin.reflect.jvm.internal.impl.descriptors.e y() {
        return this.f78030a;
    }
}
