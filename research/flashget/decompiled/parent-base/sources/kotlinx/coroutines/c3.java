package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.z0;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/c3;", "T", "Lkotlinx/coroutines/q2;", "Lkotlinx/coroutines/q;", "continuation", "<init>", "(Lkotlinx/coroutines/q;)V", "", "cause", "Lkotlin/k2;", "Z", "(Ljava/lang/Throwable;)V", "f", "Lkotlinx/coroutines/q;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1454:1\n1#2:1455\n*E\n"})
/* loaded from: classes7.dex */
final class c3<T> extends q2 {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public c3(@fg.l q<? super T> qVar) {
        this.continuation = qVar;
    }

    @Override // kotlinx.coroutines.f0
    public void Z(@fg.m Throwable cause) {
        Object i12 = e0().i1();
        if (i12 instanceof d0) {
            q<T> qVar = this.continuation;
            z0.Companion companion = kotlin.z0.INSTANCE;
            qVar.resumeWith(kotlin.a1.a(((d0) i12).cause));
        } else {
            q<T> qVar2 = this.continuation;
            z0.Companion companion2 = kotlin.z0.INSTANCE;
            qVar2.resumeWith(s2.h(i12));
        }
    }

    @Override // ld.l
    public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
        Z(th);
        return kotlin.k2.f75408a;
    }
}
