package com.kizitonwose.calendar.view.internal.monthcalendar;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.kizitonwose.calendar.view.i;
import com.kizitonwose.calendar.view.internal.p;
import fg.l;
import fg.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: MonthViewHolder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/monthcalendar/d;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/ViewGroup;", "rootLayout", "Landroid/view/View;", "headerView", "footerView", "", "Lcom/kizitonwose/calendar/view/internal/p;", "Lcb/a;", "weekHolders", "Lcom/kizitonwose/calendar/view/i;", "Lcom/kizitonwose/calendar/view/l;", "monthHeaderBinder", "monthFooterBinder", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Ljava/util/List;Lcom/kizitonwose/calendar/view/i;Lcom/kizitonwose/calendar/view/i;)V", "Lcb/b;", "month", "Lkotlin/k2;", "a", "(Lcb/b;)V", "day", "b", "(Lcb/a;)V", "Landroid/view/View;", "c", "d", "Ljava/util/List;", "e", "Lcom/kizitonwose/calendar/view/i;", "f", "g", "Lcom/kizitonwose/calendar/view/l;", "headerContainer", "h", "footerContainer", "i", "Lcb/b;", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMonthViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonthViewHolder.kt\ncom/kizitonwose/calendar/view/internal/monthcalendar/MonthViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1864#2,3:48\n288#2,2:51\n*S KotlinDebug\n*F\n+ 1 MonthViewHolder.kt\ncom/kizitonwose/calendar/view/internal/monthcalendar/MonthViewHolder\n*L\n32#1:48,3\n44#1:51,2\n*E\n"})
/* loaded from: classes6.dex */
public final class d extends RecyclerView.e0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final View headerView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final View footerView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<p<cb.a>> weekHolders;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private final i<com.kizitonwose.calendar.view.l> monthHeaderBinder;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private final i<com.kizitonwose.calendar.view.l> monthFooterBinder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    private com.kizitonwose.calendar.view.l headerContainer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @m
    private com.kizitonwose.calendar.view.l footerContainer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private cb.b month;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@l ViewGroup viewGroup, @m View view, @m View view2, @l List<p<cb.a>> list, @m i<com.kizitonwose.calendar.view.l> iVar, @m i<com.kizitonwose.calendar.view.l> iVar2) {
        super(viewGroup);
        l0.p(viewGroup, ProtectedSandApp.s("ᔝ\u0001"));
        l0.p(list, ProtectedSandApp.s("ᔞ\u0001"));
        this.headerView = view;
        this.footerView = view2;
        this.weekHolders = list;
        this.monthHeaderBinder = iVar;
        this.monthFooterBinder = iVar2;
    }

    public final void a(@l cb.b month) {
        l0.p(month, ProtectedSandApp.s("ᔟ\u0001"));
        this.month = month;
        View view = this.headerView;
        if (view != null) {
            com.kizitonwose.calendar.view.l lVar = this.headerContainer;
            if (lVar == null) {
                i<com.kizitonwose.calendar.view.l> iVar = this.monthHeaderBinder;
                l0.m(iVar);
                lVar = iVar.b(view);
                this.headerContainer = lVar;
            }
            i<com.kizitonwose.calendar.view.l> iVar2 = this.monthHeaderBinder;
            if (iVar2 != null) {
                iVar2.a(lVar, month);
            }
        }
        int i4 = 0;
        for (Object obj : this.weekHolders) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                w.Z();
            }
            p pVar = (p) obj;
            Collection collection = (List) w.W2(month.e(), i4);
            if (collection == null) {
                collection = j0.f74919b;
            }
            pVar.a(collection);
            i4 = i5;
        }
        View view2 = this.footerView;
        if (view2 != null) {
            com.kizitonwose.calendar.view.l lVar2 = this.footerContainer;
            if (lVar2 == null) {
                i<com.kizitonwose.calendar.view.l> iVar3 = this.monthFooterBinder;
                l0.m(iVar3);
                lVar2 = iVar3.b(view2);
                this.footerContainer = lVar2;
            }
            i<com.kizitonwose.calendar.view.l> iVar4 = this.monthFooterBinder;
            if (iVar4 != null) {
                iVar4.a(lVar2, month);
            }
        }
    }

    public final void b(@l cb.a day) {
        l0.p(day, ProtectedSandApp.s("ᔠ\u0001"));
        Iterator<T> it = this.weekHolders.iterator();
        while (it.hasNext() && !((p) it.next()).c(day)) {
        }
    }
}
