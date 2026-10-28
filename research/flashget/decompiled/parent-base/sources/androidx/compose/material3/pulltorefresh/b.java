package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.i;
import androidx.compose.runtime.n;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import ld.q;

/* compiled from: PullToRefresh.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final b f13495a = new b();

    /* renamed from: b, reason: collision with root package name */
    @l
    public static q<e, t, Integer, k2> f13496b = new androidx.compose.runtime.internal.b(1116780789, false, a.f13497b);

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/pulltorefresh/e;", "pullRefreshState", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/pulltorefresh/e;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements q<e, t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13497b = new a(3);

        a() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ k2 R(e eVar, t tVar, Integer num) {
            a(eVar, tVar, num.intValue());
            return k2.f75408a;
        }

        @n(applier = "androidx.compose.ui.UiComposable")
        @i
        public final void a(@l e eVar, @m t tVar, int i4) {
            if ((i4 & 6) == 0) {
                i4 |= tVar.q0(eVar) ? 4 : 2;
            }
            if ((i4 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(1116780789, i4, -1, "androidx.compose.material3.pulltorefresh.ComposableSingletons$PullToRefreshKt.lambda-1.<anonymous> (PullToRefresh.kt:110)");
            }
            c.f13498a.a(eVar, null, 0L, tVar, (i4 & 14) | 3072, 6);
            if (x.b0()) {
                x.q0();
            }
        }
    }

    @l
    public final q<e, t, Integer, k2> a() {
        return f13496b;
    }
}
