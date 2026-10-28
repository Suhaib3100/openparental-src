package db;

import androidx.compose.foundation.w1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.s;
import org.threeten.bp.q;

/* compiled from: MonthData.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u001c\u0010#\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0017\u0010/\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b%\u0010.¨\u00060"}, d2 = {"Ldb/d;", "", "Lorg/threeten/bp/q;", "month", "", "inDays", "outDays", "<init>", "(Lorg/threeten/bp/q;II)V", "dayOffset", "Lcb/a;", "g", "(I)Lcb/a;", "a", "()Lorg/threeten/bp/q;", "b", "()I", "c", "d", "(Lorg/threeten/bp/q;II)Ldb/d;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/threeten/bp/q;", "I", "totalDays", "Lorg/threeten/bp/g;", "kotlin.jvm.PlatformType", "e", "Lorg/threeten/bp/g;", "firstDay", "", "f", "Ljava/util/List;", "rows", "previousMonth", "h", "nextMonth", "Lcb/b;", "i", "Lcb/b;", "()Lcb/b;", "calendarMonth", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMonthData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonthData.kt\ncom/kizitonwose/calendar/data/MonthData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1549#2:145\n1620#2,3:146\n*S KotlinDebug\n*F\n+ 1 MonthData.kt\ncom/kizitonwose/calendar/data/MonthData\n*L\n32#1:145\n32#1:146,3\n*E\n"})
/* loaded from: classes6.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final q month;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int inDays;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int outDays;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int totalDays;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final org.threeten.bp.g firstDay;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<List<Integer>> rows;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final q previousMonth;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final q nextMonth;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    private final cb.b calendarMonth;

    public d(@l q qVar, int i4, int i5) {
        l0.p(qVar, ProtectedSandApp.s("㜑\u0001"));
        this.month = qVar;
        this.inDays = i4;
        this.outDays = i5;
        int z4 = qVar.z() + i4 + i5;
        this.totalDays = z4;
        this.firstDay = cb.f.a(qVar).m0(i4);
        List<List<Integer>> P1 = w.P1(s.W1(0, z4), 7);
        this.rows = P1;
        this.previousMonth = cb.f.i(qVar);
        this.nextMonth = cb.f.h(qVar);
        List<List<Integer>> list = P1;
        ArrayList arrayList = new ArrayList(w.b0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            ArrayList arrayList2 = new ArrayList(w.b0(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g(((Number) it2.next()).intValue()));
            }
            arrayList.add(arrayList2);
        }
        this.calendarMonth = new cb.b(qVar, arrayList);
    }

    /* renamed from: a, reason: from getter */
    private final q getMonth() {
        return this.month;
    }

    /* renamed from: b, reason: from getter */
    private final int getInDays() {
        return this.inDays;
    }

    /* renamed from: c, reason: from getter */
    private final int getOutDays() {
        return this.outDays;
    }

    public static /* synthetic */ d e(d dVar, q qVar, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            qVar = dVar.month;
        }
        if ((i6 & 2) != 0) {
            i4 = dVar.inDays;
        }
        if ((i6 & 4) != 0) {
            i5 = dVar.outDays;
        }
        return dVar.d(qVar, i4, i5);
    }

    private final cb.a g(int dayOffset) {
        cb.d dVar;
        org.threeten.bp.g F0 = this.firstDay.F0(dayOffset);
        l0.m(F0);
        q j4 = cb.f.j(F0);
        if (l0.g(j4, this.month)) {
            dVar = cb.d.MonthDate;
        } else if (l0.g(j4, this.previousMonth)) {
            dVar = cb.d.InDate;
        } else {
            if (!l0.g(j4, this.nextMonth)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("㜒\u0001") + F0 + ProtectedSandApp.s("㜓\u0001") + this.month);
            }
            dVar = cb.d.OutDate;
        }
        return new cb.a(F0, dVar);
    }

    @l
    public final d d(@l q month, int inDays, int outDays) {
        l0.p(month, ProtectedSandApp.s("㜑\u0001"));
        return new d(month, inDays, outDays);
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return l0.g(this.month, dVar.month) && this.inDays == dVar.inDays && this.outDays == dVar.outDays;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final cb.b getCalendarMonth() {
        return this.calendarMonth;
    }

    public int hashCode() {
        return Integer.hashCode(this.outDays) + w1.a(this.inDays, this.month.hashCode() * 31, 31);
    }

    @l
    public String toString() {
        q qVar = this.month;
        int i4 = this.inDays;
        int i5 = this.outDays;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("㜔\u0001"));
        sb.append(qVar);
        sb.append(ProtectedSandApp.s("㜕\u0001"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("㜖\u0001"));
        return android.support.v4.media.b.a(sb, i5, ProtectedSandApp.s("㜗\u0001"));
    }
}
