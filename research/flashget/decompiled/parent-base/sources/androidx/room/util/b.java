package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import androidx.annotation.c1;
import androidx.room.c2;
import f3.c;
import fg.l;
import fg.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.k2;
import kotlin.text.v;

/* compiled from: DBUtil.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/room/c2;", "db", "Lf3/g;", "sqLiteQuery", "", "maybeCopy", "Landroid/database/Cursor;", "e", "(Landroidx/room/c2;Lf3/g;Z)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "signal", "f", "(Landroidx/room/c2;Lf3/g;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;", "Lf3/d;", "Lkotlin/k2;", "b", "(Lf3/d;)V", "", "tableName", "c", "(Lf3/d;Ljava/lang/String;)V", "Ljava/io/File;", "databaseFile", "", "g", "(Ljava/io/File;)I", "a", "()Landroid/os/CancellationSignal;", "cursor", "d", "(Landroid/database/Cursor;)Ljava/lang/String;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@kd.i(name = "DBUtil")
@r1({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n145#2,7:215\n145#2,7:224\n1855#3,2:222\n*S KotlinDebug\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil\n*L\n100#1:215,7\n121#1:224,7\n107#1:222,2\n*E\n"})
/* loaded from: classes3.dex */
public final class b {
    @m
    public static final CancellationSignal a() {
        return c.a.b();
    }

    public static final void b(@l f3.d db2) {
        l0.p(db2, "db");
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
        Cursor U2 = db2.U2("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            Cursor cursor = U2;
            while (cursor.moveToNext()) {
                bVar.add(cursor.getString(0));
            }
            k2 k2Var = k2.f75408a;
            kotlin.io.b.a(U2, null);
            for (String triggerName : w.a(bVar)) {
                l0.o(triggerName, "triggerName");
                if (v.s2(triggerName, "room_fts_content_sync_", false, 2, null)) {
                    db2.b0("DROP TRIGGER IF EXISTS " + triggerName);
                }
            }
        } finally {
        }
    }

    public static final void c(@l f3.d db2, @l String tableName) {
        l0.p(db2, "db");
        l0.p(tableName, "tableName");
        Cursor U2 = db2.U2("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            Cursor cursor = U2;
            if (cursor.getCount() > 0) {
                throw new SQLiteConstraintException(d(cursor));
            }
            k2 k2Var = k2.f75408a;
            kotlin.io.b.a(U2, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.io.b.a(U2, th);
                throw th2;
            }
        }
    }

    private static final String d(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        int count = cursor.getCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(cursor.getString(0));
                sb.append("'.\n");
            }
            String constraintIndex = cursor.getString(3);
            if (!linkedHashMap.containsKey(constraintIndex)) {
                l0.o(constraintIndex, "constraintIndex");
                String string = cursor.getString(2);
                l0.o(string, "cursor.getString(2)");
                linkedHashMap.put(constraintIndex, string);
            }
        }
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\nNumber of rows in violation: ");
        sb.append(count);
        sb.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            androidx.room.l0.a(sb, "\tParent Table = ", (String) entry.getValue(), ", Foreign Key Constraint Index = ", (String) entry.getKey());
            sb.append("\n");
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @k(message = "This is only used in the generated code and shouldn't be called directly.")
    public static final Cursor e(@l c2 db2, @l f3.g sqLiteQuery, boolean z4) {
        l0.p(db2, "db");
        l0.p(sqLiteQuery, "sqLiteQuery");
        return f(db2, sqLiteQuery, z4, null);
    }

    @l
    public static final Cursor f(@l c2 db2, @l f3.g sqLiteQuery, boolean z4, @m CancellationSignal cancellationSignal) {
        l0.p(db2, "db");
        l0.p(sqLiteQuery, "sqLiteQuery");
        Cursor query = db2.query(sqLiteQuery, cancellationSignal);
        if (!z4 || !(query instanceof AbstractWindowedCursor)) {
            return query;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? a.a(query) : query;
    }

    public static final int g(@l File databaseFile) throws IOException {
        l0.p(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i4 = allocate.getInt();
            kotlin.io.b.a(channel, null);
            return i4;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.io.b.a(channel, th);
                throw th2;
            }
        }
    }
}
