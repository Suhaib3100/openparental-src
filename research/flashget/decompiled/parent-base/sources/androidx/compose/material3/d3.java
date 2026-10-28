package androidx.compose.material3;

import androidx.profileinstaller.o;
import kotlin.Metadata;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final d3 f10419a = new d3();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10420b = new androidx.compose.runtime.internal.b(-927355320, false, a.f10422b);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static ld.q<o9, androidx.compose.runtime.t, Integer, kotlin.k2> f10421c = new androidx.compose.runtime.internal.b(923568898, false, b.f10423b);

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f10422b = new a(2);

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
                androidx.compose.runtime.x.r0(-927355320, i4, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda-1.<anonymous> (BottomSheetScaffold.kt:111)");
            }
            i0.f11385a.a(null, 0.0f, 0.0f, null, 0L, tVar, o.c.f32821k, 31);
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

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/o9;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/o9;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.q<o9, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f10423b = new b(3);

        b() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(o9 o9Var, androidx.compose.runtime.t tVar, Integer num) {
            a(o9Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l o9 o9Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 6) == 0) {
                i4 |= tVar.q0(o9Var) ? 4 : 2;
            }
            if ((i4 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(923568898, i4, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda-2.<anonymous> (BottomSheetScaffold.kt:114)");
            }
            n9.b(o9Var, null, null, tVar, i4 & 14, 6);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    @fg.l
    public final ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> a() {
        return f10420b;
    }

    @fg.l
    public final ld.q<o9, androidx.compose.runtime.t, Integer, kotlin.k2> b() {
        return f10421c;
    }
}
