package db;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: WeekData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Ldb/i;", "", "Lorg/threeten/bp/g;", "startDateAdjusted", "endDateAdjusted", "<init>", "(Lorg/threeten/bp/g;Lorg/threeten/bp/g;)V", "a", "()Lorg/threeten/bp/g;", "b", "c", "(Lorg/threeten/bp/g;Lorg/threeten/bp/g;)Ldb/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/threeten/bp/g;", "f", "e", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final org.threeten.bp.g startDateAdjusted;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final org.threeten.bp.g endDateAdjusted;

    public i(@l org.threeten.bp.g gVar, @l org.threeten.bp.g gVar2) {
        l0.p(gVar, ProtectedSandApp.s("㜳\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("㜴\u0001"));
        this.startDateAdjusted = gVar;
        this.endDateAdjusted = gVar2;
    }

    public static /* synthetic */ i d(i iVar, org.threeten.bp.g gVar, org.threeten.bp.g gVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = iVar.startDateAdjusted;
        }
        if ((i4 & 2) != 0) {
            gVar2 = iVar.endDateAdjusted;
        }
        return iVar.c(gVar, gVar2);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final org.threeten.bp.g getStartDateAdjusted() {
        return this.startDateAdjusted;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final org.threeten.bp.g getEndDateAdjusted() {
        return this.endDateAdjusted;
    }

    @l
    public final i c(@l org.threeten.bp.g startDateAdjusted, @l org.threeten.bp.g endDateAdjusted) {
        l0.p(startDateAdjusted, ProtectedSandApp.s("㜳\u0001"));
        l0.p(endDateAdjusted, ProtectedSandApp.s("㜴\u0001"));
        return new i(startDateAdjusted, endDateAdjusted);
    }

    @l
    public final org.threeten.bp.g e() {
        return this.endDateAdjusted;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return l0.g(this.startDateAdjusted, iVar.startDateAdjusted) && l0.g(this.endDateAdjusted, iVar.endDateAdjusted);
    }

    @l
    public final org.threeten.bp.g f() {
        return this.startDateAdjusted;
    }

    public int hashCode() {
        return this.endDateAdjusted.hashCode() + (this.startDateAdjusted.hashCode() * 31);
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("㜵\u0001") + this.startDateAdjusted + ProtectedSandApp.s("㜶\u0001") + this.endDateAdjusted + ProtectedSandApp.s("㜷\u0001");
    }
}
