package androidx.room;

import androidx.annotation.c1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EntityInsertionAdapter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H$¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\r\u0010\u0011J\u001b\u0010\r\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\r\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0019\u0010\u001bJ#\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u001c\u0010\u001eJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b \u0010!J!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b \u0010\"¨\u0006#"}, d2 = {"Landroidx/room/w;", "T", "Landroidx/room/n2;", "Landroidx/room/c2;", "database", "<init>", "(Landroidx/room/c2;)V", "Lf3/i;", "statement", "entity", "Lkotlin/k2;", "bind", "(Lf3/i;Ljava/lang/Object;)V", "insert", "(Ljava/lang/Object;)V", "", "entities", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Iterable;)V", "", "insertAndReturnId", "(Ljava/lang/Object;)J", "", "", "insertAndReturnIdsArray", "(Ljava/util/Collection;)[J", "([Ljava/lang/Object;)[J", "insertAndReturnIdsArrayBox", "(Ljava/util/Collection;)[Ljava/lang/Long;", "([Ljava/lang/Object;)[Ljava/lang/Long;", "", "insertAndReturnIdsList", "([Ljava/lang/Object;)Ljava/util/List;", "(Ljava/util/Collection;)Ljava/util/List;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.internal.r1({"SMAP\nEntityInsertionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityInsertionAdapter.kt\nandroidx/room/EntityInsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n13579#2,2:230\n13644#2,3:237\n13579#2,2:240\n1855#3,2:232\n1864#3,3:234\n1855#3,2:242\n*S KotlinDebug\n*F\n+ 1 EntityInsertionAdapter.kt\nandroidx/room/EntityInsertionAdapter\n*L\n65#1:230,2\n137#1:237,3\n199#1:240,2\n82#1:232,2\n117#1:234,3\n219#1:242,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class w<T> extends n2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@fg.l c2 database) {
        super(database);
        kotlin.jvm.internal.l0.p(database, "database");
    }

    protected abstract void bind(@fg.l f3.i statement, T entity);

    public final void insert(T entity) {
        f3.i acquire = acquire();
        try {
            bind(acquire, entity);
            acquire.P1();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(T entity) {
        f3.i acquire = acquire();
        try {
            bind(acquire, entity);
            return acquire.P1();
        } finally {
            release(acquire);
        }
    }

    @fg.l
    public final long[] insertAndReturnIdsArray(@fg.l Collection<? extends T> entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        f3.i acquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i4 = 0;
            for (T t4 : entities) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    kotlin.collections.w.Z();
                }
                bind(acquire, t4);
                jArr[i4] = acquire.P1();
                i4 = i5;
            }
            release(acquire);
            return jArr;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    @fg.l
    public final Long[] insertAndReturnIdsArrayBox(@fg.l Collection<? extends T> entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        f3.i acquire = acquire();
        Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i4 = 0; i4 < size; i4++) {
                bind(acquire, it.next());
                lArr[i4] = Long.valueOf(acquire.P1());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    @fg.l
    public final List<Long> insertAndReturnIdsList(@fg.l T[] entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        f3.i acquire = acquire();
        try {
            kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
            for (T t4 : entities) {
                bind(acquire, t4);
                bVar.add(Long.valueOf(acquire.P1()));
            }
            List<Long> a5 = kotlin.collections.w.a(bVar);
            release(acquire);
            return a5;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(@fg.l T[] entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        f3.i acquire = acquire();
        try {
            for (T t4 : entities) {
                bind(acquire, t4);
                acquire.P1();
            }
        } finally {
            release(acquire);
        }
    }

    @fg.l
    public final long[] insertAndReturnIdsArray(@fg.l T[] entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        f3.i acquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = i5 + 1;
                bind(acquire, entities[i4]);
                jArr[i5] = acquire.P1();
                i4++;
                i5 = i6;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final Long[] insertAndReturnIdsArrayBox(@fg.l T[] entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        f3.i acquire = acquire();
        Iterator a5 = kotlin.jvm.internal.i.a(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i4 = 0; i4 < length; i4++) {
                bind(acquire, a5.next());
                lArr[i4] = Long.valueOf(acquire.P1());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    @fg.l
    public final List<Long> insertAndReturnIdsList(@fg.l Collection<? extends T> entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        f3.i acquire = acquire();
        try {
            kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                bVar.add(Long.valueOf(acquire.P1()));
            }
            List<Long> a5 = kotlin.collections.w.a(bVar);
            release(acquire);
            return a5;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(@fg.l Iterable<? extends T> entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        f3.i acquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                acquire.P1();
            }
        } finally {
            release(acquire);
        }
    }
}
