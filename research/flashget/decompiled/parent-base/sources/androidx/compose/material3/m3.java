package androidx.compose.material3;

import androidx.compose.material3.t9;
import androidx.compose.material3.x7;
import kotlin.Metadata;
import r.a;

/* compiled from: Snackbar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final m3 f12537a = new m3();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12538b = new androidx.compose.runtime.internal.b(-505750804, false, a.f12539b);

    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/ComposableSingletons$SnackbarKt$lambda-1$1\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,437:1\n59#2:438\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/ComposableSingletons$SnackbarKt$lambda-1$1\n*L\n231#1:438\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f12539b = new a(2);

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
                androidx.compose.runtime.x.r0(-505750804, i4, -1, "androidx.compose.material3.ComposableSingletons$SnackbarKt.lambda-1.<anonymous> (Snackbar.kt:228)");
            }
            androidx.compose.ui.graphics.vector.d a5 = x.m.a(a.b.f89546a);
            t9.Companion companion = t9.INSTANCE;
            v5.c(a5, v9.a(x7.a.O, tVar, 0), null, 0L, tVar, 0, 12);
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
        return f12538b;
    }
}
