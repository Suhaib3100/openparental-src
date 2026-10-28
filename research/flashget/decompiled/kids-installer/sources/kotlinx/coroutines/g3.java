package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/g3;", "T", "Lkotlinx/coroutines/t2;", "", "cause", "Lkotlin/m2;", "Z0", "Lkotlinx/coroutines/s;", "s", "Lkotlinx/coroutines/s;", "continuation", "<init>", "(Lkotlinx/coroutines/s;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class g3<T> extends t2 {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final s<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public g3(@d5.d s<? super T> sVar) {
        this.continuation = sVar;
    }

    @Override // q3.l
    public /* bridge */ /* synthetic */ kotlin.m2 N(Throwable th) {
        Z0(th);
        return kotlin.m2.f23662a;
    }

    @Override // kotlinx.coroutines.h0
    public void Z0(@d5.e Throwable th) {
        Object T0 = a1().T0();
        if (T0 instanceof f0) {
            s<T> sVar = this.continuation;
            Result.a aVar = Result.f27242p;
            sVar.s(kotlin.a1.a(((f0) T0).cause));
        } else {
            s<T> sVar2 = this.continuation;
            Result.a aVar2 = Result.f27242p;
            sVar2.s(v2.o(T0));
        }
    }
}
