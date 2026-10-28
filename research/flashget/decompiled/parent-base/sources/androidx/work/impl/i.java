package androidx.work.impl;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.x0;
import androidx.work.s;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WorkDatabasePathHelper.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    private static final String f36249b = "androidx.work.workdb";

    /* renamed from: a, reason: collision with root package name */
    private static final String f36248a = s.f("WrkDbPathHelper");

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f36250c = {"-journal", "-shm", "-wal"};

    private i() {
    }

    @o0
    @m1
    public static File a(@o0 Context context) {
        return c(context, "androidx.work.workdb");
    }

    @o0
    @m1
    public static File b(@o0 Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    @x0(23)
    private static File c(@o0 Context context, @o0 String filePath) {
        return new File(context.getNoBackupFilesDir(), filePath);
    }

    @o0
    public static String d() {
        return "androidx.work.workdb";
    }

    public static void e(@o0 Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            s.c().a(f36248a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> f4 = f(context);
            for (File file : f4.keySet()) {
                File file2 = f4.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        s.c().h(f36248a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    s.c().a(f36248a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
                }
            }
        }
    }

    @o0
    @m1
    public static Map<File, File> f(@o0 Context context) {
        HashMap hashMap = new HashMap();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        File c5 = c(context, "androidx.work.workdb");
        hashMap.put(databasePath, c5);
        for (String str : f36250c) {
            hashMap.put(new File(databasePath.getPath() + str), new File(c5.getPath() + str));
        }
        return hashMap;
    }
}
