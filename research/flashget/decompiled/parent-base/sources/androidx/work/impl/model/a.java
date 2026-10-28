package androidx.work.impl.model;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.room.a0;
import androidx.room.h0;

/* compiled from: Dependency.java */
@androidx.room.u(foreignKeys = {@a0(childColumns = {"work_spec_id"}, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @a0(childColumns = {"prerequisite_id"}, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@h0({"work_spec_id"}), @h0({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "work_spec_id")
    @o0
    public final String f36307a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "prerequisite_id")
    @o0
    public final String f36308b;

    public a(@o0 String workSpecId, @o0 String prerequisiteId) {
        this.f36307a = workSpecId;
        this.f36308b = prerequisiteId;
    }
}
