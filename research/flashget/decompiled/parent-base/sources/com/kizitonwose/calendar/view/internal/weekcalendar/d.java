package com.kizitonwose.calendar.view.internal.weekcalendar;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cb.h;
import cb.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.kizitonwose.calendar.view.internal.p;
import com.kizitonwose.calendar.view.o;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: WeekViewHolder.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u0018\u0010&\"\u0004\b\u001a\u0010\u0014¨\u0006'"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/weekcalendar/d;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/ViewGroup;", "rootLayout", "Landroid/view/View;", "headerView", "footerView", "Lcom/kizitonwose/calendar/view/internal/p;", "Lcb/i;", "weekHolder", "Lcom/kizitonwose/calendar/view/o;", "Lcom/kizitonwose/calendar/view/l;", "weekHeaderBinder", "weekFooterBinder", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Lcom/kizitonwose/calendar/view/internal/p;Lcom/kizitonwose/calendar/view/o;Lcom/kizitonwose/calendar/view/o;)V", "Lcb/h;", "week", "Lkotlin/k2;", "a", "(Lcb/h;)V", "day", "c", "(Lcb/i;)V", "b", "Landroid/view/View;", "d", "Lcom/kizitonwose/calendar/view/internal/p;", "e", "Lcom/kizitonwose/calendar/view/o;", "f", "g", "Lcom/kizitonwose/calendar/view/l;", "headerContainer", "h", "footerContainer", "i", "Lcb/h;", "()Lcb/h;", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    private final p<i> weekHolder;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private final o<com.kizitonwose.calendar.view.l> weekHeaderBinder;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private final o<com.kizitonwose.calendar.view.l> weekFooterBinder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    private com.kizitonwose.calendar.view.l headerContainer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @m
    private com.kizitonwose.calendar.view.l footerContainer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public h week;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@l ViewGroup viewGroup, @m View view, @m View view2, @l p<i> pVar, @m o<com.kizitonwose.calendar.view.l> oVar, @m o<com.kizitonwose.calendar.view.l> oVar2) {
        super(viewGroup);
        l0.p(viewGroup, ProtectedSandApp.s("ᕂ\u0001"));
        l0.p(pVar, ProtectedSandApp.s("ᕃ\u0001"));
        this.headerView = view;
        this.footerView = view2;
        this.weekHolder = pVar;
        this.weekHeaderBinder = oVar;
        this.weekFooterBinder = oVar2;
    }

    public final void a(@l h week) {
        l0.p(week, ProtectedSandApp.s("ᕄ\u0001"));
        d(week);
        View view = this.headerView;
        if (view != null) {
            com.kizitonwose.calendar.view.l lVar = this.headerContainer;
            if (lVar == null) {
                o<com.kizitonwose.calendar.view.l> oVar = this.weekHeaderBinder;
                l0.m(oVar);
                lVar = oVar.b(view);
                this.headerContainer = lVar;
            }
            o<com.kizitonwose.calendar.view.l> oVar2 = this.weekHeaderBinder;
            if (oVar2 != null) {
                oVar2.a(lVar, week);
            }
        }
        this.weekHolder.a(week.d());
        View view2 = this.footerView;
        if (view2 != null) {
            com.kizitonwose.calendar.view.l lVar2 = this.footerContainer;
            if (lVar2 == null) {
                o<com.kizitonwose.calendar.view.l> oVar3 = this.weekFooterBinder;
                l0.m(oVar3);
                lVar2 = oVar3.b(view2);
                this.footerContainer = lVar2;
            }
            o<com.kizitonwose.calendar.view.l> oVar4 = this.weekFooterBinder;
            if (oVar4 != null) {
                oVar4.a(lVar2, week);
            }
        }
    }

    @l
    public final h b() {
        h hVar = this.week;
        if (hVar != null) {
            return hVar;
        }
        l0.S(ProtectedSandApp.s("ᕄ\u0001"));
        return null;
    }

    public final void c(@l i day) {
        l0.p(day, ProtectedSandApp.s("ᕅ\u0001"));
        this.weekHolder.c(day);
    }

    public final void d(@l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("ᕆ\u0001"));
        this.week = hVar;
    }
}
