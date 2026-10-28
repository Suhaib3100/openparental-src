package cb;

import androidx.compose.runtime.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import org.threeten.bp.q;

/* compiled from: CalendarMonth.kt */
@m1
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcb/b;", "Ljava/io/Serializable;", "Lorg/threeten/bp/q;", "yearMonth", "", "Lcb/a;", "weekDays", "<init>", "(Lorg/threeten/bp/q;Ljava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "()Lorg/threeten/bp/q;", "b", "()Ljava/util/List;", "c", "(Lorg/threeten/bp/q;Ljava/util/List;)Lcb/b;", "Lorg/threeten/bp/q;", "f", "Ljava/util/List;", "e", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class b implements Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final q yearMonth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<List<a>> weekDays;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@l q qVar, @l List<? extends List<a>> list) {
        l0.p(qVar, ProtectedSandApp.s("\uf0c6"));
        l0.p(list, ProtectedSandApp.s("\uf0c7"));
        this.yearMonth = qVar;
        this.weekDays = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b d(b bVar, q qVar, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            qVar = bVar.yearMonth;
        }
        if ((i4 & 2) != 0) {
            list = bVar.weekDays;
        }
        return bVar.c(qVar, list);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final q getYearMonth() {
        return this.yearMonth;
    }

    @l
    public final List<List<a>> b() {
        return this.weekDays;
    }

    @l
    public final b c(@l q yearMonth, @l List<? extends List<a>> weekDays) {
        l0.p(yearMonth, ProtectedSandApp.s("\uf0c6"));
        l0.p(weekDays, ProtectedSandApp.s("\uf0c7"));
        return new b(yearMonth, weekDays);
    }

    @l
    public final List<List<a>> e() {
        return this.weekDays;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!l0.g(b.class, other != null ? other.getClass() : null)) {
            return false;
        }
        l0.n(other, ProtectedSandApp.s("\uf0c8"));
        b bVar = (b) other;
        return l0.g(this.yearMonth, bVar.yearMonth) && l0.g(w.B2((List) w.B2(this.weekDays)), w.B2((List) w.B2(bVar.weekDays))) && l0.g(w.p3((List) w.p3(this.weekDays)), w.p3((List) w.p3(bVar.weekDays)));
    }

    @l
    public final q f() {
        return this.yearMonth;
    }

    public int hashCode() {
        return ((a) w.p3((List) w.p3(this.weekDays))).hashCode() + ((((a) w.B2((List) w.B2(this.weekDays))).hashCode() + (this.yearMonth.hashCode() * 31)) * 31);
    }

    @l
    public String toString() {
        q qVar = this.yearMonth;
        Object B2 = w.B2((List) w.B2(this.weekDays));
        Object p32 = w.p3((List) w.p3(this.weekDays));
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\uf0c9"));
        sb.append(qVar);
        sb.append(ProtectedSandApp.s("\uf0ca"));
        sb.append(B2);
        sb.append(ProtectedSandApp.s("\uf0cb"));
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i.a(sb, p32, ProtectedSandApp.s("\uf0cc"));
    }
}
