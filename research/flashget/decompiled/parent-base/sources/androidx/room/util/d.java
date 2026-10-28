package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.c1;
import androidx.annotation.m1;
import fg.l;
import fg.m;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import kd.n;
import kotlin.Metadata;
import kotlin.collections.l1;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.text.v;

/* compiled from: FtsTableInfo.kt */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0014B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/room/util/d;", "", "", "name", "", "columns", "options", "<init>", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "createSql", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Ljava/util/Set;", "c", "d", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final String[] f33957e = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    @kd.f
    public final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    @kd.f
    public final Set<String> columns;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    @kd.f
    public final Set<String> options;

    /* compiled from: FtsTableInfo.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/room/util/d$a;", "", "<init>", "()V", "Lf3/d;", "database", "", "tableName", "", "c", "(Lf3/d;Ljava/lang/String;)Ljava/util/Set;", "d", "Landroidx/room/util/d;", "b", "(Lf3/d;Ljava/lang/String;)Landroidx/room/util/d;", "createStatement", "a", "(Ljava/lang/String;)Ljava/util/Set;", "", "FTS_OPTIONS", "[Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nFtsTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FtsTableInfo.kt\nandroidx/room/util/FtsTableInfo$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,182:1\n145#2,7:183\n145#2,7:190\n1183#3,2:197\n1185#3:222\n107#4:199\n79#4,22:200\n766#5:223\n857#5:224\n858#5:227\n12744#6,2:225\n*S KotlinDebug\n*F\n+ 1 FtsTableInfo.kt\nandroidx/room/util/FtsTableInfo$Companion\n*L\n94#1:183,7\n108#1:190,7\n148#1:197,2\n148#1:222\n163#1:199\n163#1:200,22\n173#1:223\n173#1:224\n173#1:227\n174#1:225,2\n*E\n"})
    /* renamed from: androidx.room.util.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final Set<String> c(f3.d database, String tableName) {
            kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
            Cursor U2 = database.U2("PRAGMA table_info(`" + tableName + "`)");
            try {
                Cursor cursor = U2;
                if (cursor.getColumnCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("name");
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(columnIndex);
                        l0.o(string, "cursor.getString(nameIndex)");
                        jVar.add(string);
                    }
                }
                k2 k2Var = k2.f75408a;
                kotlin.io.b.a(U2, null);
                return l1.a(jVar);
            } finally {
            }
        }

        private final Set<String> d(f3.d database, String tableName) {
            Cursor U2 = database.U2("SELECT * FROM sqlite_master WHERE `name` = '" + tableName + '\'');
            try {
                Cursor cursor = U2;
                String sql = cursor.moveToFirst() ? cursor.getString(cursor.getColumnIndexOrThrow("sql")) : "";
                kotlin.io.b.a(U2, null);
                l0.o(sql, "sql");
                return a(sql);
            } finally {
            }
        }

        @l
        @n
        @m1
        public final Set<String> a(@l String createStatement) {
            Character ch;
            l0.p(createStatement, "createStatement");
            if (createStatement.length() == 0) {
                return kotlin.collections.l0.f74939b;
            }
            String substring = createStatement.substring(v.o3(createStatement, '(', 0, false, 6, null) + 1, v.C3(createStatement, ')', 0, false, 6, null));
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            while (i5 < substring.length()) {
                char charAt = substring.charAt(i5);
                int i7 = i6 + 1;
                if (charAt == '\'' || charAt == '\"' || charAt == '`') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(charAt));
                    } else {
                        Character ch2 = (Character) arrayDeque.peek();
                        if (ch2 != null && ch2.charValue() == charAt) {
                            arrayDeque.pop();
                        }
                    }
                } else if (charAt == '[') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(charAt));
                    }
                } else if (charAt == ']') {
                    if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (charAt == ',' && arrayDeque.isEmpty()) {
                    String substring2 = substring.substring(i4 + 1, i6);
                    l0.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = substring2.length() - 1;
                    int i10 = 0;
                    boolean z4 = false;
                    while (i10 <= length) {
                        boolean z5 = l0.t(substring2.charAt(!z4 ? i10 : length), 32) <= 0;
                        if (z4) {
                            if (!z5) {
                                break;
                            }
                            length--;
                        } else if (z5) {
                            i10++;
                        } else {
                            z4 = true;
                        }
                    }
                    arrayList.add(substring2.subSequence(i10, length + 1).toString());
                    i4 = i6;
                }
                i5++;
                i6 = i7;
            }
            String substring3 = substring.substring(i4 + 1);
            l0.o(substring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(v.C5(substring3).toString());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str = (String) obj;
                String[] strArr = d.f33957e;
                int length2 = strArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        break;
                    }
                    if (v.s2(str, strArr[i11], false, 2, null)) {
                        arrayList2.add(obj);
                        break;
                    }
                    i11++;
                }
            }
            return w.a6(arrayList2);
        }

        @l
        @n
        public final d b(@l f3.d database, @l String tableName) {
            l0.p(database, "database");
            l0.p(tableName, "tableName");
            return new d(tableName, c(database, tableName), d(database, tableName));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public d(@l String name, @l Set<String> columns, @l Set<String> options) {
        l0.p(name, "name");
        l0.p(columns, "columns");
        l0.p(options, "options");
        this.name = name;
        this.columns = columns;
        this.options = options;
    }

    @l
    @n
    @m1
    public static final Set<String> b(@l String str) {
        return INSTANCE.a(str);
    }

    @l
    @n
    public static final d c(@l f3.d dVar, @l String str) {
        return INSTANCE.b(dVar, str);
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        if (l0.g(this.name, dVar.name) && l0.g(this.columns, dVar.columns)) {
            return l0.g(this.options, dVar.options);
        }
        return false;
    }

    public int hashCode() {
        return this.options.hashCode() + ((this.columns.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    @l
    public String toString() {
        return "FtsTableInfo{name='" + this.name + "', columns=" + this.columns + ", options=" + this.options + "'}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@l String name, @l Set<String> columns, @l String createSql) {
        this(name, columns, INSTANCE.a(createSql));
        l0.p(name, "name");
        l0.p(columns, "columns");
        l0.p(createSql, "createSql");
    }
}
