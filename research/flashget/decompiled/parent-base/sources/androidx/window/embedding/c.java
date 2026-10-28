package androidx.window.embedding;

import android.app.Activity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ActivityStack.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/window/embedding/c;", "", "", "Landroid/app/Activity;", "activities", "", "isEmpty", "<init>", "(Ljava/util/List;Z)V", "activity", "a", "(Landroid/app/Activity;)Z", "c", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<Activity> activities;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@fg.l List<? extends Activity> activities, boolean z4) {
        l0.p(activities, "activities");
        this.activities = activities;
        this.isEmpty = z4;
    }

    public final boolean a(@fg.l Activity activity) {
        l0.p(activity, "activity");
        return this.activities.contains(activity);
    }

    @fg.l
    public final List<Activity> b() {
        return this.activities;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return (l0.g(this.activities, cVar.activities) || this.isEmpty == cVar.isEmpty) ? false : true;
    }

    public int hashCode() {
        return this.activities.hashCode() + ((this.isEmpty ? 1 : 0) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("ActivityStack{");
        sb.append(l0.C("activities=", this.activities));
        sb.append("isEmpty=" + this.isEmpty + '}');
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ c(List list, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this(list, (i4 & 2) != 0 ? false : z4);
    }
}
