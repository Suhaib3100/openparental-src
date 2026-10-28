package androidx.work.impl.model;

import androidx.annotation.o0;
import androidx.room.w1;
import androidx.view.LiveData;
import androidx.work.impl.model.r;
import java.util.List;

/* compiled from: RawWorkInfoDao.java */
@androidx.room.l
/* loaded from: classes3.dex */
public interface g {
    @o0
    @w1(observedEntities = {r.class})
    LiveData<List<r.c>> a(@o0 f3.g query);

    @o0
    @w1(observedEntities = {r.class})
    List<r.c> b(@o0 f3.g query);
}
