package com.kizitonwose.calendar.view.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: CalendarLayoutManager.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001.B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0001H&¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0001H&¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00028\u0000¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u001a2\u0006\u0010 \u001a\u00028\u0000¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b$\u0010\"J\u0015\u0010%\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b%\u0010\"J\u001f\u0010*\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/CalendarLayoutManager;", "IndexData", "DayData", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView;", "calView", "", "orientation", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "day", "Landroid/view/View;", "itemView", "I", "(Ljava/lang/Object;Landroid/view/View;)I", "data", "N", "(Ljava/lang/Object;)I", "M", "J", "Lcom/kizitonwose/calendar/view/g;", "K", "()Lcom/kizitonwose/calendar/view/g;", "", "P", "()Z", "Lkotlin/k2;", "O", "()V", "Lcom/kizitonwose/calendar/view/f;", "L", "()Lcom/kizitonwose/calendar/view/f;", "indexData", "U", "(Ljava/lang/Object;)V", "X", "W", "Q", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "extraLayoutSpace", "calculateExtraLayoutSpace", "(Landroidx/recyclerview/widget/RecyclerView$a0;[I)V", "b", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CalendarLayoutManager<IndexData, DayData> extends LinearLayoutManager {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final RecyclerView calView;

    /* compiled from: CalendarLayoutManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00018\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/CalendarLayoutManager$a;", "Landroidx/recyclerview/widget/s;", "", "position", "day", "<init>", "(Lcom/kizitonwose/calendar/view/internal/CalendarLayoutManager;ILjava/lang/Object;)V", "getVerticalSnapPreference", "()I", "getHorizontalSnapPreference", "Landroid/view/View;", "view", "snapPreference", "calculateDyToMakeVisible", "(Landroid/view/View;I)I", "calculateDxToMakeVisible", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class a extends s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final DayData day;

        public a(int i4, @fg.m DayData daydata) {
            super(CalendarLayoutManager.this.calView.getContext());
            this.day = daydata;
            setTargetPosition(i4);
        }

        @fg.m
        public final DayData a() {
            return this.day;
        }

        @Override // androidx.recyclerview.widget.s
        public int calculateDxToMakeVisible(@fg.l View view, int snapPreference) {
            l0.p(view, ProtectedSandApp.s("ᓕ\u0001"));
            int calculateDxToMakeVisible = super.calculateDxToMakeVisible(view, snapPreference);
            DayData daydata = this.day;
            return daydata == null ? calculateDxToMakeVisible : calculateDxToMakeVisible - CalendarLayoutManager.this.I(daydata, view);
        }

        @Override // androidx.recyclerview.widget.s
        public int calculateDyToMakeVisible(@fg.l View view, int snapPreference) {
            l0.p(view, ProtectedSandApp.s("ᓕ\u0001"));
            int calculateDyToMakeVisible = super.calculateDyToMakeVisible(view, snapPreference);
            DayData daydata = this.day;
            return daydata == null ? calculateDyToMakeVisible : calculateDyToMakeVisible - CalendarLayoutManager.this.I(daydata, view);
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
    public CalendarLayoutManager(@fg.l RecyclerView recyclerView, int i4) {
        super(recyclerView.getContext(), i4, false);
        l0.p(recyclerView, ProtectedSandApp.s("ᓖ\u0001"));
        this.calView = recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I(DayData day, View itemView) {
        int i4;
        int j4;
        View findViewWithTag = itemView.findViewWithTag(Integer.valueOf(J(day)));
        if (findViewWithTag == null) {
            return 0;
        }
        Rect rect = new Rect();
        findViewWithTag.getDrawingRect(rect);
        l0.n(itemView, ProtectedSandApp.s("ᓗ\u0001"));
        ((ViewGroup) itemView).offsetDescendantRectToMyCoords(findViewWithTag, rect);
        com.kizitonwose.calendar.view.g K = K();
        if (getOrientation() == 1) {
            i4 = rect.top;
            j4 = K.k();
        } else {
            i4 = rect.left;
            j4 = K.j();
        }
        return j4 + i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(CalendarLayoutManager calendarLayoutManager) {
        l0.p(calendarLayoutManager, ProtectedSandApp.s("ᓘ\u0001"));
        calendarLayoutManager.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(final CalendarLayoutManager calendarLayoutManager, int i4, Object obj) {
        View view;
        l0.p(calendarLayoutManager, ProtectedSandApp.s("ᓘ\u0001"));
        RecyclerView.e0 findViewHolderForAdapterPosition = calendarLayoutManager.calView.findViewHolderForAdapterPosition(i4);
        if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
            return;
        }
        calendarLayoutManager.scrollToPositionWithOffset(i4, -calendarLayoutManager.I(obj, view));
        calendarLayoutManager.calView.post(new Runnable() { // from class: com.kizitonwose.calendar.view.internal.d
            @Override // java.lang.Runnable
            public final void run() {
                CalendarLayoutManager.T(CalendarLayoutManager.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(CalendarLayoutManager calendarLayoutManager) {
        l0.p(calendarLayoutManager, ProtectedSandApp.s("ᓘ\u0001"));
        calendarLayoutManager.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(CalendarLayoutManager calendarLayoutManager) {
        l0.p(calendarLayoutManager, ProtectedSandApp.s("ᓘ\u0001"));
        calendarLayoutManager.O();
    }

    public abstract int J(DayData data);

    @fg.l
    public abstract com.kizitonwose.calendar.view.g K();

    @fg.m
    public abstract com.kizitonwose.calendar.view.f L();

    public abstract int M(DayData data);

    public abstract int N(IndexData data);

    public abstract void O();

    public abstract boolean P();

    public final void Q(final DayData day) {
        final int M = M(day);
        if (M == -1) {
            return;
        }
        scrollToPositionWithOffset(M, 0);
        if (P()) {
            this.calView.post(new Runnable() { // from class: com.kizitonwose.calendar.view.internal.b
                @Override // java.lang.Runnable
                public final void run() {
                    CalendarLayoutManager.R(CalendarLayoutManager.this);
                }
            });
        } else {
            this.calView.post(new Runnable() { // from class: com.kizitonwose.calendar.view.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    CalendarLayoutManager.S(CalendarLayoutManager.this, M, day);
                }
            });
        }
    }

    public final void U(IndexData indexData) {
        int N = N(indexData);
        if (N == -1) {
            return;
        }
        scrollToPositionWithOffset(N, 0);
        this.calView.post(new Runnable() { // from class: com.kizitonwose.calendar.view.internal.a
            @Override // java.lang.Runnable
            public final void run() {
                CalendarLayoutManager.V(CalendarLayoutManager.this);
            }
        });
    }

    public final void W(DayData day) {
        int M = M(day);
        if (M == -1) {
            return;
        }
        if (P()) {
            day = null;
        }
        startSmoothScroll(new a(M, day));
    }

    public final void X(IndexData indexData) {
        int N = N(indexData);
        if (N == -1) {
            return;
        }
        startSmoothScroll(new a(N, null));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    protected void calculateExtraLayoutSpace(@fg.l RecyclerView.a0 state, @fg.l int[] extraLayoutSpace) {
        l0.p(state, ProtectedSandApp.s("ᓙ\u0001"));
        l0.p(extraLayoutSpace, ProtectedSandApp.s("ᓚ\u0001"));
        com.kizitonwose.calendar.view.f L = L();
        ld.p<RecyclerView.a0, int[], k2> a5 = L != null ? L.a() : null;
        if (a5 != null) {
            a5.invoke(state, extraLayoutSpace);
        } else {
            super.calculateExtraLayoutSpace(state, extraLayoutSpace);
        }
    }
}
