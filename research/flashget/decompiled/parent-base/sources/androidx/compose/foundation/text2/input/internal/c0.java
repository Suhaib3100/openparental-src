package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.w0;
import androidx.compose.ui.platform.g5;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextFieldKeyEventHandler.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJP\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/c0;", "", "<init>", "()V", "Landroidx/compose/foundation/text2/input/internal/m0;", "state", "Landroidx/compose/foundation/text2/input/internal/j0;", "textLayoutState", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/f0;", "Lkotlin/k2;", "Lkotlin/u;", "block", "d", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/j0;Lld/l;)V", "", "a", "(Landroidx/compose/foundation/text2/input/internal/j0;)Ljava/lang/Float;", "Landroidx/compose/ui/input/key/c;", "event", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "textFieldSelectionState", "Landroidx/compose/ui/focus/m;", "focusManager", "Landroidx/compose/ui/platform/g5;", "keyboardController", "", "c", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/ui/focus/m;Landroidx/compose/ui/platform/g5;)Z", "editable", "singleLine", "Lkotlin/Function0;", "onSubmit", "b", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/j0;Landroidx/compose/foundation/text2/input/internal/selection/i;ZZLld/a;)Z", "Landroidx/compose/foundation/text2/input/internal/g0;", "Landroidx/compose/foundation/text2/input/internal/g0;", "preparedSelectionState", "Landroidx/compose/foundation/text/l;", "Landroidx/compose/foundation/text/l;", "deadKeyCombiner", "Landroidx/compose/foundation/text/y;", "Landroidx/compose/foundation/text/y;", "keyMapping", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nTextFieldKeyEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n+ 4 TextPreparedSelection.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,256:1\n229#1,9:284\n238#1,5:384\n197#2,6:257\n206#2:283\n197#2,6:330\n206#2:356\n197#2,6:357\n206#2:383\n186#3,20:263\n186#3,20:336\n186#3,20:363\n104#4,4:293\n109#4:299\n104#4,4:300\n109#4:305\n104#4,4:306\n109#4:311\n104#4,4:312\n109#4:317\n104#4,4:318\n109#4:323\n104#4,4:324\n109#4:329\n1#5:297\n1#5:298\n1#5:304\n1#5:310\n1#5:316\n1#5:322\n1#5:328\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler\n*L\n105#1:284,9\n105#1:384,5\n88#1:257,6\n88#1:283\n170#1:330,6\n170#1:356\n181#1:357,6\n181#1:383\n88#1:263,20\n170#1:336,20\n181#1:363,20\n127#1:293,4\n127#1:299\n137#1:300,4\n137#1:305\n145#1:306,4\n145#1:311\n151#1:312,4\n151#1:317\n157#1:318,4\n157#1:323\n163#1:324,4\n163#1:329\n127#1:298\n137#1:304\n145#1:310\n151#1:316\n157#1:322\n163#1:328\n*E\n"})
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8611d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g0 preparedSelectionState = new g0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text.l deadKeyCombiner = new androidx.compose.foundation.text.l();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text.y keyMapping = androidx.compose.foundation.text.a0.a();

    /* compiled from: TextFieldKeyEventHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8615a;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.w.values().length];
            try {
                iArr[androidx.compose.foundation.text.w.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[androidx.compose.foundation.text.w.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            f8615a = iArr;
        }
    }

    /* compiled from: TextFieldKeyEventHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/f0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/internal/f0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<f0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f8616b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l f0 f0Var) {
            f0Var.F();
        }

        @Override // ld.l
        public k2 invoke(f0 f0Var) {
            f0Var.F();
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldKeyEventHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/f0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/internal/f0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<f0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f8617b = new c(1);

        c() {
            super(1);
        }

        public final void a(@fg.l f0 f0Var) {
            f0Var.N();
        }

        @Override // ld.l
        public k2 invoke(f0 f0Var) {
            f0Var.N();
            return k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Float a(androidx.compose.foundation.text2.input.internal.j0 r5) {
        /*
            r4 = this;
            androidx.compose.ui.layout.u r0 = r5.j()
            r1 = 0
            if (r0 == 0) goto L37
            boolean r2 = r0.f()
            if (r2 == 0) goto Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L37
            androidx.compose.ui.layout.u r5 = r5.d()
            if (r5 == 0) goto L28
            boolean r2 = r5.f()
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r5 = r1
        L1f:
            if (r5 == 0) goto L28
            r2 = 0
            r3 = 2
            i0.i r5 = androidx.compose.ui.layout.u.A(r5, r0, r2, r3, r1)
            goto L29
        L28:
            r5 = r1
        L29:
            if (r5 == 0) goto L37
            long r0 = r5.z()
            float r5 = i0.n.m(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.c0.a(androidx.compose.foundation.text2.input.internal.j0):java.lang.Float");
    }

    private final void d(m0 state, j0 textLayoutState, ld.l<? super f0, k2> block) {
        Float a5;
        androidx.compose.ui.text.n0 e4 = textLayoutState.e();
        if (e4 == null || (a5 = a(textLayoutState)) == null) {
            return;
        }
        f0 f0Var = new f0(state, e4, a5.floatValue(), this.preparedSelectionState);
        block.invoke(f0Var);
        if (t0.g(f0Var.getSelection(), f0Var.getInitialValue().getSelectionInChars())) {
            return;
        }
        state.A(f0Var.getSelection());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean b(@fg.l KeyEvent event, @fg.l m0 textFieldState, @fg.l j0 textLayoutState, @fg.l androidx.compose.foundation.text2.input.internal.selection.i textFieldSelectionState, boolean editable, boolean singleLine, @fg.l ld.a<k2> onSubmit) {
        Float a5;
        t0 b5;
        m0 m0Var;
        m0 m0Var2;
        m0 m0Var3;
        m0 m0Var4;
        m0 m0Var5;
        m0 m0Var6;
        m0 m0Var7;
        m0 m0Var8;
        m0 m0Var9;
        m0 m0Var10;
        m0 m0Var11;
        m0 m0Var12;
        androidx.compose.foundation.text2.input.h hVar;
        androidx.compose.foundation.text2.input.h hVar2;
        Integer a6;
        androidx.compose.foundation.text2.input.h hVar3;
        int b6 = androidx.compose.ui.input.key.e.b(event);
        androidx.compose.ui.input.key.d.INSTANCE.getClass();
        boolean z4 = false;
        if (!androidx.compose.ui.input.key.d.g(b6, androidx.compose.ui.input.key.d.f18651e)) {
            return false;
        }
        if (w0.a(event) && (a6 = this.deadKeyCombiner.a(event)) != null) {
            String sb = new StringBuilder(2).appendCodePoint(a6.intValue()).toString();
            if (!editable) {
                return false;
            }
            androidx.compose.foundation.text2.input.u uVar = textFieldState.textFieldState;
            hVar3 = textFieldState.inputTransformation;
            androidx.compose.foundation.text2.input.internal.undo.c cVar = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
            androidx.compose.foundation.text2.input.q m4 = uVar.m();
            uVar.getMainBuffer().getChangeTracker().e();
            m mainBuffer = uVar.getMainBuffer();
            mainBuffer.b();
            l.b(mainBuffer, sb, 1);
            if (uVar.getMainBuffer().getChangeTracker().a() != 0 || !t0.g(m4.getSelectionInChars(), uVar.getMainBuffer().k()) || !kotlin.jvm.internal.l0.g(m4.getCompositionInChars(), uVar.getMainBuffer().f())) {
                uVar.f(m4, hVar3, true, cVar);
            }
            this.preparedSelectionState.b();
            return true;
        }
        androidx.compose.foundation.text.w a7 = this.keyMapping.a(event);
        if (a7 == null || (a7.getEditsText() && !editable)) {
            return false;
        }
        androidx.compose.ui.text.n0 e4 = textLayoutState.e();
        if (e4 == null || (a5 = a(textLayoutState)) == null) {
            return true;
        }
        f0 f0Var = new f0(textFieldState, e4, a5.floatValue(), this.preparedSelectionState);
        switch (a.f8615a[a7.ordinal()]) {
            case 1:
                textFieldSelectionState.H(false);
                z4 = true;
                break;
            case 2:
                textFieldSelectionState.u0();
                z4 = true;
                break;
            case 3:
                textFieldSelectionState.K();
                z4 = true;
                break;
            case 4:
                f0Var.g(b.f8616b);
                z4 = true;
                break;
            case 5:
                f0Var.h(c.f8617b);
                z4 = true;
                break;
            case 6:
                f0Var.G();
                z4 = true;
                break;
            case 7:
                f0Var.O();
                z4 = true;
                break;
            case 8:
                f0Var.L();
                z4 = true;
                break;
            case 9:
                f0Var.I();
                z4 = true;
                break;
            case 10:
                f0Var.V();
                z4 = true;
                break;
            case 11:
                f0Var.D();
                z4 = true;
                break;
            case 12:
                f0Var.W();
                z4 = true;
                break;
            case 13:
                f0Var.E();
                z4 = true;
                break;
            case 14:
                f0Var.U();
                z4 = true;
                break;
            case 15:
                f0Var.R();
                z4 = true;
                break;
            case 16:
                f0Var.S();
                z4 = true;
                break;
            case 17:
                f0Var.T();
                z4 = true;
                break;
            case 18:
                f0Var.Q();
                z4 = true;
                break;
            case 19:
                f0Var.P();
                z4 = true;
                break;
            case 20:
                if (t0.h(f0Var.getSelection())) {
                    Integer valueOf = Integer.valueOf(f0Var.v());
                    if (valueOf.intValue() == -1) {
                        valueOf = null;
                    }
                    b5 = valueOf != null ? t0.b(u0.b(valueOf.intValue(), (int) (f0Var.getSelection() & 4294967295L))) : null;
                    if (b5 != null) {
                        long packedValue = b5.getPackedValue();
                        m0Var = f0Var.state;
                        m0.y(m0Var, "", packedValue, null, 4, null);
                    }
                } else {
                    m0Var2 = f0Var.state;
                    m0.y(m0Var2, "", f0Var.getSelection(), null, 4, null);
                }
                z4 = true;
                break;
            case 21:
                if (t0.h(f0Var.getSelection())) {
                    Integer valueOf2 = Integer.valueOf(f0Var.r());
                    if (valueOf2.intValue() == -1) {
                        valueOf2 = null;
                    }
                    b5 = valueOf2 != null ? t0.b(u0.b((int) (f0Var.getSelection() >> 32), valueOf2.intValue())) : null;
                    if (b5 != null) {
                        long packedValue2 = b5.getPackedValue();
                        m0Var3 = f0Var.state;
                        m0.y(m0Var3, "", packedValue2, null, 4, null);
                    }
                } else {
                    m0Var4 = f0Var.state;
                    m0.y(m0Var4, "", f0Var.getSelection(), null, 4, null);
                }
                z4 = true;
                break;
            case 22:
                if (t0.h(f0Var.getSelection())) {
                    long b7 = u0.b(f0Var.y(), (int) (f0Var.getSelection() & 4294967295L));
                    m0Var5 = f0Var.state;
                    m0.y(m0Var5, "", b7, null, 4, null);
                } else {
                    m0Var6 = f0Var.state;
                    m0.y(m0Var6, "", f0Var.getSelection(), null, 4, null);
                }
                z4 = true;
                break;
            case 23:
                if (t0.h(f0Var.getSelection())) {
                    long b10 = u0.b((int) (f0Var.getSelection() >> 32), f0Var.s());
                    m0Var7 = f0Var.state;
                    m0.y(m0Var7, "", b10, null, 4, null);
                } else {
                    m0Var8 = f0Var.state;
                    m0.y(m0Var8, "", f0Var.getSelection(), null, 4, null);
                }
                z4 = true;
                break;
            case 24:
                if (t0.h(f0Var.getSelection())) {
                    long b11 = u0.b(f0Var.o(), (int) (f0Var.getSelection() & 4294967295L));
                    m0Var9 = f0Var.state;
                    m0.y(m0Var9, "", b11, null, 4, null);
                } else {
                    m0Var10 = f0Var.state;
                    m0.y(m0Var10, "", f0Var.getSelection(), null, 4, null);
                }
                z4 = true;
                break;
            case 25:
                if (t0.h(f0Var.getSelection())) {
                    long b12 = u0.b((int) (f0Var.getSelection() >> 32), f0Var.l());
                    m0Var11 = f0Var.state;
                    m0.y(m0Var11, "", b12, null, 4, null);
                } else {
                    m0Var12 = f0Var.state;
                    m0.y(m0Var12, "", f0Var.getSelection(), null, 4, null);
                }
                z4 = true;
                break;
            case 26:
                if (singleLine) {
                    onSubmit.invoke();
                } else {
                    androidx.compose.foundation.text2.input.u uVar2 = textFieldState.textFieldState;
                    hVar = textFieldState.inputTransformation;
                    androidx.compose.foundation.text2.input.internal.undo.c cVar2 = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
                    androidx.compose.foundation.text2.input.q m5 = uVar2.m();
                    uVar2.getMainBuffer().getChangeTracker().e();
                    m mainBuffer2 = uVar2.getMainBuffer();
                    mainBuffer2.b();
                    l.b(mainBuffer2, "\n", 1);
                    if (uVar2.getMainBuffer().getChangeTracker().a() != 0 || !t0.g(m5.getSelectionInChars(), uVar2.getMainBuffer().k()) || !kotlin.jvm.internal.l0.g(m5.getCompositionInChars(), uVar2.getMainBuffer().f())) {
                        uVar2.f(m5, hVar, true, cVar2);
                    }
                }
                z4 = true;
                break;
            case 27:
                if (!singleLine) {
                    androidx.compose.foundation.text2.input.u uVar3 = textFieldState.textFieldState;
                    hVar2 = textFieldState.inputTransformation;
                    androidx.compose.foundation.text2.input.internal.undo.c cVar3 = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
                    androidx.compose.foundation.text2.input.q m6 = uVar3.m();
                    uVar3.getMainBuffer().getChangeTracker().e();
                    m mainBuffer3 = uVar3.getMainBuffer();
                    mainBuffer3.b();
                    l.b(mainBuffer3, "\t", 1);
                    if (uVar3.getMainBuffer().getChangeTracker().a() != 0 || !t0.g(m6.getSelectionInChars(), uVar3.getMainBuffer().k()) || !kotlin.jvm.internal.l0.g(m6.getCompositionInChars(), uVar3.getMainBuffer().f())) {
                        uVar3.f(m6, hVar2, true, cVar3);
                    }
                    z4 = true;
                    break;
                }
                break;
            case 28:
                f0Var.X();
                z4 = true;
                break;
            case 29:
                f0Var.F().Y();
                z4 = true;
                break;
            case 30:
                f0Var.N().Y();
                z4 = true;
                break;
            case 31:
                f0Var.G().Y();
                z4 = true;
                break;
            case 32:
                f0Var.O().Y();
                z4 = true;
                break;
            case 33:
                f0Var.L().Y();
                z4 = true;
                break;
            case 34:
                f0Var.I().Y();
                z4 = true;
                break;
            case 35:
                f0Var.U().Y();
                z4 = true;
                break;
            case 36:
                f0Var.R().Y();
                z4 = true;
                break;
            case 37:
                f0Var.S().Y();
                z4 = true;
                break;
            case 38:
                f0Var.T().Y();
                z4 = true;
                break;
            case 39:
                f0Var.V().Y();
                z4 = true;
                break;
            case 40:
                f0Var.D().Y();
                z4 = true;
                break;
            case 41:
                f0Var.W().Y();
                z4 = true;
                break;
            case 42:
                f0Var.E().Y();
                z4 = true;
                break;
            case 43:
                f0Var.Q().Y();
                z4 = true;
                break;
            case 44:
                f0Var.P().Y();
                z4 = true;
                break;
            case 45:
                f0Var.j();
                z4 = true;
                break;
            case 46:
                textFieldState.C();
                z4 = true;
                break;
            case 47:
                textFieldState.t();
                z4 = true;
                break;
            default:
                z4 = true;
                break;
        }
        if (!t0.g(f0Var.getSelection(), f0Var.getInitialValue().getSelectionInChars())) {
            textFieldState.A(f0Var.getSelection());
        }
        return z4;
    }

    public boolean c(@fg.l KeyEvent event, @fg.l m0 textFieldState, @fg.l androidx.compose.foundation.text2.input.internal.selection.i textFieldSelectionState, @fg.l androidx.compose.ui.focus.m focusManager, @fg.l g5 keyboardController) {
        if (t0.h(textFieldState.k().getSelectionInChars()) || !androidx.compose.foundation.text.x.a(event)) {
            return false;
        }
        textFieldSelectionState.L();
        return true;
    }
}
