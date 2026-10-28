package androidx.window.embedding;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ActivityRule.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0080\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/window/embedding/b;", "Landroidx/window/embedding/m;", "", "Landroidx/window/embedding/a;", "filters", "", "alwaysExpand", "<init>", "(Ljava/util/Set;Z)V", "filter", "c", "(Landroidx/window/embedding/a;)Landroidx/window/embedding/b;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "()Z", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean alwaysExpand;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Set<a> filters;

    public /* synthetic */ b(Set set, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this(set, (i4 & 2) != 0 ? false : z4);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    @fg.l
    public final Set<a> b() {
        return this.filters;
    }

    @fg.l
    public final b c(@fg.l a filter) {
        l0.p(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new b(kotlin.collections.w.a6(linkedHashSet), this.alwaysExpand);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return l0.g(this.filters, bVar.filters) && this.alwaysExpand == bVar.alwaysExpand;
    }

    public int hashCode() {
        return Boolean.hashCode(this.alwaysExpand) + (this.filters.hashCode() * 31);
    }

    public b(@fg.l Set<a> filters, boolean z4) {
        l0.p(filters, "filters");
        this.alwaysExpand = z4;
        this.filters = kotlin.collections.w.a6(filters);
    }
}
