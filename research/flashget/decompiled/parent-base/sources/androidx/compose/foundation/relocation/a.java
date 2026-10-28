package androidx.compose.foundation.relocation;

import androidx.compose.foundation.relocation.k;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.node.b0;
import androidx.compose.ui.q;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: BringIntoView.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR(\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00078D@BX\u0084\u000e¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/relocation/a;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/modifier/j;", "Landroidx/compose/ui/node/b0;", "Landroidx/compose/ui/node/h;", "<init>", "()V", "Landroidx/compose/ui/layout/u;", "coordinates", "Lkotlin/k2;", "q", "(Landroidx/compose/ui/layout/u;)V", "Landroidx/compose/foundation/relocation/c;", "p", "Landroidx/compose/foundation/relocation/c;", "defaultParent", "<set-?>", "Landroidx/compose/ui/layout/u;", "y7", "()Landroidx/compose/ui/layout/u;", "layoutCoordinates", "z7", "()Landroidx/compose/foundation/relocation/c;", "localParent", "A7", "parent", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBringIntoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoView.kt\nandroidx/compose/foundation/relocation/BringIntoViewChildNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
/* loaded from: classes.dex */
public abstract class a extends q.d implements androidx.compose.ui.modifier.j, b0, androidx.compose.ui.node.h {

    /* renamed from: r, reason: collision with root package name */
    public static final int f6958r = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @l
    private final c defaultParent = new k.a(this);

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @m
    private androidx.compose.ui.layout.u layoutCoordinates;

    private final c z7() {
        return (c) v(b.a());
    }

    @l
    protected final c A7() {
        c z7 = z7();
        return z7 == null ? this.defaultParent : z7;
    }

    @Override // androidx.compose.ui.node.b0
    public void q(@l androidx.compose.ui.layout.u coordinates) {
        this.layoutCoordinates = coordinates;
    }

    @m
    protected final androidx.compose.ui.layout.u y7() {
        androidx.compose.ui.layout.u uVar = this.layoutCoordinates;
        if (uVar == null || !uVar.f()) {
            return null;
        }
        return uVar;
    }
}
