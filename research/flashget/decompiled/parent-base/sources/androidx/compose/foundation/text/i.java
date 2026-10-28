package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: CoreTextField.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final i f7440a = new i();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, androidx.compose.runtime.t, Integer, k2> f7441b = new androidx.compose.runtime.internal.b(671295101, false, a.f7442b);

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "innerTextField", "a", "(Lld/p;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, ? extends k2>, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f7442b = new a(3);

        a() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ k2 R(ld.p<? super androidx.compose.runtime.t, ? super Integer, ? extends k2> pVar, androidx.compose.runtime.t tVar, Integer num) {
            a(pVar, tVar, num.intValue());
            return k2.f75408a;
        }

        @androidx.compose.runtime.j(scheme = "[0[0]]")
        @androidx.compose.runtime.i
        public final void a(@fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 14) == 0) {
                i4 |= tVar.S(pVar) ? 4 : 2;
            }
            if ((i4 & 91) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(671295101, i4, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:212)");
            }
            if (androidx.compose.animation.r.a(i4 & 14, pVar, tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    @fg.l
    public final ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, androidx.compose.runtime.t, Integer, k2> a() {
        return f7441b;
    }
}
