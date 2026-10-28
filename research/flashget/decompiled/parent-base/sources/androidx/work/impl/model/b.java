package androidx.work.impl.model;

import androidx.room.i0;
import androidx.room.y0;
import java.util.List;

/* compiled from: DependencyDao.java */
@androidx.room.l
/* loaded from: classes3.dex */
public interface b {
    @i0(onConflict = 5)
    void a(a dependency);

    @y0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    List<String> b(String id2);

    @y0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean c(String id2);

    @y0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean d(String id2);

    @y0("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    List<String> e(String id2);
}
