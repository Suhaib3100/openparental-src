package androidx.work.impl.model;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.room.i0;
import androidx.room.y0;
import java.util.List;

/* compiled from: WorkProgressDao.java */
@androidx.room.l
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface p {
    @y0("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void a(@o0 String workSpecId);

    @q0
    @y0("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    androidx.work.f b(@o0 String workSpecId);

    @y0("DELETE FROM WorkProgress")
    void c();

    @i0(onConflict = 1)
    void d(@o0 o progress);

    @o0
    @y0("SELECT progress FROM WorkProgress WHERE work_spec_id IN (:workSpecIds)")
    List<androidx.work.f> e(@o0 List<String> workSpecIds);
}
