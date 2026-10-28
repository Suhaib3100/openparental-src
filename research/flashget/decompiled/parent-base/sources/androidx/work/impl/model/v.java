package androidx.work.impl.model;

import androidx.room.i0;
import androidx.room.y0;
import java.util.List;

/* compiled from: WorkTagDao.java */
@androidx.room.l
/* loaded from: classes3.dex */
public interface v {
    @y0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    List<String> a(String id2);

    @i0(onConflict = 5)
    void b(u workTag);

    @y0("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    List<String> c(String tag);
}
