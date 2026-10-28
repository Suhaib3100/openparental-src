package androidx.compose.foundation.text2.input;

import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextUndoManager.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R/\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0012R\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/compose/foundation/text2/input/x;", "", "Landroidx/compose/foundation/text2/input/internal/undo/d;", "initialStagingUndo", "Landroidx/compose/foundation/text2/input/internal/undo/f;", "undoManager", "<init>", "(Landroidx/compose/foundation/text2/input/internal/undo/d;Landroidx/compose/foundation/text2/input/internal/undo/f;)V", "Lkotlin/k2;", "d", "()V", "Landroidx/compose/foundation/text2/input/u;", "state", "k", "(Landroidx/compose/foundation/text2/input/u;)V", "i", "op", "h", "(Landroidx/compose/foundation/text2/input/internal/undo/d;)V", "c", "a", "Landroidx/compose/foundation/text2/input/internal/undo/f;", "<set-?>", "b", "Landroidx/compose/runtime/k2;", "g", "()Landroidx/compose/foundation/text2/input/internal/undo/d;", "j", "stagingUndo", "", "f", "()Z", "canUndo", "e", "canRedo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text2/input/TextUndoManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n81#2:268\n107#2,2:269\n495#3,4:271\n500#3:280\n495#3,4:281\n500#3:290\n129#4,5:275\n129#4,5:285\n1#5:291\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text2/input/TextUndoManager\n*L\n47#1:268\n47#1:269,2\n73#1:271,4\n73#1:280\n98#1:281,4\n98#1:290\n73#1:275,5\n98#1:285,5\n*E\n"})
/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final int f9083d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text2.input.internal.undo.f<androidx.compose.foundation.text2.input.internal.undo.d> undoManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 stagingUndo;

    /* JADX WARN: Multi-variable type inference failed */
    public x() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final void d() {
        androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
        try {
            androidx.compose.runtime.snapshots.m r4 = c5.r();
            try {
                androidx.compose.foundation.text2.input.internal.undo.d g4 = g();
                if (g4 != null) {
                    this.undoManager.h(g4);
                }
                j(null);
            } finally {
                c5.y(r4);
            }
        } finally {
            c5.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text2.input.internal.undo.d g() {
        return (androidx.compose.foundation.text2.input.internal.undo.d) this.stagingUndo.getValue();
    }

    private final void j(androidx.compose.foundation.text2.input.internal.undo.d dVar) {
        this.stagingUndo.setValue(dVar);
    }

    public final void c() {
        j(null);
        this.undoManager.d();
    }

    public final boolean e() {
        return this.undoManager.e() && g() == null;
    }

    public final boolean f() {
        return this.undoManager.f() || g() != null;
    }

    public final void h(@fg.l androidx.compose.foundation.text2.input.internal.undo.d op) {
        androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
        try {
            androidx.compose.runtime.snapshots.m r4 = c5.r();
            try {
                androidx.compose.foundation.text2.input.internal.undo.d g4 = g();
                if (g4 == null) {
                    j(op);
                    return;
                }
                androidx.compose.foundation.text2.input.internal.undo.d b5 = y.b(g4, op);
                if (b5 != null) {
                    j(b5);
                } else {
                    d();
                    j(op);
                }
            } finally {
                c5.y(r4);
            }
        } finally {
            c5.d();
        }
    }

    public final void i(@fg.l u state) {
        if (e()) {
            androidx.compose.foundation.text2.input.internal.undo.e.a(state, this.undoManager.i());
        }
    }

    public final void k(@fg.l u state) {
        if (f()) {
            d();
            androidx.compose.foundation.text2.input.internal.undo.e.b(state, this.undoManager.j());
        }
    }

    public x(@fg.m androidx.compose.foundation.text2.input.internal.undo.d dVar, @fg.l androidx.compose.foundation.text2.input.internal.undo.f<androidx.compose.foundation.text2.input.internal.undo.d> fVar) {
        k2 g4;
        this.undoManager = fVar;
        g4 = t4.g(dVar, null, 2, null);
        this.stagingUndo = g4;
    }

    public /* synthetic */ x(androidx.compose.foundation.text2.input.internal.undo.d dVar, androidx.compose.foundation.text2.input.internal.undo.f fVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : dVar, (i4 & 2) != 0 ? new androidx.compose.foundation.text2.input.internal.undo.f(null, null, 100, 3, null) : fVar);
    }
}
