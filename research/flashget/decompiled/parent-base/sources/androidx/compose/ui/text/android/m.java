package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.compose.foundation.w1;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LayoutHelper.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\u0019J\u0015\u0010#\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010.R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00101R\u0017\u00106\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105¨\u00067"}, d2 = {"Landroidx/compose/ui/text/android/m;", "", "Landroid/text/Layout;", "layout", "<init>", "(Landroid/text/Layout;)V", "", "offset", "", "primary", "", "b", "(IZ)F", "lineEnd", "lineStart", "m", "(II)I", "paragraphIndex", "Ljava/text/Bidi;", "a", "(I)Ljava/text/Bidi;", "upstream", "h", "(IZ)I", "j", "(I)I", "g", "l", "(I)Z", "usePrimaryDirection", "c", "(IZZ)F", "lineIndex", "e", "", "k", "(C)Z", "Landroid/text/Layout;", "d", "()Landroid/text/Layout;", "", "Ljava/util/List;", "paragraphEnds", "", "paragraphBidi", "", "[Z", "bidiProcessedParagraphs", "", "[C", "tmpBuffer", "f", "I", "()I", "paragraphCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,401:1\n1#2:402\n1627#3,6:403\n1627#3,6:409\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n281#1:403,6\n320#1:409,6\n*E\n"})
/* loaded from: classes.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final int f20538g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Layout layout;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<Integer> paragraphEnds;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<Bidi> paragraphBidi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final boolean[] bidiProcessedParagraphs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private char[] tmpBuffer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int paragraphCount;

    /* compiled from: LayoutHelper.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/android/m$a;", "", "", "start", "end", "", "isRtl", "<init>", "(IIZ)V", "a", "()I", "b", "c", "()Z", "d", "(IIZ)Landroidx/compose/ui/text/android/m$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "g", "f", "Z", "h", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int start;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int end;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isRtl;

        public a(int i4, int i5, boolean z4) {
            this.start = i4;
            this.end = i5;
            this.isRtl = z4;
        }

        public static a e(a aVar, int i4, int i5, boolean z4, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = aVar.start;
            }
            if ((i6 & 2) != 0) {
                i5 = aVar.end;
            }
            if ((i6 & 4) != 0) {
                z4 = aVar.isRtl;
            }
            aVar.getClass();
            return new a(i4, i5, z4);
        }

        /* renamed from: a, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: b, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsRtl() {
            return this.isRtl;
        }

        @fg.l
        public final a d(int start, int end, boolean isRtl) {
            return new a(start, end, isRtl);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.start == aVar.start && this.end == aVar.end && this.isRtl == aVar.isRtl;
        }

        public final int f() {
            return this.end;
        }

        public final int g() {
            return this.start;
        }

        public final boolean h() {
            return this.isRtl;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRtl) + w1.a(this.end, Integer.hashCode(this.start) * 31, 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("BidiRun(start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", isRtl=");
            return androidx.compose.animation.l.a(sb, this.isRtl, ')');
        }
    }

    public m(@fg.l Layout layout) {
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        do {
            int o32 = kotlin.text.v.o3(this.layout.getText(), '\n', i4, false, 4, null);
            i4 = o32 < 0 ? this.layout.getText().length() : o32 + 1;
            arrayList.add(Integer.valueOf(i4));
        } while (i4 < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float b(int offset, boolean primary) {
        int lineEnd = this.layout.getLineEnd(this.layout.getLineForOffset(offset));
        if (offset > lineEnd) {
            offset = lineEnd;
        }
        return primary ? this.layout.getPrimaryHorizontal(offset) : this.layout.getSecondaryHorizontal(offset);
    }

    public static /* synthetic */ int i(m mVar, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return mVar.h(i4, z4);
    }

    private final int m(int lineEnd, int lineStart) {
        while (lineEnd > lineStart && k(this.layout.getText().charAt(lineEnd - 1))) {
            lineEnd--;
        }
        return lineEnd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r0.getRunCount() == 1) goto L21;
     */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi a(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.bidiProcessedParagraphs
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r11.paragraphBidi
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r11.paragraphEnds
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r11.paragraphEnds
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.tmpBuffer
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r10 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r11.layout
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            boolean r9 = r11.l(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L63
        L62:
            r0 = r1
        L63:
            java.util.List<java.text.Bidi> r3 = r11.paragraphBidi
            r3.set(r12, r0)
            boolean[] r3 = r11.bidiProcessedParagraphs
            r3[r12] = r2
            if (r0 == 0) goto L75
            char[] r12 = r11.tmpBuffer
            if (r10 != r12) goto L74
            r10 = r1
            goto L75
        L74:
            r10 = r12
        L75:
            r11.tmpBuffer = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.m.a(int):java.text.Bidi");
    }

    public final float c(int offset, boolean usePrimaryDirection, boolean upstream) {
        int i4 = offset;
        if (!upstream) {
            return b(offset, usePrimaryDirection);
        }
        int a5 = l.a(this.layout, i4, upstream);
        int lineStart = this.layout.getLineStart(a5);
        int lineEnd = this.layout.getLineEnd(a5);
        if (i4 != lineStart && i4 != lineEnd) {
            return b(offset, usePrimaryDirection);
        }
        if (i4 == 0 || i4 == this.layout.getText().length()) {
            return b(offset, usePrimaryDirection);
        }
        int h4 = h(i4, upstream);
        boolean l4 = l(h4);
        int m4 = m(lineEnd, lineStart);
        int j4 = j(h4);
        int i5 = lineStart - j4;
        int i6 = m4 - j4;
        Bidi a6 = a(h4);
        Bidi createLineBidi = a6 != null ? a6.createLineBidi(i5, i6) : null;
        boolean z4 = false;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (usePrimaryDirection || l4 == isRtlCharAt) {
                l4 = !l4;
            }
            if (i4 == lineStart) {
                z4 = l4;
            } else if (!l4) {
                z4 = true;
            }
            Layout layout = this.layout;
            return z4 ? layout.getLineLeft(a5) : layout.getLineRight(a5);
        }
        int runCount = createLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i7 = 0; i7 < runCount; i7++) {
            aVarArr[i7] = new a(createLineBidi.getRunStart(i7) + lineStart, createLineBidi.getRunLimit(i7) + lineStart, createLineBidi.getRunLevel(i7) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i10 = 0; i10 < runCount2; i10++) {
            bArr[i10] = (byte) createLineBidi.getRunLevel(i10);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i11 = -1;
        if (i4 == lineStart) {
            int i12 = 0;
            while (true) {
                if (i12 >= runCount) {
                    break;
                }
                if (aVarArr[i12].g() == i4) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
            a aVar = aVarArr[i11];
            if (usePrimaryDirection || l4 == aVar.h()) {
                l4 = !l4;
            }
            return (i11 == 0 && l4) ? this.layout.getLineLeft(a5) : (i11 != kotlin.collections.l.we(aVarArr) || l4) ? l4 ? this.layout.getPrimaryHorizontal(aVarArr[i11 - 1].g()) : this.layout.getPrimaryHorizontal(aVarArr[i11 + 1].g()) : this.layout.getLineRight(a5);
        }
        if (i4 > m4) {
            i4 = m(i4, lineStart);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= runCount) {
                break;
            }
            if (aVarArr[i13].f() == i4) {
                i11 = i13;
                break;
            }
            i13++;
        }
        a aVar2 = aVarArr[i11];
        if (!usePrimaryDirection && l4 != aVar2.h()) {
            l4 = !l4;
        }
        return (i11 == 0 && l4) ? this.layout.getLineLeft(a5) : (i11 != kotlin.collections.l.we(aVarArr) || l4) ? l4 ? this.layout.getPrimaryHorizontal(aVarArr[i11 - 1].f()) : this.layout.getPrimaryHorizontal(aVarArr[i11 + 1].f()) : this.layout.getLineRight(a5);
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    public final int e(int lineIndex) {
        return m(this.layout.getLineEnd(lineIndex), this.layout.getLineStart(lineIndex));
    }

    /* renamed from: f, reason: from getter */
    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int g(@androidx.annotation.g0(from = 0) int paragraphIndex) {
        return this.paragraphEnds.get(paragraphIndex).intValue();
    }

    public final int h(@androidx.annotation.g0(from = 0) int offset, boolean upstream) {
        int y4 = kotlin.collections.w.y(this.paragraphEnds, Integer.valueOf(offset), 0, 0, 6, null);
        int i4 = y4 < 0 ? -(y4 + 1) : y4 + 1;
        if (upstream && i4 > 0) {
            int i5 = i4 - 1;
            if (offset == this.paragraphEnds.get(i5).intValue()) {
                return i5;
            }
        }
        return i4;
    }

    public final int j(@androidx.annotation.g0(from = 0) int paragraphIndex) {
        if (paragraphIndex == 0) {
            return 0;
        }
        return this.paragraphEnds.get(paragraphIndex - 1).intValue();
    }

    public final boolean k(char c5) {
        return c5 == ' ' || c5 == '\n' || c5 == 5760 || (kotlin.jvm.internal.l0.t(c5, 8192) >= 0 && kotlin.jvm.internal.l0.t(c5, 8202) <= 0 && c5 != 8199) || c5 == 8287 || c5 == 12288;
    }

    public final boolean l(@androidx.annotation.g0(from = 0) int paragraphIndex) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(j(paragraphIndex))) == -1;
    }
}
