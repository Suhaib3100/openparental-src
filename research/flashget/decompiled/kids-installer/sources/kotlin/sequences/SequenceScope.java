package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.m2;

/* compiled from: SequenceBuilder.kt */
@SinceKotlin(version = "1.3")
@RestrictsSuspension
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007\b\u0000¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H¦@¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086@¢\u0006\u0002\u0010\u000bJ\u001c\u0010\b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¦@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\b\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/sequences/SequenceScope;", "T", "", "()V", "yield", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "elements", "", "(Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "iterator", "", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sequence", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.o, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public abstract class SequenceScope<T> {
    @d5.e
    public abstract Object f(T t5, @d5.d Continuation<? super m2> continuation);

    @d5.e
    public final Object g(@d5.d Iterable<? extends T> iterable, @d5.d Continuation<? super m2> continuation) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return m2.f23662a;
        }
        Object h5 = h(iterable.iterator(), continuation);
        return h5 == CoroutineSingletons.COROUTINE_SUSPENDED ? h5 : m2.f23662a;
    }

    @d5.e
    public abstract Object h(@d5.d Iterator<? extends T> it, @d5.d Continuation<? super m2> continuation);

    @d5.e
    public final Object j(@d5.d Sequence<? extends T> sequence, @d5.d Continuation<? super m2> continuation) {
        Object h5 = h(sequence.iterator(), continuation);
        return h5 == CoroutineSingletons.COROUTINE_SUSPENDED ? h5 : m2.f23662a;
    }
}
