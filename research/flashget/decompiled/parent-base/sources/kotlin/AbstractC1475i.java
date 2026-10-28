package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DeepRecursive.kt */
@o2(markerClass = {r.class})
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\f\u001a\u00028\u0003\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b2\u0006\u0010\u0006\u001a\u00028\u0002H¦@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\u00020\u000e*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0087\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/i;", "T", "R", "", "<init>", "()V", "value", "a", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "U", "S", "Lkotlin/g;", "b", "(Lkotlin/g;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "c", "(Lkotlin/g;Ljava/lang/Object;)Ljava/lang/Void;", "Lkotlin/j;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@c1(version = "1.7")
@kotlin.coroutines.j
/* renamed from: kotlin.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC1475i<T, R> {
    private AbstractC1475i() {
    }

    @fg.m
    public abstract Object a(T t4, @fg.l kotlin.coroutines.d<? super R> dVar);

    @fg.m
    public abstract <U, S> Object b(@fg.l C1473g<U, S> c1473g, U u4, @fg.l kotlin.coroutines.d<? super S> dVar);

    @fg.l
    @k(level = m.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @x0(expression = "this.callRecursive(value)", imports = {}))
    public final Void c(@fg.l C1473g<?, ?> c1473g, @fg.m Object obj) {
        kotlin.jvm.internal.l0.p(c1473g, ProtectedSandApp.s("掂\u0001"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("掃\u0001"));
    }

    public AbstractC1475i(kotlin.jvm.internal.w wVar) {
    }
}
