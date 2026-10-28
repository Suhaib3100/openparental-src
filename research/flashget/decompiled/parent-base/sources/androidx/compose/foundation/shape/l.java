package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.graphics.a1;
import androidx.compose.ui.graphics.b5;
import androidx.compose.ui.graphics.e6;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.unit.w;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import ld.q;

/* compiled from: GenericShape.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BJ\u0012A\u0010\f\u001a=\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bRO\u0010\f\u001a=\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/shape/l;", "Landroidx/compose/ui/graphics/e6;", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/g5;", "Li0/n;", "Lkotlin/r0;", "name", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Lkotlin/k2;", "Lkotlin/u;", "builder", "<init>", "(Lld/q;)V", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/graphics/b5;", "a", "(JLandroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;)Landroidx/compose/ui/graphics/b5;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lld/q;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements e6 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f7067b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q<g5, i0.n, w, k2> builder;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@fg.l q<? super g5, ? super i0.n, ? super w, k2> qVar) {
        this.builder = qVar;
    }

    @Override // androidx.compose.ui.graphics.e6
    @fg.l
    public b5 a(long size, @fg.l w layoutDirection, @fg.l androidx.compose.ui.unit.d density) {
        g5 a5 = a1.a();
        this.builder.R(a5, i0.n.c(size), layoutDirection);
        a5.close();
        return new b5.a(a5);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        l lVar = other instanceof l ? (l) other : null;
        return l0.g(lVar != null ? lVar.builder : null, this.builder);
    }

    public int hashCode() {
        return this.builder.hashCode();
    }
}
