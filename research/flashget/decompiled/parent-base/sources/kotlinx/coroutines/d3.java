package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.z0;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/d3;", "Lkotlinx/coroutines/q2;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "continuation", "<init>", "(Lkotlin/coroutines/d;)V", "", "cause", "Z", "(Ljava/lang/Throwable;)V", "f", "Lkotlin/coroutines/d;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class d3 extends q2 {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.d<kotlin.k2> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public d3(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        this.continuation = dVar;
    }

    @Override // kotlinx.coroutines.f0
    public void Z(@fg.m Throwable cause) {
        kotlin.coroutines.d<kotlin.k2> dVar = this.continuation;
        z0.Companion companion = kotlin.z0.INSTANCE;
        dVar.resumeWith(kotlin.k2.f75408a);
    }

    @Override // ld.l
    public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
        Z(th);
        return kotlin.k2.f75408a;
    }
}
