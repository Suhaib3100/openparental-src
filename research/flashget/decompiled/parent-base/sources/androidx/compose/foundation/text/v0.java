package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.runtime.t;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextFieldKeyInput.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001al\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/text/c1;", "state", "Landroidx/compose/foundation/text/selection/s0;", "manager", "Landroidx/compose/ui/text/input/z0;", "value", "Lkotlin/Function1;", "Lkotlin/k2;", "onValueChange", "", "editable", "singleLine", "Landroidx/compose/ui/text/input/p0;", "offsetMapping", "Landroidx/compose/foundation/text/j1;", "undoManager", "Landroidx/compose/ui/text/input/y;", "imeAction", "a", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/text/c1;Landroidx/compose/foundation/text/selection/s0;Landroidx/compose/ui/text/input/z0;Lld/l;ZZLandroidx/compose/ui/text/input/p0;Landroidx/compose/foundation/text/j1;I)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v0 {

    /* compiled from: TextFieldKeyInput.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.z0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f8280b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
        }

        @Override // ld.l
        public k2 invoke(androidx.compose.ui.text.input.z0 z0Var) {
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldKeyInput.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,263:1\n25#2:264\n25#2:271\n1116#3,6:265\n1116#3,6:272\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n*L\n246#1:264\n247#1:271\n246#1:265,6\n247#1:272,6\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f8281b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.s0 f8282c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f8283d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f8284e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f8285f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.p0 f8286g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ j1 f8287h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.input.z0, k2> f8288i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f8289j;

        /* compiled from: TextFieldKeyInput.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class a extends kotlin.jvm.internal.h0 implements ld.l<androidx.compose.ui.input.key.c, Boolean> {
            a(Object obj) {
                super(1, obj, u0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            @fg.l
            public final Boolean Z(@fg.l KeyEvent keyEvent) {
                return Boolean.valueOf(((u0) this.receiver).p(keyEvent));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
                return Z(cVar.h());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(c1 c1Var, androidx.compose.foundation.text.selection.s0 s0Var, androidx.compose.ui.text.input.z0 z0Var, boolean z4, boolean z5, androidx.compose.ui.text.input.p0 p0Var, j1 j1Var, ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar, int i4) {
            super(3);
            this.f8281b = c1Var;
            this.f8282c = s0Var;
            this.f8283d = z0Var;
            this.f8284e = z4;
            this.f8285f = z5;
            this.f8286g = p0Var;
            this.f8287h = j1Var;
            this.f8288i = lVar;
            this.f8289j = i4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(2057323757);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(2057323757, i4, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
            }
            tVar.P(-492369756);
            Object Q = tVar.Q();
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (Q == companion.a()) {
                Q = new androidx.compose.foundation.text.selection.w0();
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.foundation.text.selection.w0 w0Var = (androidx.compose.foundation.text.selection.w0) Q;
            tVar.P(-492369756);
            Object Q2 = tVar.Q();
            if (Q2 == companion.a()) {
                Q2 = new l();
                tVar.E(Q2);
            }
            tVar.p0();
            androidx.compose.ui.q a5 = androidx.compose.ui.input.key.f.a(androidx.compose.ui.q.INSTANCE, new a(new u0(this.f8281b, this.f8282c, this.f8283d, this.f8284e, this.f8285f, w0Var, this.f8286g, this.f8287h, (l) Q2, null, this.f8288i, this.f8289j, 512, null)));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return a5;
        }
    }

    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l c1 c1Var, @fg.l androidx.compose.foundation.text.selection.s0 s0Var, @fg.l androidx.compose.ui.text.input.z0 z0Var, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar, boolean z4, boolean z5, @fg.l androidx.compose.ui.text.input.p0 p0Var, @fg.l j1 j1Var, int i4) {
        return androidx.compose.ui.i.j(qVar, null, new b(c1Var, s0Var, z0Var, z4, z5, p0Var, j1Var, lVar, i4), 1, null);
    }
}
