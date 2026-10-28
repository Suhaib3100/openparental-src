package com.kizitonwose.calendar.view.internal.weekcalendar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cb.h;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.kizitonwose.calendar.view.WeekCalendarView;
import com.kizitonwose.calendar.view.e;
import com.kizitonwose.calendar.view.internal.n;
import com.kizitonwose.calendar.view.internal.p;
import db.i;
import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import org.threeten.bp.g;

/* compiled from: WeekCalendarAdapter.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u0012J\u001f\u0010%\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010&J-\u0010+\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u0005¢\u0006\u0004\b2\u00101J\r\u00103\u001a\u00020\u001b¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u001b¢\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0005H\u0000¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b=\u0010<J'\u0010>\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000e0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010RR\u0014\u0010V\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010UR\u0014\u0010[\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006`"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/weekcalendar/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/kizitonwose/calendar/view/internal/weekcalendar/d;", "Lcom/kizitonwose/calendar/view/WeekCalendarView;", "calView", "Lorg/threeten/bp/g;", "startDate", "endDate", "Lorg/threeten/bp/d;", "firstDayOfWeek", "<init>", "(Lcom/kizitonwose/calendar/view/WeekCalendarView;Lorg/threeten/bp/g;Lorg/threeten/bp/g;Lorg/threeten/bp/d;)V", "", "position", "Lcb/h;", "r", "(I)Lcb/h;", "k", "()I", "n", "", "isFirst", "Lcb/i;", "o", "(Z)Lcb/i;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lkotlin/k2;", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "getItemId", "(I)J", "getItemCount", "Landroid/view/ViewGroup;", "parent", "viewType", "A", "(Landroid/view/ViewGroup;I)Lcom/kizitonwose/calendar/view/internal/weekcalendar/d;", "holder", "", "", "payloads", "z", "(Lcom/kizitonwose/calendar/view/internal/weekcalendar/d;ILjava/util/List;)V", "y", "(Lcom/kizitonwose/calendar/view/internal/weekcalendar/d;I)V", "date", "C", "(Lorg/threeten/bp/g;)V", "D", "B", "()V", "v", "p", "(Lorg/threeten/bp/g;)I", "j", "()Lcb/h;", "m", "i", "()Lcb/i;", "l", "E", "(Lorg/threeten/bp/g;Lorg/threeten/bp/g;Lorg/threeten/bp/d;)V", "b", "Lcom/kizitonwose/calendar/view/WeekCalendarView;", "c", "Lorg/threeten/bp/g;", "d", "e", "Lorg/threeten/bp/d;", "Ldb/i;", "f", "Ldb/i;", "adjustedData", "g", "I", "itemCount", "Ldb/a;", "h", "Ldb/a;", "dataStore", "Lcb/h;", "visibleWeek", "t", "()Lorg/threeten/bp/g;", "startDateAdjusted", "q", "endDateAdjusted", "u", "()Z", "isAttached", "Lcom/kizitonwose/calendar/view/internal/weekcalendar/WeekCalendarLayoutManager;", "s", "()Lcom/kizitonwose/calendar/view/internal/weekcalendar/WeekCalendarLayoutManager;", "layoutManager", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nWeekCalendarAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeekCalendarAdapter.kt\ncom/kizitonwose/calendar/view/internal/weekcalendar/WeekCalendarAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1855#2,2:194\n223#2,2:196\n288#2,2:199\n1#3:198\n*S KotlinDebug\n*F\n+ 1 WeekCalendarAdapter.kt\ncom/kizitonwose/calendar/view/internal/weekcalendar/WeekCalendarAdapter\n*L\n87#1:194,2\n100#1:196,2\n170#1:199,2\n*E\n"})
/* loaded from: classes6.dex */
public final class c extends RecyclerView.h<d> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final WeekCalendarView calView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private g startDate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private g endDate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private org.threeten.bp.d firstDayOfWeek;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private i adjustedData;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int itemCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final db.a<h> dataStore;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @m
    private h visibleWeek;

    /* compiled from: WeekCalendarAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "offset", "Lcb/h;", "a", "(I)Lcb/h;"}, k = 3, mv = {1, 9, 0})
    static final class a extends n0 implements ld.l<Integer, h> {
        a() {
            super(1);
        }

        @l
        public final h a(int i4) {
            return db.h.b(c.h(c.this), i4, c.this.startDate, c.this.endDate).getWeek();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ h invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public c(@l WeekCalendarView weekCalendarView, @l g gVar, @l g gVar2, @l org.threeten.bp.d dVar) {
        l0.p(weekCalendarView, ProtectedSandApp.s("ᔳ\u0001"));
        l0.p(gVar, ProtectedSandApp.s("ᔴ\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("ᔵ\u0001"));
        l0.p(dVar, ProtectedSandApp.s("ᔶ\u0001"));
        this.calView = weekCalendarView;
        this.startDate = gVar;
        this.endDate = gVar2;
        this.firstDayOfWeek = dVar;
        i a5 = db.h.a(gVar, gVar2, dVar);
        this.adjustedData = a5;
        this.itemCount = db.h.d(a5.f(), this.adjustedData.e());
        this.dataStore = new db.a<>(null, new a(), 1, null);
        setHasStableIds(true);
    }

    public static final g h(c cVar) {
        return cVar.adjustedData.f();
    }

    private final int k() {
        return s().findFirstVisibleItemPosition();
    }

    private final int n() {
        return s().findLastVisibleItemPosition();
    }

    private final cb.i o(boolean isFirst) {
        View findViewByPosition;
        int k4 = isFirst ? k() : n();
        Object obj = null;
        if (k4 == -1 || (findViewByPosition = s().findViewByPosition(k4)) == null) {
            return null;
        }
        Rect rect = new Rect();
        if (!findViewByPosition.getGlobalVisibleRect(rect) || rect.isEmpty()) {
            return null;
        }
        Rect rect2 = new Rect();
        List<cb.i> d5 = this.dataStore.get(Integer.valueOf(k4)).d();
        if (!isFirst) {
            d5 = w.X4(d5);
        }
        Iterator<T> it = d5.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            View findViewWithTag = findViewByPosition.findViewWithTag(Integer.valueOf(n.a(((cb.i) next).e())));
            if (findViewWithTag != null && findViewWithTag.getGlobalVisibleRect(rect2) && com.kizitonwose.calendar.view.internal.l.c(rect2, rect)) {
                obj = next;
                break;
            }
        }
        return (cb.i) obj;
    }

    private final g q() {
        return this.adjustedData.e();
    }

    private final h r(int position) {
        return this.dataStore.get(Integer.valueOf(position));
    }

    private final WeekCalendarLayoutManager s() {
        RecyclerView.LayoutManager layoutManager = this.calView.getLayoutManager();
        l0.n(layoutManager, ProtectedSandApp.s("ᔷ\u0001"));
        return (WeekCalendarLayoutManager) layoutManager;
    }

    private final g t() {
        return this.adjustedData.f();
    }

    private final boolean u() {
        return this.calView.getAdapter() == this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(c cVar) {
        l0.p(cVar, ProtectedSandApp.s("ᔸ\u0001"));
        cVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(c cVar) {
        l0.p(cVar, ProtectedSandApp.s("ᔸ\u0001"));
        cVar.v();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @l
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(@l ViewGroup parent, int viewType) {
        l0.p(parent, ProtectedSandApp.s("ᔹ\u0001"));
        com.kizitonwose.calendar.view.g weekMargins = this.calView.getWeekMargins();
        e daySize = this.calView.getDaySize();
        Context context = this.calView.getContext();
        l0.o(context, ProtectedSandApp.s("ᔺ\u0001"));
        int dayViewResource = this.calView.getDayViewResource();
        int weekHeaderResource = this.calView.getWeekHeaderResource();
        int weekFooterResource = this.calView.getWeekFooterResource();
        String weekViewClass = this.calView.getWeekViewClass();
        com.kizitonwose.calendar.view.n<?> k4 = this.calView.k();
        l0.n(k4, ProtectedSandApp.s("ᔻ\u0001"));
        com.kizitonwose.calendar.view.internal.m b5 = n.b(weekMargins, daySize, context, dayViewResource, weekHeaderResource, weekFooterResource, 1, weekViewClass, k4);
        return new d(b5.i(), b5.h(), b5.g(), (p) w.B2(b5.j()), this.calView.r(), this.calView.p());
    }

    public final void B() {
        notifyItemRangeChanged(0, this.itemCount);
    }

    public final void C(@l g date) {
        l0.p(date, ProtectedSandApp.s("ᔼ\u0001"));
        int p4 = p(date);
        if (p4 != -1) {
            for (Object obj : this.dataStore.get(Integer.valueOf(p4)).d()) {
                if (l0.g(((cb.i) obj).e(), date)) {
                    notifyItemChanged(p4, obj);
                    return;
                }
            }
            throw new NoSuchElementException(ProtectedSandApp.s("ᔽ\u0001"));
        }
    }

    public final void D(@l g date) {
        l0.p(date, ProtectedSandApp.s("ᔼ\u0001"));
        notifyItemChanged(p(date));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void E(@l g startDate, @l g endDate, @l org.threeten.bp.d firstDayOfWeek) {
        l0.p(startDate, ProtectedSandApp.s("ᔴ\u0001"));
        l0.p(endDate, ProtectedSandApp.s("ᔵ\u0001"));
        l0.p(firstDayOfWeek, ProtectedSandApp.s("ᔶ\u0001"));
        this.startDate = startDate;
        this.endDate = endDate;
        this.firstDayOfWeek = firstDayOfWeek;
        i a5 = db.h.a(startDate, endDate, firstDayOfWeek);
        this.adjustedData = a5;
        this.itemCount = db.h.d(a5.f(), this.adjustedData.e());
        this.dataStore.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int position) {
        return ((cb.i) w.B2(r(position).d())).e().hashCode();
    }

    @m
    public final cb.i i() {
        return o(true);
    }

    @m
    public final h j() {
        int k4 = k();
        if (k4 == -1) {
            return null;
        }
        return this.dataStore.get(Integer.valueOf(k4));
    }

    @m
    public final cb.i l() {
        return o(false);
    }

    @m
    public final h m() {
        int n4 = n();
        if (n4 == -1) {
            return null;
        }
        return this.dataStore.get(Integer.valueOf(n4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView) {
        l0.p(recyclerView, ProtectedSandApp.s("ᔾ\u0001"));
        this.calView.post(new Runnable() { // from class: com.kizitonwose.calendar.view.internal.weekcalendar.a
            @Override // java.lang.Runnable
            public final void run() {
                c.x(c.this);
            }
        });
    }

    public final int p(@l g date) {
        l0.p(date, ProtectedSandApp.s("ᔼ\u0001"));
        return db.h.c(this.adjustedData.f(), date);
    }

    public final void v() {
        if (u()) {
            if (this.calView.isAnimating()) {
                RecyclerView.m itemAnimator = this.calView.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.isRunning(new RecyclerView.m.b() { // from class: com.kizitonwose.calendar.view.internal.weekcalendar.b
                        @Override // androidx.recyclerview.widget.RecyclerView.m.b
                        public final void a() {
                            c.w(c.this);
                        }
                    });
                    return;
                }
                return;
            }
            int k4 = k();
            if (k4 != -1) {
                h hVar = this.dataStore.get(Integer.valueOf(k4));
                if (l0.g(hVar, this.visibleWeek)) {
                    return;
                }
                this.visibleWeek = hVar;
                ld.l<h, k2> u4 = this.calView.u();
                if (u4 != null) {
                    u4.invoke(hVar);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@l d holder, int position) {
        l0.p(holder, ProtectedSandApp.s("ᔿ\u0001"));
        holder.a(r(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@l d holder, int position, @l List<? extends Object> payloads) {
        l0.p(holder, ProtectedSandApp.s("ᔿ\u0001"));
        l0.p(payloads, ProtectedSandApp.s("ᕀ\u0001"));
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, position, payloads);
            return;
        }
        for (Object obj : payloads) {
            l0.n(obj, ProtectedSandApp.s("ᕁ\u0001"));
            holder.c((cb.i) obj);
        }
    }
}
