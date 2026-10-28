package androidx.compose.runtime;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: ActualJvm.jvm.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/u4;", "T", "", "<init>", "()V", "a", "()Ljava/lang/Object;", "value", "Lkotlin/k2;", "b", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/v;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "map", "Ljava/lang/Object;", "writeMutex", "c", "mainThreadValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,119:1\n82#2:120\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n*L\n67#1:120\n*E\n"})
/* loaded from: classes.dex */
public final class u4<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f17209d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicReference<androidx.compose.runtime.internal.v> map = new AtomicReference<>(androidx.compose.runtime.internal.w.a());

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object writeMutex = new Object();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private T mainThreadValue;

    @fg.m
    public final T a() {
        return Thread.currentThread().getId() == b.h() ? this.mainThreadValue : (T) this.map.get().b(Thread.currentThread().getId());
    }

    public final void b(@fg.m T value) {
        long id2 = Thread.currentThread().getId();
        if (id2 == b.h()) {
            this.mainThreadValue = value;
            return;
        }
        synchronized (this.writeMutex) {
            androidx.compose.runtime.internal.v vVar = this.map.get();
            if (vVar.d(id2, value)) {
                return;
            }
            this.map.set(vVar.c(id2, value));
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        }
    }
}
