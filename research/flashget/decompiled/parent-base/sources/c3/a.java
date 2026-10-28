package c3;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.c1;
import androidx.paging.b1;
import androidx.paging.d1;
import androidx.room.c2;
import androidx.room.g2;
import fg.l;
import fg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;

/* compiled from: RoomPagingUtil.kt */
@c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001ao\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0011¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0018\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019\u001a)\u0010\u001b\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\n*\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001b\u0010\u001c\"#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001d8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0014\u0010#\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\"¨\u0006$"}, d2 = {"Landroidx/paging/b1$a;", "", "params", "key", "c", "(Landroidx/paging/b1$a;I)I", "itemCount", "d", "(Landroidx/paging/b1$a;II)I", "", "Value", "Landroidx/room/g2;", "sourceQuery", "Landroidx/room/c2;", "db", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function1;", "Landroid/database/Cursor;", "", "convertRows", "Landroidx/paging/b1$b;", "e", "(Landroidx/paging/b1$a;Landroidx/room/g2;Landroidx/room/c2;ILandroid/os/CancellationSignal;Lld/l;)Landroidx/paging/b1$b;", "g", "(Landroidx/room/g2;Landroidx/room/c2;)I", "Landroidx/paging/d1;", "a", "(Landroidx/paging/d1;)Ljava/lang/Integer;", "Landroidx/paging/b1$b$b;", "Landroidx/paging/b1$b$b;", "b", "()Landroidx/paging/b1$b$b;", "INVALID", "I", "INITIAL_ITEM_COUNT", "room-paging_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final b1.b.C0529b<Object, Object> f38592a = new b1.b.C0529b<>(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f38593b = -1;

    @m
    public static final <Value> Integer a(@l d1<Integer, Value> d1Var) {
        l0.p(d1Var, "<this>");
        Integer anchorPosition = d1Var.getAnchorPosition();
        if (anchorPosition != null) {
            return Integer.valueOf(Math.max(0, anchorPosition.intValue() - (d1Var.getConfig().initialLoadSize / 2)));
        }
        return null;
    }

    @l
    public static final b1.b.C0529b<Object, Object> b() {
        return f38592a;
    }

    public static final int c(@l b1.a<Integer> params, int i4) {
        l0.p(params, "params");
        return params instanceof b1.a.c ? i4 < params.getLoadSize() ? i4 : params.getLoadSize() : params.getLoadSize();
    }

    public static final int d(@l b1.a<Integer> params, int i4, int i5) {
        l0.p(params, "params");
        if (params instanceof b1.a.c) {
            if (i4 < params.getLoadSize()) {
                return 0;
            }
            return i4 - params.getLoadSize();
        }
        if (params instanceof b1.a.C0527a) {
            return i4;
        }
        if (params instanceof b1.a.d) {
            return i4 >= i5 ? Math.max(0, i5 - params.getLoadSize()) : i4;
        }
        throw new NoWhenBranchMatchedException();
    }

    @l
    public static final <Value> b1.b<Integer, Value> e(@l b1.a<Integer> params, @l g2 sourceQuery, @l c2 db2, int i4, @m CancellationSignal cancellationSignal, @l ld.l<? super Cursor, ? extends List<? extends Value>> convertRows) {
        l0.p(params, "params");
        l0.p(sourceQuery, "sourceQuery");
        l0.p(db2, "db");
        l0.p(convertRows, "convertRows");
        Integer a5 = params.a();
        int intValue = a5 != null ? a5.intValue() : 0;
        int c5 = c(params, intValue);
        int d5 = d(params, intValue, i4);
        g2 a6 = g2.INSTANCE.a("SELECT * FROM ( " + sourceQuery.getQuery() + " ) LIMIT " + c5 + " OFFSET " + d5, sourceQuery.getArgCount());
        a6.e(sourceQuery);
        Cursor query = db2.query(a6, cancellationSignal);
        try {
            List<? extends Value> invoke = convertRows.invoke(query);
            query.close();
            a6.release();
            int size = invoke.size() + d5;
            Integer num = null;
            Integer valueOf = (invoke.isEmpty() || invoke.size() < c5 || size >= i4) ? null : Integer.valueOf(size);
            if (d5 > 0 && !invoke.isEmpty()) {
                num = Integer.valueOf(d5);
            }
            return new b1.b.c(invoke, num, valueOf, d5, Math.max(0, i4 - size));
        } catch (Throwable th) {
            query.close();
            a6.release();
            throw th;
        }
    }

    public static /* synthetic */ b1.b f(b1.a aVar, g2 g2Var, c2 c2Var, int i4, CancellationSignal cancellationSignal, ld.l lVar, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            cancellationSignal = null;
        }
        return e(aVar, g2Var, c2Var, i4, cancellationSignal, lVar);
    }

    public static final int g(@l g2 sourceQuery, @l c2 db2) {
        l0.p(sourceQuery, "sourceQuery");
        l0.p(db2, "db");
        g2 a5 = g2.INSTANCE.a("SELECT COUNT(*) FROM ( " + sourceQuery.getQuery() + " )", sourceQuery.getArgCount());
        a5.e(sourceQuery);
        Cursor query$default = c2.query$default(db2, a5, null, 2, null);
        try {
            if (query$default.moveToFirst()) {
                return query$default.getInt(0);
            }
            return 0;
        } finally {
            query$default.close();
            a5.release();
        }
    }
}
