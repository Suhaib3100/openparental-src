package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.m2;

/* compiled from: Iterators.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\bø\u0001\u0000\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\n\u001a\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b0\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"forEach", "", "T", "", "operation", "Lkotlin/Function1;", "iterator", "withIndex", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes6.dex */
class d0 extends c0 {
    public static final <T> void g0(@d5.d Iterator<? extends T> it, @d5.d q3.l<? super T, m2> lVar) {
        kotlin.jvm.internal.l0.p(it, ProtectedSandApp.s("沞"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沟"));
        while (it.hasNext()) {
            lVar.N(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Iterator<T> h0(Iterator<? extends T> it) {
        kotlin.jvm.internal.l0.p(it, ProtectedSandApp.s("沠"));
        return it;
    }

    @d5.d
    public static final <T> Iterator<IndexedValue<T>> i0(@d5.d Iterator<? extends T> it) {
        kotlin.jvm.internal.l0.p(it, ProtectedSandApp.s("没"));
        return new IndexingIterator(it);
    }
}
