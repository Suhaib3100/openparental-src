package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.b0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.load.java.y;
import kotlin.reflect.jvm.internal.impl.storage.n;

/* compiled from: context.kt */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final b f76642a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final k f76643b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final b0<y> f76644c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private final b0 f76645d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d f76646e;

    public g(@l b bVar, @l k kVar, @l b0<y> b0Var) {
        l0.p(bVar, ProtectedSandApp.s("燾\u0001"));
        l0.p(kVar, ProtectedSandApp.s("燿\u0001"));
        l0.p(b0Var, ProtectedSandApp.s("爀\u0001"));
        this.f76642a = bVar;
        this.f76643b = kVar;
        this.f76644c = b0Var;
        this.f76645d = b0Var;
        this.f76646e = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d(this, kVar);
    }

    @l
    public final b a() {
        return this.f76642a;
    }

    @m
    public final y b() {
        return (y) this.f76645d.getValue();
    }

    @l
    public final b0<y> c() {
        return this.f76644c;
    }

    @l
    public final h0 d() {
        return this.f76642a.m();
    }

    @l
    public final n e() {
        return this.f76642a.u();
    }

    @l
    public final k f() {
        return this.f76643b;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d g() {
        return this.f76646e;
    }
}
