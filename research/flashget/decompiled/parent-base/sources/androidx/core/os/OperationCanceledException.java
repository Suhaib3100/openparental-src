package androidx.core.os;

/* loaded from: classes3.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(@androidx.annotation.q0 String str) {
        super(androidx.core.util.r.f(str, "The operation has been canceled."));
    }
}
