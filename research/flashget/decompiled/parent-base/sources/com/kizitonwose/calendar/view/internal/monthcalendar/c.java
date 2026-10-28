package com.kizitonwose.calendar.view.internal.monthcalendar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cb.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.kizitonwose.calendar.view.CalendarView;
import com.kizitonwose.calendar.view.h;
import com.kizitonwose.calendar.view.internal.n;
import db.e;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import org.threeten.bp.q;

/* compiled from: MonthCalendarAdapter.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010\u0016J\u001f\u0010,\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0010H\u0016¢\u0006\u0004\b,\u0010-J-\u00101\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\fH\u0016¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u00104J!\u00107\u001a\u00020\"2\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a05\"\u00020\u001a¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0007¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\"¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\"¢\u0006\u0004\b>\u0010=J\u0017\u0010?\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u0007H\u0001¢\u0006\u0004\b?\u0010@J%\u0010A\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0001¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u001aH\u0000¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bG\u0010FJ\u000f\u0010H\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\bJ\u0010IJ/\u0010K\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\bK\u0010LJ/\u0010M\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fH\u0001¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\u001eR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00120`8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010cR\u0014\u0010g\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006l"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/monthcalendar/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/kizitonwose/calendar/view/internal/monthcalendar/d;", "Lcom/kizitonwose/calendar/view/CalendarView;", "calView", "Lcb/g;", "outDateStyle", "Lorg/threeten/bp/q;", "startMonth", "endMonth", "Lorg/threeten/bp/d;", "firstDayOfWeek", "", "skipMonths", "<init>", "(Lcom/kizitonwose/calendar/view/CalendarView;Lcb/g;Lorg/threeten/bp/q;Lorg/threeten/bp/q;Lorg/threeten/bp/d;Ljava/util/List;)V", "", "position", "Lcb/b;", "s", "(I)Lcb/b;", "k", "()I", "n", "", "isFirst", "Lcb/a;", "o", "(Z)Lcb/a;", "monthIncrement", "I", "(ZI)Lcb/a;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lkotlin/k2;", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "getItemId", "(I)J", "getItemCount", "Landroid/view/ViewGroup;", "parent", "viewType", "C", "(Landroid/view/ViewGroup;I)Lcom/kizitonwose/calendar/view/internal/monthcalendar/d;", "holder", "", "payloads", "B", "(Lcom/kizitonwose/calendar/view/internal/monthcalendar/d;ILjava/util/List;)V", "A", "(Lcom/kizitonwose/calendar/view/internal/monthcalendar/d;I)V", "", "day", "E", "([Lcb/a;)V", "month", "F", "(Lorg/threeten/bp/q;)V", "D", "()V", "x", "q", "(Lorg/threeten/bp/q;)I", "r", "(Lorg/threeten/bp/q;Ljava/util/List;)I", "p", "(Lcb/a;)I", "j", "()Lcb/b;", "m", "i", "()Lcb/a;", "l", "H", "(Lorg/threeten/bp/q;Lorg/threeten/bp/q;Lcb/g;Lorg/threeten/bp/d;)V", "u", "(Lorg/threeten/bp/q;Lorg/threeten/bp/q;Ljava/util/List;)I", "b", "Lcom/kizitonwose/calendar/view/CalendarView;", "c", "Lcb/g;", "d", "Lorg/threeten/bp/q;", "e", "f", "Lorg/threeten/bp/d;", "g", "Ljava/util/List;", "v", "()Ljava/util/List;", "G", "(Ljava/util/List;)V", "h", "itemCount", "Ldb/a;", "Ldb/a;", "dataStore", "Lcb/b;", "visibleMonth", "w", "()Z", "isAttached", "Lcom/kizitonwose/calendar/view/internal/monthcalendar/MonthCalendarLayoutManager;", "t", "()Lcom/kizitonwose/calendar/view/internal/monthcalendar/MonthCalendarLayoutManager;", "layoutManager", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMonthCalendarAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonthCalendarAdapter.kt\ncom/kizitonwose/calendar/view/internal/monthcalendar/MonthCalendarAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1855#2,2:291\n1855#2,2:295\n288#2,2:298\n766#2:300\n857#2,2:301\n13309#3,2:293\n1#4:297\n*S KotlinDebug\n*F\n+ 1 MonthCalendarAdapter.kt\ncom/kizitonwose/calendar/view/internal/monthcalendar/MonthCalendarAdapter\n*L\n88#1:291,2\n183#1:295,2\n248#1:298,2\n283#1:300\n283#1:301,2\n99#1:293,2\n*E\n"})
/* loaded from: classes6.dex */
public final class c extends RecyclerView.h<d> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final CalendarView calView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private g outDateStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private q startMonth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private q endMonth;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private org.threeten.bp.d firstDayOfWeek;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    private List<q> skipMonths;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int itemCount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    @SuppressLint({"NewApi"})
    private final db.a<cb.b> dataStore;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @m
    private cb.b visibleMonth;

    /* compiled from: MonthCalendarAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "offset", "Lcb/b;", "a", "(I)Lcb/b;"}, k = 3, mv = {1, 9, 0})
    static final class a extends n0 implements ld.l<Integer, cb.b> {
        a() {
            super(1);
        }

        @l
        public final cb.b a(int i4) {
            return e.b(c.this.startMonth, i4, c.this.firstDayOfWeek, c.this.outDateStyle, c.this.v()).getCalendarMonth();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ cb.b invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public /* synthetic */ c(CalendarView calendarView, g gVar, q qVar, q qVar2, org.threeten.bp.d dVar, List list, int i4, w wVar) {
        this(calendarView, gVar, qVar, qVar2, dVar, (i4 & 32) != 0 ? null : list);
    }

    private final cb.a I(boolean isFirst, int monthIncrement) {
        int i4;
        View findViewByPosition;
        int k4 = isFirst ? k() : n();
        Object obj = null;
        if (k4 == -1 || (findViewByPosition = t().findViewByPosition((i4 = k4 + monthIncrement))) == null) {
            return null;
        }
        Rect rect = new Rect();
        if (!findViewByPosition.getGlobalVisibleRect(rect) || rect.isEmpty()) {
            return null;
        }
        Rect rect2 = new Rect();
        List d02 = kotlin.collections.w.d0(this.dataStore.get(Integer.valueOf(i4)).e());
        if (!isFirst) {
            d02 = kotlin.collections.w.X4(d02);
        }
        Iterator it = d02.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            View findViewWithTag = findViewByPosition.findViewWithTag(Integer.valueOf(n.a(((cb.a) next).e())));
            if (findViewWithTag != null && findViewWithTag.getGlobalVisibleRect(rect2) && com.kizitonwose.calendar.view.internal.l.c(rect2, rect)) {
                obj = next;
                break;
            }
        }
        return (cb.a) obj;
    }

    static /* synthetic */ cb.a J(c cVar, boolean z4, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return cVar.I(z4, i4);
    }

    private final int k() {
        return t().findFirstVisibleItemPosition();
    }

    private final int n() {
        return t().findLastVisibleItemPosition();
    }

    private final cb.a o(boolean isFirst) {
        cb.a J = J(this, isFirst, 0, 2, null);
        if (J != null) {
            return J;
        }
        cb.a I = I(isFirst, -1);
        return I == null ? I(isFirst, 1) : I;
    }

    private final cb.b s(int position) {
        return this.dataStore.get(Integer.valueOf(position));
    }

    private final MonthCalendarLayoutManager t() {
        RecyclerView.LayoutManager layoutManager = this.calView.getLayoutManager();
        l0.n(layoutManager, ProtectedSandApp.s("ᔑ\u0001"));
        return (MonthCalendarLayoutManager) layoutManager;
    }

    private final boolean w() {
        return this.calView.getAdapter() == this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(c cVar) {
        l0.p(cVar, ProtectedSandApp.s("ᔒ\u0001"));
        cVar.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(c cVar) {
        l0.p(cVar, ProtectedSandApp.s("ᔒ\u0001"));
        cVar.x();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@l d holder, int position) {
        l0.p(holder, ProtectedSandApp.s("ᔓ\u0001"));
        holder.a(s(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@l d holder, int position, @l List<? extends Object> payloads) {
        l0.p(holder, ProtectedSandApp.s("ᔓ\u0001"));
        l0.p(payloads, ProtectedSandApp.s("ᔔ\u0001"));
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, position, payloads);
            return;
        }
        for (Object obj : payloads) {
            l0.n(obj, ProtectedSandApp.s("ᔕ\u0001"));
            holder.b((cb.a) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @l
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(@l ViewGroup parent, int viewType) {
        l0.p(parent, ProtectedSandApp.s("ᔖ\u0001"));
        com.kizitonwose.calendar.view.g monthMargins = this.calView.getMonthMargins();
        com.kizitonwose.calendar.view.e daySize = this.calView.getDaySize();
        Context context = this.calView.getContext();
        l0.o(context, ProtectedSandApp.s("ᔗ\u0001"));
        int dayViewResource = this.calView.getDayViewResource();
        int monthHeaderResource = this.calView.getMonthHeaderResource();
        int monthFooterResource = this.calView.getMonthFooterResource();
        String monthViewClass = this.calView.getMonthViewClass();
        h<?> k4 = this.calView.k();
        l0.n(k4, ProtectedSandApp.s("ᔘ\u0001"));
        com.kizitonwose.calendar.view.internal.m b5 = n.b(monthMargins, daySize, context, dayViewResource, monthHeaderResource, monthFooterResource, 6, monthViewClass, k4);
        return new d(b5.i(), b5.h(), b5.g(), b5.j(), this.calView.q(), this.calView.o());
    }

    public final void D() {
        notifyItemRangeChanged(0, this.itemCount);
    }

    public final void E(@l cb.a... day) {
        l0.p(day, ProtectedSandApp.s("ᔙ\u0001"));
        for (cb.a aVar : day) {
            int p4 = p(aVar);
            if (p4 != -1) {
                notifyItemChanged(p4, aVar);
            }
        }
    }

    public final void F(@l q month) {
        l0.p(month, ProtectedSandApp.s("ᔚ\u0001"));
        notifyItemChanged(q(month));
    }

    public final void G(@m List<q> list) {
        this.skipMonths = list;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void H(@l q startMonth, @l q endMonth, @l g outDateStyle, @l org.threeten.bp.d firstDayOfWeek) {
        l0.p(startMonth, ProtectedSandApp.s("ᔎ\u0001"));
        l0.p(endMonth, ProtectedSandApp.s("ᔏ\u0001"));
        l0.p(outDateStyle, ProtectedSandApp.s("ᔍ\u0001"));
        l0.p(firstDayOfWeek, ProtectedSandApp.s("ᔐ\u0001"));
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.outDateStyle = outDateStyle;
        this.firstDayOfWeek = firstDayOfWeek;
        this.itemCount = u(startMonth, endMonth, this.skipMonths);
        this.dataStore.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int position) {
        return s(position).f().hashCode();
    }

    @m
    public final cb.a i() {
        return o(true);
    }

    @m
    public final cb.b j() {
        int k4 = k();
        if (k4 == -1) {
            return null;
        }
        return this.dataStore.get(Integer.valueOf(k4));
    }

    @m
    public final cb.a l() {
        return o(false);
    }

    @m
    public final cb.b m() {
        int n4 = n();
        if (n4 == -1) {
            return null;
        }
        return this.dataStore.get(Integer.valueOf(n4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView) {
        l0.p(recyclerView, ProtectedSandApp.s("ᔛ\u0001"));
        this.calView.post(new Runnable() { // from class: com.kizitonwose.calendar.view.internal.monthcalendar.b
            @Override // java.lang.Runnable
            public final void run() {
                c.z(c.this);
            }
        });
    }

    public final int p(@l cb.a day) {
        l0.p(day, ProtectedSandApp.s("ᔙ\u0001"));
        return q(db.c.b(day));
    }

    @SuppressLint({"NewApi"})
    public final int q(@l q month) {
        l0.p(month, ProtectedSandApp.s("ᔚ\u0001"));
        List<q> list = this.skipMonths;
        return list != null ? r(month, list) : q(month);
    }

    @SuppressLint({"NewApi"})
    public final int r(@l q month, @l List<q> skipMonths) {
        l0.p(month, ProtectedSandApp.s("ᔚ\u0001"));
        l0.p(skipMonths, ProtectedSandApp.s("ᔜ\u0001"));
        if (skipMonths.isEmpty()) {
            return e.e(this.startMonth, month);
        }
        if (skipMonths.contains(month)) {
            return -1;
        }
        int i4 = 0;
        for (q qVar : kotlin.collections.w.q5(skipMonths)) {
            if (qVar.v(month) && qVar.u(this.startMonth) && !qVar.u(this.endMonth)) {
                i4++;
            }
        }
        return e.e(this.startMonth, month) - i4;
    }

    @SuppressLint({"NewApi"})
    public final int u(@l q startMonth, @l q endMonth, @m List<q> skipMonths) {
        l0.p(startMonth, ProtectedSandApp.s("ᔎ\u0001"));
        l0.p(endMonth, ProtectedSandApp.s("ᔏ\u0001"));
        List<q> list = skipMonths;
        if (list == null || list.isEmpty()) {
            return e.f(startMonth, endMonth);
        }
        int f4 = e.f(startMonth, endMonth);
        ArrayList arrayList = new ArrayList();
        for (Object obj : skipMonths) {
            q qVar = (q) obj;
            if (qVar.compareTo(startMonth) >= 0 && qVar.compareTo(endMonth) <= 0) {
                arrayList.add(obj);
            }
        }
        return f4 - arrayList.size();
    }

    @m
    public final List<q> v() {
        return this.skipMonths;
    }

    public final void x() {
        RecyclerView.e0 findViewHolderForAdapterPosition;
        if (w()) {
            if (this.calView.isAnimating()) {
                RecyclerView.m itemAnimator = this.calView.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.isRunning(new RecyclerView.m.b() { // from class: com.kizitonwose.calendar.view.internal.monthcalendar.a
                        @Override // androidx.recyclerview.widget.RecyclerView.m.b
                        public final void a() {
                            c.y(c.this);
                        }
                    });
                    return;
                }
                return;
            }
            int k4 = k();
            if (k4 != -1) {
                cb.b bVar = this.dataStore.get(Integer.valueOf(k4));
                if (l0.g(bVar, this.visibleMonth)) {
                    return;
                }
                this.visibleMonth = bVar;
                ld.l<cb.b, k2> t4 = this.calView.t();
                if (t4 != null) {
                    t4.invoke(bVar);
                }
                if (this.calView.getScrollPaged() && this.calView.getLayoutParams().height == -2 && (findViewHolderForAdapterPosition = this.calView.findViewHolderForAdapterPosition(k4)) != null) {
                    findViewHolderForAdapterPosition.itemView.requestLayout();
                }
            }
        }
    }

    public c(@l CalendarView calendarView, @l g gVar, @l q qVar, @l q qVar2, @l org.threeten.bp.d dVar, @m List<q> list) {
        l0.p(calendarView, ProtectedSandApp.s("ᔌ\u0001"));
        l0.p(gVar, ProtectedSandApp.s("ᔍ\u0001"));
        l0.p(qVar, ProtectedSandApp.s("ᔎ\u0001"));
        l0.p(qVar2, ProtectedSandApp.s("ᔏ\u0001"));
        l0.p(dVar, ProtectedSandApp.s("ᔐ\u0001"));
        this.calView = calendarView;
        this.outDateStyle = gVar;
        this.startMonth = qVar;
        this.endMonth = qVar2;
        this.firstDayOfWeek = dVar;
        this.skipMonths = list;
        this.itemCount = u(qVar, qVar2, list);
        this.dataStore = new db.a<>(null, new a(), 1, null);
        setHasStableIds(true);
    }
}
