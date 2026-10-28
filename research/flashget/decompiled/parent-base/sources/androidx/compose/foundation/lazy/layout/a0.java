package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.c0;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import androidx.compose.ui.layout.g1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyLayoutPinnableItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR/\u0010%\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b#\u0010$R/\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\"\u001a\u0004\b!\u0010&\"\u0004\b'\u0010(R(\u0010,\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010&\"\u0004\b+\u0010(¨\u0006-"}, d2 = {"Landroidx/compose/foundation/lazy/layout/a0;", "Landroidx/compose/ui/layout/g1;", "Landroidx/compose/ui/layout/g1$a;", "Landroidx/compose/foundation/lazy/layout/c0$a;", "", "key", "Landroidx/compose/foundation/lazy/layout/c0;", "pinnedItemList", "<init>", "(Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/c0;)V", "a", "()Landroidx/compose/ui/layout/g1$a;", "Lkotlin/k2;", "release", "()V", "f", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "Landroidx/compose/foundation/lazy/layout/c0;", "", "<set-?>", "c", "Landroidx/compose/runtime/i2;", "getIndex", "()I", "g", "(I)V", "index", "d", "j", "pinsCount", "e", "Landroidx/compose/runtime/k2;", "h", "(Landroidx/compose/ui/layout/g1$a;)V", "parentHandle", "()Landroidx/compose/ui/layout/g1;", "k", "(Landroidx/compose/ui/layout/g1;)V", "_parentPinnableContainer", "value", "i", "parentPinnableContainer", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n75#2:175\n108#2,2:176\n75#2:178\n108#2,2:179\n81#3:181\n107#3,2:182\n81#3:184\n107#3,2:185\n495#4,4:187\n500#4:196\n129#5,5:191\n1#6:197\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n*L\n117#1:175\n117#1:176,2\n123#1:178\n123#1:179,2\n128#1:181\n128#1:182,2\n134#1:184\n134#1:185,2\n137#1:187,4\n137#1:196\n137#1:191,5\n*E\n"})
/* loaded from: classes.dex */
final class a0 implements g1, g1.a, c0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 pinnedItemList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2 index = androidx.compose.runtime.b.c(-1);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2 pinsCount = androidx.compose.runtime.b.c(0);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 parentHandle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 _parentPinnableContainer;

    public a0(@fg.m Object obj, @fg.l c0 c0Var) {
        k2 g4;
        k2 g5;
        this.key = obj;
        this.pinnedItemList = c0Var;
        g4 = t4.g(null, null, 2, null);
        this.parentHandle = g4;
        g5 = t4.g(null, null, 2, null);
        this._parentPinnableContainer = g5;
    }

    private final g1.a b() {
        return (g1.a) this.parentHandle.getValue();
    }

    private final int d() {
        return this.pinsCount.f();
    }

    private final g1 e() {
        return (g1) this._parentPinnableContainer.getValue();
    }

    private final void h(g1.a aVar) {
        this.parentHandle.setValue(aVar);
    }

    private final void j(int i4) {
        this.pinsCount.k(i4);
    }

    private final void k(g1 g1Var) {
        this._parentPinnableContainer.setValue(g1Var);
    }

    @Override // androidx.compose.ui.layout.g1
    @fg.l
    public g1.a a() {
        if (this.pinsCount.f() == 0) {
            this.pinnedItemList.m(this);
            g1 e4 = e();
            h(e4 != null ? e4.a() : null);
        }
        j(this.pinsCount.f() + 1);
        return this;
    }

    @fg.m
    public final g1 c() {
        return e();
    }

    public final void f() {
        int f4 = this.pinsCount.f();
        for (int i4 = 0; i4 < f4; i4++) {
            release();
        }
    }

    public void g(int i4) {
        this.index.k(i4);
    }

    @Override // androidx.compose.foundation.lazy.layout.c0.a
    public int getIndex() {
        return this.index.f();
    }

    @Override // androidx.compose.foundation.lazy.layout.c0.a
    @fg.m
    public Object getKey() {
        return this.key;
    }

    public final void i(@fg.m g1 g1Var) {
        androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
        try {
            androidx.compose.runtime.snapshots.m r4 = c5.r();
            try {
                if (g1Var != e()) {
                    k(g1Var);
                    if (this.pinsCount.f() > 0) {
                        g1.a b5 = b();
                        if (b5 != null) {
                            b5.release();
                        }
                        h(g1Var != null ? g1Var.a() : null);
                    }
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
                c5.y(r4);
            } catch (Throwable th) {
                c5.y(r4);
                throw th;
            }
        } finally {
            c5.d();
        }
    }

    @Override // androidx.compose.ui.layout.g1.a
    public void release() {
        if (this.pinsCount.f() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        j(this.pinsCount.f() - 1);
        if (this.pinsCount.f() == 0) {
            this.pinnedItemList.p(this);
            g1.a b5 = b();
            if (b5 != null) {
                b5.release();
            }
            h(null);
        }
    }
}
