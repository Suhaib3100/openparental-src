package androidx.room;

import androidx.annotation.c1;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CoroutinesRoom.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/room/c2;", "Lkotlinx/coroutines/m0;", "a", "(Landroidx/room/c2;)Lkotlinx/coroutines/m0;", "b", "transactionDispatcher", "room-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCoroutinesRoom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoomKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,162:1\n361#2,7:163\n361#2,7:170\n*S KotlinDebug\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoomKt\n*L\n149#1:163,7\n159#1:170,7\n*E\n"})
/* loaded from: classes3.dex */
public final class k {
    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public static final kotlinx.coroutines.m0 a(@fg.l c2 c2Var) {
        Map<String, Object> backingFieldMap = c2Var.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = kotlinx.coroutines.y1.c(c2Var.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (kotlinx.coroutines.m0) obj;
    }

    @fg.l
    public static final kotlinx.coroutines.m0 b(@fg.l c2 c2Var) {
        Map<String, Object> backingFieldMap = c2Var.getBackingFieldMap();
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = kotlinx.coroutines.y1.c(c2Var.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (kotlinx.coroutines.m0) obj;
    }
}
