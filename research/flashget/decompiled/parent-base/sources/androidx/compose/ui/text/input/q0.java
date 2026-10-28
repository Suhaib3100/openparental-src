package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* compiled from: GapBuffer.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@androidx.compose.ui.text.l
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0005R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/input/q0;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "", "start", "end", "Lkotlin/k2;", "d", "(IILjava/lang/String;)V", "index", "", "a", "(I)C", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "c", "e", "Landroidx/compose/ui/text/input/v;", "b", "Landroidx/compose/ui/text/input/v;", "buffer", "I", "bufStart", "bufEnd", "()I", "length", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f21082f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f21083g = 255;

    /* renamed from: h, reason: collision with root package name */
    public static final int f21084h = 64;

    /* renamed from: i, reason: collision with root package name */
    public static final int f21085i = -1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private String text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private v buffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int bufStart = -1;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int bufEnd = -1;

    public q0(@fg.l String str) {
        this.text = str;
    }

    public final char a(int index) {
        v vVar = this.buffer;
        if (vVar == null) {
            return this.text.charAt(index);
        }
        if (index < this.bufStart) {
            return this.text.charAt(index);
        }
        int e4 = vVar.e();
        int i4 = this.bufStart;
        return index < e4 + i4 ? vVar.d(index - i4) : this.text.charAt(index - ((e4 - this.bufEnd) + i4));
    }

    public final int b() {
        v vVar = this.buffer;
        return vVar == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + vVar.e();
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final void d(int start, int end, @fg.l String text) {
        if (start > end) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a("start index must be less than or equal to end index: ", start, " > ", end).toString());
        }
        if (start < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("start must be non-negative, but was ", start).toString());
        }
        v vVar = this.buffer;
        if (vVar != null) {
            int i4 = this.bufStart;
            int i5 = start - i4;
            int i6 = end - i4;
            if (i5 >= 0 && i6 <= vVar.e()) {
                vVar.g(i5, i6, text);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            d(start, end, text);
            return;
        }
        int max = Math.max(255, text.length() + 128);
        char[] cArr = new char[max];
        int min = Math.min(start, 64);
        int min2 = Math.min(this.text.length() - end, 64);
        int i7 = start - min;
        x.a(this.text, cArr, 0, i7, start);
        int i10 = max - min2;
        int i11 = min2 + end;
        x.a(this.text, cArr, i10, end, i11);
        w.b(text, cArr, min);
        this.buffer = new v(cArr, text.length() + min, i10);
        this.bufStart = i7;
        this.bufEnd = i11;
    }

    public final void e(@fg.l String str) {
        this.text = str;
    }

    @fg.l
    public String toString() {
        v vVar = this.buffer;
        if (vVar == null) {
            return this.text;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.text, 0, this.bufStart);
        vVar.a(sb);
        String str = this.text;
        sb.append((CharSequence) str, this.bufEnd, str.length());
        return sb.toString();
    }
}
