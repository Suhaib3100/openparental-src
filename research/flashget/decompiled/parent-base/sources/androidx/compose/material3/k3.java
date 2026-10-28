package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: SegmentedButton.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final k3 f12080a = new k3();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12081b = new androidx.compose.runtime.internal.b(-860995255, false, a.f12082b);

    /* compiled from: SegmentedButton.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f12082b = new a(2);

        a() {
            super(2);
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-860995255, i4, -1, "androidx.compose.material3.ComposableSingletons$SegmentedButtonKt.lambda-1.<anonymous> (SegmentedButton.kt:572)");
            }
            o8.f12930a.a(tVar, 6);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    @fg.l
    public final ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> a() {
        return f12081b;
    }
}
