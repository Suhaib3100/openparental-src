package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/o1;", "Lkotlinx/coroutines/q2;", "Lkotlinx/coroutines/m1;", "handle", "<init>", "(Lkotlinx/coroutines/m1;)V", "", "cause", "Lkotlin/k2;", "Z", "(Ljava/lang/Throwable;)V", "f", "Lkotlinx/coroutines/m1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class o1 extends q2 {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m1 handle;

    public o1(@fg.l m1 m1Var) {
        this.handle = m1Var;
    }

    @Override // kotlinx.coroutines.f0
    public void Z(@fg.m Throwable cause) {
        this.handle.dispose();
    }

    @Override // ld.l
    public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
        Z(th);
        return kotlin.k2.f75408a;
    }
}
