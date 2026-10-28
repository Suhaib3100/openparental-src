package androidx.core.database;

import android.database.Cursor;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Cursor.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¨\u0006\u0015"}, d2 = {"Landroid/database/Cursor;", "", "index", "", "a", "", "b", "(Landroid/database/Cursor;I)Ljava/lang/Double;", "", "c", "(Landroid/database/Cursor;I)Ljava/lang/Float;", "d", "(Landroid/database/Cursor;I)Ljava/lang/Integer;", "", "e", "(Landroid/database/Cursor;I)Ljava/lang/Long;", "", "f", "(Landroid/database/Cursor;I)Ljava/lang/Short;", "", "g", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class a {
    @e
    public static final byte[] a(@d Cursor cursor, int i5) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i5)) {
            return null;
        }
        return cursor.getBlob(i5);
    }

    @e
    public static final Double b(@d Cursor cursor, int i5) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i5)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i5));
    }

    @e
    public static final Float c(@d Cursor cursor, int i5) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i5)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i5));
    }

    @e
    public static final Integer d(@d Cursor cursor, int i5) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i5)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i5));
    }

    @e
    public static final Long e(@d Cursor cursor, int i5) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i5)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i5));
    }

    @e
    public static final Short f(@d Cursor cursor, int i5) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i5)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i5));
    }

    @e
    public static final String g(@d Cursor cursor, int i5) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i5)) {
            return null;
        }
        return cursor.getString(i5);
    }
}
