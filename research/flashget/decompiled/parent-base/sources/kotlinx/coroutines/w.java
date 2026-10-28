package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/w;", "Lkotlinx/coroutines/l2;", "Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/x;", "childJob", "<init>", "(Lkotlinx/coroutines/x;)V", "", "cause", "Lkotlin/k2;", "Z", "(Ljava/lang/Throwable;)V", "", "b", "(Ljava/lang/Throwable;)Z", "f", "Lkotlinx/coroutines/x;", "Lkotlinx/coroutines/k2;", "getParent", "()Lkotlinx/coroutines/k2;", "parent", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class w extends l2 implements v {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final x childJob;

    public w(@fg.l x xVar) {
        this.childJob = xVar;
    }

    @Override // kotlinx.coroutines.f0
    public void Z(@fg.m Throwable cause) {
        this.childJob.C(e0());
    }

    @Override // kotlinx.coroutines.v
    public boolean b(@fg.l Throwable cause) {
        return e0().O0(cause);
    }

    @Override // kotlinx.coroutines.v
    @fg.l
    public k2 getParent() {
        return e0();
    }

    @Override // ld.l
    public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
        Z(th);
        return kotlin.k2.f75408a;
    }
}
