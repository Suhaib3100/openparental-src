package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.c2;
import q3.l;
import q3.p;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J5\u0010\u0001\u001a\u00020\u0007*\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦\u0002ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\bJG\u0010\f\u001a\u00020\u0007\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00010\n2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH¦\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ[\u0010\u0011\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH¦\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JU\u0010\u0013\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\t*\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00020\u000f2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H'ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/selects/a;", "R", "", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "Lkotlin/m2;", "(Lkotlinx/coroutines/selects/c;Lq3/l;)V", "Q", "Lkotlinx/coroutines/selects/d;", "Lkotlin/Function2;", "s0", "(Lkotlinx/coroutines/selects/d;Lq3/p;)V", "P", "Lkotlinx/coroutines/selects/e;", "param", "A", "(Lkotlinx/coroutines/selects/e;Ljava/lang/Object;Lq3/p;)V", "c", "(Lkotlinx/coroutines/selects/e;Lq3/p;)V", "", "timeMillis", "b", "(JLq3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public interface a<R> {

    /* compiled from: Select.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.selects.a$a, reason: collision with other inner class name */
    public static final class C0453a {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void a(@d5.d a<? super R> aVar, @d5.d e<? super P, ? extends Q> eVar, @d5.d p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar) {
            aVar.A(eVar, null, pVar);
        }
    }

    <P, Q> void A(@d5.d e<? super P, ? extends Q> eVar, P p5, @d5.d p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar);

    void R(@d5.d c cVar, @d5.d l<? super Continuation<? super R>, ? extends Object> lVar);

    @c2
    void b(long timeMillis, @d5.d l<? super Continuation<? super R>, ? extends Object> block);

    <P, Q> void c(@d5.d e<? super P, ? extends Q> eVar, @d5.d p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar);

    <Q> void s0(@d5.d d<? extends Q> dVar, @d5.d p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar);
}
