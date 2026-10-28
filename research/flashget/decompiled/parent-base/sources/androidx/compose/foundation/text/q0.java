package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.c6;
import androidx.compose.ui.graphics.d5;
import androidx.compose.ui.graphics.v1;
import androidx.compose.ui.graphics.y4;
import androidx.compose.ui.text.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.k2;

/* compiled from: TextFieldDelegate.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/q0;", "", "<init>", "()V", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name */
    public static final int f7861b = 0;

    /* compiled from: TextFieldDelegate.kt */
    @Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\"\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\"\u0010#J/\u0010&\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020%H\u0001¢\u0006\u0004\b&\u0010'JC\u00100\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010,\u001a\u00020+2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00190-2\b\u0010/\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\b0\u00101JF\u00104\u001a\u00020\u00192\u0006\u00103\u001a\u0002022\u0006\u0010\u0016\u001a\u00020%2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00190-H\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105JW\u0010<\u001a\u00020\u001e2\u0006\u00107\u001a\u0002062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+2\u0006\u00109\u001a\u0002082\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00190-2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00190-H\u0001¢\u0006\u0004\b<\u0010=JW\u0010>\u001a\u00020\u001e2\u0006\u00107\u001a\u0002062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+2\u0006\u00109\u001a\u0002082\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00190-2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00190-H\u0001¢\u0006\u0004\b>\u0010=J3\u0010?\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00190-H\u0001¢\u0006\u0004\b?\u0010@J \u0010E\u001a\u00020C2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020Cø\u0001\u0000¢\u0006\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Landroidx/compose/foundation/text/q0$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text/m0;", "textDelegate", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/text/n0;", "prevResultText", "Lkotlin/l1;", "", "c", "(Landroidx/compose/foundation/text/m0;JLandroidx/compose/ui/unit/w;Landroidx/compose/ui/text/n0;)Lkotlin/l1;", "Landroidx/compose/ui/graphics/v1;", "canvas", "Landroidx/compose/ui/text/input/z0;", "value", "Landroidx/compose/ui/text/input/p0;", "offsetMapping", "textLayoutResult", "Landroidx/compose/ui/graphics/d5;", "selectionPaint", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/graphics/v1;Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/p0;Landroidx/compose/ui/text/n0;Landroidx/compose/ui/graphics/d5;)V", "Landroidx/compose/ui/layout/u;", "layoutCoordinates", "Landroidx/compose/ui/text/input/h1;", "textInputSession", "", "hasFocus", "e", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/foundation/text/m0;Landroidx/compose/ui/text/n0;Landroidx/compose/ui/layout/u;Landroidx/compose/ui/text/input/h1;ZLandroidx/compose/ui/text/input/p0;)V", "textFieldValue", "Landroidx/compose/foundation/text/e1;", "k", "(Landroidx/compose/ui/text/input/h1;Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/p0;Landroidx/compose/foundation/text/e1;)V", "", "Landroidx/compose/ui/text/input/p;", "ops", "Landroidx/compose/ui/text/input/r;", "editProcessor", "Lkotlin/Function1;", "onValueChange", "session", "g", "(Ljava/util/List;Landroidx/compose/ui/text/input/r;Lld/l;Landroidx/compose/ui/text/input/h1;)V", "Li0/f;", "position", "j", "(JLandroidx/compose/foundation/text/e1;Landroidx/compose/ui/text/input/r;Landroidx/compose/ui/text/input/p0;Lld/l;)V", "Landroidx/compose/ui/text/input/b1;", "textInputService", "Landroidx/compose/ui/text/input/z;", "imeOptions", "Landroidx/compose/ui/text/input/y;", "onImeActionPerformed", "i", "(Landroidx/compose/ui/text/input/b1;Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/r;Landroidx/compose/ui/text/input/z;Lld/l;Lld/l;)Landroidx/compose/ui/text/input/h1;", "h", "f", "(Landroidx/compose/ui/text/input/h1;Landroidx/compose/ui/text/input/r;Lld/l;)V", "Landroidx/compose/ui/text/t0;", "compositionRange", "Landroidx/compose/ui/text/input/i1;", "transformed", "a", "(JLandroidx/compose/ui/text/input/i1;)Landroidx/compose/ui/text/input/i1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.q0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: TextFieldDelegate.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/input/p;", "it", "Lkotlin/k2;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.q0$a$a, reason: collision with other inner class name */
        static final class C0148a extends kotlin.jvm.internal.n0 implements ld.l<List<? extends androidx.compose.ui.text.input.p>, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.r f7862b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.l<androidx.compose.ui.text.input.z0, k2> f7863c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ k1.h<androidx.compose.ui.text.input.h1> f7864d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0148a(androidx.compose.ui.text.input.r rVar, ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar, k1.h<androidx.compose.ui.text.input.h1> hVar) {
                super(1);
                this.f7862b = rVar;
                this.f7863c = lVar;
                this.f7864d = hVar;
            }

            public final void a(@fg.l List<? extends androidx.compose.ui.text.input.p> list) {
                q0.INSTANCE.g(list, this.f7862b, this.f7863c, this.f7864d.f75329b);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(List<? extends androidx.compose.ui.text.input.p> list) {
                a(list);
                return k2.f75408a;
            }
        }

        /* compiled from: TextFieldDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/y4;", "matrix", "Lkotlin/k2;", "a", "([F)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.q0$a$b */
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<y4, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.u f7865b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.layout.u uVar) {
                super(1);
                this.f7865b = uVar;
            }

            public final void a(@fg.l float[] fArr) {
                androidx.compose.ui.layout.v.d(this.f7865b).T(this.f7865b, fArr);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(y4 y4Var) {
                a(y4Var.y());
                return k2.f75408a;
            }
        }

        private Companion() {
        }

        public static /* synthetic */ kotlin.l1 d(Companion companion, m0 m0Var, long j4, androidx.compose.ui.unit.w wVar, androidx.compose.ui.text.n0 n0Var, int i4, Object obj) {
            if ((i4 & 8) != 0) {
                n0Var = null;
            }
            return companion.c(m0Var, j4, wVar, n0Var);
        }

        @fg.l
        public final androidx.compose.ui.text.input.i1 a(long compositionRange, @fg.l androidx.compose.ui.text.input.i1 transformed) {
            int b5 = transformed.getOffsetMapping().b(androidx.compose.ui.text.t0.n(compositionRange));
            int b6 = transformed.getOffsetMapping().b((int) (compositionRange & 4294967295L));
            int min = Math.min(b5, b6);
            int max = Math.max(b5, b6);
            e.a aVar = new e.a(transformed.getText());
            androidx.compose.ui.text.style.k.INSTANCE.getClass();
            aVar.c(new androidx.compose.ui.text.i0(0L, 0L, (androidx.compose.ui.text.font.o0) null, (androidx.compose.ui.text.font.k0) null, (androidx.compose.ui.text.font.l0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.o) null, (u0.f) null, 0L, androidx.compose.ui.text.style.k.f21365e, (c6) null, (androidx.compose.ui.text.d0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (kotlin.jvm.internal.w) null), min, max);
            return new androidx.compose.ui.text.input.i1(aVar.u(), transformed.getOffsetMapping());
        }

        @kd.n
        public final void b(@fg.l v1 canvas, @fg.l androidx.compose.ui.text.input.z0 value, @fg.l androidx.compose.ui.text.input.p0 offsetMapping, @fg.l androidx.compose.ui.text.n0 textLayoutResult, @fg.l d5 selectionPaint) {
            int b5;
            int b6;
            if (!androidx.compose.ui.text.t0.h(value.getSelection()) && (b5 = offsetMapping.b(androidx.compose.ui.text.t0.l(value.getSelection()))) != (b6 = offsetMapping.b(androidx.compose.ui.text.t0.k(value.getSelection())))) {
                canvas.J(textLayoutResult.z(b5, b6), selectionPaint);
            }
            androidx.compose.ui.text.r0.f21295a.a(canvas, textLayoutResult);
        }

        @fg.l
        @kd.n
        public final kotlin.l1<Integer, Integer, androidx.compose.ui.text.n0> c(@fg.l m0 textDelegate, long constraints, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.m androidx.compose.ui.text.n0 prevResultText) {
            androidx.compose.ui.text.n0 o4 = textDelegate.o(constraints, layoutDirection, prevResultText);
            return new kotlin.l1<>(Integer.valueOf(androidx.compose.ui.unit.u.m(o4.getSize())), Integer.valueOf((int) (o4.getSize() & 4294967295L)), o4);
        }

        @kd.n
        public final void e(@fg.l androidx.compose.ui.text.input.z0 value, @fg.l m0 textDelegate, @fg.l androidx.compose.ui.text.n0 textLayoutResult, @fg.l androidx.compose.ui.layout.u layoutCoordinates, @fg.l androidx.compose.ui.text.input.h1 textInputSession, boolean hasFocus, @fg.l androidx.compose.ui.text.input.p0 offsetMapping) {
            if (hasFocus) {
                int b5 = offsetMapping.b(androidx.compose.ui.text.t0.k(value.getSelection()));
                i0.i d5 = b5 < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.d(b5) : b5 != 0 ? textLayoutResult.d(b5 - 1) : new i0.i(0.0f, 0.0f, 1.0f, androidx.compose.ui.unit.u.j(r0.b(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
                long r02 = layoutCoordinates.r0(i0.g.a(d5.t(), d5.getTop()));
                textInputSession.e(i0.j.c(i0.g.a(i0.f.p(r02), i0.f.r(r02)), i0.o.a(d5.G(), d5.r())));
            }
        }

        @kd.n
        public final void f(@fg.l androidx.compose.ui.text.input.h1 textInputSession, @fg.l androidx.compose.ui.text.input.r editProcessor, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, k2> onValueChange) {
            onValueChange.invoke(androidx.compose.ui.text.input.z0.d(editProcessor.h(), null, 0L, null, 3, null));
            textInputSession.a();
        }

        @kd.n
        public final void g(@fg.l List<? extends androidx.compose.ui.text.input.p> ops, @fg.l androidx.compose.ui.text.input.r editProcessor, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, k2> onValueChange, @fg.m androidx.compose.ui.text.input.h1 session) {
            androidx.compose.ui.text.input.z0 b5 = editProcessor.b(ops);
            if (session != null) {
                session.g(null, b5);
            }
            onValueChange.invoke(b5);
        }

        @fg.l
        @kd.n
        public final androidx.compose.ui.text.input.h1 h(@fg.l androidx.compose.ui.text.input.b1 textInputService, @fg.l androidx.compose.ui.text.input.z0 value, @fg.l androidx.compose.ui.text.input.r editProcessor, @fg.l androidx.compose.ui.text.input.z imeOptions, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, k2> onValueChange, @fg.l ld.l<? super androidx.compose.ui.text.input.y, k2> onImeActionPerformed) {
            return i(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.text.input.h1] */
        @fg.l
        @kd.n
        public final androidx.compose.ui.text.input.h1 i(@fg.l androidx.compose.ui.text.input.b1 textInputService, @fg.l androidx.compose.ui.text.input.z0 value, @fg.l androidx.compose.ui.text.input.r editProcessor, @fg.l androidx.compose.ui.text.input.z imeOptions, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, k2> onValueChange, @fg.l ld.l<? super androidx.compose.ui.text.input.y, k2> onImeActionPerformed) {
            k1.h hVar = new k1.h();
            ?? d5 = textInputService.d(value, imeOptions, new C0148a(editProcessor, onValueChange, hVar), onImeActionPerformed);
            hVar.f75329b = d5;
            return d5;
        }

        @kd.n
        public final void j(long position, @fg.l e1 textLayoutResult, @fg.l androidx.compose.ui.text.input.r editProcessor, @fg.l androidx.compose.ui.text.input.p0 offsetMapping, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, k2> onValueChange) {
            int a5 = offsetMapping.a(e1.h(textLayoutResult, position, false, 2, null));
            onValueChange.invoke(androidx.compose.ui.text.input.z0.d(editProcessor.h(), null, androidx.compose.ui.text.u0.b(a5, a5), null, 5, null));
        }

        @kd.n
        public final void k(@fg.l androidx.compose.ui.text.input.h1 textInputSession, @fg.l androidx.compose.ui.text.input.z0 textFieldValue, @fg.l androidx.compose.ui.text.input.p0 offsetMapping, @fg.l e1 textLayoutResult) {
            androidx.compose.ui.layout.u decorationBoxCoordinates;
            androidx.compose.ui.layout.u innerTextFieldCoordinates = textLayoutResult.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.f() || (decorationBoxCoordinates = textLayoutResult.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.h(textFieldValue, offsetMapping, textLayoutResult.getValue(), new b(innerTextFieldCoordinates), androidx.compose.foundation.text.selection.i0.i(innerTextFieldCoordinates), innerTextFieldCoordinates.j0(decorationBoxCoordinates, false));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @kd.n
    public static final void a(@fg.l v1 v1Var, @fg.l androidx.compose.ui.text.input.z0 z0Var, @fg.l androidx.compose.ui.text.input.p0 p0Var, @fg.l androidx.compose.ui.text.n0 n0Var, @fg.l d5 d5Var) {
        INSTANCE.b(v1Var, z0Var, p0Var, n0Var, d5Var);
    }

    @fg.l
    @kd.n
    public static final kotlin.l1<Integer, Integer, androidx.compose.ui.text.n0> b(@fg.l m0 m0Var, long j4, @fg.l androidx.compose.ui.unit.w wVar, @fg.m androidx.compose.ui.text.n0 n0Var) {
        return INSTANCE.c(m0Var, j4, wVar, n0Var);
    }

    @kd.n
    public static final void c(@fg.l androidx.compose.ui.text.input.z0 z0Var, @fg.l m0 m0Var, @fg.l androidx.compose.ui.text.n0 n0Var, @fg.l androidx.compose.ui.layout.u uVar, @fg.l androidx.compose.ui.text.input.h1 h1Var, boolean z4, @fg.l androidx.compose.ui.text.input.p0 p0Var) {
        INSTANCE.e(z0Var, m0Var, n0Var, uVar, h1Var, z4, p0Var);
    }

    @kd.n
    public static final void d(@fg.l androidx.compose.ui.text.input.h1 h1Var, @fg.l androidx.compose.ui.text.input.r rVar, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar) {
        INSTANCE.f(h1Var, rVar, lVar);
    }

    @kd.n
    public static final void e(@fg.l List<? extends androidx.compose.ui.text.input.p> list, @fg.l androidx.compose.ui.text.input.r rVar, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar, @fg.m androidx.compose.ui.text.input.h1 h1Var) {
        INSTANCE.g(list, rVar, lVar, h1Var);
    }

    @fg.l
    @kd.n
    public static final androidx.compose.ui.text.input.h1 f(@fg.l androidx.compose.ui.text.input.b1 b1Var, @fg.l androidx.compose.ui.text.input.z0 z0Var, @fg.l androidx.compose.ui.text.input.r rVar, @fg.l androidx.compose.ui.text.input.z zVar, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar, @fg.l ld.l<? super androidx.compose.ui.text.input.y, k2> lVar2) {
        return INSTANCE.i(b1Var, z0Var, rVar, zVar, lVar, lVar2);
    }

    @fg.l
    @kd.n
    public static final androidx.compose.ui.text.input.h1 g(@fg.l androidx.compose.ui.text.input.b1 b1Var, @fg.l androidx.compose.ui.text.input.z0 z0Var, @fg.l androidx.compose.ui.text.input.r rVar, @fg.l androidx.compose.ui.text.input.z zVar, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar, @fg.l ld.l<? super androidx.compose.ui.text.input.y, k2> lVar2) {
        return INSTANCE.i(b1Var, z0Var, rVar, zVar, lVar, lVar2);
    }

    @kd.n
    public static final void h(long j4, @fg.l e1 e1Var, @fg.l androidx.compose.ui.text.input.r rVar, @fg.l androidx.compose.ui.text.input.p0 p0Var, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar) {
        INSTANCE.j(j4, e1Var, rVar, p0Var, lVar);
    }

    @kd.n
    public static final void i(@fg.l androidx.compose.ui.text.input.h1 h1Var, @fg.l androidx.compose.ui.text.input.z0 z0Var, @fg.l androidx.compose.ui.text.input.p0 p0Var, @fg.l e1 e1Var) {
        INSTANCE.k(h1Var, z0Var, p0Var, e1Var);
    }
}
