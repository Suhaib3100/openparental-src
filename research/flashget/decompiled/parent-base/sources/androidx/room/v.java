package androidx.room;

import androidx.annotation.c1;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: EntityDeletionOrUpdateAdapter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H$¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0015\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/room/v;", "T", "Landroidx/room/n2;", "Landroidx/room/c2;", "database", "<init>", "(Landroidx/room/c2;)V", "", "createQuery", "()Ljava/lang/String;", "Lf3/i;", "statement", "entity", "Lkotlin/k2;", "bind", "(Lf3/i;Ljava/lang/Object;)V", "", "handle", "(Ljava/lang/Object;)I", "", "entities", "handleMultiple", "(Ljava/lang/Iterable;)I", "", "([Ljava/lang/Object;)I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.internal.r1({"SMAP\nEntityDeletionOrUpdateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityDeletionOrUpdateAdapter.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,107:1\n1855#2,2:108\n13579#3,2:110\n*S KotlinDebug\n*F\n+ 1 EntityDeletionOrUpdateAdapter.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n*L\n77#1:108,2\n97#1:110,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class v<T> extends n2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@fg.l c2 database) {
        super(database);
        kotlin.jvm.internal.l0.p(database, "database");
    }

    protected abstract void bind(@fg.l f3.i statement, T entity);

    @Override // androidx.room.n2
    @fg.l
    protected abstract String createQuery();

    public final int handle(T entity) {
        f3.i acquire = acquire();
        try {
            bind(acquire, entity);
            return acquire.h0();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(@fg.l Iterable<? extends T> entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        f3.i acquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                bind(acquire, it.next());
                i4 += acquire.h0();
            }
            return i4;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(@fg.l T[] entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        f3.i acquire = acquire();
        try {
            int i4 = 0;
            for (T t4 : entities) {
                bind(acquire, t4);
                i4 += acquire.h0();
            }
            return i4;
        } finally {
            release(acquire);
        }
    }
}
