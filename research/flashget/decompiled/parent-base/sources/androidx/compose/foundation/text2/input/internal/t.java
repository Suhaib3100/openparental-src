package androidx.compose.foundation.text2.input.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: GapBuffer.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J9\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0016\u0010%\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010'\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Landroidx/compose/foundation/text2/input/internal/t;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "", "start", "end", "textStart", "textEnd", "Lkotlin/k2;", "f", "(IILjava/lang/CharSequence;II)V", "index", "", "a", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "toString", "()Ljava/lang/String;", "other", "", "d", "(Ljava/lang/CharSequence;)Z", "b", "Ljava/lang/CharSequence;", "Landroidx/compose/foundation/text2/input/internal/p;", "c", "Landroidx/compose/foundation/text2/input/internal/p;", "buffer", "I", "bufStart", "e", "bufEnd", "()I", "length", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text2/input/internal/PartialGapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
/* loaded from: classes.dex */
public final class t implements CharSequence {

    /* renamed from: g, reason: collision with root package name */
    public static final int f8951g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final int f8952h = 255;

    /* renamed from: i, reason: collision with root package name */
    public static final int f8953i = 64;

    /* renamed from: j, reason: collision with root package name */
    public static final int f8954j = -1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private CharSequence text;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p buffer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int bufStart = -1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int bufEnd = -1;

    public t(@fg.l CharSequence charSequence) {
        this.text = charSequence;
    }

    public static /* synthetic */ void g(t tVar, int i4, int i5, CharSequence charSequence, int i6, int i7, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            i6 = 0;
        }
        int i11 = i6;
        if ((i10 & 16) != 0) {
            i7 = charSequence.length();
        }
        tVar.f(i4, i5, charSequence, i11, i7);
    }

    public char a(int index) {
        p pVar = this.buffer;
        if (pVar == null) {
            return this.text.charAt(index);
        }
        if (index < this.bufStart) {
            return this.text.charAt(index);
        }
        int e4 = pVar.e();
        int i4 = this.bufStart;
        return index < e4 + i4 ? pVar.d(index - i4) : this.text.charAt(index - ((e4 - this.bufEnd) + i4));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i4) {
        return a(i4);
    }

    public final boolean d(@fg.l CharSequence other) {
        return kotlin.jvm.internal.l0.g(toString(), other.toString());
    }

    public int e() {
        p pVar = this.buffer;
        return pVar == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + pVar.e();
    }

    public final void f(int start, int end, @fg.l CharSequence text, int textStart, int textEnd) {
        if (start > end) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a("start=", start, " > end=", end).toString());
        }
        if (textStart > textEnd) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a("textStart=", textStart, " > textEnd=", textEnd).toString());
        }
        if (start < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("start must be non-negative, but was ", start).toString());
        }
        if (textStart < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("textStart must be non-negative, but was ", textStart).toString());
        }
        p pVar = this.buffer;
        int i4 = textEnd - textStart;
        if (pVar != null) {
            int i5 = this.bufStart;
            int i6 = start - i5;
            int i7 = end - i5;
            if (i6 >= 0 && i7 <= pVar.e()) {
                pVar.g(i6, i7, text, textStart, textEnd);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            f(start, end, text, textStart, textEnd);
            return;
        }
        int max = Math.max(255, i4 + 128);
        char[] cArr = new char[max];
        int min = Math.min(start, 64);
        int min2 = Math.min(this.text.length() - end, 64);
        int i10 = start - min;
        l0.a(this.text, cArr, 0, i10, start);
        int i11 = max - min2;
        int i12 = min2 + end;
        l0.a(this.text, cArr, i11, end, i12);
        l0.a(text, cArr, min, textStart, textEnd);
        this.buffer = new p(cArr, min + i4, i11);
        this.bufStart = i10;
        this.bufEnd = i12;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return e();
    }

    @Override // java.lang.CharSequence
    @fg.l
    public CharSequence subSequence(int startIndex, int endIndex) {
        return toString().subSequence(startIndex, endIndex);
    }

    @Override // java.lang.CharSequence
    @fg.l
    public String toString() {
        p pVar = this.buffer;
        if (pVar == null) {
            return this.text.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.text, 0, this.bufStart);
        pVar.a(sb);
        CharSequence charSequence = this.text;
        sb.append(charSequence, this.bufEnd, charSequence.length());
        return sb.toString();
    }
}
