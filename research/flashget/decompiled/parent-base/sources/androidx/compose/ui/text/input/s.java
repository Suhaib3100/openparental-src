package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 52\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0080\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R*\u0010-\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u00100\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R$\u00103\u001a\u00020\r2\u0006\u00101\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b2\u0010*R$\u00106\u001a\u00020\r2\u0006\u00101\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010*R\u001c\u00108\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b4\u00107R\u001a\u0010\u0005\u001a\u00020\u00048@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b9\u0010:R$\u0010;\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b<\u0010*\"\u0004\b=\u0010,R\u0014\u0010?\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/ui/text/input/s;", "", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/t0;", "selection", "<init>", "(Landroidx/compose/ui/text/e;JLkotlin/jvm/internal/w;)V", "", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "", "m", "()Z", "", "index", "", "d", "(I)C", "start", "end", "Lkotlin/k2;", "n", "(IILandroidx/compose/ui/text/e;)V", "o", "(IILjava/lang/String;)V", "c", "(II)V", "r", "p", "a", "()V", "b", "toString", "()Ljava/lang/String;", "u", "()Landroidx/compose/ui/text/e;", "Landroidx/compose/ui/text/input/q0;", "Landroidx/compose/ui/text/input/q0;", "gapBuffer", "value", "I", "l", "()I", "t", "(I)V", "selectionStart", "k", "s", "selectionEnd", "<set-?>", "g", "compositionStart", "e", "f", "compositionEnd", "()Landroidx/compose/ui/text/t0;", "composition", "j", "()J", "cursor", "h", "q", "i", "length", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
/* loaded from: classes.dex */
public final class s {

    /* renamed from: g, reason: collision with root package name */
    public static final int f21098g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final int f21099h = -1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q0 gapBuffer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int selectionStart;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int selectionEnd;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int compositionStart;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int compositionEnd;

    public /* synthetic */ s(androidx.compose.ui.text.e eVar, long j4, kotlin.jvm.internal.w wVar) {
        this(eVar, j4);
    }

    private final void s(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Cannot set selectionEnd to a negative value: ", i4).toString());
        }
        this.selectionEnd = i4;
    }

    private final void t(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Cannot set selectionStart to a negative value: ", i4).toString());
        }
        this.selectionStart = i4;
    }

    public final void a() {
        o(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void b() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void c(int start, int end) {
        long b5 = androidx.compose.ui.text.u0.b(start, end);
        this.gapBuffer.d(start, end, "");
        long a5 = t.a(androidx.compose.ui.text.u0.b(this.selectionStart, this.selectionEnd), b5);
        t(androidx.compose.ui.text.t0.l(a5));
        s(androidx.compose.ui.text.t0.k(a5));
        if (m()) {
            long a6 = t.a(androidx.compose.ui.text.u0.b(this.compositionStart, this.compositionEnd), b5);
            if (androidx.compose.ui.text.t0.h(a6)) {
                b();
            } else {
                this.compositionStart = androidx.compose.ui.text.t0.l(a6);
                this.compositionEnd = androidx.compose.ui.text.t0.k(a6);
            }
        }
    }

    public final char d(int index) {
        return this.gapBuffer.a(index);
    }

    @fg.m
    public final androidx.compose.ui.text.t0 e() {
        if (m()) {
            return androidx.compose.ui.text.t0.b(androidx.compose.ui.text.u0.b(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* renamed from: f, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    /* renamed from: g, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int h() {
        int i4 = this.selectionStart;
        int i5 = this.selectionEnd;
        if (i4 == i5) {
            return i5;
        }
        return -1;
    }

    public final int i() {
        return this.gapBuffer.b();
    }

    public final long j() {
        return androidx.compose.ui.text.u0.b(this.selectionStart, this.selectionEnd);
    }

    /* renamed from: k, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* renamed from: l, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final boolean m() {
        return this.compositionStart != -1;
    }

    public final void n(int start, int end, @fg.l androidx.compose.ui.text.e text) {
        o(start, end, text.getText());
    }

    public final void o(int start, int end, @fg.l String text) {
        if (start < 0 || start > this.gapBuffer.b()) {
            StringBuilder a5 = androidx.collection.s.a("start (", start, ") offset is outside of text region ");
            a5.append(this.gapBuffer.b());
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            StringBuilder a6 = androidx.collection.s.a("end (", end, ") offset is outside of text region ");
            a6.append(this.gapBuffer.b());
            throw new IndexOutOfBoundsException(a6.toString());
        }
        if (start > end) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a("Do not set reversed range: ", start, " > ", end));
        }
        this.gapBuffer.d(start, end, text);
        t(text.length() + start);
        s(text.length() + start);
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void p(int start, int end) {
        if (start < 0 || start > this.gapBuffer.b()) {
            StringBuilder a5 = androidx.collection.s.a("start (", start, ") offset is outside of text region ");
            a5.append(this.gapBuffer.b());
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            StringBuilder a6 = androidx.collection.s.a("end (", end, ") offset is outside of text region ");
            a6.append(this.gapBuffer.b());
            throw new IndexOutOfBoundsException(a6.toString());
        }
        if (start >= end) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a("Do not set reversed or empty range: ", start, " > ", end));
        }
        this.compositionStart = start;
        this.compositionEnd = end;
    }

    public final void q(int i4) {
        r(i4, i4);
    }

    public final void r(int start, int end) {
        if (start < 0 || start > this.gapBuffer.b()) {
            StringBuilder a5 = androidx.collection.s.a("start (", start, ") offset is outside of text region ");
            a5.append(this.gapBuffer.b());
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            StringBuilder a6 = androidx.collection.s.a("end (", end, ") offset is outside of text region ");
            a6.append(this.gapBuffer.b());
            throw new IndexOutOfBoundsException(a6.toString());
        }
        if (start > end) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a("Do not set reversed range: ", start, " > ", end));
        }
        t(start);
        s(end);
    }

    @fg.l
    public String toString() {
        return this.gapBuffer.toString();
    }

    @fg.l
    public final androidx.compose.ui.text.e u() {
        return new androidx.compose.ui.text.e(this.gapBuffer.toString(), null, null, 6, null);
    }

    public /* synthetic */ s(String str, long j4, kotlin.jvm.internal.w wVar) {
        this(str, j4);
    }

    private s(androidx.compose.ui.text.e eVar, long j4) {
        this.gapBuffer = new q0(eVar.getText());
        this.selectionStart = androidx.compose.ui.text.t0.l(j4);
        this.selectionEnd = androidx.compose.ui.text.t0.k(j4);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int l4 = androidx.compose.ui.text.t0.l(j4);
        int k4 = androidx.compose.ui.text.t0.k(j4);
        if (l4 >= 0 && l4 <= eVar.length()) {
            if (k4 < 0 || k4 > eVar.length()) {
                StringBuilder a5 = androidx.collection.s.a("end (", k4, ") offset is outside of text region ");
                a5.append(eVar.length());
                throw new IndexOutOfBoundsException(a5.toString());
            }
            if (l4 > k4) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.q.a("Do not set reversed range: ", l4, " > ", k4));
            }
            return;
        }
        StringBuilder a6 = androidx.collection.s.a("start (", l4, ") offset is outside of text region ");
        a6.append(eVar.length());
        throw new IndexOutOfBoundsException(a6.toString());
    }

    private s(String str, long j4) {
        this(new androidx.compose.ui.text.e(str, null, null, 6, null), j4);
    }
}
