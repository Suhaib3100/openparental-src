package androidx.core.database;

import android.database.Cursor;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: Cursor.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroid/database/Cursor;", "", "index", "", "a", "(Landroid/database/Cursor;I)[B", "", "b", "(Landroid/database/Cursor;I)Ljava/lang/Double;", "", "c", "(Landroid/database/Cursor;I)Ljava/lang/Float;", "d", "(Landroid/database/Cursor;I)Ljava/lang/Integer;", "", "e", "(Landroid/database/Cursor;I)Ljava/lang/Long;", "", "f", "(Landroid/database/Cursor;I)Ljava/lang/Short;", "", "g", "(Landroid/database/Cursor;I)Ljava/lang/String;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    @m
    public static final byte[] a(@l Cursor cursor, int i4) {
        if (cursor.isNull(i4)) {
            return null;
        }
        return cursor.getBlob(i4);
    }

    @m
    public static final Double b(@l Cursor cursor, int i4) {
        if (cursor.isNull(i4)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i4));
    }

    @m
    public static final Float c(@l Cursor cursor, int i4) {
        if (cursor.isNull(i4)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i4));
    }

    @m
    public static final Integer d(@l Cursor cursor, int i4) {
        if (cursor.isNull(i4)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i4));
    }

    @m
    public static final Long e(@l Cursor cursor, int i4) {
        if (cursor.isNull(i4)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i4));
    }

    @m
    public static final Short f(@l Cursor cursor, int i4) {
        if (cursor.isNull(i4)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i4));
    }

    @m
    public static final String g(@l Cursor cursor, int i4) {
        if (cursor.isNull(i4)) {
            return null;
        }
        return cursor.getString(i4);
    }
}
