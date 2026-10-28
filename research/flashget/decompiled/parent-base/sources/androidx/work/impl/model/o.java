package androidx.work.impl.model;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.room.a0;
import androidx.room.v0;

/* compiled from: WorkProgress.java */
@androidx.room.u(foreignKeys = {@a0(childColumns = {"work_spec_id"}, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "work_spec_id")
    @o0
    @v0
    public final String f36334a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "progress")
    @o0
    public final androidx.work.f f36335b;

    public o(@o0 String workSpecId, @o0 androidx.work.f progress) {
        this.f36334a = workSpecId;
        this.f36335b = progress;
    }
}
