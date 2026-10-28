package xe;

import java.lang.Throwable;

/* compiled from: FailableCallable.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface j0<R, E extends Throwable> {
    R call() throws Throwable;
}
