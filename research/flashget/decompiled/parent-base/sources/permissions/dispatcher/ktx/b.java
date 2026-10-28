package permissions.dispatcher.ktx;

import kotlin.Metadata;

/* compiled from: Event.kt */
@androidx.annotation.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lpermissions/dispatcher/ktx/b;", "T", "", "content", "<init>", "(Ljava/lang/Object;)V", "a", "()Ljava/lang/Object;", "Ljava/lang/Object;", "", "b", "Z", "hasBeenHandled", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile boolean hasBeenHandled;

    public b(T t4) {
        this.content = t4;
    }

    @fg.m
    public final T a() {
        if (this.hasBeenHandled) {
            return null;
        }
        this.hasBeenHandled = true;
        return this.content;
    }
}
