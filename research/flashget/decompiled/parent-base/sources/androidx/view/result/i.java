package androidx.view.result;

import androidx.core.app.e;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: ActivityResultLauncher.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/activity/result/h;", "Ljava/lang/Void;", "Landroidx/core/app/e;", "options", "Lkotlin/k2;", "a", "(Landroidx/activity/result/h;Landroidx/core/app/e;)V", "c", "activity-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {
    public static final void a(@l h<Void> hVar, @m e eVar) {
        hVar.c(null, eVar);
    }

    public static void b(h hVar, e eVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            eVar = null;
        }
        hVar.c(null, eVar);
    }

    @kd.i(name = "launchUnit")
    public static final void c(@l h<k2> hVar, @m e eVar) {
        hVar.c(k2.f75408a, eVar);
    }

    public static /* synthetic */ void d(h hVar, e eVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            eVar = null;
        }
        c(hVar, eVar);
    }
}
