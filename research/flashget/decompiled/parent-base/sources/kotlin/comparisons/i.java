package kotlin.comparisons;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;

/* compiled from: _Comparisons.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0007\u001aI\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001aM\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b\"\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\b\u001aA\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\n\u001aM\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b\"\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"T", "a", "b", "c", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "y0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "z0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "", "other", "A0", "(Ljava/lang/Object;[Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "B0", "C0", "D0", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes7.dex */
class i extends h {
    @c1(version = "1.4")
    public static final <T> T A0(T t4, @fg.l T[] tArr, @fg.l Comparator<? super T> comparator) {
        l0.p(tArr, ProtectedSandApp.s("拝\u0001"));
        l0.p(comparator, ProtectedSandApp.s("拞\u0001"));
        for (T t5 : tArr) {
            if (comparator.compare(t4, t5) < 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    @c1(version = "1.1")
    public static final <T> T B0(T t4, T t5, T t6, @fg.l Comparator<? super T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("拞\u0001"));
        return (T) C0(t4, C0(t5, t6, comparator), comparator);
    }

    @c1(version = "1.1")
    public static final <T> T C0(T t4, T t5, @fg.l Comparator<? super T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("拞\u0001"));
        return comparator.compare(t4, t5) <= 0 ? t4 : t5;
    }

    @c1(version = "1.4")
    public static final <T> T D0(T t4, @fg.l T[] tArr, @fg.l Comparator<? super T> comparator) {
        l0.p(tArr, ProtectedSandApp.s("拝\u0001"));
        l0.p(comparator, ProtectedSandApp.s("拞\u0001"));
        for (T t5 : tArr) {
            if (comparator.compare(t4, t5) > 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    @c1(version = "1.1")
    public static final <T> T y0(T t4, T t5, T t6, @fg.l Comparator<? super T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("拞\u0001"));
        return (T) z0(t4, z0(t5, t6, comparator), comparator);
    }

    @c1(version = "1.1")
    public static final <T> T z0(T t4, T t5, @fg.l Comparator<? super T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("拞\u0001"));
        return comparator.compare(t4, t5) >= 0 ? t4 : t5;
    }
}
