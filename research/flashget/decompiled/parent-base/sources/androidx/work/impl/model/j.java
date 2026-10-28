package androidx.work.impl.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.room.i0;
import androidx.room.y0;
import java.util.List;

/* compiled from: SystemIdInfoDao.java */
@androidx.room.l
/* loaded from: classes3.dex */
public interface j {
    @q0
    @y0("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId")
    i a(@o0 String workSpecId);

    @o0
    @y0("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    List<String> b();

    @i0(onConflict = 1)
    void c(@o0 i systemIdInfo);

    @y0("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void d(@o0 String workSpecId);
}
