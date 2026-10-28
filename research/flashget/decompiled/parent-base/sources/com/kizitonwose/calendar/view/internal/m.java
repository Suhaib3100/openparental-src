package com.kizitonwose.calendar.view.internal;

import android.view.View;
import android.view.ViewGroup;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ItemRoot.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JN\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b$\u0010\u0010R#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010\u0013¨\u0006'"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/m;", "Day", "", "Landroid/view/ViewGroup;", "itemView", "Landroid/view/View;", "headerView", "footerView", "", "Lcom/kizitonwose/calendar/view/internal/p;", "weekHolders", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Ljava/util/List;)V", "a", "()Landroid/view/ViewGroup;", "b", "()Landroid/view/View;", "c", "d", "()Ljava/util/List;", "e", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Ljava/util/List;)Lcom/kizitonwose/calendar/view/internal/m;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "i", "Landroid/view/View;", "h", "g", "Ljava/util/List;", "j", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class m<Day> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ViewGroup itemView;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final View headerView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final View footerView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<p<Day>> weekHolders;

    public m(@fg.l ViewGroup viewGroup, @fg.m View view, @fg.m View view2, @fg.l List<p<Day>> list) {
        l0.p(viewGroup, ProtectedSandApp.s("ᔂ\u0001"));
        l0.p(list, ProtectedSandApp.s("ᔃ\u0001"));
        this.itemView = viewGroup;
        this.headerView = view;
        this.footerView = view2;
        this.weekHolders = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m f(m mVar, ViewGroup viewGroup, View view, View view2, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            viewGroup = mVar.itemView;
        }
        if ((i4 & 2) != 0) {
            view = mVar.headerView;
        }
        if ((i4 & 4) != 0) {
            view2 = mVar.footerView;
        }
        if ((i4 & 8) != 0) {
            list = mVar.weekHolders;
        }
        return mVar.e(viewGroup, view, view2, list);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final ViewGroup getItemView() {
        return this.itemView;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final View getHeaderView() {
        return this.headerView;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final View getFooterView() {
        return this.footerView;
    }

    @fg.l
    public final List<p<Day>> d() {
        return this.weekHolders;
    }

    @fg.l
    public final m<Day> e(@fg.l ViewGroup itemView, @fg.m View headerView, @fg.m View footerView, @fg.l List<p<Day>> weekHolders) {
        l0.p(itemView, ProtectedSandApp.s("ᔂ\u0001"));
        l0.p(weekHolders, ProtectedSandApp.s("ᔃ\u0001"));
        return new m<>(itemView, headerView, footerView, weekHolders);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return l0.g(this.itemView, mVar.itemView) && l0.g(this.headerView, mVar.headerView) && l0.g(this.footerView, mVar.footerView) && l0.g(this.weekHolders, mVar.weekHolders);
    }

    @fg.m
    public final View g() {
        return this.footerView;
    }

    @fg.m
    public final View h() {
        return this.headerView;
    }

    public int hashCode() {
        int hashCode = this.itemView.hashCode() * 31;
        View view = this.headerView;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.footerView;
        return this.weekHolders.hashCode() + ((hashCode2 + (view2 != null ? view2.hashCode() : 0)) * 31);
    }

    @fg.l
    public final ViewGroup i() {
        return this.itemView;
    }

    @fg.l
    public final List<p<Day>> j() {
        return this.weekHolders;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("ᔄ\u0001") + this.itemView + ProtectedSandApp.s("ᔅ\u0001") + this.headerView + ProtectedSandApp.s("ᔆ\u0001") + this.footerView + ProtectedSandApp.s("ᔇ\u0001") + this.weekHolders + ProtectedSandApp.s("ᔈ\u0001");
    }
}
