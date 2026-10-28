package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: StateObjectImpl.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/snapshots/q0;", "Landroidx/compose/runtime/snapshots/p0;", "<init>", "()V", "Landroidx/compose/runtime/snapshots/i;", "reader", "Lkotlin/k2;", "y", "(I)V", "", "a", "(I)Z", "Landroidx/compose/runtime/f;", "b", "Landroidx/compose/runtime/f;", "readerKind", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStateObjectImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n+ 2 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind\n*L\n1#1,55:1\n47#2:56\n45#2:57\n47#2:58\n*S KotlinDebug\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n*L\n32#1:56\n34#1:57\n39#1:58\n*E\n"})
/* loaded from: classes.dex */
public abstract class q0 implements p0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f17126c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.f readerKind = new androidx.compose.runtime.f(0);

    public final boolean a(int reader) {
        return (reader & i.b(this.readerKind.get())) != 0;
    }

    public final void y(int reader) {
        int b5;
        do {
            b5 = i.b(this.readerKind.get());
            if ((b5 & reader) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(b5, b5 | reader));
    }
}
