package androidx.compose.foundation.text2.input.internal;

import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextPreparedSelection.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 82\u00020\u0001:\u0001MB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u0014H\u0082\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J\u001e\u0010#\u001a\u00020\f*\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\fH\u0082\u0010¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u00020\f*\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\fH\u0082\u0010¢\u0006\u0004\b%\u0010$J\u001d\u0010&\u001a\u00020\f*\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010$J\u001d\u0010'\u001a\u00020\f*\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010$J\u001b\u0010)\u001a\u00020\f*\u00020\u00042\u0006\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010$J\u0017\u0010*\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010\u000fJ \u0010-\u001a\u00020\u00132\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+H\u0086\b¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0000¢\u0006\u0004\b/\u0010\u001cJ\r\u00100\u001a\u00020\u0000¢\u0006\u0004\b0\u0010\u001cJ\r\u00101\u001a\u00020\u0000¢\u0006\u0004\b1\u0010\u001cJ\r\u00102\u001a\u00020\u0000¢\u0006\u0004\b2\u0010\u001cJ\r\u00103\u001a\u00020\u0000¢\u0006\u0004\b3\u0010\u001cJ\r\u00104\u001a\u00020\u0000¢\u0006\u0004\b4\u0010\u001cJ&\u00106\u001a\u00020\u00002\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u0014¢\u0006\u0004\b6\u00107J&\u00108\u001a\u00020\u00002\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u0014¢\u0006\u0004\b8\u00107J\r\u00109\u001a\u00020\f¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\f¢\u0006\u0004\b;\u0010:J\r\u0010<\u001a\u00020\u0000¢\u0006\u0004\b<\u0010\u001cJ\r\u0010=\u001a\u00020\u0000¢\u0006\u0004\b=\u0010\u001cJ\r\u0010>\u001a\u00020\u0000¢\u0006\u0004\b>\u0010\u001cJ\r\u0010?\u001a\u00020\u0000¢\u0006\u0004\b?\u0010\u001cJ\r\u0010@\u001a\u00020\f¢\u0006\u0004\b@\u0010:J\r\u0010A\u001a\u00020\f¢\u0006\u0004\bA\u0010:J\r\u0010B\u001a\u00020\u0000¢\u0006\u0004\bB\u0010\u001cJ\r\u0010C\u001a\u00020\u0000¢\u0006\u0004\bC\u0010\u001cJ\r\u0010D\u001a\u00020\u0000¢\u0006\u0004\bD\u0010\u001cJ\r\u0010E\u001a\u00020\u0000¢\u0006\u0004\bE\u0010\u001cJ\r\u0010F\u001a\u00020\f¢\u0006\u0004\bF\u0010:J\r\u0010G\u001a\u00020\u0000¢\u0006\u0004\bG\u0010\u001cJ\r\u0010H\u001a\u00020\f¢\u0006\u0004\bH\u0010:J\r\u0010I\u001a\u00020\u0000¢\u0006\u0004\bI\u0010\u001cJ\r\u0010J\u001a\u00020\u0000¢\u0006\u0004\bJ\u0010\u001cJ\r\u0010K\u001a\u00020\u0000¢\u0006\u0004\bK\u0010\u001cJ\r\u0010L\u001a\u00020\u0000¢\u0006\u0004\bL\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010RR\u0017\u0010X\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR(\u0010]\u001a\u00020,8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b*\u0010\u001e\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010_\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/f0;", "", "Landroidx/compose/foundation/text2/input/internal/m0;", "state", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "", "visibleTextLayoutHeight", "Landroidx/compose/foundation/text2/input/internal/g0;", "textPreparedSelectionState", "<init>", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/ui/text/n0;FLandroidx/compose/foundation/text2/input/internal/g0;)V", "", "pagesAmount", "C", "(I)I", "", "resetCachedX", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlin/u;", "block", "d", "(ZLld/l;)Landroidx/compose/foundation/text2/input/internal/f0;", "offset", "Z", "(I)V", "K", "()Landroidx/compose/foundation/text2/input/internal/f0;", "H", "J", "M", "A", "()Z", "currentOffset", "t", "(Landroidx/compose/ui/text/n0;I)I", "w", "p", "m", "linesAmount", "B", "f", "Lkotlin/Function0;", "Landroidx/compose/ui/text/t0;", "i", "(Lld/a;)V", "W", "E", "X", "j", "F", "N", "or", "g", "(Lld/l;)Landroidx/compose/foundation/text2/input/internal/f0;", "h", "v", "()I", "r", "Q", "P", "G", "O", "s", "y", "L", "I", "V", "D", "o", "U", "l", "R", "S", "T", "Y", "a", "Landroidx/compose/foundation/text2/input/internal/m0;", "b", "Landroidx/compose/ui/text/n0;", "c", "Landroidx/compose/foundation/text2/input/internal/g0;", "Landroidx/compose/foundation/text2/input/q;", "e", "Landroidx/compose/foundation/text2/input/q;", "k", "()Landroidx/compose/foundation/text2/input/q;", "initialValue", "z", "()J", "a0", "(J)V", "selection", "", "Ljava/lang/String;", "text", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n159#1,7:444\n159#1,7:451\n155#1,11:458\n155#1,11:469\n155#1,11:480\n155#1,11:491\n155#1,11:502\n155#1,11:513\n155#1,11:524\n155#1,11:535\n155#1,11:546\n155#1,11:557\n155#1,11:568\n155#1,11:579\n155#1,11:590\n155#1,11:601\n155#1,11:612\n155#1,11:623\n159#1,7:634\n159#1,7:641\n155#1,11:648\n155#1,11:659\n155#1,11:670\n155#1,11:681\n159#1,7:692\n495#2,4:433\n500#2:442\n129#3,5:437\n1#4:443\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection\n*L\n114#1:444,7\n121#1:451,7\n175#1:458,11\n179#1:469,11\n183#1:480,11\n191#1:491,11\n202#1:502,11\n217#1:513,11\n240#1:524,11\n245#1:535,11\n250#1:546,11\n254#1:557,11\n258#1:568,11\n266#1:579,11\n276#1:590,11\n282#1:601,11\n286#1:612,11\n294#1:623,11\n302#1:634,7\n306#1:641,7\n312#1:648,11\n318#1:659,11\n322#1:670,11\n330#1:681,11\n339#1:692,7\n87#1:433,4\n87#1:442\n87#1:437,5\n*E\n"})
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f8656i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f8657j = -1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0 state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n0 textLayoutResult;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float visibleTextLayoutHeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g0 textPreparedSelectionState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text2.input.q initialValue;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long selection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String text;

    public f0(@fg.l m0 m0Var, @fg.l n0 n0Var, float f4, @fg.l g0 g0Var) {
        this.state = m0Var;
        this.textLayoutResult = n0Var;
        this.visibleTextLayoutHeight = f4;
        this.textPreparedSelectionState = g0Var;
        androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
        try {
            androidx.compose.runtime.snapshots.m r4 = c5.r();
            try {
                androidx.compose.foundation.text2.input.q k4 = m0Var.k();
                c5.d();
                this.initialValue = k4;
                this.selection = k4.getSelectionInChars();
                this.text = k4.toString();
            } finally {
                c5.y(r4);
            }
        } catch (Throwable th) {
            c5.d();
            throw th;
        }
    }

    private final boolean A() {
        return this.textLayoutResult.y(t0.i(this.selection)) == androidx.compose.ui.text.style.i.Ltr;
    }

    private final int B(n0 n0Var, int i4) {
        int i5 = t0.i(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.c(n0Var.e(i5).t());
        }
        int q4 = n0Var.q(i5) + i4;
        if (q4 < 0) {
            return 0;
        }
        if (q4 >= n0Var.n()) {
            return this.text.length();
        }
        float m4 = n0Var.m(q4) - 1;
        float cachedX = this.textPreparedSelectionState.getCachedX();
        return ((!A() || cachedX < n0Var.t(q4)) && (A() || cachedX > n0Var.s(q4))) ? n0Var.x(i0.g.a(cachedX, m4)) : n0Var.o(q4, true);
    }

    private final int C(int pagesAmount) {
        i0.i S = this.textLayoutResult.e(t0.i(this.initialValue.getSelectionInChars())).S(0.0f, this.visibleTextLayoutHeight * pagesAmount);
        float m4 = this.textLayoutResult.m(this.textLayoutResult.r(S.getTop()));
        return Math.abs(S.getTop() - m4) > Math.abs(S.j() - m4) ? this.textLayoutResult.x(S.E()) : this.textLayoutResult.x(S.m());
    }

    private final f0 H() {
        int r4;
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0 && (r4 = r()) != -1) {
            Z(r4);
        }
        return this;
    }

    private final f0 J() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            Z(s());
        }
        return this;
    }

    private final f0 K() {
        int v4;
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0 && (v4 = v()) != -1) {
            Z(v4);
        }
        return this;
    }

    private final f0 M() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            Z(y());
        }
        return this;
    }

    private final void Z(int offset) {
        this.selection = u0.b(offset, offset);
    }

    private final f0 d(boolean resetCachedX, ld.l<? super f0, k2> block) {
        if (resetCachedX) {
            this.textPreparedSelectionState.b();
        }
        if (this.text.length() > 0) {
            block.invoke(this);
        }
        return this;
    }

    static /* synthetic */ f0 e(f0 f0Var, boolean z4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        if (z4) {
            f0Var.textPreparedSelectionState.b();
        }
        if (f0Var.text.length() > 0) {
            lVar.invoke(f0Var);
        }
        return f0Var;
    }

    private final int f(int offset) {
        int length = this.text.length() - 1;
        return offset > length ? length : offset;
    }

    private final int m(n0 n0Var, int i4) {
        return n0Var.o(n0Var.q(i4), true);
    }

    static /* synthetic */ int n(f0 f0Var, n0 n0Var, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = t0.k(f0Var.selection);
        }
        return f0Var.m(n0Var, i4);
    }

    private final int p(n0 n0Var, int i4) {
        return n0Var.u(n0Var.q(i4));
    }

    static /* synthetic */ int q(f0 f0Var, n0 n0Var, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = t0.l(f0Var.selection);
        }
        return f0Var.p(n0Var, i4);
    }

    private final int t(n0 n0Var, int i4) {
        while (i4 < this.initialValue.length()) {
            long C = n0Var.C(f(i4));
            if (t0.i(C) > i4) {
                return (int) (4294967295L & C);
            }
            i4++;
        }
        return this.initialValue.length();
    }

    static /* synthetic */ int u(f0 f0Var, n0 n0Var, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = t0.i(f0Var.selection);
        }
        return f0Var.t(n0Var, i4);
    }

    private final int w(n0 n0Var, int i4) {
        while (i4 > 0) {
            long C = n0Var.C(f(i4));
            if (t0.n(C) < i4) {
                return (int) (C >> 32);
            }
            i4--;
        }
        return 0;
    }

    static /* synthetic */ int x(f0 f0Var, n0 n0Var, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = t0.i(f0Var.selection);
        }
        return f0Var.w(n0Var, i4);
    }

    @fg.l
    public final f0 D() {
        if (this.text.length() > 0) {
            Z(B(this.textLayoutResult, 1));
        }
        return this;
    }

    @fg.l
    public final f0 E() {
        if (this.text.length() > 0) {
            Z(C(1));
        }
        return this;
    }

    @fg.l
    public final f0 F() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            if (A()) {
                K();
            } else {
                H();
            }
        }
        return this;
    }

    @fg.l
    public final f0 G() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            if (A()) {
                M();
            } else {
                J();
            }
        }
        return this;
    }

    @fg.l
    public final f0 I() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            int a5 = androidx.compose.foundation.text.j0.a(this.text, t0.k(this.selection));
            if (a5 == t0.k(this.selection) && a5 != this.text.length()) {
                a5 = androidx.compose.foundation.text.j0.a(this.text, a5 + 1);
            }
            Z(a5);
        }
        return this;
    }

    @fg.l
    public final f0 L() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            int b5 = androidx.compose.foundation.text.j0.b(this.text, t0.l(this.selection));
            if (b5 == t0.l(this.selection) && b5 != 0) {
                b5 = androidx.compose.foundation.text.j0.b(this.text, b5 - 1);
            }
            Z(b5);
        }
        return this;
    }

    @fg.l
    public final f0 N() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            if (A()) {
                H();
            } else {
                K();
            }
        }
        return this;
    }

    @fg.l
    public final f0 O() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            if (A()) {
                J();
            } else {
                M();
            }
        }
        return this;
    }

    @fg.l
    public final f0 P() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            Z(this.text.length());
        }
        return this;
    }

    @fg.l
    public final f0 Q() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            Z(0);
        }
        return this;
    }

    @fg.l
    public final f0 R() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            Z(l());
        }
        return this;
    }

    @fg.l
    public final f0 S() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            if (A()) {
                U();
            } else {
                R();
            }
        }
        return this;
    }

    @fg.l
    public final f0 T() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            if (A()) {
                R();
            } else {
                U();
            }
        }
        return this;
    }

    @fg.l
    public final f0 U() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            Z(o());
        }
        return this;
    }

    @fg.l
    public final f0 V() {
        if (this.text.length() > 0) {
            Z(B(this.textLayoutResult, -1));
        }
        return this;
    }

    @fg.l
    public final f0 W() {
        if (this.text.length() > 0) {
            Z(C(-1));
        }
        return this;
    }

    @fg.l
    public final f0 X() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            this.selection = u0.b(0, this.text.length());
        }
        return this;
    }

    @fg.l
    public final f0 Y() {
        if (this.text.length() > 0) {
            this.selection = u0.b(t0.n(this.initialValue.getSelectionInChars()), (int) (this.selection & 4294967295L));
        }
        return this;
    }

    public final void a0(long j4) {
        this.selection = j4;
    }

    @fg.l
    public final f0 g(@fg.l ld.l<? super f0, k2> or) {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            if (t0.h(this.selection)) {
                or.invoke(this);
            } else if (A()) {
                Z(t0.l(this.selection));
            } else {
                Z(t0.k(this.selection));
            }
        }
        return this;
    }

    @fg.l
    public final f0 h(@fg.l ld.l<? super f0, k2> or) {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            if (t0.h(this.selection)) {
                or.invoke(this);
            } else if (A()) {
                Z(t0.k(this.selection));
            } else {
                Z(t0.l(this.selection));
            }
        }
        return this;
    }

    public final void i(@fg.l ld.a<t0> block) {
        if (!t0.h(this.selection)) {
            m0.y(this.state, "", this.selection, null, 4, null);
            return;
        }
        t0 invoke = block.invoke();
        if (invoke != null) {
            m0.y(this.state, "", invoke.getPackedValue(), null, 4, null);
        }
    }

    @fg.l
    public final f0 j() {
        this.textPreparedSelectionState.b();
        if (this.text.length() > 0) {
            Z(t0.i(this.selection));
        }
        return this;
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final androidx.compose.foundation.text2.input.q getInitialValue() {
        return this.initialValue;
    }

    public final int l() {
        return n(this, this.textLayoutResult, 0, 1, null);
    }

    public final int o() {
        return q(this, this.textLayoutResult, 0, 1, null);
    }

    public final int r() {
        return androidx.compose.foundation.text.k0.a(this.text, t0.i(this.selection));
    }

    public final int s() {
        return u(this, this.textLayoutResult, 0, 1, null);
    }

    public final int v() {
        return androidx.compose.foundation.text.k0.b(this.text, t0.i(this.selection));
    }

    public final int y() {
        return x(this, this.textLayoutResult, 0, 1, null);
    }

    /* renamed from: z, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }
}
