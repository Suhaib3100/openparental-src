package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.annotation.o0;
import androidx.room.i0;
import androidx.room.p2;
import androidx.room.y0;
import androidx.view.LiveData;
import androidx.work.f0;
import androidx.work.impl.model.r;
import java.util.List;

/* compiled from: WorkSpecDao.java */
@androidx.room.l
@SuppressLint({"UnknownNullness"})
/* loaded from: classes3.dex */
public interface s {
    @y0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    boolean A();

    @y0("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int B(String id2);

    @p2
    @y0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<r.c> C(String tag);

    @p2
    @y0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    LiveData<List<r.c>> D(List<String> ids);

    @y0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int E(String id2);

    @y0("UPDATE workspec SET period_start_time=:periodStartTime WHERE id=:id")
    void F(String id2, long periodStartTime);

    @p2
    @y0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    List<r.c> G(List<String> ids);

    @y0("SELECT id FROM workspec")
    List<String> H();

    @y0("DELETE FROM workspec WHERE id=:id")
    void a(String id2);

    @y0("UPDATE workspec SET state=:state WHERE id IN (:ids)")
    int b(f0.a state, String... ids);

    @y0("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void c();

    @y0("SELECT * FROM workspec WHERE period_start_time >= :startingAt AND state IN (2, 3, 5) ORDER BY period_start_time DESC")
    List<r> d(long startingAt);

    @i0(onConflict = 5)
    void e(r workSpec);

    @y0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    List<r> f();

    @y0("SELECT * FROM workspec WHERE id IN (:ids)")
    r[] g(List<String> ids);

    @y0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<String> h(@o0 String name);

    @p2
    @y0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=:id")
    r.c i(String id2);

    @y0("SELECT state FROM workspec WHERE id=:id")
    f0.a j(String id2);

    @y0("SELECT * FROM workspec WHERE id=:id")
    r k(String id2);

    @y0("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    LiveData<Long> l(@o0 String id2);

    @y0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<String> m(@o0 String tag);

    @y0("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    List<androidx.work.f> n(String id2);

    @p2
    @y0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<r.c> o(String name);

    @y0("SELECT * FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT :maxLimit")
    List<r> p(int maxLimit);

    @y0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int q();

    @y0("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int r(@o0 String id2, long startTime);

    @y0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<r.b> s(String name);

    @y0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    List<r> t(int schedulerLimit);

    @y0("UPDATE workspec SET output=:output WHERE id=:id")
    void u(String id2, androidx.work.f output);

    @p2
    @y0("SELECT id FROM workspec")
    LiveData<List<String>> v();

    @p2
    @y0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    LiveData<List<r.c>> w(String name);

    @y0("SELECT * FROM workspec WHERE state=1")
    List<r> x();

    @p2
    @y0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    LiveData<List<r.c>> y(String tag);

    @y0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    List<String> z();
}
