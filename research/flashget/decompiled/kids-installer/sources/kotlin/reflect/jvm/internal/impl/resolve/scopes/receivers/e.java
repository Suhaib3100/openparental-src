package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: ImplicitClassReceiver.kt */
/* loaded from: classes6.dex */
public class e implements g, j {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f26045a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final e f26046b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f26047c;

    public e(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.e e eVar2) {
        l0.p(eVar, ProtectedSandApp.s("蜒"));
        this.f26045a = eVar;
        this.f26046b = eVar2 == null ? this : eVar2;
        this.f26047c = eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j
    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.e D() {
        return this.f26045a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
    @d5.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 getType() {
        p0 E = this.f26045a.E();
        l0.o(E, ProtectedSandApp.s("蜓"));
        return E;
    }

    public boolean equals(@d5.e Object obj) {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f26045a;
        e eVar2 = obj instanceof e ? (e) obj : null;
        return l0.g(eVar, eVar2 != null ? eVar2.f26045a : null);
    }

    public int hashCode() {
        return this.f26045a.hashCode();
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("蜔") + getType() + '}';
    }
}
