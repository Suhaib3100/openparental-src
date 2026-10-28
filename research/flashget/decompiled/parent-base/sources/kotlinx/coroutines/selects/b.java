package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.z1;

/* compiled from: OnTimeout.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aN\u0010\r\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"R", "Lkotlinx/coroutines/selects/c;", "", "timeMillis", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/selects/c;JLld/l;)V", "Lkotlin/time/e;", "timeout", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    @z1
    public static final <R> void a(@fg.l c<? super R> cVar, long j4, @fg.l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar) {
        cVar.b(new a(j4).b(), lVar);
    }

    @z1
    public static final <R> void b(@fg.l c<? super R> cVar, long j4, @fg.l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar) {
        a(cVar, c1.e(j4), lVar);
    }
}
