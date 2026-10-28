package androidx.compose.material3;

import java.util.List;
import kotlin.Metadata;

/* compiled from: TabRow.kt */
@f5
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JD\u0010\f\u001a\u00020\u0002*\u00020\u00022/\u0010\u000b\u001a+\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\b\nH&¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/ia;", "", "Landroidx/compose/ui/q;", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/unit/b;", "", "Landroidx/compose/material3/ka;", "Landroidx/compose/ui/layout/n0;", "Lkotlin/u;", "measure", "b", "(Landroidx/compose/ui/q;Lld/r;)Landroidx/compose/ui/q;", "", "selectedTabIndex", "", "matchContentSize", "c", "(Landroidx/compose/ui/q;IZ)Landroidx/compose/ui/q;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ia {
    static /* synthetic */ androidx.compose.ui.q d(ia iaVar, androidx.compose.ui.q qVar, int i4, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tabIndicatorOffset");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return iaVar.c(qVar, i4, z4);
    }

    @fg.l
    androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l ld.r<? super androidx.compose.ui.layout.o0, ? super androidx.compose.ui.layout.l0, ? super androidx.compose.ui.unit.b, ? super List<ka>, ? extends androidx.compose.ui.layout.n0> rVar);

    @fg.l
    androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, int i4, boolean z4);
}
