package androidx.compose.ui.text;

import androidx.collection.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextRange.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"", "Landroidx/compose/ui/text/t0;", "range", "", "e", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "", "start", "end", "b", "(II)J", "index", "a", "(I)J", "minimumValue", "maximumValue", "c", "(JII)J", "", "d", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n48#2:130\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n127#1:130\n*E\n"})
/* loaded from: classes.dex */
public final class u0 {
    public static final long a(int i4) {
        return b(i4, i4);
    }

    public static final long b(int i4, int i5) {
        return t0.c(d(i4, i5));
    }

    public static final long c(long j4, int i4, int i5) {
        int I = kotlin.ranges.s.I(t0.n(j4), i4, i5);
        int i6 = (int) (4294967295L & j4);
        int I2 = kotlin.ranges.s.I(i6, i4, i5);
        return (I == ((int) (j4 >> 32)) && I2 == i6) ? j4 : b(I, I2);
    }

    private static final long d(int i4, int i5) {
        if (i4 < 0) {
            throw new IllegalArgumentException(m1.a("start cannot be negative. [start: ", i4, ", end: ", i5, ']').toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(m1.a("end cannot be negative. [start: ", i4, ", end: ", i5, ']').toString());
        }
        return (i5 & 4294967295L) | (i4 << 32);
    }

    @fg.l
    public static final String e(@fg.l CharSequence charSequence, long j4) {
        return charSequence.subSequence(t0.l(j4), t0.k(j4)).toString();
    }
}
