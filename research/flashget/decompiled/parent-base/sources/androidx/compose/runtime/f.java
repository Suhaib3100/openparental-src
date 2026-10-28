package androidx.compose.runtime;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* compiled from: ActualJvm.jvm.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/f;", "Ljava/util/concurrent/atomic/AtomicInteger;", "", "value", "<init>", "(I)V", "amount", "a", "(I)I", "", "b", "()B", "", "h", "()S", "", "c", "()C", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f extends AtomicInteger {

    /* renamed from: b, reason: collision with root package name */
    public static final int f16381b = 0;

    public f(int i4) {
        super(i4);
    }

    public final int a(int amount) {
        return addAndGet(amount);
    }

    public byte b() {
        return (byte) super.intValue();
    }

    @Override // java.lang.Number
    public final byte byteValue() {
        return (byte) super.intValue();
    }

    public char c() {
        return (char) super.intValue();
    }

    public /* bridge */ double d() {
        return super.doubleValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ double doubleValue() {
        return super.doubleValue();
    }

    public /* bridge */ float e() {
        return super.floatValue();
    }

    public /* bridge */ int f() {
        return super.intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ float floatValue() {
        return super.floatValue();
    }

    public /* bridge */ long g() {
        return super.longValue();
    }

    public short h() {
        return (short) super.intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ int intValue() {
        return super.intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ long longValue() {
        return super.longValue();
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return (short) super.intValue();
    }
}
