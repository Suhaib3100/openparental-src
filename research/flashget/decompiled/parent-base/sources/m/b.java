package m;

import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Lock.jvm.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"Lm/b;", "", "<init>", "()V", "T", "Lkotlin/Function0;", "block", "a", "(Lld/a;)Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public final <T> T a(@l ld.a<? extends T> block) {
        T invoke;
        l0.p(block, "block");
        synchronized (this) {
            invoke = block.invoke();
        }
        return invoke;
    }
}
