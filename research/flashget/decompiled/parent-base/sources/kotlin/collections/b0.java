package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Iterators.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a)\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0005\u0010\u0003\u001a7\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"T", "", "h0", "(Ljava/util/Iterator;)Ljava/util/Iterator;", "Lkotlin/collections/r0;", "i0", "Lkotlin/Function1;", "Lkotlin/k2;", "operation", "g0", "(Ljava/util/Iterator;Lld/l;)V", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes7.dex */
class b0 extends a0 {
    public static final <T> void g0(@fg.l Iterator<? extends T> it, @fg.l ld.l<? super T, k2> lVar) {
        kotlin.jvm.internal.l0.p(it, ProtectedSandApp.s("惂\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("惃\u0001"));
        while (it.hasNext()) {
            lVar.invoke(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> Iterator<T> h0(Iterator<? extends T> it) {
        kotlin.jvm.internal.l0.p(it, ProtectedSandApp.s("惂\u0001"));
        return it;
    }

    @fg.l
    public static final <T> Iterator<r0<T>> i0(@fg.l Iterator<? extends T> it) {
        kotlin.jvm.internal.l0.p(it, ProtectedSandApp.s("惂\u0001"));
        return new t0(it);
    }
}
