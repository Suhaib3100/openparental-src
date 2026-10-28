package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.o2;
import java.util.List;
import kotlin.Metadata;

/* compiled from: WindowInsets.android.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010/\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R$\u00105\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00066"}, d2 = {"Landroidx/compose/foundation/layout/q0;", "Landroidx/core/view/o2$b;", "Ljava/lang/Runnable;", "Landroidx/core/view/d1;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/foundation/layout/q2;", "composeInsets", "<init>", "(Landroidx/compose/foundation/layout/q2;)V", "Landroidx/core/view/o2;", "animation", "Lkotlin/k2;", "d", "(Landroidx/core/view/o2;)V", "Landroidx/core/view/o2$a;", "bounds", "f", "(Landroidx/core/view/o2;Landroidx/core/view/o2$a;)Landroidx/core/view/o2$a;", "Landroidx/core/view/j3;", "insets", "", "runningAnimations", "e", "(Landroidx/core/view/j3;Ljava/util/List;)Landroidx/core/view/j3;", "c", "Landroid/view/View;", "view", "a", "(Landroid/view/View;Landroidx/core/view/j3;)Landroidx/core/view/j3;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "v", "onViewDetachedFromWindow", "Landroidx/compose/foundation/layout/q2;", "g", "()Landroidx/compose/foundation/layout/q2;", "", "Z", "h", "()Z", "k", "(Z)V", "prepared", "i", "l", "runningAnimation", "Landroidx/core/view/j3;", "j", "()Landroidx/core/view/j3;", "m", "(Landroidx/core/view/j3;)V", "savedInsets", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class q0 extends o2.b implements Runnable, androidx.core.view.d1, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q2 composeInsets;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean prepared;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean runningAnimation;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.core.view.j3 savedInsets;

    public q0(@fg.l q2 q2Var) {
        super(!q2Var.getConsumes() ? 1 : 0);
        this.composeInsets = q2Var;
    }

    @Override // androidx.core.view.d1
    @fg.l
    public androidx.core.view.j3 a(@fg.l View view, @fg.l androidx.core.view.j3 insets) {
        this.savedInsets = insets;
        this.composeInsets.C(insets);
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            this.composeInsets.B(insets);
            q2.A(this.composeInsets, insets, 0, 2, null);
        }
        return this.composeInsets.getConsumes() ? androidx.core.view.j3.f27272c : insets;
    }

    @Override // androidx.core.view.o2.b
    public void c(@fg.l androidx.core.view.o2 animation) {
        this.prepared = false;
        this.runningAnimation = false;
        androidx.core.view.j3 j3Var = this.savedInsets;
        if (animation.b() != 0 && j3Var != null) {
            this.composeInsets.B(j3Var);
            this.composeInsets.C(j3Var);
            q2.A(this.composeInsets, j3Var, 0, 2, null);
        }
        this.savedInsets = null;
    }

    @Override // androidx.core.view.o2.b
    public void d(@fg.l androidx.core.view.o2 animation) {
        this.prepared = true;
        this.runningAnimation = true;
    }

    @Override // androidx.core.view.o2.b
    @fg.l
    public androidx.core.view.j3 e(@fg.l androidx.core.view.j3 insets, @fg.l List<androidx.core.view.o2> runningAnimations) {
        q2.A(this.composeInsets, insets, 0, 2, null);
        return this.composeInsets.getConsumes() ? androidx.core.view.j3.f27272c : insets;
    }

    @Override // androidx.core.view.o2.b
    @fg.l
    public o2.a f(@fg.l androidx.core.view.o2 animation, @fg.l o2.a bounds) {
        this.prepared = false;
        return bounds;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final q2 getComposeInsets() {
        return this.composeInsets;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getPrepared() {
        return this.prepared;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getRunningAnimation() {
        return this.runningAnimation;
    }

    @fg.m
    /* renamed from: j, reason: from getter */
    public final androidx.core.view.j3 getSavedInsets() {
        return this.savedInsets;
    }

    public final void k(boolean z4) {
        this.prepared = z4;
    }

    public final void l(boolean z4) {
        this.runningAnimation = z4;
    }

    public final void m(@fg.m androidx.core.view.j3 j3Var) {
        this.savedInsets = j3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@fg.l View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@fg.l View v4) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            androidx.core.view.j3 j3Var = this.savedInsets;
            if (j3Var != null) {
                this.composeInsets.B(j3Var);
                q2.A(this.composeInsets, j3Var, 0, 2, null);
                this.savedInsets = null;
            }
        }
    }
}
