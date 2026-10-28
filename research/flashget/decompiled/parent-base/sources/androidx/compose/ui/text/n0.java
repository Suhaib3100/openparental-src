package androidx.compose.ui.text;

import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.l6;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TextLayoutResult.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\rJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b%\u0010$J\u0018\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b0\u0010,J\u001d\u00104\u001a\u0002032\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n¢\u0006\u0004\b4\u00105J$\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\u000e2\b\u00108\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010M\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b+\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010O\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b0\u0010J\u001a\u0004\bN\u0010LR\u001f\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bQ\u0010VR\u0011\u0010Y\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0011\u0010[\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bZ\u0010VR\u0011\u0010]\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\\\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/ui/text/n0;", "", "Landroidx/compose/ui/text/m0;", "layoutInput", "Landroidx/compose/ui/text/o;", "multiParagraph", "Landroidx/compose/ui/unit/u;", "size", "<init>", "(Landroidx/compose/ui/text/m0;Landroidx/compose/ui/text/o;JLkotlin/jvm/internal/w;)V", "", "lineIndex", "u", "(I)I", "", "visibleEnd", "o", "(IZ)I", "D", "(I)Z", "", "v", "(I)F", "m", "s", "t", "offset", "q", "vertical", "r", "(F)I", "usePrimaryDirection", "j", "(IZ)F", "Landroidx/compose/ui/text/style/i;", "y", "(I)Landroidx/compose/ui/text/style/i;", "c", "Li0/f;", "position", "x", "(J)I", "Li0/i;", "d", "(I)Li0/i;", "Landroidx/compose/ui/text/t0;", "C", "(I)J", "e", "start", "end", "Landroidx/compose/ui/graphics/g5;", "z", "(II)Landroidx/compose/ui/graphics/g5;", "a", "(Landroidx/compose/ui/text/m0;J)Landroidx/compose/ui/text/n0;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/m0;", "l", "()Landroidx/compose/ui/text/m0;", "b", "Landroidx/compose/ui/text/o;", "w", "()Landroidx/compose/ui/text/o;", "J", "B", "()J", "F", "h", "()F", "firstBaseline", "k", "lastBaseline", "", "f", "Ljava/util/List;", "A", "()Ljava/util/List;", "placeholderRects", "()Z", "didOverflowHeight", "g", "didOverflowWidth", "i", "hasVisualOverflow", "n", "lineCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f21188g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0 layoutInput;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o multiParagraph;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float firstBaseline;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float lastBaseline;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<i0.i> placeholderRects;

    public /* synthetic */ n0(m0 m0Var, o oVar, long j4, kotlin.jvm.internal.w wVar) {
        this(m0Var, oVar, j4);
    }

    public static /* synthetic */ n0 b(n0 n0Var, m0 m0Var, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            m0Var = n0Var.layoutInput;
        }
        if ((i4 & 2) != 0) {
            j4 = n0Var.size;
        }
        return n0Var.a(m0Var, j4);
    }

    public static int p(n0 n0Var, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return n0Var.multiParagraph.n(i4, z4);
    }

    @fg.l
    public final List<i0.i> A() {
        return this.placeholderRects;
    }

    /* renamed from: B, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final long C(int offset) {
        return this.multiParagraph.G(offset);
    }

    public final boolean D(int lineIndex) {
        return this.multiParagraph.H(lineIndex);
    }

    @fg.l
    public final n0 a(@fg.l m0 layoutInput, long size) {
        return new n0(layoutInput, this.multiParagraph, size);
    }

    @fg.l
    public final androidx.compose.ui.text.style.i c(int offset) {
        return this.multiParagraph.c(offset);
    }

    @fg.l
    public final i0.i d(int offset) {
        return this.multiParagraph.d(offset);
    }

    @fg.l
    public final i0.i e(int offset) {
        return this.multiParagraph.e(offset);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) other;
        return kotlin.jvm.internal.l0.g(this.layoutInput, n0Var.layoutInput) && kotlin.jvm.internal.l0.g(this.multiParagraph, n0Var.multiParagraph) && androidx.compose.ui.unit.u.h(this.size, n0Var.size) && this.firstBaseline == n0Var.firstBaseline && this.lastBaseline == n0Var.lastBaseline && kotlin.jvm.internal.l0.g(this.placeholderRects, n0Var.placeholderRects);
    }

    public final boolean f() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) androidx.compose.ui.unit.u.j(this.size)) < this.multiParagraph.getHeight();
    }

    public final boolean g() {
        return ((float) androidx.compose.ui.unit.u.m(this.size)) < this.multiParagraph.getWidth();
    }

    /* renamed from: h, reason: from getter */
    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public int hashCode() {
        return this.placeholderRects.hashCode() + androidx.compose.animation.l0.a(this.lastBaseline, androidx.compose.animation.l0.a(this.firstBaseline, (androidx.compose.ui.unit.u.n(this.size) + ((this.multiParagraph.hashCode() + (this.layoutInput.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int offset, boolean usePrimaryDirection) {
        return this.multiParagraph.i(offset, usePrimaryDirection);
    }

    /* renamed from: k, reason: from getter */
    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final m0 getLayoutInput() {
        return this.layoutInput;
    }

    public final float m(int lineIndex) {
        return this.multiParagraph.l(lineIndex);
    }

    public final int n() {
        return this.multiParagraph.getLineCount();
    }

    public final int o(int lineIndex, boolean visibleEnd) {
        return this.multiParagraph.n(lineIndex, visibleEnd);
    }

    public final int q(int offset) {
        return this.multiParagraph.p(offset);
    }

    public final int r(float vertical) {
        return this.multiParagraph.q(vertical);
    }

    public final float s(int lineIndex) {
        return this.multiParagraph.s(lineIndex);
    }

    public final float t(int lineIndex) {
        return this.multiParagraph.t(lineIndex);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutResult(layoutInput=");
        sb.append(this.layoutInput);
        sb.append(", multiParagraph=");
        sb.append(this.multiParagraph);
        sb.append(", size=");
        sb.append((Object) androidx.compose.ui.unit.u.p(this.size));
        sb.append(", firstBaseline=");
        sb.append(this.firstBaseline);
        sb.append(", lastBaseline=");
        sb.append(this.lastBaseline);
        sb.append(", placeholderRects=");
        return l6.a(sb, this.placeholderRects, ')');
    }

    public final int u(int lineIndex) {
        return this.multiParagraph.u(lineIndex);
    }

    public final float v(int lineIndex) {
        return this.multiParagraph.v(lineIndex);
    }

    @fg.l
    /* renamed from: w, reason: from getter */
    public final o getMultiParagraph() {
        return this.multiParagraph;
    }

    public final int x(long position) {
        return this.multiParagraph.A(position);
    }

    @fg.l
    public final androidx.compose.ui.text.style.i y(int offset) {
        return this.multiParagraph.B(offset);
    }

    @fg.l
    public final g5 z(int start, int end) {
        return this.multiParagraph.D(start, end);
    }

    private n0(m0 m0Var, o oVar, long j4) {
        this.layoutInput = m0Var;
        this.multiParagraph = oVar;
        this.size = j4;
        this.firstBaseline = oVar.g();
        this.lastBaseline = oVar.k();
        this.placeholderRects = oVar.E();
    }
}
