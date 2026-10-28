package com.kizitonwose.calendar.view.internal.yearcalendar;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.kizitonwose.calendar.view.YearCalendarView;
import com.kizitonwose.calendar.view.internal.CalendarLayoutManager;
import com.kizitonwose.calendar.view.internal.n;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import org.threeten.bp.p;
import org.threeten.bp.q;

/* compiled from: YearCalendarLayoutManager.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/yearcalendar/YearCalendarLayoutManager;", "Lcom/kizitonwose/calendar/view/internal/CalendarLayoutManager;", "Lorg/threeten/bp/p;", "Lcb/a;", "Lcom/kizitonwose/calendar/view/YearCalendarView;", "calView", "<init>", "(Lcom/kizitonwose/calendar/view/YearCalendarView;)V", "Lorg/threeten/bp/q;", "month", "Landroid/view/View;", "itemView", "", "d0", "(Lorg/threeten/bp/q;Landroid/view/View;)I", "data", "h0", "(Lorg/threeten/bp/p;)I", "g0", "(Lcb/a;)I", "f0", "Lcom/kizitonwose/calendar/view/g;", "K", "()Lcom/kizitonwose/calendar/view/g;", "", "P", "()Z", "Lkotlin/k2;", "O", "()V", "Lcom/kizitonwose/calendar/view/f;", "L", "()Lcom/kizitonwose/calendar/view/f;", "m0", "(Lorg/threeten/bp/q;)V", "i0", "c", "Lcom/kizitonwose/calendar/view/YearCalendarView;", "Lcom/kizitonwose/calendar/view/internal/yearcalendar/c;", "e0", "()Lcom/kizitonwose/calendar/view/internal/yearcalendar/c;", "adapter", "a", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class YearCalendarLayoutManager extends CalendarLayoutManager<p, cb.a> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final YearCalendarView calView;

    /* compiled from: YearCalendarLayoutManager.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/yearcalendar/YearCalendarLayoutManager$a;", "Landroidx/recyclerview/widget/s;", "", "position", "Lorg/threeten/bp/q;", "month", "<init>", "(Lcom/kizitonwose/calendar/view/internal/yearcalendar/YearCalendarLayoutManager;ILorg/threeten/bp/q;)V", "getVerticalSnapPreference", "()I", "getHorizontalSnapPreference", "Landroid/view/View;", "view", "snapPreference", "calculateDyToMakeVisible", "(Landroid/view/View;I)I", "calculateDxToMakeVisible", "a", "Lorg/threeten/bp/q;", "()Lorg/threeten/bp/q;", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class a extends s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @m
        private final q month;

        public a(int i4, @m q qVar) {
            super(YearCalendarLayoutManager.this.calView.getContext());
            this.month = qVar;
            setTargetPosition(i4);
        }

        @m
        /* renamed from: a, reason: from getter */
        public final q getMonth() {
            return this.month;
        }

        @Override // androidx.recyclerview.widget.s
        public int calculateDxToMakeVisible(@l View view, int snapPreference) {
            l0.p(view, ProtectedSandApp.s("ᕇ\u0001"));
            int calculateDxToMakeVisible = super.calculateDxToMakeVisible(view, snapPreference);
            q qVar = this.month;
            return qVar == null ? calculateDxToMakeVisible : calculateDxToMakeVisible - YearCalendarLayoutManager.this.d0(qVar, view);
        }

        @Override // androidx.recyclerview.widget.s
        public int calculateDyToMakeVisible(@l View view, int snapPreference) {
            l0.p(view, ProtectedSandApp.s("ᕇ\u0001"));
            int calculateDyToMakeVisible = super.calculateDyToMakeVisible(view, snapPreference);
            q qVar = this.month;
            return qVar == null ? calculateDyToMakeVisible : calculateDyToMakeVisible - YearCalendarLayoutManager.this.d0(qVar, view);
        }

        @Override // androidx.recyclerview.widget.s
        protected int getHorizontalSnapPreference() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.s
        protected int getVerticalSnapPreference() {
            return -1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YearCalendarLayoutManager(@l YearCalendarView yearCalendarView) {
        super(yearCalendarView, yearCalendarView.getOrientation());
        l0.p(yearCalendarView, ProtectedSandApp.s("ᕈ\u0001"));
        this.calView = yearCalendarView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d0(q month, View itemView) {
        View findViewWithTag = itemView.findViewWithTag(Integer.valueOf(i.c(month)));
        if (findViewWithTag == null) {
            return 0;
        }
        Rect rect = new Rect();
        findViewWithTag.getDrawingRect(rect);
        l0.n(itemView, ProtectedSandApp.s("ᕉ\u0001"));
        ((ViewGroup) itemView).offsetDescendantRectToMyCoords(findViewWithTag, rect);
        return getOrientation() == 1 ? rect.top : rect.left;
    }

    private final c e0() {
        RecyclerView.h adapter = this.calView.getAdapter();
        l0.n(adapter, ProtectedSandApp.s("ᕊ\u0001"));
        return (c) adapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(YearCalendarLayoutManager yearCalendarLayoutManager) {
        l0.p(yearCalendarLayoutManager, ProtectedSandApp.s("ᕋ\u0001"));
        yearCalendarLayoutManager.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(final YearCalendarLayoutManager yearCalendarLayoutManager, int i4, q qVar) {
        View view;
        l0.p(yearCalendarLayoutManager, ProtectedSandApp.s("ᕋ\u0001"));
        l0.p(qVar, ProtectedSandApp.s("ᕌ\u0001"));
        RecyclerView.e0 findViewHolderForAdapterPosition = yearCalendarLayoutManager.calView.findViewHolderForAdapterPosition(i4);
        if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
            return;
        }
        yearCalendarLayoutManager.scrollToPositionWithOffset(i4, -yearCalendarLayoutManager.d0(qVar, view));
        yearCalendarLayoutManager.calView.post(new Runnable() { // from class: com.kizitonwose.calendar.view.internal.yearcalendar.d
            @Override // java.lang.Runnable
            public final void run() {
                YearCalendarLayoutManager.l0(YearCalendarLayoutManager.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(YearCalendarLayoutManager yearCalendarLayoutManager) {
        l0.p(yearCalendarLayoutManager, ProtectedSandApp.s("ᕋ\u0001"));
        yearCalendarLayoutManager.O();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    @l
    public com.kizitonwose.calendar.view.g K() {
        return this.calView.getYearMargins();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    @m
    public com.kizitonwose.calendar.view.f L() {
        return this.calView.getLayoutHelper();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    public void O() {
        e0().y();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    public boolean P() {
        return this.calView.getScrollPaged();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public int J(@l cb.a data) {
        l0.p(data, ProtectedSandApp.s("ᕍ\u0001"));
        return n.a(data.e());
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public int M(@l cb.a data) {
        l0.p(data, ProtectedSandApp.s("ᕍ\u0001"));
        return e0().s(data);
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public int N(@l p data) {
        l0.p(data, ProtectedSandApp.s("ᕍ\u0001"));
        return e0().t(data);
    }

    public final void i0(@l final q month) {
        l0.p(month, ProtectedSandApp.s("ᕎ\u0001"));
        final int u4 = e0().u(month);
        if (u4 == -1) {
            return;
        }
        scrollToPositionWithOffset(u4, 0);
        if (this.calView.getScrollPaged()) {
            this.calView.post(new Runnable() { // from class: com.kizitonwose.calendar.view.internal.yearcalendar.e
                @Override // java.lang.Runnable
                public final void run() {
                    YearCalendarLayoutManager.j0(YearCalendarLayoutManager.this);
                }
            });
        } else {
            this.calView.post(new Runnable() { // from class: com.kizitonwose.calendar.view.internal.yearcalendar.f
                @Override // java.lang.Runnable
                public final void run() {
                    YearCalendarLayoutManager.k0(YearCalendarLayoutManager.this, u4, month);
                }
            });
        }
    }

    public final void m0(@l q month) {
        l0.p(month, ProtectedSandApp.s("ᕎ\u0001"));
        int u4 = e0().u(month);
        if (u4 == -1) {
            return;
        }
        if (this.calView.getScrollPaged()) {
            month = null;
        }
        startSmoothScroll(new a(u4, month));
    }
}
