package androidx.content;

import androidx.content.d;
import androidx.core.app.e;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: ActivityNavigatorExtras.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/core/app/e;", "activityOptions", "", "flags", "Landroidx/navigation/d$c;", "a", "(Landroidx/core/app/e;I)Landroidx/navigation/d$c;", "navigation-runtime_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {
    @l
    public static final d.c a(@m e eVar, int i4) {
        d.c.a aVar = new d.c.a();
        if (eVar != null) {
            aVar.c(eVar);
        }
        aVar.a(i4);
        return aVar.b();
    }

    public static /* synthetic */ d.c b(e eVar, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            eVar = null;
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return a(eVar, i4);
    }
}
