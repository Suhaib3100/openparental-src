package androidx.window.embedding;

import android.content.Intent;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SplitPlaceholderRule.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0080\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/window/embedding/w;", "Landroidx/window/embedding/x;", "", "Landroidx/window/embedding/a;", "filters", "Landroid/content/Intent;", "placeholderIntent", "", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDirection", "<init>", "(Ljava/util/Set;Landroid/content/Intent;IIFI)V", "filter", "h", "(Landroidx/window/embedding/a;)Landroidx/window/embedding/w;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "e", "Landroid/content/Intent;", "g", "()Landroid/content/Intent;", "f", "Ljava/util/Set;", "()Ljava/util/Set;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w extends x {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Intent placeholderIntent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Set<a> filters;

    public /* synthetic */ w(Set set, Intent intent, int i4, int i5, float f4, int i6, int i7, kotlin.jvm.internal.w wVar) {
        this(set, intent, (i7 & 4) != 0 ? 0 : i4, (i7 & 8) != 0 ? 0 : i5, (i7 & 16) != 0 ? 0.5f : f4, (i7 & 32) != 0 ? 3 : i6);
    }

    @Override // androidx.window.embedding.x
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof w) || !super.equals(other) || !super.equals(other)) {
            return false;
        }
        w wVar = (w) other;
        return l0.g(this.filters, wVar.filters) && l0.g(this.placeholderIntent, wVar.placeholderIntent);
    }

    @fg.l
    public final Set<a> f() {
        return this.filters;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    @fg.l
    public final w h(@fg.l a filter) {
        l0.p(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new w(kotlin.collections.w.a6(linkedHashSet), this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    @Override // androidx.window.embedding.x
    public int hashCode() {
        return this.placeholderIntent.hashCode() + ((this.filters.hashCode() + (super.hashCode() * 31)) * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@fg.l Set<a> filters, @fg.l Intent placeholderIntent, int i4, int i5, float f4, int i6) {
        super(i4, i5, f4, i6);
        l0.p(filters, "filters");
        l0.p(placeholderIntent, "placeholderIntent");
        this.placeholderIntent = placeholderIntent;
        this.filters = kotlin.collections.w.a6(filters);
    }
}
