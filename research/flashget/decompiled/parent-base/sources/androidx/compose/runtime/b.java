package androidx.compose.runtime;

import android.os.Looper;
import kotlin.Metadata;

/* compiled from: ActualAndroid.android.kt */
@Metadata(d1 = {"\u0000l\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u001e\"!\u0010&\u001a\u00020 8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#\"\u0014\u0010(\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010'\"\u001a\u0010,\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+*\f\b\u0000\u0010.\"\u00020-2\u00020-¨\u0006/"}, d2 = {"T", "value", "Landroidx/compose/runtime/m4;", "policy", "Landroidx/compose/runtime/snapshots/a0;", "e", "(Ljava/lang/Object;Landroidx/compose/runtime/m4;)Landroidx/compose/runtime/snapshots/a0;", "", "Landroidx/compose/runtime/i2;", "c", "(I)Landroidx/compose/runtime/i2;", "", "Landroidx/compose/runtime/j2;", "d", "(J)Landroidx/compose/runtime/j2;", "", "Landroidx/compose/runtime/h2;", "b", "(F)Landroidx/compose/runtime/h2;", "", "Landroidx/compose/runtime/g2;", "a", "(D)Landroidx/compose/runtime/g2;", "", "message", "", "Lkotlin/k2;", "i", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "", "Z", "DisallowDefaultMonotonicFrameClock", "Landroidx/compose/runtime/a2;", "Lkotlin/b0;", "f", "()Landroidx/compose/runtime/a2;", "g", "()V", "DefaultMonotonicFrameClock", "Ljava/lang/String;", "LogTag", "J", "h", "()J", "MainThreadId", "Landroidx/annotation/j;", "CheckResult", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f15937a = false;

    /* renamed from: d, reason: collision with root package name */
    private static final long f15940d;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final String f15939c = "ComposeInternal";

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final kotlin.b0 f15938b = kotlin.c0.c(a.f15941b);

    /* compiled from: ActualAndroid.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/runtime/a2;", "a", "()Landroidx/compose/runtime/a2;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<a2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15941b = new a(0);

        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a2 invoke() {
            return Looper.getMainLooper() != null ? p0.f16868b : u3.f17205b;
        }
    }

    static {
        long j4;
        try {
            j4 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j4 = -1;
        }
        f15940d = j4;
    }

    @fg.l
    public static final g2 a(double d5) {
        return new ParcelableSnapshotMutableDoubleState(d5);
    }

    @fg.l
    public static final h2 b(float f4) {
        return new ParcelableSnapshotMutableFloatState(f4);
    }

    @fg.l
    public static final i2 c(int i4) {
        return new ParcelableSnapshotMutableIntState(i4);
    }

    @fg.l
    public static final j2 d(long j4) {
        return new ParcelableSnapshotMutableLongState(j4);
    }

    @fg.l
    public static final <T> androidx.compose.runtime.snapshots.a0<T> e(T t4, @fg.l m4<T> m4Var) {
        return new ParcelableSnapshotMutableState(t4, m4Var);
    }

    @fg.l
    public static final a2 f() {
        return (a2) f15938b.getValue();
    }

    @kotlin.k(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    public static /* synthetic */ void g() {
    }

    public static final long h() {
        return f15940d;
    }

    public static final void i(@fg.l String str, @fg.l Throwable th) {
    }
}
