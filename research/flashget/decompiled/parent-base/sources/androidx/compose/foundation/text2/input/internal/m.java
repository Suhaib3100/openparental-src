package androidx.compose.foundation.text2.input.internal;

import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u0000 92\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u000fJ\u001d\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u000fJ\u001d\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u000fJ\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0017\u0010*\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010)R*\u00101\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u00104\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R$\u00107\u001a\u00020\n2\u0006\u00105\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b6\u0010.R$\u0010:\u001a\u00020\n2\u0006\u00105\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010.R\u0019\u0010<\u001a\u0004\u0018\u00010\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b8\u0010;R\u0017\u0010\u0005\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b=\u0010>R$\u0010?\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010.\"\u0004\bA\u00100R\u0011\u0010C\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bB\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m;", "", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/t0;", "selection", "<init>", "(Landroidx/compose/ui/text/e;JLkotlin/jvm/internal/w;)V", "", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "", "start", "end", "Lkotlin/k2;", "a", "(II)V", "", "n", "()Z", "index", "", "d", "(I)C", "", "o", "(IILjava/lang/CharSequence;)V", "c", "r", "p", "b", "()V", "toString", "()Ljava/lang/String;", "u", "()Landroidx/compose/ui/text/e;", "Landroidx/compose/foundation/text2/input/internal/t;", "Landroidx/compose/foundation/text2/input/internal/t;", "gapBuffer", "Landroidx/compose/foundation/text2/input/internal/e;", "Landroidx/compose/foundation/text2/input/internal/e;", "e", "()Landroidx/compose/foundation/text2/input/internal/e;", "changeTracker", "value", "I", "m", "()I", "t", "(I)V", "selectionStart", "l", "s", "selectionEnd", "<set-?>", "h", "compositionStart", "f", "g", "compositionEnd", "()Landroidx/compose/ui/text/t0;", "composition", "k", "()J", "cursor", "i", "q", "j", "length", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/foundation/text2/input/internal/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes.dex */
public final class m {

    /* renamed from: h, reason: collision with root package name */
    public static final int f8687h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final int f8688i = -1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t gapBuffer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e changeTracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int selectionStart;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int selectionEnd;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int compositionStart;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int compositionEnd;

    public /* synthetic */ m(androidx.compose.ui.text.e eVar, long j4, kotlin.jvm.internal.w wVar) {
        this(eVar, j4);
    }

    private final void a(int start, int end) {
        if (start < 0 || start > this.gapBuffer.e()) {
            StringBuilder a5 = androidx.collection.s.a("start (", start, ") offset is outside of text region ");
            a5.append(this.gapBuffer.e());
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (end < 0 || end > this.gapBuffer.e()) {
            StringBuilder a6 = androidx.collection.s.a("end (", end, ") offset is outside of text region ");
            a6.append(this.gapBuffer.e());
            throw new IndexOutOfBoundsException(a6.toString());
        }
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

    public final void b() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void c(int start, int end) {
        a(start, end);
        long b5 = u0.b(start, end);
        this.changeTracker.f(start, end, 0);
        t.g(this.gapBuffer, t0.l(b5), t0.k(b5), "", 0, 0, 24, null);
        long a5 = n.a(u0.b(this.selectionStart, this.selectionEnd), b5);
        t((int) (a5 >> 32));
        s((int) (a5 & 4294967295L));
        if (n()) {
            long a6 = n.a(u0.b(this.compositionStart, this.compositionEnd), b5);
            if (t0.h(a6)) {
                b();
            } else {
                this.compositionStart = t0.l(a6);
                this.compositionEnd = t0.k(a6);
            }
        }
    }

    public final char d(int index) {
        return this.gapBuffer.a(index);
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final e getChangeTracker() {
        return this.changeTracker;
    }

    @fg.m
    public final t0 f() {
        if (n()) {
            return t0.b(u0.b(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* renamed from: g, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    /* renamed from: h, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int i() {
        int i4 = this.selectionStart;
        int i5 = this.selectionEnd;
        if (i4 == i5) {
            return i5;
        }
        return -1;
    }

    public final int j() {
        return this.gapBuffer.e();
    }

    public final long k() {
        return u0.b(this.selectionStart, this.selectionEnd);
    }

    /* renamed from: l, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* renamed from: m, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final boolean n() {
        return this.compositionStart != -1;
    }

    public final void o(int start, int end, @fg.l CharSequence text) {
        a(start, end);
        int min = Math.min(start, end);
        int max = Math.max(start, end);
        int i4 = 0;
        int i5 = min;
        while (i5 < max && i4 < text.length() && text.charAt(i4) == this.gapBuffer.a(i5)) {
            i4++;
            i5++;
        }
        int length = text.length();
        int i6 = max;
        while (i6 > min && length > i4 && text.charAt(length - 1) == this.gapBuffer.a(i6 - 1)) {
            length--;
            i6--;
        }
        this.changeTracker.f(i5, i6, length - i4);
        t.g(this.gapBuffer, min, max, text, 0, 0, 24, null);
        t(text.length() + min);
        s(text.length() + min);
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void p(int start, int end) {
        if (start < 0 || start > this.gapBuffer.e()) {
            StringBuilder a5 = androidx.collection.s.a("start (", start, ") offset is outside of text region ");
            a5.append(this.gapBuffer.e());
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (end < 0 || end > this.gapBuffer.e()) {
            StringBuilder a6 = androidx.collection.s.a("end (", end, ") offset is outside of text region ");
            a6.append(this.gapBuffer.e());
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
        int I = kotlin.ranges.s.I(start, 0, this.gapBuffer.e());
        int I2 = kotlin.ranges.s.I(end, 0, this.gapBuffer.e());
        t(I);
        s(I2);
    }

    @fg.l
    public String toString() {
        return this.gapBuffer.toString();
    }

    @fg.l
    public final androidx.compose.ui.text.e u() {
        return new androidx.compose.ui.text.e(this.gapBuffer.toString(), null, null, 6, null);
    }

    public /* synthetic */ m(String str, long j4, kotlin.jvm.internal.w wVar) {
        this(str, j4);
    }

    private m(androidx.compose.ui.text.e eVar, long j4) {
        this.gapBuffer = new t(eVar.getText());
        this.changeTracker = new e(null, 1, null);
        this.selectionStart = t0.n(j4);
        int i4 = (int) (4294967295L & j4);
        this.selectionEnd = i4;
        this.compositionStart = -1;
        this.compositionEnd = -1;
        a((int) (j4 >> 32), i4);
    }

    private m(String str, long j4) {
        this(new androidx.compose.ui.text.e(str, null, null, 6, null), j4);
    }
}
