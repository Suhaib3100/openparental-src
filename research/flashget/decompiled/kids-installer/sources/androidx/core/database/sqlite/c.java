package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import d5.d;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import q3.l;

/* compiled from: SQLiteDatabase.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"T", "Landroid/database/sqlite/SQLiteDatabase;", "", "exclusive", "Lkotlin/Function1;", "Lkotlin/u;", "body", "a", "(Landroid/database/sqlite/SQLiteDatabase;ZLq3/l;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class c {
    public static final <T> T a(@d SQLiteDatabase sQLiteDatabase, boolean z5, @d l<? super SQLiteDatabase, ? extends T> body) {
        l0.p(sQLiteDatabase, "<this>");
        l0.p(body, "body");
        if (z5) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T N = body.N(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return N;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static Object b(SQLiteDatabase sQLiteDatabase, boolean z5, l body, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = true;
        }
        l0.p(sQLiteDatabase, "<this>");
        l0.p(body, "body");
        if (z5) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object N = body.N(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return N;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
