package de.greenrobot.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public class DbUtils {
    public static int copyAllBytes(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        int i4 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i4;
            }
            outputStream.write(bArr, 0, read);
            i4 += read;
        }
    }

    public static int executeSqlScript(Context context, SQLiteDatabase sQLiteDatabase, String str) throws IOException {
        return executeSqlScript(context, sQLiteDatabase, str, true);
    }

    public static int executeSqlStatements(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        int i4 = 0;
        for (String str : strArr) {
            String trim = str.trim();
            if (trim.length() > 0) {
                sQLiteDatabase.execSQL(trim);
                i4++;
            }
        }
        return i4;
    }

    public static int executeSqlStatementsInTx(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        sQLiteDatabase.beginTransaction();
        try {
            int executeSqlStatements = executeSqlStatements(sQLiteDatabase, strArr);
            sQLiteDatabase.setTransactionSuccessful();
            return executeSqlStatements;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static void logTableDump(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query(str, null, null, null, null, null, null);
        try {
            DaoLog.d(DatabaseUtils.dumpCursorToString(query));
        } finally {
            query.close();
        }
    }

    public static byte[] readAllBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyAllBytes(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] readAsset(Context context, String str) throws IOException {
        InputStream open = context.getResources().getAssets().open(str);
        try {
            return readAllBytes(open);
        } finally {
            open.close();
        }
    }

    public static void vacuum(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ProtectedSandApp.s("徯\u0001"));
    }

    public static int executeSqlScript(Context context, SQLiteDatabase sQLiteDatabase, String str, boolean z4) throws IOException {
        String[] split = new String(readAsset(context, str), ProtectedSandApp.s("循\u0001")).split(ProtectedSandApp.s("徫\u0001"));
        int executeSqlStatementsInTx = z4 ? executeSqlStatementsInTx(sQLiteDatabase, split) : executeSqlStatements(sQLiteDatabase, split);
        DaoLog.i(ProtectedSandApp.s("徬\u0001") + executeSqlStatementsInTx + ProtectedSandApp.s("徭\u0001") + str + ProtectedSandApp.s("微\u0001"));
        return executeSqlStatementsInTx;
    }
}
