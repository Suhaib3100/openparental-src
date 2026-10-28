package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Vector.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/vector/n;", "", "<init>", "()V", "Lkotlin/k2;", "c", "Landroidx/compose/ui/graphics/drawscope/f;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V", "Lkotlin/Function1;", "Lld/l;", "b", "()Lld/l;", "d", "(Lld/l;)V", "invalidateListener", "Landroidx/compose/ui/graphics/vector/c;", "Landroidx/compose/ui/graphics/vector/h;", "Landroidx/compose/ui/graphics/vector/p;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: b, reason: collision with root package name */
    public static final int f18281b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super n, k2> invalidateListener;

    public /* synthetic */ n(kotlin.jvm.internal.w wVar) {
        this();
    }

    public abstract void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar);

    @fg.m
    public ld.l<n, k2> b() {
        return this.invalidateListener;
    }

    public final void c() {
        ld.l<n, k2> b5 = b();
        if (b5 != null) {
            b5.invoke(this);
        }
    }

    public void d(@fg.m ld.l<? super n, k2> lVar) {
        this.invalidateListener = lVar;
    }

    private n() {
    }
}
