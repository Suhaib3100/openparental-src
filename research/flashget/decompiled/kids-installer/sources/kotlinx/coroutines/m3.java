package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B6\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR-\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/m3;", "R", "Lkotlinx/coroutines/t2;", "", "cause", "Lkotlin/m2;", "Z0", "Lkotlinx/coroutines/selects/f;", "s", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "t", "Lq3/l;", "block", "<init>", "(Lkotlinx/coroutines/selects/f;Lq3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class m3<R> extends t2 {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final kotlinx.coroutines.selects.f<R> select;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q3.l<Continuation<? super R>, Object> block;

    /* JADX WARN: Multi-variable type inference failed */
    public m3(@d5.d kotlinx.coroutines.selects.f<? super R> fVar, @d5.d q3.l<? super Continuation<? super R>, ? extends Object> lVar) {
        this.select = fVar;
        this.block = lVar;
    }

    @Override // q3.l
    public /* bridge */ /* synthetic */ kotlin.m2 N(Throwable th) {
        Z0(th);
        return kotlin.m2.f23662a;
    }

    @Override // kotlinx.coroutines.h0
    public void Z0(@d5.e Throwable th) {
        if (this.select.t()) {
            q4.a.d(this.block, this.select.L());
        }
    }
}
