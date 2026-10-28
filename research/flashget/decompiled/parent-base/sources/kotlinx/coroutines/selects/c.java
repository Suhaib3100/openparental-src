package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.x0;
import kotlinx.coroutines.z1;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J5\u0010\b\u001a\u00020\u0007*\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJG\u0010\r\u001a\u00020\u0007\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ[\u0010\u0012\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JU\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\n*\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00020\u00102\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0001\u0001\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/selects/c;", "R", "", "Lkotlinx/coroutines/selects/e;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "Lkotlin/k2;", "b", "(Lkotlinx/coroutines/selects/e;Lld/l;)V", "Q", "Lkotlinx/coroutines/selects/g;", "Lkotlin/Function2;", "c", "(Lkotlinx/coroutines/selects/g;Lld/p;)V", "P", "Lkotlinx/coroutines/selects/i;", "param", "m", "(Lkotlinx/coroutines/selects/i;Ljava/lang/Object;Lld/p;)V", "j", "(Lkotlinx/coroutines/selects/i;Lld/p;)V", "", "timeMillis", "h", "(JLld/l;)V", "Lkotlinx/coroutines/selects/l;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface c<R> {

    /* compiled from: Select.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void a(@fg.l c<? super R> cVar, @fg.l i<? super P, ? extends Q> iVar, @fg.l ld.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
            cVar.m(iVar, null, pVar);
        }

        @kotlin.internal.h
        @kotlin.k(level = kotlin.m.ERROR, message = "Replaced with the same extension function", replaceWith = @x0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
        @z1
        public static <R> void b(@fg.l c<? super R> cVar, long j4, @fg.l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar) {
            b.a(cVar, j4, lVar);
        }
    }

    void b(@fg.l e eVar, @fg.l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar);

    <Q> void c(@fg.l g<? extends Q> gVar, @fg.l ld.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar);

    @kotlin.internal.h
    @kotlin.k(level = kotlin.m.ERROR, message = "Replaced with the same extension function", replaceWith = @x0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @z1
    void h(long timeMillis, @fg.l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> block);

    <P, Q> void j(@fg.l i<? super P, ? extends Q> iVar, @fg.l ld.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar);

    <P, Q> void m(@fg.l i<? super P, ? extends Q> iVar, P p4, @fg.l ld.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar);
}
