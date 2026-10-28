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
import org.threeten.bp.p;

/* compiled from: CalendarYear.kt */
@m1
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcb/c;", "Ljava/io/Serializable;", "Lorg/threeten/bp/p;", "year", "", "Lcb/b;", "months", "<init>", "(Lorg/threeten/bp/p;Ljava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "()Lorg/threeten/bp/p;", "b", "()Ljava/util/List;", "c", "(Lorg/threeten/bp/p;Ljava/util/List;)Lcb/c;", "Lorg/threeten/bp/p;", "f", "Ljava/util/List;", "e", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class c implements Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final p year;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<b> months;

    public c(@l p pVar, @l List<b> list) {
        l0.p(pVar, ProtectedSandApp.s("\uf0cd"));
        l0.p(list, ProtectedSandApp.s("\uf0ce"));
        this.year = pVar;
        this.months = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c d(c cVar, p pVar, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            pVar = cVar.year;
        }
        if ((i4 & 2) != 0) {
            list = cVar.months;
        }
        return cVar.c(pVar, list);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final p getYear() {
        return this.year;
    }

    @l
    public final List<b> b() {
        return this.months;
    }

    @l
    public final c c(@l p year, @l List<b> months) {
        l0.p(year, ProtectedSandApp.s("\uf0cd"));
        l0.p(months, ProtectedSandApp.s("\uf0ce"));
        return new c(year, months);
    }

    @l
    public final List<b> e() {
        return this.months;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!l0.g(c.class, other != null ? other.getClass() : null)) {
            return false;
        }
        l0.n(other, ProtectedSandApp.s("\uf0cf"));
        c cVar = (c) other;
        return l0.g(this.year, cVar.year) && l0.g(w.B2(this.months), w.B2(cVar.months)) && l0.g(w.p3(this.months), w.p3(cVar.months));
    }

    @l
    public final p f() {
        return this.year;
    }

    public int hashCode() {
        return ((b) w.p3(this.months)).hashCode() + ((((b) w.B2(this.months)).hashCode() + (this.year.hashCode() * 31)) * 31);
    }

    @l
    public String toString() {
        p pVar = this.year;
        Object B2 = w.B2(this.months);
        Object p32 = w.p3(this.months);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\uf0d0"));
        sb.append(pVar);
        sb.append(ProtectedSandApp.s("\uf0d1"));
        sb.append(B2);
        sb.append(ProtectedSandApp.s("\uf0d2"));
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i.a(sb, p32, ProtectedSandApp.s("\uf0d3"));
    }
}
