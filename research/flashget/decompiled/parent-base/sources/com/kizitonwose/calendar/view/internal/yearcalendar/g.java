package com.kizitonwose.calendar.view.internal.yearcalendar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.q0;

/* compiled from: YearRoot.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\b0\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J(\u0010\u0013\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JT\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b%\u0010\u0011R/\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b'\u0010\u0014¨\u0006("}, d2 = {"Lcom/kizitonwose/calendar/view/internal/yearcalendar/g;", "", "Landroid/view/ViewGroup;", "itemView", "Landroid/view/View;", "headerView", "footerView", "", "Lkotlin/q0;", "Landroid/widget/LinearLayout;", "Lcom/kizitonwose/calendar/view/internal/yearcalendar/h;", "monthRowHolders", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Ljava/util/List;)V", "a", "()Landroid/view/ViewGroup;", "b", "()Landroid/view/View;", "c", "d", "()Ljava/util/List;", "e", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Ljava/util/List;)Lcom/kizitonwose/calendar/view/internal/yearcalendar/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "i", "Landroid/view/View;", "h", "g", "Ljava/util/List;", "j", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final ViewGroup itemView;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final View headerView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final View footerView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<q0<LinearLayout, List<h>>> monthRowHolders;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@l ViewGroup viewGroup, @m View view, @m View view2, @l List<? extends q0<? extends LinearLayout, ? extends List<h>>> list) {
        l0.p(viewGroup, ProtectedSandApp.s("ᕟ\u0001"));
        l0.p(list, ProtectedSandApp.s("ᕠ\u0001"));
        this.itemView = viewGroup;
        this.headerView = view;
        this.footerView = view2;
        this.monthRowHolders = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g f(g gVar, ViewGroup viewGroup, View view, View view2, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            viewGroup = gVar.itemView;
        }
        if ((i4 & 2) != 0) {
            view = gVar.headerView;
        }
        if ((i4 & 4) != 0) {
            view2 = gVar.footerView;
        }
        if ((i4 & 8) != 0) {
            list = gVar.monthRowHolders;
        }
        return gVar.e(viewGroup, view, view2, list);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ViewGroup getItemView() {
        return this.itemView;
    }

    @m
    /* renamed from: b, reason: from getter */
    public final View getHeaderView() {
        return this.headerView;
    }

    @m
    /* renamed from: c, reason: from getter */
    public final View getFooterView() {
        return this.footerView;
    }

    @l
    public final List<q0<LinearLayout, List<h>>> d() {
        return this.monthRowHolders;
    }

    @l
    public final g e(@l ViewGroup itemView, @m View headerView, @m View footerView, @l List<? extends q0<? extends LinearLayout, ? extends List<h>>> monthRowHolders) {
        l0.p(itemView, ProtectedSandApp.s("ᕟ\u0001"));
        l0.p(monthRowHolders, ProtectedSandApp.s("ᕠ\u0001"));
        return new g(itemView, headerView, footerView, monthRowHolders);
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return l0.g(this.itemView, gVar.itemView) && l0.g(this.headerView, gVar.headerView) && l0.g(this.footerView, gVar.footerView) && l0.g(this.monthRowHolders, gVar.monthRowHolders);
    }

    @m
    public final View g() {
        return this.footerView;
    }

    @m
    public final View h() {
        return this.headerView;
    }

    public int hashCode() {
        int hashCode = this.itemView.hashCode() * 31;
        View view = this.headerView;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.footerView;
        return this.monthRowHolders.hashCode() + ((hashCode2 + (view2 != null ? view2.hashCode() : 0)) * 31);
    }

    @l
    public final ViewGroup i() {
        return this.itemView;
    }

    @l
    public final List<q0<LinearLayout, List<h>>> j() {
        return this.monthRowHolders;
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("ᕡ\u0001") + this.itemView + ProtectedSandApp.s("ᕢ\u0001") + this.headerView + ProtectedSandApp.s("ᕣ\u0001") + this.footerView + ProtectedSandApp.s("ᕤ\u0001") + this.monthRowHolders + ProtectedSandApp.s("ᕥ\u0001");
    }
}
