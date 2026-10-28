package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.c1;
import androidx.compose.foundation.text.e1;
import androidx.compose.foundation.text.selection.s0.b;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextFieldSelectionManager.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"", "isStartHandle", "Landroidx/compose/ui/text/style/i;", "direction", "Landroidx/compose/foundation/text/selection/s0;", "manager", "Lkotlin/k2;", "a", "(ZLandroidx/compose/ui/text/style/i;Landroidx/compose/foundation/text/selection/s0;Landroidx/compose/runtime/t;I)V", "c", "(Landroidx/compose/foundation/text/selection/s0;Z)Z", "Landroidx/compose/ui/unit/u;", "magnifierSize", "Li0/f;", "b", "(Landroidx/compose/foundation/text/selection/s0;J)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1049:1\n50#2:1050\n49#2:1051\n1116#3,6:1052\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n*L\n959#1:1050\n959#1:1051\n959#1:1052,6\n*E\n"})
/* loaded from: classes.dex */
public final class t0 {

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/f;", "<anonymous>", "()Li0/f;"}, k = 3, mv = {1, 8, 0})
    static final class a implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s0 f8145b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8146c;

        a(s0 s0Var, boolean z4) {
            this.f8145b = s0Var;
            this.f8146c = z4;
        }

        @Override // androidx.compose.foundation.text.selection.n
        public final long a() {
            return this.f8145b.F(this.f8146c);
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2", f = "TextFieldSelectionManager.kt", i = {}, l = {969}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8147b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8148c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.o0 f8149d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.foundation.text.o0 o0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f8149d = o0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f8149d, dVar);
            bVar.f8148c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8147b;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f8148c;
                androidx.compose.foundation.text.o0 o0Var = this.f8149d;
                this.f8147b = 1;
                if (androidx.compose.foundation.text.g0.c(k0Var, o0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8150b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.style.i f8151c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s0 f8152d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f8153e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z4, androidx.compose.ui.text.style.i iVar, s0 s0Var, int i4) {
            super(2);
            this.f8150b = z4;
            this.f8151c = iVar;
            this.f8152d = s0Var;
            this.f8153e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            t0.a(this.f8150b, this.f8151c, this.f8152d, tVar, g3.b(this.f8153e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8154a;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.o.values().length];
            try {
                iArr[androidx.compose.foundation.text.o.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.o.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.o.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8154a = iArr;
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void a(boolean z4, @fg.l androidx.compose.ui.text.style.i iVar, @fg.l s0 s0Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(-1344558920);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1344558920, i4, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:957)");
        }
        Boolean valueOf = Boolean.valueOf(z4);
        o4.P(511388516);
        boolean q02 = o4.q0(valueOf) | o4.q0(s0Var);
        Object Q = o4.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            s0Var.getClass();
            Q = s0Var.new b(z4);
            o4.E(Q);
        }
        o4.p0();
        androidx.compose.foundation.text.o0 o0Var = (androidx.compose.foundation.text.o0) Q;
        androidx.compose.foundation.text.selection.a.b(new a(s0Var, z4), z4, iVar, androidx.compose.ui.text.t0.m(s0Var.Q().getSelection()), androidx.compose.ui.input.pointer.u0.e(androidx.compose.ui.q.INSTANCE, o0Var, new b(o0Var, null)), o4, (i4 << 3) & 1008);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(z4, iVar, s0Var, i4));
        }
    }

    public static final long b(@fg.l s0 s0Var, long j4) {
        int n4;
        e1 h4;
        androidx.compose.foundation.text.m0 textDelegate;
        androidx.compose.ui.text.e text;
        i0.f A = s0Var.A();
        if (A == null) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        long packedValue = A.getPackedValue();
        androidx.compose.ui.text.e N = s0Var.N();
        if (N == null || N.length() == 0) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        androidx.compose.foundation.text.o C = s0Var.C();
        int i4 = C == null ? -1 : d.f8154a[C.ordinal()];
        if (i4 == -1) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        if (i4 == 1 || i4 == 2) {
            n4 = androidx.compose.ui.text.t0.n(s0Var.Q().getSelection());
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n4 = androidx.compose.ui.text.t0.i(s0Var.Q().getSelection());
        }
        c1 state = s0Var.getState();
        if (state == null || (h4 = state.h()) == null) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        c1 state2 = s0Var.getState();
        if (state2 == null || (textDelegate = state2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        int I = kotlin.ranges.s.I(s0Var.getOffsetMapping().b(n4), 0, text.length());
        float p4 = i0.f.p(h4.m(packedValue));
        androidx.compose.ui.text.n0 value = h4.getValue();
        int q4 = value.q(I);
        float s4 = value.s(q4);
        float t4 = value.t(q4);
        float H = kotlin.ranges.s.H(p4, Math.min(s4, t4), Math.max(s4, t4));
        if (Math.abs(p4 - H) > androidx.compose.ui.unit.u.m(j4) / 2) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        float v4 = value.v(q4);
        return i0.g.a(H, ((value.m(q4) - v4) / 2) + v4);
    }

    public static final boolean c(@fg.l s0 s0Var, boolean z4) {
        androidx.compose.ui.layout.u g4;
        i0.i i4;
        c1 state = s0Var.getState();
        if (state == null || (g4 = state.g()) == null || (i4 = i0.i(g4)) == null) {
            return false;
        }
        return i0.d(i4, s0Var.F(z4));
    }
}
