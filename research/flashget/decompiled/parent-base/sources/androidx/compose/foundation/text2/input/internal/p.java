package androidx.compose.foundation.text2.input.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: GapBuffer.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010 \u001a\u00020\f2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\nJ\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010&R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010&R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010&¨\u0006,"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/p;", "", "", "initBuffer", "", "initGapStart", "initGapEnd", "<init>", "([CII)V", "c", "()I", "requestSize", "Lkotlin/k2;", "f", "(I)V", "start", "end", "b", "(II)V", "index", "", "d", "(I)C", "", "text", "textStart", "textEnd", "g", "(IILjava/lang/CharSequence;II)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "a", "(Ljava/lang/StringBuilder;)V", "e", "", "toString", "()Ljava/lang/String;", "I", "capacity", "[C", "buffer", "gapStart", "gapEnd", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text2/input/internal/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
/* loaded from: classes.dex */
final class p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int capacity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private char[] buffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int gapStart;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int gapEnd;

    public p(@fg.l char[] cArr, int i4, int i5) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i4;
        this.gapEnd = i5;
    }

    private final void b(int start, int end) {
        int i4 = this.gapStart;
        if (start < i4 && end <= i4) {
            int i5 = i4 - end;
            char[] cArr = this.buffer;
            kotlin.collections.l.w0(cArr, cArr, this.gapEnd - i5, end, i4);
            this.gapStart = start;
            this.gapEnd -= i5;
            return;
        }
        if (start < i4 && end >= i4) {
            this.gapEnd = end + c();
            this.gapStart = start;
            return;
        }
        int c5 = start + c();
        int c6 = end + c();
        int i6 = this.gapEnd;
        char[] cArr2 = this.buffer;
        kotlin.collections.l.w0(cArr2, cArr2, this.gapStart, i6, c5);
        this.gapStart += c5 - i6;
        this.gapEnd = c6;
    }

    private final int c() {
        return this.gapEnd - this.gapStart;
    }

    private final void f(int requestSize) {
        if (requestSize <= c()) {
            return;
        }
        int c5 = requestSize - c();
        int i4 = this.capacity;
        do {
            i4 *= 2;
        } while (i4 - this.capacity < c5);
        char[] cArr = new char[i4];
        kotlin.collections.l.w0(this.buffer, cArr, 0, 0, this.gapStart);
        int i5 = this.capacity;
        int i6 = this.gapEnd;
        int i7 = i5 - i6;
        int i10 = i4 - i7;
        kotlin.collections.l.w0(this.buffer, cArr, i10, i6, i7 + i6);
        this.buffer = cArr;
        this.capacity = i4;
        this.gapEnd = i10;
    }

    public static /* synthetic */ void h(p pVar, int i4, int i5, CharSequence charSequence, int i6, int i7, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            i6 = 0;
        }
        int i11 = i6;
        if ((i10 & 16) != 0) {
            i7 = charSequence.length();
        }
        pVar.g(i4, i5, charSequence, i11, i7);
    }

    public final void a(@fg.l StringBuilder builder) {
        builder.append(this.buffer, 0, this.gapStart);
        char[] cArr = this.buffer;
        int i4 = this.gapEnd;
        builder.append(cArr, i4, this.capacity - i4);
    }

    public final char d(int index) {
        int i4 = this.gapStart;
        return index < i4 ? this.buffer[index] : this.buffer[(index - i4) + this.gapEnd];
    }

    public final int e() {
        return this.capacity - c();
    }

    public final void g(int start, int end, @fg.l CharSequence text, int textStart, int textEnd) {
        int i4 = textEnd - textStart;
        f(i4 - (end - start));
        b(start, end);
        l0.a(text, this.buffer, this.gapStart, textStart, textEnd);
        this.gapStart += i4;
    }

    @fg.l
    public String toString() {
        return "";
    }
}
