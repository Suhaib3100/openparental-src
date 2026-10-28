package androidx.work.impl.model;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.room.a0;
import androidx.room.h0;

/* compiled from: WorkName.java */
@androidx.room.u(foreignKeys = {@a0(childColumns = {"work_spec_id"}, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@h0({"work_spec_id"})}, primaryKeys = {"name", "work_spec_id"})
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "name")
    @o0
    public final String f36329a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "work_spec_id")
    @o0
    public final String f36330b;

    public l(@o0 String name, @o0 String workSpecId) {
        this.f36329a = name;
        this.f36330b = workSpecId;
    }
}
