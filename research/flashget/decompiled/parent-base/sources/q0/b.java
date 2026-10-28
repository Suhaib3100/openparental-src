package q0;

import android.text.Layout;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.text.android.g;
import androidx.compose.ui.text.android.m;
import fg.l;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SegmentBreaker.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\tJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\tJ%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lq0/b;", "", "<init>", "()V", "Landroidx/compose/ui/text/android/m;", "layoutHelper", "", "", "a", "(Landroidx/compose/ui/text/android/m;)Ljava/util/List;", "", "text", "Ljava/text/BreakIterator;", "breaker", "i", "(Ljava/lang/CharSequence;Ljava/text/BreakIterator;)Ljava/util/List;", "Lq0/a;", "d", "f", "", "dropSpaces", "e", "(Landroidx/compose/ui/text/android/m;Z)Ljava/util/List;", "g", "c", "Lq0/c;", "segmentType", "b", "(Landroidx/compose/ui/text/android/m;Lq0/c;)Ljava/util/List;", "h", "(Landroidx/compose/ui/text/android/m;Lq0/c;Z)Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 1)
@r1({"SMAP\nSegmentBreaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n+ 2 ListUtils.kt\nandroidx/compose/ui/text/android/ListUtilsKt\n*L\n1#1,308:1\n33#2,6:309\n74#2,11:315\n74#2,11:326\n*S KotlinDebug\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n*L\n61#1:309,6\n221#1:315,11\n270#1:326,11\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final b f89517a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final int f89518b = 0;

    /* compiled from: SegmentBreaker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89519a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.Document.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.Paragraph.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.Line.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.Word.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f89519a = iArr;
        }
    }

    private b() {
    }

    private final List<Integer> a(m layoutHelper) {
        List<Integer> i4 = i(layoutHelper.getLayout().getText(), BreakIterator.getLineInstance(Locale.getDefault()));
        TreeSet treeSet = new TreeSet();
        int size = i4.size();
        for (int i5 = 0; i5 < size; i5++) {
            treeSet.add(Integer.valueOf(i4.get(i5).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i6 = 0; i6 < paragraphCount; i6++) {
            Bidi a5 = layoutHelper.a(i6);
            if (a5 != null) {
                int j4 = layoutHelper.j(i6);
                int runCount = a5.getRunCount();
                for (int i7 = 0; i7 < runCount; i7++) {
                    treeSet.add(Integer.valueOf(a5.getRunStart(i7) + j4));
                }
            }
        }
        return w.V5(treeSet);
    }

    private final List<q0.a> c(m layoutHelper, boolean dropSpaces) {
        ArrayList arrayList = new ArrayList();
        List<Integer> b5 = b(layoutHelper, c.Character);
        if (b5.size() != 0) {
            boolean z4 = true;
            if (b5.size() != 1) {
                ArrayList arrayList2 = new ArrayList();
                boolean z5 = false;
                Integer num = b5.get(0);
                int J = w.J(b5);
                int i4 = 0;
                while (i4 < J) {
                    i4++;
                    Integer num2 = b5.get(i4);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    Layout layout = layoutHelper.getLayout();
                    if (!dropSpaces || intValue != intValue2 + 1 || !layoutHelper.k(layout.getText().charAt(intValue2))) {
                        int a5 = androidx.compose.ui.text.android.l.a(layout, intValue2, z5);
                        boolean z6 = layout.getParagraphDirection(a5) == -1 ? z4 : z5;
                        boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                        if (isRtlCharAt != z6) {
                            z4 = z5;
                        }
                        int ceil = (int) Math.ceil(layoutHelper.c(intValue2, z4, z5));
                        int ceil2 = (int) Math.ceil(layoutHelper.c(intValue, isRtlCharAt == z6, true));
                        arrayList.add(new q0.a(intValue2, intValue, Math.min(ceil, ceil2), layout.getLineTop(a5), Math.max(ceil, ceil2), layout.getLineBottom(a5)));
                    }
                    arrayList2.add(k2.f75408a);
                    num = num2;
                    z4 = true;
                    z5 = false;
                }
                return arrayList;
            }
        }
        j0 j0Var = j0.f74919b;
        return arrayList;
    }

    private final List<q0.a> d(m layoutHelper) {
        return w.k(new q0.a(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
    }

    private final List<q0.a> e(m layoutHelper, boolean dropSpaces) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        for (int i4 = 0; i4 < lineCount; i4++) {
            arrayList.add(new q0.a(layout.getLineStart(i4), layout.getLineEnd(i4), dropSpaces ? (int) Math.ceil(layout.getLineLeft(i4)) : 0, layout.getLineTop(i4), dropSpaces ? (int) Math.ceil(layout.getLineRight(i4)) : layout.getWidth(), layout.getLineBottom(i4)));
        }
        return arrayList;
    }

    private final List<q0.a> f(m layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i4 = 0; i4 < paragraphCount; i4++) {
            int j4 = layoutHelper.j(i4);
            int g4 = layoutHelper.g(i4);
            arrayList.add(new q0.a(j4, g4, 0, layout.getLineTop(androidx.compose.ui.text.android.l.a(layout, j4, false)), layout.getWidth(), layout.getLineBottom(androidx.compose.ui.text.android.l.a(layout, g4, true))));
        }
        return arrayList;
    }

    private final List<q0.a> g(m layoutHelper, boolean dropSpaces) {
        int i4;
        Layout layout = layoutHelper.getLayout();
        int ceil = (int) Math.ceil(layout.getPaint().measureText(" "));
        List<Integer> b5 = b(layoutHelper, c.Word);
        if (b5.size() != 0) {
            boolean z4 = true;
            if (b5.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z5 = false;
                Integer num = b5.get(0);
                int J = w.J(b5);
                int i5 = 0;
                while (i5 < J) {
                    i5++;
                    Integer num2 = b5.get(i5);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    int a5 = androidx.compose.ui.text.android.l.a(layout, intValue2, z5);
                    boolean z6 = layout.getParagraphDirection(a5) == -1 ? z4 : z5;
                    boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                    if (isRtlCharAt != z6) {
                        z4 = z5;
                    }
                    int ceil2 = (int) Math.ceil(layoutHelper.c(intValue2, z4, z5));
                    int ceil3 = (int) Math.ceil(layoutHelper.c(intValue, isRtlCharAt == z6, true));
                    int min = Math.min(ceil2, ceil3);
                    int max = Math.max(ceil2, ceil3);
                    if (dropSpaces && intValue != 0 && layout.getText().charAt(intValue - 1) == ' ') {
                        i4 = a5;
                        if (layout.getLineEnd(i4) != intValue) {
                            if (isRtlCharAt) {
                                min += ceil;
                            } else {
                                max -= ceil;
                            }
                        }
                    } else {
                        i4 = a5;
                    }
                    arrayList.add(new q0.a(intValue2, intValue, min, layout.getLineTop(i4), max, layout.getLineBottom(i4)));
                    num = num2;
                    z4 = true;
                    z5 = false;
                }
                return arrayList;
            }
        }
        return j0.f74919b;
    }

    private final List<Integer> i(CharSequence text, BreakIterator breaker) {
        g gVar = new g(text, 0, text.length());
        List<Integer> S = w.S(0);
        breaker.setText(gVar);
        while (breaker.next() != -1) {
            S.add(Integer.valueOf(breaker.current()));
        }
        return S;
    }

    @l
    public final List<Integer> b(@l m layoutHelper, @l c segmentType) {
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i4 = a.f89519a[segmentType.ordinal()];
        int i5 = 0;
        if (i4 == 1) {
            return w.O(0, Integer.valueOf(text.length()));
        }
        if (i4 == 2) {
            List<Integer> S = w.S(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i5 < paragraphCount) {
                S.add(Integer.valueOf(layoutHelper.g(i5)));
                i5++;
            }
            return S;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return a(layoutHelper);
            }
            if (i4 == 5) {
                return i(text, BreakIterator.getCharacterInstance(Locale.getDefault()));
            }
            throw new NoWhenBranchMatchedException();
        }
        List<Integer> S2 = w.S(0);
        int lineCount = layout.getLineCount();
        while (i5 < lineCount) {
            S2.add(Integer.valueOf(layout.getLineEnd(i5)));
            i5++;
        }
        return S2;
    }

    @l
    public final List<q0.a> h(@l m layoutHelper, @l c segmentType, boolean dropSpaces) {
        int i4 = a.f89519a[segmentType.ordinal()];
        if (i4 == 1) {
            return d(layoutHelper);
        }
        if (i4 == 2) {
            return f(layoutHelper);
        }
        if (i4 == 3) {
            return e(layoutHelper, dropSpaces);
        }
        if (i4 == 4) {
            return g(layoutHelper, dropSpaces);
        }
        if (i4 == 5) {
            return c(layoutHelper, dropSpaces);
        }
        throw new NoWhenBranchMatchedException();
    }
}
