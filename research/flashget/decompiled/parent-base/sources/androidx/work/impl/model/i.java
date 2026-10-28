package androidx.work.impl.model;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.room.a0;
import androidx.room.v0;

/* compiled from: SystemIdInfo.java */
@androidx.room.u(foreignKeys = {@a0(childColumns = {"work_spec_id"}, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "work_spec_id")
    @o0
    @v0
    public final String f36322a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "system_id")
    public final int f36323b;

    public i(@o0 String workSpecId, int systemId) {
        this.f36322a = workSpecId;
        this.f36323b = systemId;
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof i)) {
            return false;
        }
        i iVar = (i) o4;
        if (this.f36323b != iVar.f36323b) {
            return false;
        }
        return this.f36322a.equals(iVar.f36322a);
    }

    public int hashCode() {
        return (this.f36322a.hashCode() * 31) + this.f36323b;
    }
}
