package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: Dispatchers.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R \u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u0012\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\f\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/m1;", "", "Lkotlin/m2;", "i", "Lkotlinx/coroutines/o0;", "b", "Lkotlinx/coroutines/o0;", "a", "()Lkotlinx/coroutines/o0;", "getDefault$annotations", "()V", "Default", "c", "g", "getUnconfined$annotations", "Unconfined", "d", "getIO$annotations", "IO", "Lkotlinx/coroutines/y2;", "e", "()Lkotlinx/coroutines/y2;", "getMain$annotations", "Main", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final m1 f28809a = new m1();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final o0 Default = kotlinx.coroutines.scheduling.d.f28866w;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final o0 Unconfined = z3.f29088q;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final o0 IO = kotlinx.coroutines.scheduling.c.f28864r;

    private m1() {
    }

    @d5.d
    public static final o0 a() {
        return Default;
    }

    @p3.n
    public static /* synthetic */ void b() {
    }

    @d5.d
    public static final o0 c() {
        return IO;
    }

    @p3.n
    public static /* synthetic */ void d() {
    }

    @d5.d
    public static final y2 e() {
        return kotlinx.coroutines.internal.e0.dispatcher;
    }

    @p3.n
    public static /* synthetic */ void f() {
    }

    @d5.d
    public static final o0 g() {
        return Unconfined;
    }

    @p3.n
    public static /* synthetic */ void h() {
    }

    @g1
    public final void i() {
        a1.f27251v.shutdown();
        kotlinx.coroutines.scheduling.d.f28866w.U0();
    }
}
