package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: CompletableDeferred.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/z;", "T", "Lkotlinx/coroutines/r2;", "Lkotlinx/coroutines/y;", "Lkotlinx/coroutines/k2;", "parent", "<init>", "(Lkotlinx/coroutines/k2;)V", "k", "()Ljava/lang/Object;", "z", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "value", "", "I", "(Ljava/lang/Object;)Z", "", "exception", "e", "(Ljava/lang/Throwable;)Z", "e1", "()Z", "onCancelComplete", "Lkotlinx/coroutines/selects/g;", "X", "()Lkotlinx/coroutines/selects/g;", "onAwait", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class z<T> extends r2 implements y<T> {
    public z(@fg.m k2 k2Var) {
        super(true);
        l1(k2Var);
    }

    @Override // kotlinx.coroutines.y
    public boolean I(T value) {
        return u1(value);
    }

    @Override // kotlinx.coroutines.z0
    @fg.l
    public kotlinx.coroutines.selects.g<T> X() {
        kotlinx.coroutines.selects.g<T> gVar = (kotlinx.coroutines.selects.g<T>) c1();
        kotlin.jvm.internal.l0.n(gVar, ProtectedSandApp.s("褤\u0001"));
        return gVar;
    }

    @Override // kotlinx.coroutines.y
    public boolean e(@fg.l Throwable exception) {
        return u1(new d0(exception, false, 2, null));
    }

    @Override // kotlinx.coroutines.r2
    public boolean e1() {
        return true;
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
