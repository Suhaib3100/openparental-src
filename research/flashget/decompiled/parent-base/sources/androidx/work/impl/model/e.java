package androidx.work.impl.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.room.i0;
import androidx.room.y0;
import androidx.view.LiveData;

/* compiled from: PreferenceDao.java */
@androidx.room.l
/* loaded from: classes3.dex */
public interface e {
    @o0
    @y0("SELECT long_value FROM Preference where `key`=:key")
    LiveData<Long> a(@o0 String key);

    @i0(onConflict = 1)
    void b(@o0 d preference);

    @q0
    @y0("SELECT long_value FROM Preference where `key`=:key")
    Long c(@o0 String key);
}
