package androidx.compose.animation;

import androidx.compose.runtime.h2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: AnimatedContent.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0010\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/animation/x;", "", "Landroidx/compose/animation/f0;", "targetContentEnter", "Landroidx/compose/animation/h0;", "initialContentExit", "", "targetContentZIndex", "Landroidx/compose/animation/w0;", "sizeTransform", "<init>", "(Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;FLandroidx/compose/animation/w0;)V", "a", "Landroidx/compose/animation/f0;", "c", "()Landroidx/compose/animation/f0;", "b", "Landroidx/compose/animation/h0;", "()Landroidx/compose/animation/h0;", "<set-?>", "Landroidx/compose/runtime/h2;", "d", "()F", "f", "(F)V", "Landroidx/compose/animation/w0;", "()Landroidx/compose/animation/w0;", "e", "(Landroidx/compose/animation/w0;)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,831:1\n76#2:832\n109#2,2:833\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n*L\n198#1:832\n198#1:833,2\n*E\n"})
/* loaded from: classes.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final int f3391e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f0 targetContentEnter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 initialContentExit;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h2 targetContentZIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private w0 sizeTransform;

    public x(@fg.l f0 f0Var, @fg.l h0 h0Var, float f4, @fg.m w0 w0Var) {
        this.targetContentEnter = f0Var;
        this.initialContentExit = h0Var;
        this.targetContentZIndex = androidx.compose.runtime.b.b(f4);
        this.sizeTransform = w0Var;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final h0 getInitialContentExit() {
        return this.initialContentExit;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final w0 getSizeTransform() {
        return this.sizeTransform;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final f0 getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public final float d() {
        return this.targetContentZIndex.b();
    }

    public final void e(@fg.m w0 w0Var) {
        this.sizeTransform = w0Var;
    }

    public final void f(float f4) {
        this.targetContentZIndex.E(f4);
    }

    public /* synthetic */ x(f0 f0Var, h0 h0Var, float f4, w0 w0Var, int i4, kotlin.jvm.internal.w wVar) {
        this(f0Var, h0Var, (i4 & 4) != 0 ? 0.0f : f4, (i4 & 8) != 0 ? f.d(false, null, 3, null) : w0Var);
    }
}
