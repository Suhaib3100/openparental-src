package com.kizitonwose.calendar.view.internal.weekcalendar;

import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.kizitonwose.calendar.view.WeekCalendarView;
import com.kizitonwose.calendar.view.f;
import com.kizitonwose.calendar.view.internal.CalendarLayoutManager;
import com.kizitonwose.calendar.view.internal.n;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import org.threeten.bp.g;

/* compiled from: WeekCalendarLayoutManager.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/weekcalendar/WeekCalendarLayoutManager;", "Lcom/kizitonwose/calendar/view/internal/CalendarLayoutManager;", "Lorg/threeten/bp/g;", "Lcom/kizitonwose/calendar/view/WeekCalendarView;", "calView", "<init>", "(Lcom/kizitonwose/calendar/view/WeekCalendarView;)V", "data", "", "b0", "(Lorg/threeten/bp/g;)I", "a0", "Z", "Lcom/kizitonwose/calendar/view/g;", "K", "()Lcom/kizitonwose/calendar/view/g;", "", "P", "()Z", "Lkotlin/k2;", "O", "()V", "Lcom/kizitonwose/calendar/view/f;", "L", "()Lcom/kizitonwose/calendar/view/f;", "c", "Lcom/kizitonwose/calendar/view/WeekCalendarView;", "Lcom/kizitonwose/calendar/view/internal/weekcalendar/c;", "Y", "()Lcom/kizitonwose/calendar/view/internal/weekcalendar/c;", "adapter", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WeekCalendarLayoutManager extends CalendarLayoutManager<g, g> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final WeekCalendarView calView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekCalendarLayoutManager(@l WeekCalendarView weekCalendarView) {
        super(weekCalendarView, 0);
        l0.p(weekCalendarView, ProtectedSandApp.s("ᔰ\u0001"));
        this.calView = weekCalendarView;
    }

    private final c Y() {
        RecyclerView.h adapter = this.calView.getAdapter();
        l0.n(adapter, ProtectedSandApp.s("ᔱ\u0001"));
        return (c) adapter;
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    @l
    public com.kizitonwose.calendar.view.g K() {
        return this.calView.getWeekMargins();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    @m
    public f L() {
        return this.calView.getLayoutHelper();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    public void O() {
        Y().v();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    public boolean P() {
        return this.calView.getScrollPaged();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public int J(@l g data) {
        l0.p(data, ProtectedSandApp.s("ᔲ\u0001"));
        return n.a(data);
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public int M(@l g data) {
        l0.p(data, ProtectedSandApp.s("ᔲ\u0001"));
        return Y().p(data);
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public int N(@l g data) {
        l0.p(data, ProtectedSandApp.s("ᔲ\u0001"));
        return Y().p(data);
    }
}
