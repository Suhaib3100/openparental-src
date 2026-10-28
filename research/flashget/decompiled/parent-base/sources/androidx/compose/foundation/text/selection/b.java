package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.b;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextPreparedSelection.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u000e\n\u0002\b\u0004\b \u0018\u0000 V*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001-B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082\u0010¢\u0006\u0004\b\u001b\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010\u001f\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J=\u0010-\u001a\u00028\u0000\"\u0004\b\u0001\u0010'*\u00028\u00012\b\b\u0002\u0010(\u001a\u00020\u00142\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020*0)¢\u0006\u0002\b+H\u0084\b¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020*2\u0006\u0010$\u001a\u00020\u0017H\u0004¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020*2\u0006\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0017H\u0004¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00028\u0000¢\u0006\u0004\b5\u0010\u0010J\r\u00106\u001a\u00028\u0000¢\u0006\u0004\b6\u0010\u0010J\r\u00107\u001a\u00028\u0000¢\u0006\u0004\b7\u0010\u0010J\r\u00108\u001a\u00028\u0000¢\u0006\u0004\b8\u0010\u0010J&\u0010:\u001a\u00028\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*0)¢\u0006\u0002\b+¢\u0006\u0004\b:\u0010;J&\u0010<\u001a\u00028\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*0)¢\u0006\u0002\b+¢\u0006\u0004\b<\u0010;J\r\u0010=\u001a\u00020\u0017¢\u0006\u0004\b=\u0010!J\r\u0010>\u001a\u00020\u0017¢\u0006\u0004\b>\u0010!J\r\u0010?\u001a\u00028\u0000¢\u0006\u0004\b?\u0010\u0010J\r\u0010@\u001a\u00028\u0000¢\u0006\u0004\b@\u0010\u0010J\r\u0010A\u001a\u00028\u0000¢\u0006\u0004\bA\u0010\u0010J\r\u0010B\u001a\u00028\u0000¢\u0006\u0004\bB\u0010\u0010J\u000f\u0010C\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bE\u0010DJ\r\u0010F\u001a\u00028\u0000¢\u0006\u0004\bF\u0010\u0010J\r\u0010G\u001a\u00028\u0000¢\u0006\u0004\bG\u0010\u0010J\r\u0010H\u001a\u00028\u0000¢\u0006\u0004\bH\u0010\u0010J\r\u0010I\u001a\u00028\u0000¢\u0006\u0004\bI\u0010\u0010J\u000f\u0010J\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bJ\u0010DJ\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010\u0010J\u000f\u0010K\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bK\u0010DJ\r\u0010L\u001a\u00028\u0000¢\u0006\u0004\bL\u0010\u0010J\r\u0010M\u001a\u00028\u0000¢\u0006\u0004\bM\u0010\u0010J\r\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0001\u0010\u0010J\r\u0010N\u001a\u00028\u0000¢\u0006\u0004\bN\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b-\u0010O\u001a\u0004\bP\u0010QR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bR\u0010\u0012\u001a\u0004\bS\u0010TR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b<\u0010[\u001a\u0004\b\\\u0010]R(\u0010a\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b6\u0010\u0012\u001a\u0004\b^\u0010T\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010O\u001a\u0004\bb\u0010Q\"\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, d2 = {"Landroidx/compose/foundation/text/selection/b;", "T", "", "Landroidx/compose/ui/text/e;", "originalText", "Landroidx/compose/ui/text/t0;", "originalSelection", "Landroidx/compose/ui/text/n0;", "layoutResult", "Landroidx/compose/ui/text/input/p0;", "offsetMapping", "Landroidx/compose/foundation/text/selection/w0;", "state", "<init>", "(Landroidx/compose/ui/text/e;JLandroidx/compose/ui/text/n0;Landroidx/compose/ui/text/input/p0;Landroidx/compose/foundation/text/selection/w0;Lkotlin/jvm/internal/w;)V", "K", "()Landroidx/compose/foundation/text/selection/b;", "H", "J", "M", "", "C", "()Z", "", "currentOffset", "q", "(Landroidx/compose/ui/text/n0;I)I", "w", "m", "j", "linesAmount", "D", "c0", "()I", "e0", "d0", "offset", "c", "(I)I", "U", "resetCachedX", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlin/u;", "block", "a", "(Ljava/lang/Object;ZLld/l;)Landroidx/compose/foundation/text/selection/b;", "Z", "(I)V", "start", "end", "a0", "(II)V", "W", "f", "F", "N", "or", "d", "(Lld/l;)Landroidx/compose/foundation/text/selection/b;", "e", "v", "o", "Q", "P", "G", "O", "p", "()Ljava/lang/Integer;", "y", "L", "I", "V", "E", "l", "i", "R", "S", "X", "Landroidx/compose/ui/text/e;", "u", "()Landroidx/compose/ui/text/e;", "b", "t", "()J", "Landroidx/compose/ui/text/n0;", "h", "()Landroidx/compose/ui/text/n0;", "Landroidx/compose/ui/text/input/p0;", "s", "()Landroidx/compose/ui/text/input/p0;", "Landroidx/compose/foundation/text/selection/w0;", "A", "()Landroidx/compose/foundation/text/selection/w0;", "z", "b0", "(J)V", "selection", "g", "Y", "(Landroidx/compose/ui/text/e;)V", "annotatedString", "", "B", "()Ljava/lang/String;", "text", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n73#1,8:438\n73#1,8:446\n73#1,8:454\n73#1,8:462\n73#1,8:470\n73#1,8:478\n73#1,8:486\n73#1,8:494\n73#1,8:502\n73#1,8:510\n73#1,8:518\n73#1,8:526\n73#1,6:534\n80#1:541\n73#1,8:542\n73#1,8:550\n73#1,8:558\n74#1,7:566\n74#1,7:573\n73#1,8:580\n73#1,8:588\n73#1,8:596\n73#1,8:604\n74#1,7:612\n1#2:540\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:438,8\n95#1:446,8\n99#1:454,8\n107#1:462,8\n118#1:470,8\n134#1:478,8\n158#1:486,8\n163#1:494,8\n168#1:502,8\n172#1:510,8\n176#1:518,8\n184#1:526,8\n194#1:534,6\n194#1:541\n200#1:542,8\n204#1:550,8\n212#1:558,8\n220#1:566,7\n224#1:573,7\n230#1:580,8\n236#1:588,8\n240#1:596,8\n248#1:604,8\n257#1:612,7\n*E\n"})
/* loaded from: classes.dex */
public abstract class b<T extends b<T>> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f7922i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f7923j = -1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.e originalText;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long originalSelection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.ui.text.n0 layoutResult;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.input.p0 offsetMapping;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w0 state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long selection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.text.e annotatedString;

    public /* synthetic */ b(androidx.compose.ui.text.e eVar, long j4, androidx.compose.ui.text.n0 n0Var, androidx.compose.ui.text.input.p0 p0Var, w0 w0Var, kotlin.jvm.internal.w wVar) {
        this(eVar, j4, n0Var, p0Var, w0Var);
    }

    private final boolean C() {
        androidx.compose.ui.text.n0 n0Var = this.layoutResult;
        return (n0Var != null ? n0Var.y(c0()) : null) != androidx.compose.ui.text.style.i.Rtl;
    }

    private final int D(androidx.compose.ui.text.n0 n0Var, int i4) {
        int c02 = c0();
        if (this.state.getCachedX() == null) {
            this.state.c(Float.valueOf(n0Var.e(c02).t()));
        }
        int q4 = n0Var.q(c02) + i4;
        if (q4 < 0) {
            return 0;
        }
        if (q4 >= n0Var.n()) {
            return this.annotatedString.getText().length();
        }
        float m4 = n0Var.m(q4) - 1;
        Float cachedX = this.state.getCachedX();
        kotlin.jvm.internal.l0.m(cachedX);
        float floatValue = cachedX.floatValue();
        if ((C() && floatValue >= n0Var.t(q4)) || (!C() && floatValue <= n0Var.s(q4))) {
            return n0Var.o(q4, true);
        }
        return this.offsetMapping.a(n0Var.x(i0.g.a(cachedX.floatValue(), m4)));
    }

    private final T H() {
        int o4;
        this.state.b();
        if (this.annotatedString.getText().length() > 0 && (o4 = o()) != -1) {
            a0(o4, o4);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T J() {
        Integer p4;
        this.state.b();
        if (this.annotatedString.getText().length() > 0 && (p4 = p()) != null) {
            int intValue = p4.intValue();
            a0(intValue, intValue);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T K() {
        int v4;
        this.state.b();
        if (this.annotatedString.getText().length() > 0 && (v4 = v()) != -1) {
            a0(v4, v4);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T M() {
        Integer y4;
        this.state.b();
        if (this.annotatedString.getText().length() > 0 && (y4 = y()) != null) {
            int intValue = y4.intValue();
            a0(intValue, intValue);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public static b b(b bVar, Object obj, boolean z4, ld.l lVar, int i4, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        if (z4) {
            bVar.state.b();
        }
        if (bVar.annotatedString.getText().length() > 0) {
            lVar.invoke(obj);
        }
        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (b) obj;
    }

    private final int c(int offset) {
        int length = this.annotatedString.getText().length() - 1;
        return offset > length ? length : offset;
    }

    private final int c0() {
        return this.offsetMapping.b(androidx.compose.ui.text.t0.i(this.selection));
    }

    private final int d0() {
        return this.offsetMapping.b(androidx.compose.ui.text.t0.k(this.selection));
    }

    private final int e0() {
        return this.offsetMapping.b(androidx.compose.ui.text.t0.l(this.selection));
    }

    private final int j(androidx.compose.ui.text.n0 n0Var, int i4) {
        return this.offsetMapping.a(n0Var.o(n0Var.q(i4), true));
    }

    static /* synthetic */ int k(b bVar, androidx.compose.ui.text.n0 n0Var, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i5 & 1) != 0) {
            i4 = bVar.d0();
        }
        return bVar.j(n0Var, i4);
    }

    private final int m(androidx.compose.ui.text.n0 n0Var, int i4) {
        return this.offsetMapping.a(n0Var.u(n0Var.q(i4)));
    }

    static /* synthetic */ int n(b bVar, androidx.compose.ui.text.n0 n0Var, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i5 & 1) != 0) {
            i4 = bVar.e0();
        }
        return bVar.m(n0Var, i4);
    }

    private final int q(androidx.compose.ui.text.n0 n0Var, int i4) {
        while (i4 < this.originalText.length()) {
            long C = n0Var.C(c(i4));
            if (androidx.compose.ui.text.t0.i(C) > i4) {
                return this.offsetMapping.a((int) (C & 4294967295L));
            }
            i4++;
        }
        return this.originalText.length();
    }

    static /* synthetic */ int r(b bVar, androidx.compose.ui.text.n0 n0Var, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i5 & 1) != 0) {
            i4 = bVar.c0();
        }
        return bVar.q(n0Var, i4);
    }

    private final int w(androidx.compose.ui.text.n0 n0Var, int i4) {
        while (i4 > 0) {
            long C = n0Var.C(c(i4));
            if (androidx.compose.ui.text.t0.n(C) < i4) {
                return this.offsetMapping.a((int) (C >> 32));
            }
            i4--;
        }
        return 0;
    }

    static /* synthetic */ int x(b bVar, androidx.compose.ui.text.n0 n0Var, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i5 & 1) != 0) {
            i4 = bVar.c0();
        }
        return bVar.w(n0Var, i4);
    }

    @fg.l
    /* renamed from: A, reason: from getter */
    public final w0 getState() {
        return this.state;
    }

    @fg.l
    public final String B() {
        return this.annotatedString.getText();
    }

    @fg.l
    public final T E() {
        androidx.compose.ui.text.n0 n0Var;
        if (this.annotatedString.getText().length() > 0 && (n0Var = this.layoutResult) != null) {
            int D = D(n0Var, 1);
            a0(D, D);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T F() {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            if (C()) {
                K();
            } else {
                H();
            }
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T G() {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            if (C()) {
                M();
            } else {
                J();
            }
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T I() {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            int a5 = androidx.compose.foundation.text.j0.a(this.annotatedString.getText(), androidx.compose.ui.text.t0.k(this.selection));
            if (a5 == androidx.compose.ui.text.t0.k(this.selection) && a5 != this.annotatedString.getText().length()) {
                a5 = androidx.compose.foundation.text.j0.a(this.annotatedString.getText(), a5 + 1);
            }
            a0(a5, a5);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T L() {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            int b5 = androidx.compose.foundation.text.j0.b(this.annotatedString.getText(), androidx.compose.ui.text.t0.l(this.selection));
            if (b5 == androidx.compose.ui.text.t0.l(this.selection) && b5 != 0) {
                b5 = androidx.compose.foundation.text.j0.b(this.annotatedString.getText(), b5 - 1);
            }
            a0(b5, b5);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T N() {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            if (C()) {
                H();
            } else {
                K();
            }
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T O() {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            if (C()) {
                J();
            } else {
                M();
            }
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T P() {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            int length = this.annotatedString.getText().length();
            a0(length, length);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T Q() {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            a0(0, 0);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T R() {
        Integer i4;
        this.state.b();
        if (this.annotatedString.getText().length() > 0 && (i4 = i()) != null) {
            int intValue = i4.intValue();
            a0(intValue, intValue);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T S() {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            if (C()) {
                U();
            } else {
                R();
            }
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T T() {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            if (C()) {
                R();
            } else {
                U();
            }
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T U() {
        Integer l4;
        this.state.b();
        if (this.annotatedString.getText().length() > 0 && (l4 = l()) != null) {
            int intValue = l4.intValue();
            a0(intValue, intValue);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T V() {
        androidx.compose.ui.text.n0 n0Var;
        if (this.annotatedString.getText().length() > 0 && (n0Var = this.layoutResult) != null) {
            int D = D(n0Var, -1);
            a0(D, D);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T W() {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            a0(0, this.annotatedString.getText().length());
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T X() {
        if (this.annotatedString.getText().length() > 0) {
            this.selection = androidx.compose.ui.text.u0.b(androidx.compose.ui.text.t0.n(this.originalSelection), (int) (this.selection & 4294967295L));
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void Y(@fg.l androidx.compose.ui.text.e eVar) {
        this.annotatedString = eVar;
    }

    protected final void Z(int offset) {
        a0(offset, offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    protected final <U> T a(U u4, boolean z4, @fg.l ld.l<? super U, k2> lVar) {
        if (z4) {
            this.state.b();
        }
        if (this.annotatedString.getText().length() > 0) {
            lVar.invoke(u4);
        }
        kotlin.jvm.internal.l0.n(u4, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u4;
    }

    protected final void a0(int start, int end) {
        this.selection = androidx.compose.ui.text.u0.b(start, end);
    }

    public final void b0(long j4) {
        this.selection = j4;
    }

    @fg.l
    public final T d(@fg.l ld.l<? super T, k2> or) {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            if (androidx.compose.ui.text.t0.h(this.selection)) {
                kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                or.invoke(this);
            } else if (C()) {
                int l4 = androidx.compose.ui.text.t0.l(this.selection);
                a0(l4, l4);
            } else {
                int k4 = androidx.compose.ui.text.t0.k(this.selection);
                a0(k4, k4);
            }
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T e(@fg.l ld.l<? super T, k2> or) {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            if (androidx.compose.ui.text.t0.h(this.selection)) {
                kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                or.invoke(this);
            } else if (C()) {
                int k4 = androidx.compose.ui.text.t0.k(this.selection);
                a0(k4, k4);
            } else {
                int l4 = androidx.compose.ui.text.t0.l(this.selection);
                a0(l4, l4);
            }
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final T f() {
        this.state.b();
        if (this.annotatedString.getText().length() > 0) {
            int i4 = androidx.compose.ui.text.t0.i(this.selection);
            a0(i4, i4);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final androidx.compose.ui.text.e getAnnotatedString() {
        return this.annotatedString;
    }

    @fg.m
    /* renamed from: h, reason: from getter */
    public final androidx.compose.ui.text.n0 getLayoutResult() {
        return this.layoutResult;
    }

    @fg.m
    public final Integer i() {
        androidx.compose.ui.text.n0 n0Var = this.layoutResult;
        if (n0Var != null) {
            return Integer.valueOf(k(this, n0Var, 0, 1, null));
        }
        return null;
    }

    @fg.m
    public final Integer l() {
        androidx.compose.ui.text.n0 n0Var = this.layoutResult;
        if (n0Var != null) {
            return Integer.valueOf(n(this, n0Var, 0, 1, null));
        }
        return null;
    }

    public final int o() {
        return androidx.compose.foundation.text.k0.a(this.annotatedString.getText(), androidx.compose.ui.text.t0.i(this.selection));
    }

    @fg.m
    public final Integer p() {
        androidx.compose.ui.text.n0 n0Var = this.layoutResult;
        if (n0Var != null) {
            return Integer.valueOf(r(this, n0Var, 0, 1, null));
        }
        return null;
    }

    @fg.l
    /* renamed from: s, reason: from getter */
    public final androidx.compose.ui.text.input.p0 getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: t, reason: from getter */
    public final long getOriginalSelection() {
        return this.originalSelection;
    }

    @fg.l
    /* renamed from: u, reason: from getter */
    public final androidx.compose.ui.text.e getOriginalText() {
        return this.originalText;
    }

    public final int v() {
        return androidx.compose.foundation.text.k0.b(this.annotatedString.getText(), androidx.compose.ui.text.t0.i(this.selection));
    }

    @fg.m
    public final Integer y() {
        androidx.compose.ui.text.n0 n0Var = this.layoutResult;
        if (n0Var != null) {
            return Integer.valueOf(x(this, n0Var, 0, 1, null));
        }
        return null;
    }

    /* renamed from: z, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    private b(androidx.compose.ui.text.e eVar, long j4, androidx.compose.ui.text.n0 n0Var, androidx.compose.ui.text.input.p0 p0Var, w0 w0Var) {
        this.originalText = eVar;
        this.originalSelection = j4;
        this.layoutResult = n0Var;
        this.offsetMapping = p0Var;
        this.state = w0Var;
        this.selection = j4;
        this.annotatedString = eVar;
    }
}
