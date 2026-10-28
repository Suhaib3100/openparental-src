package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/y;", "Lkotlinx/coroutines/o2;", "Lkotlinx/coroutines/x;", "", "cause", "Lkotlin/m2;", "Z0", "", "w", "Lkotlinx/coroutines/z;", "s", "Lkotlinx/coroutines/z;", "childJob", "Lkotlinx/coroutines/n2;", "getParent", "()Lkotlinx/coroutines/n2;", "parent", "<init>", "(Lkotlinx/coroutines/z;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class y extends o2 implements x {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final z childJob;

    public y(@d5.d z zVar) {
        this.childJob = zVar;
    }

    @Override // q3.l
    public /* bridge */ /* synthetic */ kotlin.m2 N(Throwable th) {
        Z0(th);
        return kotlin.m2.f23662a;
    }

    @Override // kotlinx.coroutines.h0
    public void Z0(@d5.e Throwable th) {
        this.childJob.U(a1());
    }

    @Override // kotlinx.coroutines.x
    @d5.d
    public n2 getParent() {
        return a1();
    }

    @Override // kotlinx.coroutines.x
    public boolean w(@d5.d Throwable cause) {
        return a1().C0(cause);
    }
}
