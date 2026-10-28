package com.kizitonwose.calendar.view.internal.yearcalendar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.kizitonwose.calendar.view.q;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;

/* compiled from: YearViewHolder.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u0086\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\b0\u0007\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010)R,\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010*R\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010,R/\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b(\u00106\"\u0004\b+\u0010\u001f¨\u00067"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/yearcalendar/j;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/ViewGroup;", "rootLayout", "Landroid/view/View;", "headerView", "footerView", "", "Lkotlin/q0;", "Landroid/widget/LinearLayout;", "Lcom/kizitonwose/calendar/view/internal/yearcalendar/h;", "monthRowHolders", "Lcom/kizitonwose/calendar/view/q;", "Lcom/kizitonwose/calendar/view/l;", "yearHeaderBinder", "yearFooterBinder", "Lkotlin/Function1;", "Lcb/b;", "Lkotlin/r0;", "name", "month", "", "isMonthVisible", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Ljava/util/List;Lcom/kizitonwose/calendar/view/q;Lcom/kizitonwose/calendar/view/q;Lld/l;)V", "f", "()Ljava/util/List;", "Lcb/c;", "year", "Lkotlin/k2;", "a", "(Lcb/c;)V", "Lorg/threeten/bp/q;", "yearMonth", "d", "(Lorg/threeten/bp/q;)V", "Lcb/a;", "day", "c", "(Lcb/a;)V", "b", "Landroid/view/View;", "Ljava/util/List;", "e", "Lcom/kizitonwose/calendar/view/q;", "g", "Lld/l;", "h", "Lcom/kizitonwose/calendar/view/l;", "yearHeaderContainer", "i", "yearFooterContainer", "j", "Lcb/c;", "()Lcb/c;", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nYearViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YearViewHolder.kt\ncom/kizitonwose/calendar/view/internal/yearcalendar/YearViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,75:1\n766#2:76\n857#2,2:77\n1747#2,3:79\n288#2,2:84\n288#2,2:86\n1549#2:88\n1620#2,3:89\n766#2:92\n857#2,2:93\n262#3,2:82\n*S KotlinDebug\n*F\n+ 1 YearViewHolder.kt\ncom/kizitonwose/calendar/view/internal/yearcalendar/YearViewHolder\n*L\n37#1:76\n37#1:77,2\n48#1:79,3\n59#1:84,2\n65#1:86,2\n71#1:88\n71#1:89,3\n73#1:92\n73#1:93,2\n48#1:82,2\n*E\n"})
/* loaded from: classes6.dex */
public final class j extends RecyclerView.e0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final View headerView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final View footerView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<q0<LinearLayout, List<h>>> monthRowHolders;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private final q<com.kizitonwose.calendar.view.l> yearHeaderBinder;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private final q<com.kizitonwose.calendar.view.l> yearFooterBinder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<cb.b, Boolean> isMonthVisible;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @m
    private com.kizitonwose.calendar.view.l yearHeaderContainer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @m
    private com.kizitonwose.calendar.view.l yearFooterContainer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public cb.c year;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(@l ViewGroup viewGroup, @m View view, @m View view2, @l List<? extends q0<? extends LinearLayout, ? extends List<h>>> list, @m q<com.kizitonwose.calendar.view.l> qVar, @m q<com.kizitonwose.calendar.view.l> qVar2, @l ld.l<? super cb.b, Boolean> lVar) {
        super(viewGroup);
        l0.p(viewGroup, ProtectedSandApp.s("ᕵ\u0001"));
        l0.p(list, ProtectedSandApp.s("ᕶ\u0001"));
        l0.p(lVar, ProtectedSandApp.s("ᕷ\u0001"));
        this.headerView = view;
        this.footerView = view2;
        this.monthRowHolders = list;
        this.yearHeaderBinder = qVar;
        this.yearFooterBinder = qVar2;
        this.isMonthVisible = lVar;
    }

    private final List<h> f() {
        List<q0<LinearLayout, List<h>>> list = this.monthRowHolders;
        ArrayList arrayList = new ArrayList(w.b0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((List) ((q0) it.next()).f());
        }
        List d02 = w.d0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : d02) {
            if (((h) obj).c()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@l cb.c year) {
        boolean z4;
        l0.p(year, ProtectedSandApp.s("ᕸ\u0001"));
        e(year);
        View view = this.headerView;
        if (view != null) {
            com.kizitonwose.calendar.view.l lVar = this.yearHeaderContainer;
            if (lVar == null) {
                q<com.kizitonwose.calendar.view.l> qVar = this.yearHeaderBinder;
                l0.m(qVar);
                lVar = qVar.b(view);
                this.yearHeaderContainer = lVar;
            }
            q<com.kizitonwose.calendar.view.l> qVar2 = this.yearHeaderBinder;
            if (qVar2 != null) {
                qVar2.a(lVar, year);
            }
        }
        List<cb.b> e4 = year.e();
        ld.l<cb.b, Boolean> lVar2 = this.isMonthVisible;
        ArrayList arrayList = new ArrayList();
        for (Object obj : e4) {
            if (((Boolean) lVar2.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        int i4 = 0;
        for (q0<LinearLayout, List<h>> q0Var : this.monthRowHolders) {
            LinearLayout a5 = q0Var.a();
            List<h> b5 = q0Var.b();
            for (h hVar : b5) {
                if (arrayList.size() > i4) {
                    hVar.a((cb.b) arrayList.get(i4));
                } else {
                    hVar.d();
                }
                i4++;
            }
            List<h> list = b5;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).c()) {
                        z4 = true;
                        break;
                    }
                }
            }
            z4 = false;
            a5.setVisibility(z4 ? 0 : 8);
        }
        View view2 = this.footerView;
        if (view2 != null) {
            com.kizitonwose.calendar.view.l lVar3 = this.yearFooterContainer;
            if (lVar3 == null) {
                q<com.kizitonwose.calendar.view.l> qVar3 = this.yearFooterBinder;
                l0.m(qVar3);
                lVar3 = qVar3.b(view2);
                this.yearFooterContainer = lVar3;
            }
            q<com.kizitonwose.calendar.view.l> qVar4 = this.yearFooterBinder;
            if (qVar4 != null) {
                qVar4.a(lVar3, year);
            }
        }
    }

    @l
    public final cb.c b() {
        cb.c cVar = this.year;
        if (cVar != null) {
            return cVar;
        }
        l0.S(ProtectedSandApp.s("ᕸ\u0001"));
        return null;
    }

    public final void c(@l cb.a day) {
        l0.p(day, ProtectedSandApp.s("ᕹ\u0001"));
        Iterator<T> it = f().iterator();
        while (it.hasNext() && !((h) it.next()).e(day)) {
        }
    }

    public final void d(@l org.threeten.bp.q yearMonth) {
        l0.p(yearMonth, ProtectedSandApp.s("ᕺ\u0001"));
        Iterator<T> it = f().iterator();
        while (it.hasNext() && !((h) it.next()).f(yearMonth)) {
        }
    }

    public final void e(@l cb.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("ᕻ\u0001"));
        this.year = cVar;
    }
}
