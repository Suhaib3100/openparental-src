package androidx.compose.foundation.relocation;

import androidx.compose.foundation.z0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: BringIntoViewRequester.kt */
@z0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/relocation/d;", "", "Li0/i;", "rect", "Lkotlin/k2;", "a", "(Li0/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/relocation/e;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface d {
    static /* synthetic */ Object b(d dVar, i0.i iVar, kotlin.coroutines.d dVar2, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i4 & 1) != 0) {
            iVar = null;
        }
        return dVar.a(iVar, dVar2);
    }

    @m
    Object a(@m i0.i iVar, @l kotlin.coroutines.d<? super k2> dVar);
}
