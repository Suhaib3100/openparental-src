package androidx.compose.ui.window;

import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.k2;

/* compiled from: AndroidDialog.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final d f21705a = new d();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static ld.p<t, Integer, k2> f21706b = new androidx.compose.runtime.internal.b(210148896, false, a.f21707b);

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21707b = new a(2);

        a() {
            super(2);
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(210148896, i4, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt.lambda-1.<anonymous> (AndroidDialog.android.kt:215)");
            }
            if (x.b0()) {
                x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    @fg.l
    public final ld.p<t, Integer, k2> a() {
        return f21706b;
    }
}
