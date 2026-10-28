package db;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.u0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.s;

/* compiled from: WeekData.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Ldb/g;", "", "Lorg/threeten/bp/g;", "firstDayInWeek", "desiredStartDate", "desiredEndDate", "<init>", "(Lorg/threeten/bp/g;Lorg/threeten/bp/g;Lorg/threeten/bp/g;)V", "", "dayOffset", "Lcb/i;", "f", "(I)Lcb/i;", "a", "()Lorg/threeten/bp/g;", "b", "c", "d", "(Lorg/threeten/bp/g;Lorg/threeten/bp/g;Lorg/threeten/bp/g;)Ldb/g;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/threeten/bp/g;", "Lcb/h;", "Lcb/h;", "g", "()Lcb/h;", "week", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nWeekData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeekData.kt\ncom/kizitonwose/calendar/data/WeekData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n1549#2:65\n1620#2,3:66\n*S KotlinDebug\n*F\n+ 1 WeekData.kt\ncom/kizitonwose/calendar/data/WeekData\n*L\n43#1:65\n43#1:66,3\n*E\n"})
/* loaded from: classes6.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final org.threeten.bp.g firstDayInWeek;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final org.threeten.bp.g desiredStartDate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final org.threeten.bp.g desiredEndDate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final cb.h week;

    public g(@l org.threeten.bp.g gVar, @l org.threeten.bp.g gVar2, @l org.threeten.bp.g gVar3) {
        l0.p(gVar, ProtectedSandApp.s("㜣\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("㜤\u0001"));
        l0.p(gVar3, ProtectedSandApp.s("㜥\u0001"));
        this.firstDayInWeek = gVar;
        this.desiredStartDate = gVar2;
        this.desiredEndDate = gVar3;
        kotlin.ranges.l W1 = s.W1(0, 7);
        ArrayList arrayList = new ArrayList(w.b0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            arrayList.add(f(((u0) it).c()));
        }
        this.week = new cb.h(arrayList);
    }

    /* renamed from: a, reason: from getter */
    private final org.threeten.bp.g getFirstDayInWeek() {
        return this.firstDayInWeek;
    }

    /* renamed from: b, reason: from getter */
    private final org.threeten.bp.g getDesiredStartDate() {
        return this.desiredStartDate;
    }

    /* renamed from: c, reason: from getter */
    private final org.threeten.bp.g getDesiredEndDate() {
        return this.desiredEndDate;
    }

    public static /* synthetic */ g e(g gVar, org.threeten.bp.g gVar2, org.threeten.bp.g gVar3, org.threeten.bp.g gVar4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar2 = gVar.firstDayInWeek;
        }
        if ((i4 & 2) != 0) {
            gVar3 = gVar.desiredStartDate;
        }
        if ((i4 & 4) != 0) {
            gVar4 = gVar.desiredEndDate;
        }
        return gVar.d(gVar2, gVar3, gVar4);
    }

    private final cb.i f(int dayOffset) {
        org.threeten.bp.g F0 = this.firstDayInWeek.F0(dayOffset);
        cb.j jVar = F0.compareTo(this.desiredStartDate) < 0 ? cb.j.InDate : F0.compareTo(this.desiredEndDate) > 0 ? cb.j.OutDate : cb.j.RangeDate;
        l0.m(F0);
        return new cb.i(F0, jVar);
    }

    @l
    public final g d(@l org.threeten.bp.g firstDayInWeek, @l org.threeten.bp.g desiredStartDate, @l org.threeten.bp.g desiredEndDate) {
        l0.p(firstDayInWeek, ProtectedSandApp.s("㜣\u0001"));
        l0.p(desiredStartDate, ProtectedSandApp.s("㜤\u0001"));
        l0.p(desiredEndDate, ProtectedSandApp.s("㜥\u0001"));
        return new g(firstDayInWeek, desiredStartDate, desiredEndDate);
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return l0.g(this.firstDayInWeek, gVar.firstDayInWeek) && l0.g(this.desiredStartDate, gVar.desiredStartDate) && l0.g(this.desiredEndDate, gVar.desiredEndDate);
    }

    @l
    /* renamed from: g, reason: from getter */
    public final cb.h getWeek() {
        return this.week;
    }

    public int hashCode() {
        return this.desiredEndDate.hashCode() + ((this.desiredStartDate.hashCode() + (this.firstDayInWeek.hashCode() * 31)) * 31);
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("㜦\u0001") + this.firstDayInWeek + ProtectedSandApp.s("㜧\u0001") + this.desiredStartDate + ProtectedSandApp.s("㜨\u0001") + this.desiredEndDate + ProtectedSandApp.s("㜩\u0001");
    }
}
