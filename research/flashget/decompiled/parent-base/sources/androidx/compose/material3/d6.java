package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Label.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/d6;", "Landroidx/compose/material3/b0;", "", "isVisible", "isPersistent", "<init>", "(ZZ)V", "Landroidx/compose/foundation/a2;", "mutatePriority", "Lkotlin/k2;", "c", "(Landroidx/compose/foundation/a2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dismiss", "()V", "a", "Z", "()Z", "b", "d", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class d6 implements b0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVisible;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isPersistent;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d6() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.d6.<init>():void");
    }

    @Override // androidx.compose.material3.b0
    public void a() {
    }

    @Override // androidx.compose.material3.b0
    @fg.m
    public Object c(@fg.l androidx.compose.foundation.a2 a2Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        return kotlin.k2.f75408a;
    }

    @Override // androidx.compose.material3.b0
    /* renamed from: d, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.compose.material3.b0
    public void dismiss() {
    }

    @Override // androidx.compose.material3.b0
    /* renamed from: isVisible, reason: from getter */
    public boolean getIsVisible() {
        return this.isVisible;
    }

    public d6(boolean z4, boolean z5) {
        this.isVisible = z4;
        this.isPersistent = z5;
    }

    public /* synthetic */ d6(boolean z4, boolean z5, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? true : z4, (i4 & 2) != 0 ? true : z5);
    }
}
