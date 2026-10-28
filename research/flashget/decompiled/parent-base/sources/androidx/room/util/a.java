package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.fragment.app.y;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.v;

/* compiled from: CursorUtil.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\b\u001a%\u0010\u0001\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0001\u0010\u000e\u001a1\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Landroid/database/Cursor;", "c", "a", "(Landroid/database/Cursor;)Landroid/database/Cursor;", "", "name", "", "d", "(Landroid/database/Cursor;Ljava/lang/String;)I", "e", "cursor", "b", "", "columnNames", "([Ljava/lang/String;Ljava/lang/String;)I", "R", "Lkotlin/Function1;", "block", "f", "(Landroid/database/Cursor;Lld/l;)Ljava/lang/Object;", "", "mapping", "g", "(Landroid/database/Cursor;[Ljava/lang/String;[I)Landroid/database/Cursor;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@kd.i(name = "CursorUtil")
@r1({"SMAP\nCursorUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n145#1,7:185\n13644#2,3:192\n1#3:195\n*S KotlinDebug\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n39#1:185,7\n127#1:192,3\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: CursorUtil.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/room/util/a$a", "Landroid/database/CursorWrapper;", "", "columnName", "", "getColumnIndex", "(Ljava/lang/String;)I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nCursorUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil$wrapMappedColumns$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,184:1\n13644#2,3:185\n*S KotlinDebug\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil$wrapMappedColumns$2\n*L\n175#1:185,3\n*E\n"})
    /* renamed from: androidx.room.util.a$a, reason: collision with other inner class name */
    public static final class C0612a extends CursorWrapper {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f33954b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int[] f33955c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0612a(Cursor cursor, String[] strArr, int[] iArr) {
            super(cursor);
            this.f33954b = strArr;
            this.f33955c = iArr;
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public int getColumnIndex(@l String columnName) {
            l0.p(columnName, "columnName");
            String[] strArr = this.f33954b;
            int[] iArr = this.f33955c;
            int length = strArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = i5 + 1;
                if (v.K1(strArr[i4], columnName, true)) {
                    return iArr[i5];
                }
                i4++;
                i5 = i6;
            }
            return super.getColumnIndex(columnName);
        }
    }

    @l
    public static final Cursor a(@l Cursor c5) {
        l0.p(c5, "c");
        Cursor cursor = c5;
        try {
            Cursor cursor2 = cursor;
            MatrixCursor matrixCursor = new MatrixCursor(cursor2.getColumnNames(), cursor2.getCount());
            while (cursor2.moveToNext()) {
                Object[] objArr = new Object[cursor2.getColumnCount()];
                int columnCount = c5.getColumnCount();
                for (int i4 = 0; i4 < columnCount; i4++) {
                    int type = cursor2.getType(i4);
                    if (type == 0) {
                        objArr[i4] = null;
                    } else if (type == 1) {
                        objArr[i4] = Long.valueOf(cursor2.getLong(i4));
                    } else if (type == 2) {
                        objArr[i4] = Double.valueOf(cursor2.getDouble(i4));
                    } else if (type == 3) {
                        objArr[i4] = cursor2.getString(i4);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i4] = cursor2.getBlob(i4);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            kotlin.io.b.a(cursor, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        l0.o(columnNames, "columnNames");
        return c(columnNames, str);
    }

    @m1
    public static final int c(@l String[] columnNames, @l String name) {
        l0.p(columnNames, "columnNames");
        l0.p(name, "name");
        String str = "." + name;
        String str2 = "." + name + '`';
        int length = columnNames.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            String str3 = columnNames[i4];
            int i6 = i5 + 1;
            if (str3.length() >= name.length() + 2) {
                if (v.J1(str3, str, false, 2, null)) {
                    return i5;
                }
                if (str3.charAt(0) == '`' && v.J1(str3, str2, false, 2, null)) {
                    return i5;
                }
            }
            i4++;
            i5 = i6;
        }
        return -1;
    }

    public static final int d(@l Cursor c5, @l String name) {
        l0.p(c5, "c");
        l0.p(name, "name");
        int columnIndex = c5.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c5.getColumnIndex("`" + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(c5, name);
    }

    public static final int e(@l Cursor c5, @l String name) {
        String str;
        l0.p(c5, "c");
        l0.p(name, "name");
        int d5 = d(c5, name);
        if (d5 >= 0) {
            return d5;
        }
        try {
            String[] columnNames = c5.getColumnNames();
            l0.o(columnNames, "c.columnNames");
            str = kotlin.collections.l.lh(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception unused) {
            str = "unknown";
        }
        throw new IllegalArgumentException(y.a("column '", name, "' does not exist. Available columns: ", str));
    }

    public static final <R> R f(@l Cursor cursor, @l ld.l<? super Cursor, ? extends R> block) {
        l0.p(cursor, "<this>");
        l0.p(block, "block");
        Cursor cursor2 = cursor;
        try {
            R invoke = block.invoke(cursor2);
            kotlin.io.b.a(cursor2, null);
            return invoke;
        } finally {
        }
    }

    @l
    public static final Cursor g(@l Cursor cursor, @l String[] columnNames, @l int[] mapping) {
        l0.p(cursor, "cursor");
        l0.p(columnNames, "columnNames");
        l0.p(mapping, "mapping");
        if (columnNames.length == mapping.length) {
            return new C0612a(cursor, columnNames, mapping);
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length");
    }
}
