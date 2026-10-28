package kotlin.comparisons;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Comparisons.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003B\u001f\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003¢\u0006\u0004\b\f\u0010\rR'\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/comparisons/l;", "T", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "<init>", "(Ljava/util/Comparator;)V", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "reversed", "()Ljava/util/Comparator;", "Ljava/util/Comparator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class l<T> implements Comparator<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Comparator<T> comparator;

    public l(@fg.l Comparator<T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("拣\u0001"));
        this.comparator = comparator;
    }

    @fg.l
    public final Comparator<T> a() {
        return this.comparator;
    }

    @Override // java.util.Comparator
    public int compare(T a5, T b5) {
        return this.comparator.compare(b5, a5);
    }

    @Override // java.util.Comparator
    @fg.l
    public final Comparator<T> reversed() {
        return this.comparator;
    }
}
