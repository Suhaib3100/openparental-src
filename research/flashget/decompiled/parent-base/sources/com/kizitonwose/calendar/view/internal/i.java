package com.kizitonwose.calendar.view.internal;

import androidx.annotation.j0;
import androidx.compose.foundation.w1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DayHolder.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lcom/kizitonwose/calendar/view/internal/i;", "Day", "", "Lcom/kizitonwose/calendar/view/e;", "daySize", "", "dayViewRes", "Lcom/kizitonwose/calendar/view/a;", "Lcom/kizitonwose/calendar/view/l;", "dayBinder", "<init>", "(Lcom/kizitonwose/calendar/view/e;ILcom/kizitonwose/calendar/view/a;)V", "a", "()Lcom/kizitonwose/calendar/view/e;", "b", "()I", "c", "()Lcom/kizitonwose/calendar/view/a;", "d", "(Lcom/kizitonwose/calendar/view/e;ILcom/kizitonwose/calendar/view/a;)Lcom/kizitonwose/calendar/view/internal/i;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/kizitonwose/calendar/view/e;", "g", "I", "h", "Lcom/kizitonwose/calendar/view/a;", "f", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class i<Day> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final com.kizitonwose.calendar.view.e daySize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int dayViewRes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final com.kizitonwose.calendar.view.a<Day, com.kizitonwose.calendar.view.l> dayBinder;

    public i(@fg.l com.kizitonwose.calendar.view.e eVar, @j0 int i4, @fg.l com.kizitonwose.calendar.view.a<Day, com.kizitonwose.calendar.view.l> aVar) {
        l0.p(eVar, ProtectedSandApp.s("ᓯ\u0001"));
        l0.p(aVar, ProtectedSandApp.s("ᓰ\u0001"));
        this.daySize = eVar;
        this.dayViewRes = i4;
        this.dayBinder = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i e(i iVar, com.kizitonwose.calendar.view.e eVar, int i4, com.kizitonwose.calendar.view.a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            eVar = iVar.daySize;
        }
        if ((i5 & 2) != 0) {
            i4 = iVar.dayViewRes;
        }
        if ((i5 & 4) != 0) {
            aVar = iVar.dayBinder;
        }
        return iVar.d(eVar, i4, aVar);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final com.kizitonwose.calendar.view.e getDaySize() {
        return this.daySize;
    }

    /* renamed from: b, reason: from getter */
    public final int getDayViewRes() {
        return this.dayViewRes;
    }

    @fg.l
    public final com.kizitonwose.calendar.view.a<Day, com.kizitonwose.calendar.view.l> c() {
        return this.dayBinder;
    }

    @fg.l
    public final i<Day> d(@fg.l com.kizitonwose.calendar.view.e daySize, @j0 int dayViewRes, @fg.l com.kizitonwose.calendar.view.a<Day, com.kizitonwose.calendar.view.l> dayBinder) {
        l0.p(daySize, ProtectedSandApp.s("ᓯ\u0001"));
        l0.p(dayBinder, ProtectedSandApp.s("ᓰ\u0001"));
        return new i<>(daySize, dayViewRes, dayBinder);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return this.daySize == iVar.daySize && this.dayViewRes == iVar.dayViewRes && l0.g(this.dayBinder, iVar.dayBinder);
    }

    @fg.l
    public final com.kizitonwose.calendar.view.a<Day, com.kizitonwose.calendar.view.l> f() {
        return this.dayBinder;
    }

    @fg.l
    public final com.kizitonwose.calendar.view.e g() {
        return this.daySize;
    }

    public final int h() {
        return this.dayViewRes;
    }

    public int hashCode() {
        return this.dayBinder.hashCode() + w1.a(this.dayViewRes, this.daySize.hashCode() * 31, 31);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("ᓱ\u0001") + this.daySize + ProtectedSandApp.s("ᓲ\u0001") + this.dayViewRes + ProtectedSandApp.s("ᓳ\u0001") + this.dayBinder + ProtectedSandApp.s("ᓴ\u0001");
    }
}
