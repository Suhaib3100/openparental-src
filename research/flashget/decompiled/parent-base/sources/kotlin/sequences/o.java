package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.k2;

/* compiled from: SequenceBuilder.kt */
@c1(version = "1.3")
@kotlin.coroutines.j
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/sequences/o;", "T", "", "<init>", "()V", "value", "Lkotlin/k2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "iterator", "d", "(Ljava/util/Iterator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "elements", "c", "(Ljava/lang/Iterable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/sequences/m;", "sequence", "e", "(Lkotlin/sequences/m;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class o<T> {
    @fg.m
    public abstract Object b(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.m
    public final Object c(@fg.l Iterable<? extends T> iterable, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return k2.f75408a;
        }
        Object d5 = d(iterable.iterator(), dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : k2.f75408a;
    }

    @fg.m
    public abstract Object d(@fg.l Iterator<? extends T> it, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.m
    public final Object e(@fg.l m<? extends T> mVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object d5 = d(mVar.iterator(), dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : k2.f75408a;
    }
}
