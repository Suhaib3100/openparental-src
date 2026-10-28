package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/a1;", "T", "Lkotlinx/coroutines/a;", "Lkotlinx/coroutines/z0;", "Lkotlin/coroutines/g;", "parentContext", "", "active", "<init>", "(Lkotlin/coroutines/g;Z)V", "k", "()Ljava/lang/Object;", "z", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/g;", "X", "()Lkotlinx/coroutines/selects/g;", "onAwait", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
class a1<T> extends a<T> implements z0<T> {
    public a1(@fg.l kotlin.coroutines.g gVar, boolean z4) {
        super(gVar, true, z4);
    }

    static <T> Object b2(a1<T> a1Var, kotlin.coroutines.d<? super T> dVar) {
        Object z02 = a1Var.z0(dVar);
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        return z02;
    }

    @Override // kotlinx.coroutines.z0
    @fg.l
    public kotlinx.coroutines.selects.g<T> X() {
        kotlinx.coroutines.selects.g<T> gVar = (kotlinx.coroutines.selects.g<T>) c1();
        kotlin.jvm.internal.l0.n(gVar, ProtectedSandApp.s("薙\u0001"));
        return gVar;
    }

    @Override // kotlinx.coroutines.z0
    public T k() {
        return (T) W0();
    }

    @Override // kotlinx.coroutines.z0
    @fg.m
    public Object z(@fg.l kotlin.coroutines.d<? super T> dVar) {
        Object z02 = z0(dVar);
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        return z02;
    }
}
