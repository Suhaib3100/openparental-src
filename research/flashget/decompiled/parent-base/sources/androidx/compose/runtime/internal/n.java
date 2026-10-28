package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: IntRef.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\u0005¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/internal/n;", "", "", "element", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "a", "I", "()I", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final int f16796b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int element;

    public n() {
        this(0, 1, null);
    }

    /* renamed from: a, reason: from getter */
    public final int getElement() {
        return this.element;
    }

    public final void b(int i4) {
        this.element = i4;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.element);
        sb.append(")@");
        String num = Integer.toString(hashCode(), kotlin.text.c.a(16));
        l0.o(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    public n(int i4) {
        this.element = i4;
    }

    public /* synthetic */ n(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 0 : i4);
    }
}
