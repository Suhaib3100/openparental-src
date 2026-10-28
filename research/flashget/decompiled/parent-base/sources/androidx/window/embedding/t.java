package androidx.window.embedding;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SplitInfo.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/window/embedding/t;", "", "Landroidx/window/embedding/c;", "primaryActivityStack", "secondaryActivityStack", "", "splitRatio", "<init>", "(Landroidx/window/embedding/c;Landroidx/window/embedding/c;F)V", "Landroid/app/Activity;", "activity", "", "a", "(Landroid/app/Activity;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/window/embedding/c;", "b", "()Landroidx/window/embedding/c;", "c", "F", "d", "()F", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c primaryActivityStack;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c secondaryActivityStack;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float splitRatio;

    public t(@fg.l c primaryActivityStack, @fg.l c secondaryActivityStack, float f4) {
        l0.p(primaryActivityStack, "primaryActivityStack");
        l0.p(secondaryActivityStack, "secondaryActivityStack");
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitRatio = f4;
    }

    public final boolean a(@fg.l Activity activity) {
        l0.p(activity, "activity");
        return this.primaryActivityStack.a(activity) || this.secondaryActivityStack.a(activity);
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final c getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final c getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    /* renamed from: d, reason: from getter */
    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return l0.g(this.primaryActivityStack, tVar.primaryActivityStack) && l0.g(this.secondaryActivityStack, tVar.secondaryActivityStack) && this.splitRatio == tVar.splitRatio;
    }

    public int hashCode() {
        return Float.hashCode(this.splitRatio) + ((this.secondaryActivityStack.hashCode() + (this.primaryActivityStack.hashCode() * 31)) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("SplitInfo:{");
        sb.append("primaryActivityStack=" + this.primaryActivityStack + ',');
        sb.append("secondaryActivityStack=" + this.secondaryActivityStack + ',');
        sb.append("splitRatio=" + this.splitRatio + '}');
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
