package androidx.room.util;

import android.database.Cursor;
import androidx.room.util.g;
import fg.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.l1;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: TableInfo.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\n\u001a)\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lf3/d;", "database", "", "tableName", "Landroidx/room/util/g;", "f", "(Lf3/d;Ljava/lang/String;)Landroidx/room/util/g;", "", "Landroidx/room/util/g$d;", "c", "(Lf3/d;Ljava/lang/String;)Ljava/util/Set;", "Landroid/database/Cursor;", "cursor", "", "Landroidx/room/util/g$e;", "b", "(Landroid/database/Cursor;)Ljava/util/List;", "", "Landroidx/room/util/g$a;", "a", "(Lf3/d;Ljava/lang/String;)Ljava/util/Map;", "Landroidx/room/util/g$f;", "e", "name", "", "unique", "d", "(Lf3/d;Ljava/lang/String;Z)Landroidx/room/util/g$f;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n145#2,2:647\n148#2,2:654\n151#2:660\n145#2,7:661\n145#2,7:668\n145#2,7:675\n766#3:649\n857#3,2:650\n1855#3,2:652\n857#3,2:656\n1855#3,2:658\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n*L\n477#1:647,2\n477#1:654,2\n477#1:660\n542#1:661,7\n580#1:668,7\n613#1:675,7\n497#1:649\n497#1:650,2\n499#1:652,2\n497#1:656,2\n499#1:658,2\n*E\n"})
/* loaded from: classes3.dex */
public final class h {
    private static final Map<String, g.a> a(f3.d dVar, String str) {
        Cursor U2 = dVar.U2("PRAGMA table_info(`" + str + "`)");
        try {
            Cursor cursor = U2;
            if (cursor.getColumnCount() <= 0) {
                Map<String, g.a> z4 = z0.z();
                kotlin.io.b.a(U2, null);
                return z4;
            }
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("type");
            int columnIndex3 = cursor.getColumnIndex("notnull");
            int columnIndex4 = cursor.getColumnIndex("pk");
            int columnIndex5 = cursor.getColumnIndex("dflt_value");
            kotlin.collections.builders.d dVar2 = new kotlin.collections.builders.d();
            while (cursor.moveToNext()) {
                String name = cursor.getString(columnIndex);
                String type = cursor.getString(columnIndex2);
                boolean z5 = cursor.getInt(columnIndex3) != 0;
                int i4 = cursor.getInt(columnIndex4);
                String string = cursor.getString(columnIndex5);
                l0.o(name, "name");
                l0.o(type, "type");
                dVar2.put(name, new g.a(name, type, z5, i4, string, 2));
            }
            Map<String, g.a> d5 = z0.d(dVar2);
            kotlin.io.b.a(U2, null);
            return d5;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.io.b.a(U2, th);
                throw th2;
            }
        }
    }

    private static final List<g.e> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
        while (cursor.moveToNext()) {
            int i4 = cursor.getInt(columnIndex);
            int i5 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            l0.o(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            l0.o(string2, "cursor.getString(toColumnIndex)");
            bVar.add(new g.e(i4, i5, string, string2));
        }
        return w.q5(w.a(bVar));
    }

    private static final Set<g.d> c(f3.d dVar, String str) {
        Cursor U2 = dVar.U2("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            Cursor cursor = U2;
            int columnIndex = cursor.getColumnIndex("id");
            int columnIndex2 = cursor.getColumnIndex("seq");
            int columnIndex3 = cursor.getColumnIndex("table");
            int columnIndex4 = cursor.getColumnIndex("on_delete");
            int columnIndex5 = cursor.getColumnIndex("on_update");
            List<g.e> b5 = b(cursor);
            cursor.moveToPosition(-1);
            kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
            while (cursor.moveToNext()) {
                if (cursor.getInt(columnIndex2) == 0) {
                    int i4 = cursor.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<g.e> arrayList3 = new ArrayList();
                    for (Object obj : b5) {
                        if (((g.e) obj).getId() == i4) {
                            arrayList3.add(obj);
                        }
                    }
                    for (g.e eVar : arrayList3) {
                        arrayList.add(eVar.getFrom());
                        arrayList2.add(eVar.getTo());
                    }
                    String string = cursor.getString(columnIndex3);
                    l0.o(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursor.getString(columnIndex4);
                    l0.o(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursor.getString(columnIndex5);
                    l0.o(string3, "cursor.getString(onUpdateColumnIndex)");
                    jVar.add(new g.d(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<g.d> a5 = l1.a(jVar);
            kotlin.io.b.a(U2, null);
            return a5;
        } finally {
        }
    }

    private static final g.f d(f3.d dVar, String str, boolean z4) {
        Cursor U2 = dVar.U2("PRAGMA index_xinfo(`" + str + "`)");
        try {
            Cursor cursor = U2;
            int columnIndex = cursor.getColumnIndex("seqno");
            int columnIndex2 = cursor.getColumnIndex("cid");
            int columnIndex3 = cursor.getColumnIndex("name");
            int columnIndex4 = cursor.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursor.moveToNext()) {
                    if (cursor.getInt(columnIndex2) >= 0) {
                        int i4 = cursor.getInt(columnIndex);
                        String columnName = cursor.getString(columnIndex3);
                        String str2 = cursor.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i4);
                        l0.o(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i4), str2);
                    }
                }
                Collection values = treeMap.values();
                l0.o(values, "columnsMap.values");
                List V5 = w.V5(values);
                Collection values2 = treeMap2.values();
                l0.o(values2, "ordersMap.values");
                g.f fVar = new g.f(str, z4, V5, w.V5(values2));
                kotlin.io.b.a(U2, null);
                return fVar;
            }
            kotlin.io.b.a(U2, null);
            return null;
        } finally {
        }
    }

    private static final Set<g.f> e(f3.d dVar, String str) {
        Cursor U2 = dVar.U2("PRAGMA index_list(`" + str + "`)");
        try {
            Cursor cursor = U2;
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("origin");
            int columnIndex3 = cursor.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
                while (cursor.moveToNext()) {
                    if (l0.g("c", cursor.getString(columnIndex2))) {
                        String name = cursor.getString(columnIndex);
                        boolean z4 = true;
                        if (cursor.getInt(columnIndex3) != 1) {
                            z4 = false;
                        }
                        l0.o(name, "name");
                        g.f d5 = d(dVar, name, z4);
                        if (d5 == null) {
                            kotlin.io.b.a(U2, null);
                            return null;
                        }
                        jVar.add(d5);
                    }
                }
                Set<g.f> a5 = l1.a(jVar);
                kotlin.io.b.a(U2, null);
                return a5;
            }
            kotlin.io.b.a(U2, null);
            return null;
        } finally {
        }
    }

    @l
    public static final g f(@l f3.d database, @l String tableName) {
        l0.p(database, "database");
        l0.p(tableName, "tableName");
        return new g(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}
