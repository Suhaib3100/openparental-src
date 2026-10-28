package androidx.paging;

import androidx.annotation.c1;
import androidx.paging.b1;
import androidx.paging.s0;
import kotlin.Metadata;

/* compiled from: PagingSource.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Key", "Landroidx/paging/s0$e;", "key", "Landroidx/paging/b1$a;", "a", "(Landroidx/paging/s0$e;Ljava/lang/Object;)Landroidx/paging/b1$a;", "paging-common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class c1 {
    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public static final <Key> b1.a<Key> a(@fg.l s0.e eVar, @fg.m Key key) {
        kotlin.jvm.internal.l0.p(eVar, "<this>");
        return new b1.a.d(key, eVar.initialLoadSizeHint, eVar.enablePlaceholders);
    }
}
