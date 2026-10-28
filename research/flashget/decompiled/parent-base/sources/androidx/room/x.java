package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.c1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EntityUpsertionAdapter.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180!2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0011¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180!2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0011¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010+¨\u0006,"}, d2 = {"Landroidx/room/x;", "T", "", "Landroidx/room/w;", "insertionAdapter", "Landroidx/room/v;", "updateAdapter", "<init>", "(Landroidx/room/w;Landroidx/room/v;)V", "Landroid/database/sqlite/SQLiteConstraintException;", "ex", "Lkotlin/k2;", "a", "(Landroid/database/sqlite/SQLiteConstraintException;)V", "entity", "c", "(Ljava/lang/Object;)V", "", "entities", "d", "([Ljava/lang/Object;)V", "", "b", "(Ljava/lang/Iterable;)V", "", "e", "(Ljava/lang/Object;)J", "", "g", "([Ljava/lang/Object;)[J", "", "f", "(Ljava/util/Collection;)[J", "", "k", "([Ljava/lang/Object;)Ljava/util/List;", "j", "(Ljava/util/Collection;)Ljava/util/List;", "i", "([Ljava/lang/Object;)[Ljava/lang/Long;", "h", "(Ljava/util/Collection;)[Ljava/lang/Long;", "Landroidx/room/w;", "Landroidx/room/v;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.internal.r1({"SMAP\nEntityUpsertionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n13579#2,2:225\n13579#2,2:229\n1855#3,2:227\n1855#3,2:231\n*S KotlinDebug\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n*L\n78#1:225,2\n151#1:229,2\n89#1:227,2\n165#1:231,2\n*E\n"})
/* loaded from: classes3.dex */
public final class x<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w<T> insertionAdapter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v<T> updateAdapter;

    public x(@fg.l w<T> insertionAdapter, @fg.l v<T> updateAdapter) {
        kotlin.jvm.internal.l0.p(insertionAdapter, "insertionAdapter");
        kotlin.jvm.internal.l0.p(updateAdapter, "updateAdapter");
        this.insertionAdapter = insertionAdapter;
        this.updateAdapter = updateAdapter;
    }

    private final void a(SQLiteConstraintException ex) {
        String message = ex.getMessage();
        if (message == null) {
            throw ex;
        }
        if (!kotlin.text.v.Q2(message, "unique", true) && !kotlin.text.v.T2(message, "2067", false, 2, null) && !kotlin.text.v.T2(message, "1555", false, 2, null)) {
            throw ex;
        }
    }

    public final void b(@fg.l Iterable<? extends T> entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        for (T t4 : entities) {
            try {
                this.insertionAdapter.insert((w<T>) t4);
            } catch (SQLiteConstraintException e4) {
                a(e4);
                this.updateAdapter.handle(t4);
            }
        }
    }

    public final void c(T entity) {
        try {
            this.insertionAdapter.insert((w<T>) entity);
        } catch (SQLiteConstraintException e4) {
            a(e4);
            this.updateAdapter.handle(entity);
        }
    }

    public final void d(@fg.l T[] entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        for (T t4 : entities) {
            try {
                this.insertionAdapter.insert((w<T>) t4);
            } catch (SQLiteConstraintException e4) {
                a(e4);
                this.updateAdapter.handle(t4);
            }
        }
    }

    public final long e(T entity) {
        try {
            return this.insertionAdapter.insertAndReturnId(entity);
        } catch (SQLiteConstraintException e4) {
            a(e4);
            this.updateAdapter.handle(entity);
            return -1L;
        }
    }

    @fg.l
    public final long[] f(@fg.l Collection<? extends T> entities) {
        long j4;
        kotlin.jvm.internal.l0.p(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i4 = 0; i4 < size; i4++) {
            T next = it.next();
            try {
                j4 = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e4) {
                a(e4);
                this.updateAdapter.handle(next);
                j4 = -1;
            }
            jArr[i4] = j4;
        }
        return jArr;
    }

    @fg.l
    public final long[] g(@fg.l T[] entities) {
        long j4;
        kotlin.jvm.internal.l0.p(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            try {
                j4 = this.insertionAdapter.insertAndReturnId(entities[i4]);
            } catch (SQLiteConstraintException e4) {
                a(e4);
                this.updateAdapter.handle(entities[i4]);
                j4 = -1;
            }
            jArr[i4] = j4;
        }
        return jArr;
    }

    @fg.l
    public final Long[] h(@fg.l Collection<? extends T> entities) {
        long j4;
        kotlin.jvm.internal.l0.p(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        Long[] lArr = new Long[size];
        for (int i4 = 0; i4 < size; i4++) {
            T next = it.next();
            try {
                j4 = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e4) {
                a(e4);
                this.updateAdapter.handle(next);
                j4 = -1;
            }
            lArr[i4] = Long.valueOf(j4);
        }
        return lArr;
    }

    @fg.l
    public final Long[] i(@fg.l T[] entities) {
        long j4;
        kotlin.jvm.internal.l0.p(entities, "entities");
        int length = entities.length;
        Long[] lArr = new Long[length];
        for (int i4 = 0; i4 < length; i4++) {
            try {
                j4 = this.insertionAdapter.insertAndReturnId(entities[i4]);
            } catch (SQLiteConstraintException e4) {
                a(e4);
                this.updateAdapter.handle(entities[i4]);
                j4 = -1;
            }
            lArr[i4] = Long.valueOf(j4);
        }
        return lArr;
    }

    @fg.l
    public final List<Long> j(@fg.l Collection<? extends T> entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
        for (T t4 : entities) {
            try {
                bVar.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t4)));
            } catch (SQLiteConstraintException e4) {
                a(e4);
                this.updateAdapter.handle(t4);
                bVar.add(-1L);
            }
        }
        return kotlin.collections.w.a(bVar);
    }

    @fg.l
    public final List<Long> k(@fg.l T[] entities) {
        kotlin.jvm.internal.l0.p(entities, "entities");
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
        for (T t4 : entities) {
            try {
                bVar.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t4)));
            } catch (SQLiteConstraintException e4) {
                a(e4);
                this.updateAdapter.handle(t4);
                bVar.add(-1L);
            }
        }
        return kotlin.collections.w.a(bVar);
    }
}
