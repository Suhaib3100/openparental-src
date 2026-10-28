package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Lazy;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.load.java.y;
import kotlin.reflect.jvm.internal.impl.storage.n;

/* compiled from: context.kt */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final b f24767a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final k f24768b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Lazy<y> f24769c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final Lazy f24770d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d f24771e;

    public g(@d5.d b bVar, @d5.d k kVar, @d5.d Lazy<y> lazy) {
        l0.p(bVar, ProtectedSandApp.s("䩮"));
        l0.p(kVar, ProtectedSandApp.s("䩯"));
        l0.p(lazy, ProtectedSandApp.s("䩰"));
        this.f24767a = bVar;
        this.f24768b = kVar;
        this.f24769c = lazy;
        this.f24770d = lazy;
        this.f24771e = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d(this, kVar);
    }

    @d5.d
    public final b a() {
        return this.f24767a;
    }

    @d5.e
    public final y b() {
        return (y) this.f24770d.getValue();
    }

    @d5.d
    public final Lazy<y> c() {
        return this.f24769c;
    }

    @d5.d
    public final h0 d() {
        return this.f24767a.m();
    }

    @d5.d
    public final n e() {
        return this.f24767a.u();
    }

    @d5.d
    public final k f() {
        return this.f24768b;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d g() {
        return this.f24771e;
    }
}
