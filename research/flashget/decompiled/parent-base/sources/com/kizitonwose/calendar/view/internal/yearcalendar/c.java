package com.kizitonwose.calendar.view.internal.yearcalendar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.kizitonwose.calendar.view.YearCalendarView;
import com.kizitonwose.calendar.view.internal.n;
import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.l1;
import org.threeten.bp.p;
import org.threeten.bp.q;

/* compiled from: YearCalendarAdapter.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001f\u001a\u0004\u0018\u00010\u0018*\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J5\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b.\u0010\u0014J\u001f\u00102\u001a\u00020\u00022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u00103J-\u00108\u001a\u00020(2\u0006\u00104\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020(2\u0006\u00104\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010;J!\u0010>\u001a\u00020(2\u0012\u0010=\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180<\"\u00020\u0018¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020(2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020(2\u0006\u0010D\u001a\u00020\u0007¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020(¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020(¢\u0006\u0004\bI\u0010HJ\u0017\u0010J\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u0007H\u0000¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020@H\u0000¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u0018H\u0000¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bR\u0010QJ\u000f\u0010S\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bU\u0010TJ\u000f\u0010V\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bX\u0010WJ/\u0010Y\u001a\u00020(2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\bY\u0010ZR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010`R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010YR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00100f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010k\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010jR\u0014\u0010n\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/yearcalendar/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/kizitonwose/calendar/view/internal/yearcalendar/j;", "Lcom/kizitonwose/calendar/view/YearCalendarView;", "calView", "Lcb/g;", "outDateStyle", "Lorg/threeten/bp/p;", "startYear", "endYear", "Lorg/threeten/bp/d;", "firstDayOfWeek", "<init>", "(Lcom/kizitonwose/calendar/view/YearCalendarView;Lcb/g;Lorg/threeten/bp/p;Lorg/threeten/bp/p;Lorg/threeten/bp/d;)V", "", "position", "Lcb/c;", "v", "(I)Lcb/c;", "l", "()I", "p", "", "isFirst", "Lcb/a;", "q", "(Z)Lcb/a;", "Lkotlin/l1;", "Lcb/b;", "Landroid/view/View;", "Landroid/graphics/Rect;", "J", "(Lkotlin/l1;Z)Lcb/a;", "r", "(Z)Lcb/b;", "yearIncrement", "K", "(ZI)Lkotlin/l1;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lkotlin/k2;", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "getItemId", "(I)J", "getItemCount", "Landroid/view/ViewGroup;", "parent", "viewType", "D", "(Landroid/view/ViewGroup;I)Lcom/kizitonwose/calendar/view/internal/yearcalendar/j;", "holder", "", "", "payloads", "C", "(Lcom/kizitonwose/calendar/view/internal/yearcalendar/j;ILjava/util/List;)V", "B", "(Lcom/kizitonwose/calendar/view/internal/yearcalendar/j;I)V", "", "day", "F", "([Lcb/a;)V", "Lorg/threeten/bp/q;", "month", "G", "(Lorg/threeten/bp/q;)V", "year", "H", "(Lorg/threeten/bp/p;)V", "E", "()V", "y", "t", "(Lorg/threeten/bp/p;)I", "u", "(Lorg/threeten/bp/q;)I", "s", "(Lcb/a;)I", "k", "()Lcb/c;", "o", "j", "()Lcb/b;", "n", "i", "()Lcb/a;", "m", "I", "(Lorg/threeten/bp/p;Lorg/threeten/bp/p;Lcb/g;Lorg/threeten/bp/d;)V", "b", "Lcom/kizitonwose/calendar/view/YearCalendarView;", "c", "Lcb/g;", "d", "Lorg/threeten/bp/p;", "e", "f", "Lorg/threeten/bp/d;", "g", "itemCount", "Ldb/a;", "h", "Ldb/a;", "dataStore", "Lcb/c;", "visibleYear", "x", "()Z", "isAttached", "Lcom/kizitonwose/calendar/view/internal/yearcalendar/YearCalendarLayoutManager;", "w", "()Lcom/kizitonwose/calendar/view/internal/yearcalendar/YearCalendarLayoutManager;", "layoutManager", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nYearCalendarAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YearCalendarAdapter.kt\ncom/kizitonwose/calendar/view/internal/yearcalendar/YearCalendarAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1855#2,2:292\n288#2,2:297\n13309#3,2:294\n1#4:296\n*S KotlinDebug\n*F\n+ 1 YearCalendarAdapter.kt\ncom/kizitonwose/calendar/view/internal/yearcalendar/YearCalendarAdapter\n*L\n98#1:292,2\n225#1:297,2\n113#1:294,2\n*E\n"})
/* loaded from: classes6.dex */
public final class c extends RecyclerView.h<j> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final YearCalendarView calView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private cb.g outDateStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private p startYear;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private p endYear;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private org.threeten.bp.d firstDayOfWeek;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int itemCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final db.a<cb.c> dataStore;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @m
    private cb.c visibleYear;

    /* compiled from: YearCalendarAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "offset", "Lcb/c;", "a", "(I)Lcb/c;"}, k = 3, mv = {1, 9, 0})
    static final class a extends n0 implements ld.l<Integer, cb.c> {
        a() {
            super(1);
        }

        @l
        public final cb.c a(int i4) {
            return db.j.a(c.this.startYear, i4, c.this.firstDayOfWeek, c.this.outDateStyle);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ cb.c invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public c(@l YearCalendarView yearCalendarView, @l cb.g gVar, @l p pVar, @l p pVar2, @l org.threeten.bp.d dVar) {
        l0.p(yearCalendarView, ProtectedSandApp.s("ᕏ\u0001"));
        l0.p(gVar, ProtectedSandApp.s("ᕐ\u0001"));
        l0.p(pVar, ProtectedSandApp.s("ᕑ\u0001"));
        l0.p(pVar2, ProtectedSandApp.s("ᕒ\u0001"));
        l0.p(dVar, ProtectedSandApp.s("ᕓ\u0001"));
        this.calView = yearCalendarView;
        this.outDateStyle = gVar;
        this.startYear = pVar;
        this.endYear = pVar2;
        this.firstDayOfWeek = dVar;
        this.itemCount = db.j.c(pVar, pVar2);
        this.dataStore = new db.a<>(null, new a(), 1, null);
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(c cVar) {
        l0.p(cVar, ProtectedSandApp.s("ᕔ\u0001"));
        cVar.y();
    }

    private final cb.a J(l1<cb.b, ? extends View, Rect> l1Var, boolean z4) {
        Object obj;
        cb.b a5 = l1Var.a();
        View b5 = l1Var.b();
        Rect c5 = l1Var.c();
        Rect rect = new Rect();
        List d02 = w.d0(a5.e());
        if (!z4) {
            d02 = w.X4(d02);
        }
        Iterator it = d02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            View findViewWithTag = b5.findViewWithTag(Integer.valueOf(n.a(((cb.a) obj).e())));
            if (findViewWithTag != null && findViewWithTag.getGlobalVisibleRect(rect) && com.kizitonwose.calendar.view.internal.l.c(rect, c5)) {
                break;
            }
        }
        return (cb.a) obj;
    }

    private final l1<cb.b, View, Rect> K(boolean isFirst, int yearIncrement) {
        int i4;
        View findViewByPosition;
        int l4 = isFirst ? l() : p();
        if (l4 == -1 || (findViewByPosition = w().findViewByPosition((i4 = l4 + yearIncrement))) == null) {
            return null;
        }
        Rect rect = new Rect();
        if (!findViewByPosition.getGlobalVisibleRect(rect) || rect.isEmpty()) {
            return null;
        }
        Rect rect2 = new Rect();
        List<cb.b> e4 = this.dataStore.get(Integer.valueOf(i4)).e();
        if (!isFirst) {
            e4 = w.X4(e4);
        }
        for (cb.b bVar : e4) {
            View findViewWithTag = findViewByPosition.findViewWithTag(Integer.valueOf(i.c(bVar.f())));
            l1<cb.b, View, Rect> l1Var = (findViewWithTag != null && findViewWithTag.getGlobalVisibleRect(rect2) && com.kizitonwose.calendar.view.internal.l.c(rect2, rect)) ? new l1<>(bVar, findViewWithTag, rect2) : null;
            if (l1Var != null) {
                return l1Var;
            }
        }
        return null;
    }

    static /* synthetic */ l1 L(c cVar, boolean z4, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return cVar.K(z4, i4);
    }

    private final int l() {
        return w().findFirstVisibleItemPosition();
    }

    private final int p() {
        return w().findLastVisibleItemPosition();
    }

    private final cb.a q(boolean isFirst) {
        cb.a J;
        l1<cb.b, ? extends View, Rect> L = L(this, isFirst, 0, 2, null);
        if (L == null || (J = J(L, isFirst)) == null) {
            l1<cb.b, View, Rect> K = K(isFirst, -1);
            J = K != null ? J(K, isFirst) : null;
            if (J == null) {
                l1<cb.b, View, Rect> K2 = K(isFirst, 1);
                if (K2 != null) {
                    return J(K2, isFirst);
                }
                return null;
            }
        }
        return J;
    }

    private final cb.b r(boolean isFirst) {
        cb.b bVar;
        l1 L = L(this, isFirst, 0, 2, null);
        if (L != null && (bVar = (cb.b) L.f()) != null) {
            return bVar;
        }
        l1<cb.b, View, Rect> K = K(isFirst, -1);
        if (K != null) {
            return K.f();
        }
        l1<cb.b, View, Rect> K2 = K(isFirst, 1);
        if (K2 != null) {
            return K2.f();
        }
        return null;
    }

    private final cb.c v(int position) {
        return this.dataStore.get(Integer.valueOf(position));
    }

    private final YearCalendarLayoutManager w() {
        RecyclerView.LayoutManager layoutManager = this.calView.getLayoutManager();
        l0.n(layoutManager, ProtectedSandApp.s("ᕕ\u0001"));
        return (YearCalendarLayoutManager) layoutManager;
    }

    private final boolean x() {
        return this.calView.getAdapter() == this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(c cVar) {
        l0.p(cVar, ProtectedSandApp.s("ᕔ\u0001"));
        cVar.y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@l j holder, int position) {
        l0.p(holder, ProtectedSandApp.s("ᕖ\u0001"));
        holder.a(v(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@l j holder, int position, @l List<? extends Object> payloads) {
        l0.p(holder, ProtectedSandApp.s("ᕖ\u0001"));
        l0.p(payloads, ProtectedSandApp.s("ᕗ\u0001"));
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, position, payloads);
            return;
        }
        for (Object obj : payloads) {
            if (obj instanceof cb.a) {
                holder.c((cb.a) obj);
            } else if (obj instanceof q) {
                holder.d((q) obj);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @l
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(@l ViewGroup parent, int viewType) {
        l0.p(parent, ProtectedSandApp.s("ᕘ\u0001"));
        Context context = this.calView.getContext();
        com.kizitonwose.calendar.view.e daySize = this.calView.getDaySize();
        com.kizitonwose.calendar.view.j monthHeight = this.calView.getMonthHeight();
        int dayViewResource = this.calView.getDayViewResource();
        com.kizitonwose.calendar.view.h<?> m4 = this.calView.m();
        l0.n(m4, ProtectedSandApp.s("ᕙ\u0001"));
        int monthColumns = this.calView.getMonthColumns();
        int monthHorizontalSpacing = this.calView.getMonthHorizontalSpacing();
        int monthVerticalSpacing = this.calView.getMonthVerticalSpacing();
        com.kizitonwose.calendar.view.g yearMargins = this.calView.getYearMargins();
        com.kizitonwose.calendar.view.g yearBodyMargins = this.calView.getYearBodyMargins();
        int monthHeaderResource = this.calView.getMonthHeaderResource();
        int monthFooterResource = this.calView.getMonthFooterResource();
        String monthViewClass = this.calView.getMonthViewClass();
        com.kizitonwose.calendar.view.i<?> t4 = this.calView.t();
        com.kizitonwose.calendar.view.i<?> r4 = this.calView.r();
        String yearViewClass = this.calView.getYearViewClass();
        int yearHeaderResource = this.calView.getYearHeaderResource();
        int yearFooterResource = this.calView.getYearFooterResource();
        l0.m(context);
        g d5 = i.d(monthColumns, monthHorizontalSpacing, monthVerticalSpacing, yearMargins, yearBodyMargins, daySize, monthHeight, context, dayViewResource, m4, monthHeaderResource, monthFooterResource, monthViewClass, t4, r4, yearViewClass, yearHeaderResource, yearFooterResource);
        return new j(d5.i(), d5.h(), d5.g(), d5.j(), this.calView.G(), this.calView.E(), this.calView.O());
    }

    public final void E() {
        notifyItemRangeChanged(0, this.itemCount);
    }

    public final void F(@l cb.a... day) {
        l0.p(day, ProtectedSandApp.s("ᕚ\u0001"));
        for (cb.a aVar : day) {
            int s4 = s(aVar);
            if (s4 != -1) {
                notifyItemChanged(s4, aVar);
            }
        }
    }

    public final void G(@l q month) {
        l0.p(month, ProtectedSandApp.s("ᕛ\u0001"));
        int u4 = u(month);
        if (u4 != -1) {
            notifyItemChanged(u4, month);
        }
    }

    public final void H(@l p year) {
        l0.p(year, ProtectedSandApp.s("ᕜ\u0001"));
        notifyItemChanged(t(year));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void I(@l p startYear, @l p endYear, @l cb.g outDateStyle, @l org.threeten.bp.d firstDayOfWeek) {
        l0.p(startYear, ProtectedSandApp.s("ᕑ\u0001"));
        l0.p(endYear, ProtectedSandApp.s("ᕒ\u0001"));
        l0.p(outDateStyle, ProtectedSandApp.s("ᕐ\u0001"));
        l0.p(firstDayOfWeek, ProtectedSandApp.s("ᕓ\u0001"));
        this.startYear = startYear;
        this.endYear = endYear;
        this.outDateStyle = outDateStyle;
        this.firstDayOfWeek = firstDayOfWeek;
        this.itemCount = db.j.c(startYear, endYear);
        this.dataStore.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int position) {
        return v(position).f().getValue();
    }

    @m
    public final cb.a i() {
        return q(true);
    }

    @m
    public final cb.b j() {
        return r(true);
    }

    @m
    public final cb.c k() {
        int l4 = l();
        if (l4 == -1) {
            return null;
        }
        return this.dataStore.get(Integer.valueOf(l4));
    }

    @m
    public final cb.a m() {
        return q(false);
    }

    @m
    public final cb.b n() {
        return r(false);
    }

    @m
    public final cb.c o() {
        int p4 = p();
        if (p4 == -1) {
            return null;
        }
        return this.dataStore.get(Integer.valueOf(p4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView) {
        l0.p(recyclerView, ProtectedSandApp.s("ᕝ\u0001"));
        this.calView.post(new Runnable() { // from class: com.kizitonwose.calendar.view.internal.yearcalendar.a
            @Override // java.lang.Runnable
            public final void run() {
                c.A(c.this);
            }
        });
    }

    public final int s(@l cb.a day) {
        l0.p(day, ProtectedSandApp.s("ᕚ\u0001"));
        return u(db.c.b(day));
    }

    public final int t(@l p year) {
        l0.p(year, ProtectedSandApp.s("ᕜ\u0001"));
        return db.j.b(this.startYear, year);
    }

    public final int u(@l q month) {
        l0.p(month, ProtectedSandApp.s("ᕛ\u0001"));
        p J = p.J(month.t());
        l0.o(J, ProtectedSandApp.s("ᕞ\u0001"));
        return t(J);
    }

    public final void y() {
        RecyclerView.e0 findViewHolderForAdapterPosition;
        if (x()) {
            if (this.calView.isAnimating()) {
                RecyclerView.m itemAnimator = this.calView.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.isRunning(new RecyclerView.m.b() { // from class: com.kizitonwose.calendar.view.internal.yearcalendar.b
                        @Override // androidx.recyclerview.widget.RecyclerView.m.b
                        public final void a() {
                            c.z(c.this);
                        }
                    });
                    return;
                }
                return;
            }
            int l4 = l();
            if (l4 != -1) {
                cb.c cVar = this.dataStore.get(Integer.valueOf(l4));
                if (l0.g(cVar, this.visibleYear)) {
                    return;
                }
                this.visibleYear = cVar;
                ld.l<cb.c, k2> J = this.calView.J();
                if (J != null) {
                    J.invoke(cVar);
                }
                if (this.calView.getScrollPaged() && this.calView.getLayoutParams().height == -2 && (findViewHolderForAdapterPosition = this.calView.findViewHolderForAdapterPosition(l4)) != null) {
                    findViewHolderForAdapterPosition.itemView.requestLayout();
                }
            }
        }
    }
}
