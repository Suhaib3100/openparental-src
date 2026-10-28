package androidx.compose.material3.pulltorefresh;

import androidx.annotation.x;
import androidx.compose.material3.f5;
import androidx.compose.runtime.x4;
import com.google.firebase.remoteconfig.p;
import fg.l;
import kotlin.Metadata;

/* compiled from: PullToRefresh.kt */
@x4
@f5
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u001c\u0010\u0017\u001a\u00020\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/pulltorefresh/e;", "", "Lkotlin/k2;", "h", "()V", "g", "", "i", "()F", "positionalThreshold", "f", "progress", "", "e", "()Z", "isRefreshing", "d", "verticalOffset", "Landroidx/compose/ui/input/nestedscroll/a;", "a", "()Landroidx/compose/ui/input/nestedscroll/a;", "j", "(Landroidx/compose/ui/input/nestedscroll/a;)V", "nestedScrollConnection", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface e {
    @l
    androidx.compose.ui.input.nestedscroll.a a();

    @x(from = p.f60679p)
    float d();

    boolean e();

    @x(from = p.f60679p)
    float f();

    void g();

    void h();

    float i();

    void j(@l androidx.compose.ui.input.nestedscroll.a aVar);
}
