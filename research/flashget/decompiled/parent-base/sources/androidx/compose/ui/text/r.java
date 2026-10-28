package androidx.compose.ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: MultiParagraph.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0006\u001a4\u0010\u0016\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\rH\u0082\b¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"", "Landroidx/compose/ui/text/t;", "paragraphInfoList", "", "index", "b", "(Ljava/util/List;I)I", "", "y", "d", "(Ljava/util/List;F)I", "Landroidx/compose/ui/text/t0;", "range", "Lkotlin/Function1;", "Lkotlin/k2;", "action", "e", "(Ljava/util/List;JLld/l;)V", "lineIndex", "c", "T", "comparison", "a", "(Ljava/util/List;Lld/l;)I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1#1,1055:1\n924#1,16:1056\n924#1,16:1072\n924#1,16:1088\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n860#1:1056,16\n880#1:1072,16\n914#1:1088,16\n*E\n"})
/* loaded from: classes.dex */
public final class r {
    private static final <T> int a(List<? extends T> list, ld.l<? super T, Integer> lVar) {
        int size = list.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int intValue = lVar.invoke(list.get(i5)).intValue();
            if (intValue < 0) {
                i4 = i5 + 1;
            } else {
                if (intValue <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final int b(@fg.l List<t> list, int i4) {
        int size = list.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            t tVar = list.get(i6);
            char c5 = tVar.o() > i4 ? (char) 1 : tVar.k() <= i4 ? (char) 65535 : (char) 0;
            if (c5 < 0) {
                i5 = i6 + 1;
            } else {
                if (c5 <= 0) {
                    return i6;
                }
                size = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static final int c(@fg.l List<t> list, int i4) {
        int size = list.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            t tVar = list.get(i6);
            char c5 = tVar.p() > i4 ? (char) 1 : tVar.l() <= i4 ? (char) 65535 : (char) 0;
            if (c5 < 0) {
                i5 = i6 + 1;
            } else {
                if (c5 <= 0) {
                    return i6;
                }
                size = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static final int d(@fg.l List<t> list, float f4) {
        int size = list.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            t tVar = list.get(i5);
            char c5 = tVar.q() > f4 ? (char) 1 : tVar.j() <= f4 ? (char) 65535 : (char) 0;
            if (c5 < 0) {
                i4 = i5 + 1;
            } else {
                if (c5 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final void e(@fg.l List<t> list, long j4, @fg.l ld.l<? super t, k2> lVar) {
        int size = list.size();
        for (int b5 = b(list, t0.l(j4)); b5 < size; b5++) {
            t tVar = list.get(b5);
            if (tVar.o() >= t0.k(j4)) {
                return;
            }
            if (tVar.o() != tVar.k()) {
                lVar.invoke(tVar);
            }
        }
    }
}
