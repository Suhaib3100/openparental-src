package kotlin.ranges;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.l0;

/* compiled from: Ranges.kt */
@SinceKotlin(version = "1.1")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/ranges/ClosedFloatingPointRange;", "T", "", "Lkotlin/ranges/ClosedRange;", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "lessThanOrEquals", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.f, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public interface ClosedFloatingPointRange<T extends Comparable<? super T>> extends ClosedRange<T> {

    /* compiled from: Ranges.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.f$a */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@d5.d ClosedFloatingPointRange<T> closedFloatingPointRange, @d5.d T t5) {
            l0.p(t5, ProtectedSandApp.s("䈝"));
            return closedFloatingPointRange.g(closedFloatingPointRange.f(), t5) && closedFloatingPointRange.g(t5, closedFloatingPointRange.p());
        }

        public static <T extends Comparable<? super T>> boolean b(@d5.d ClosedFloatingPointRange<T> closedFloatingPointRange) {
            return !closedFloatingPointRange.g(closedFloatingPointRange.f(), closedFloatingPointRange.p());
        }
    }

    @Override // kotlin.ranges.ClosedRange
    boolean b(@d5.d T t5);

    boolean g(@d5.d T t5, @d5.d T t6);

    @Override // kotlin.ranges.ClosedRange
    boolean isEmpty();
}
