package androidx.room;

import androidx.view.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;

/* compiled from: InvalidationLiveDataContainer.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00062\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R$\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/room/j0;", "", "Landroidx/room/c2;", "database", "<init>", "(Landroidx/room/c2;)V", "T", "", "", "tableNames", "", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", "a", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "liveData", "Lkotlin/k2;", "c", "(Landroidx/lifecycle/LiveData;)V", "d", "Landroidx/room/c2;", "", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "liveDataSet", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c2 database;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Set<LiveData<?>> liveDataSet;

    public j0(@fg.l c2 database) {
        kotlin.jvm.internal.l0.p(database, "database");
        this.database = database;
        Set<LiveData<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        kotlin.jvm.internal.l0.o(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.liveDataSet = newSetFromMap;
    }

    @fg.l
    public final <T> LiveData<T> a(@fg.l String[] tableNames, boolean inTransaction, @fg.l Callable<T> computeFunction) {
        kotlin.jvm.internal.l0.p(tableNames, "tableNames");
        kotlin.jvm.internal.l0.p(computeFunction, "computeFunction");
        return new j2(this.database, this, inTransaction, computeFunction, tableNames);
    }

    @fg.l
    public final Set<LiveData<?>> b() {
        return this.liveDataSet;
    }

    public final void c(@fg.l LiveData<?> liveData) {
        kotlin.jvm.internal.l0.p(liveData, "liveData");
        this.liveDataSet.add(liveData);
    }

    public final void d(@fg.l LiveData<?> liveData) {
        kotlin.jvm.internal.l0.p(liveData, "liveData");
        this.liveDataSet.remove(liveData);
    }
}
