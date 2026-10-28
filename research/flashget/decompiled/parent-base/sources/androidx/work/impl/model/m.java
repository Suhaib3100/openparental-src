package androidx.work.impl.model;

import androidx.annotation.o0;
import androidx.room.i0;
import androidx.room.y0;
import java.util.List;

/* compiled from: WorkNameDao.java */
@androidx.room.l
/* loaded from: classes3.dex */
public interface m {
    @i0(onConflict = 5)
    void a(l workName);

    @o0
    @y0("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    List<String> b(@o0 String workSpecId);

    @y0("SELECT work_spec_id FROM workname WHERE name=:name")
    List<String> c(String name);
}
