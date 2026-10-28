package kotlin.comparisons;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.l0;

/* compiled from: _Comparisons.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001aG\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\b\u001a?\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\t\u001aK\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000b\"\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\f\u001aG\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\b\u001a?\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\t\u001aK\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000b\"\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"maxOf", "T", "a", "b", "c", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "other", "", "(Ljava/lang/Object;[Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "minOf", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes6.dex */
class i extends h {
    @SinceKotlin(version = "1.4")
    public static final <T> T A0(T t5, @d5.d T[] tArr, @d5.d Comparator<? super T> comparator) {
        l0.p(tArr, ProtectedSandApp.s("綠"));
        l0.p(comparator, ProtectedSandApp.s("綡"));
        for (T t6 : tArr) {
            if (comparator.compare(t5, t6) < 0) {
                t5 = t6;
            }
        }
        return t5;
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T B0(T t5, T t6, T t7, @d5.d Comparator<? super T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("綢"));
        return (T) C0(t5, C0(t6, t7, comparator), comparator);
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T C0(T t5, T t6, @d5.d Comparator<? super T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("綣"));
        return comparator.compare(t5, t6) <= 0 ? t5 : t6;
    }

    @SinceKotlin(version = "1.4")
    public static final <T> T D0(T t5, @d5.d T[] tArr, @d5.d Comparator<? super T> comparator) {
        l0.p(tArr, ProtectedSandApp.s("綤"));
        l0.p(comparator, ProtectedSandApp.s("綥"));
        for (T t6 : tArr) {
            if (comparator.compare(t5, t6) > 0) {
                t5 = t6;
            }
        }
        return t5;
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T y0(T t5, T t6, T t7, @d5.d Comparator<? super T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("綦"));
        return (T) z0(t5, z0(t6, t7, comparator), comparator);
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T z0(T t5, T t6, @d5.d Comparator<? super T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("綧"));
        return comparator.compare(t5, t6) >= 0 ? t5 : t6;
    }
}
