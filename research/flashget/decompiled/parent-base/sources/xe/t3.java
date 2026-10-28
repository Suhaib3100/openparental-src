package xe;

import java.lang.Throwable;

/* compiled from: FailableSupplier.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface t3<R, E extends Throwable> {
    R get() throws Throwable;
}
