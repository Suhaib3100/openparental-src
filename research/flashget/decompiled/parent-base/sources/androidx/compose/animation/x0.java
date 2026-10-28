package androidx.compose.animation;

import kotlin.Metadata;

/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012<\u0010\u000b\u001a8\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u0004¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013RM\u0010\u000b\u001a8\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/x0;", "Landroidx/compose/animation/w0;", "", "clip", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/u;", "Lkotlin/r0;", "name", "initialSize", "targetSize", "Landroidx/compose/animation/core/p0;", "sizeAnimationSpec", "<init>", "(ZLld/p;)V", "k", "(JJ)Landroidx/compose/animation/core/p0;", "a", "Z", "j", "()Z", "b", "Lld/p;", "()Lld/p;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class x0 implements w0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean clip;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, androidx.compose.animation.core.p0<androidx.compose.ui.unit.u>> sizeAnimationSpec;

    /* JADX WARN: Multi-variable type inference failed */
    public x0(boolean z4, @fg.l ld.p<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, ? extends androidx.compose.animation.core.p0<androidx.compose.ui.unit.u>> pVar) {
        this.clip = z4;
        this.sizeAnimationSpec = pVar;
    }

    @fg.l
    public final ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, androidx.compose.animation.core.p0<androidx.compose.ui.unit.u>> a() {
        return this.sizeAnimationSpec;
    }

    @Override // androidx.compose.animation.w0
    /* renamed from: j, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.animation.w0
    @fg.l
    public androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> k(long initialSize, long targetSize) {
        return this.sizeAnimationSpec.invoke(androidx.compose.ui.unit.u.b(initialSize), androidx.compose.ui.unit.u.b(targetSize));
    }

    public /* synthetic */ x0(boolean z4, ld.p pVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? true : z4, pVar);
    }
}
