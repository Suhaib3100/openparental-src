package androidx.compose.material3;

import androidx.constraintlayout.core.motion.utils.w;
import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final l3 f12176a = new l3();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static ld.q<k9, androidx.compose.runtime.t, Integer, kotlin.k2> f12177b = new androidx.compose.runtime.internal.b(818736383, false, a.f12178b);

    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/k9;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/k9;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<k9, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f12178b = new a(3);

        a() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(k9 k9Var, androidx.compose.runtime.t tVar, Integer num) {
            a(k9Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l k9 k9Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            int i5;
            if ((i4 & 6) == 0) {
                i5 = i4 | (tVar.q0(k9Var) ? 4 : 2);
            } else {
                i5 = i4;
            }
            if ((i5 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(818736383, i5, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:223)");
            }
            p9.d(k9Var, null, false, null, 0L, 0L, 0L, 0L, 0L, tVar, i5 & 14, w.g.f22543r);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    @fg.l
    public final ld.q<k9, androidx.compose.runtime.t, Integer, kotlin.k2> a() {
        return f12177b;
    }
}
