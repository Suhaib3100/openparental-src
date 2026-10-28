package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: Dispatchers.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R \u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\t\u0010\nR \u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\b\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\r\u0010\nR \u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\b\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0016\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/j1;", "", "<init>", "()V", "Lkotlin/k2;", "i", "Lkotlinx/coroutines/m0;", "b", "Lkotlinx/coroutines/m0;", "a", "()Lkotlinx/coroutines/m0;", "Default", "c", "g", "h", "Unconfined", "d", "IO", "Lkotlinx/coroutines/v2;", "e", "()Lkotlinx/coroutines/v2;", "f", "Main", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final j1 f80845a = new j1();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final m0 Default = kotlinx.coroutines.scheduling.d.f80983j;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final m0 Unconfined = v3.f81184d;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final m0 IO = kotlinx.coroutines.scheduling.c.f80981e;

    private j1() {
    }

    @fg.l
    public static final m0 a() {
        return Default;
    }

    @kd.n
    public static /* synthetic */ void b() {
    }

    @fg.l
    public static final m0 c() {
        return IO;
    }

    @kd.n
    public static /* synthetic */ void d() {
    }

    @fg.l
    public static final v2 e() {
        return kotlinx.coroutines.internal.d0.dispatcher;
    }

    @kd.n
    public static /* synthetic */ void f() {
    }

    @fg.l
    public static final m0 g() {
        return Unconfined;
    }

    @kd.n
    public static /* synthetic */ void h() {
    }

    @e1
    public final void i() {
        x0.f81189j.shutdown();
        kotlinx.coroutines.scheduling.d.f80983j.B1();
    }
}
