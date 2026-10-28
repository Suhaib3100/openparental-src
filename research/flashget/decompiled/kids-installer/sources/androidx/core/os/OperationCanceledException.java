package androidx.core.os;

import androidx.annotation.q0;

/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(@q0 String str) {
        super(androidx.core.util.l.f(str, "The operation has been canceled."));
    }
}
