package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/r1;", "Lkotlinx/coroutines/t2;", "", "cause", "Lkotlin/m2;", "Z0", "Lkotlinx/coroutines/p1;", "s", "Lkotlinx/coroutines/p1;", "handle", "<init>", "(Lkotlinx/coroutines/p1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class r1 extends t2 {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final p1 handle;

    public r1(@d5.d p1 p1Var) {
        this.handle = p1Var;
    }

    @Override // q3.l
    public /* bridge */ /* synthetic */ kotlin.m2 N(Throwable th) {
        Z0(th);
        return kotlin.m2.f23662a;
    }

    @Override // kotlinx.coroutines.h0
    public void Z0(@d5.e Throwable th) {
        this.handle.g();
    }
}
