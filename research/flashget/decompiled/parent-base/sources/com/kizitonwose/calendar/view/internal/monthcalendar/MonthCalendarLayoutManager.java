package com.kizitonwose.calendar.view.internal.monthcalendar;

import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.kizitonwose.calendar.view.CalendarView;
import com.kizitonwose.calendar.view.f;
import com.kizitonwose.calendar.view.g;
import com.kizitonwose.calendar.view.internal.CalendarLayoutManager;
import com.kizitonwose.calendar.view.internal.n;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import org.threeten.bp.q;

/* compiled from: MonthCalendarLayoutManager.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/monthcalendar/MonthCalendarLayoutManager;", "Lcom/kizitonwose/calendar/view/internal/CalendarLayoutManager;", "Lorg/threeten/bp/q;", "Lcb/a;", "Lcom/kizitonwose/calendar/view/CalendarView;", "calView", "<init>", "(Lcom/kizitonwose/calendar/view/CalendarView;)V", "data", "", "b0", "(Lorg/threeten/bp/q;)I", "a0", "(Lcb/a;)I", "Z", "Lcom/kizitonwose/calendar/view/g;", "K", "()Lcom/kizitonwose/calendar/view/g;", "", "P", "()Z", "Lkotlin/k2;", "O", "()V", "Lcom/kizitonwose/calendar/view/f;", "L", "()Lcom/kizitonwose/calendar/view/f;", "c", "Lcom/kizitonwose/calendar/view/CalendarView;", "Lcom/kizitonwose/calendar/view/internal/monthcalendar/c;", "Y", "()Lcom/kizitonwose/calendar/view/internal/monthcalendar/c;", "adapter", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MonthCalendarLayoutManager extends CalendarLayoutManager<q, cb.a> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final CalendarView calView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonthCalendarLayoutManager(@l CalendarView calendarView) {
        super(calendarView, calendarView.getOrientation());
        l0.p(calendarView, ProtectedSandApp.s("ᔉ\u0001"));
        this.calView = calendarView;
    }

    private final c Y() {
        RecyclerView.h adapter = this.calView.getAdapter();
        l0.n(adapter, ProtectedSandApp.s("ᔊ\u0001"));
        return (c) adapter;
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    @l
    public g K() {
        return this.calView.getMonthMargins();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    @m
    public f L() {
        return this.calView.getLayoutHelper();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    public void O() {
        Y().x();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    public boolean P() {
        return this.calView.getScrollPaged();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public int J(@l cb.a data) {
        l0.p(data, ProtectedSandApp.s("ᔋ\u0001"));
        return n.a(data.e());
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public int M(@l cb.a data) {
        l0.p(data, ProtectedSandApp.s("ᔋ\u0001"));
        return Y().p(data);
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public int N(@l q data) {
        l0.p(data, ProtectedSandApp.s("ᔋ\u0001"));
        return Y().q(data);
    }
}
