package f3;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import androidx.annotation.x0;
import androidx.compose.foundation.text.q;
import f3.c;
import fg.l;
import fg.m;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.text.v;

/* compiled from: SupportSQLiteOpenHelper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lf3/e;", "Ljava/io/Closeable;", "", "enabled", "Lkotlin/k2;", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lf3/d;", "O2", "()Lf3/d;", "writableDatabase", "K2", "readableDatabase", "a", "b", "c", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface e extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 \r2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lf3/e$a;", "", "", "version", "<init>", "(I)V", "", "fileName", "Lkotlin/k2;", "a", "(Ljava/lang/String;)V", "Lf3/d;", "db", "b", "(Lf3/d;)V", "d", "oldVersion", "newVersion", "g", "(Lf3/d;II)V", "e", "f", "c", "I", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSupportSQLiteOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,426:1\n1#2:427\n1855#3,2:428\n107#4:430\n79#4,22:431\n*S KotlinDebug\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n*L\n243#1:428,2\n251#1:430\n251#1:431,22\n*E\n"})
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int version;

        /* renamed from: c, reason: collision with root package name */
        @l
        private static final String f73863c = "SupportSQLite";

        public a(int i4) {
            this.version = i4;
        }

        private final void a(String fileName) {
            if (v.K1(fileName, ":memory:", true)) {
                return;
            }
            int length = fileName.length() - 1;
            int i4 = 0;
            boolean z4 = false;
            while (i4 <= length) {
                boolean z5 = l0.t(fileName.charAt(!z4 ? i4 : length), 32) <= 0;
                if (z4) {
                    if (!z5) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z5) {
                    i4++;
                } else {
                    z4 = true;
                }
            }
            if (fileName.subSequence(i4, length + 1).toString().length() == 0) {
                return;
            }
            try {
                c.a.c(new File(fileName));
            } catch (Exception unused) {
            }
        }

        public void b(@l d db2) {
            l0.p(db2, "db");
        }

        public void c(@l d db2) {
            l0.p(db2, "db");
            Objects.toString(db2);
            if (!db2.isOpen()) {
                String path = db2.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = db2.Z();
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            l0.o(obj, "p.second");
                            a((String) obj);
                        }
                    } else {
                        String path2 = db2.getPath();
                        if (path2 != null) {
                            a(path2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db2.close();
            } catch (IOException unused2) {
            }
            if (list != null) {
                return;
            }
        }

        public abstract void d(@l d db2);

        public void e(@l d db2, int oldVersion, int newVersion) {
            l0.p(db2, "db");
            throw new SQLiteException(q.a("Can't downgrade database from version ", oldVersion, " to ", newVersion));
        }

        public void f(@l d db2) {
            l0.p(db2, "db");
        }

        public abstract void g(@l d db2, int oldVersion, int newVersion);
    }

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lf3/e$c;", "", "Lf3/e$b;", "configuration", "Lf3/e;", "a", "(Lf3/e$b;)Lf3/e;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {
        @l
        e a(@l b configuration);
    }

    @l
    d K2();

    @l
    d O2();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @m
    String getDatabaseName();

    @x0(api = 16)
    void setWriteAheadLoggingEnabled(boolean enabled);

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0002\r\u000fB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lf3/e$b;", "", "Landroid/content/Context;", "context", "", "name", "Lf3/e$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lf3/e$a;ZZ)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lf3/e$a;", "d", "Z", "e", "f", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public final Context context;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        @kd.f
        public final String name;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public final a callback;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final boolean useNoBackupDirectory;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final boolean allowDataLossOnRecovery;

        /* compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lf3/e$b$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lf3/e$b;", "b", "()Lf3/e$b;", "", "name", "d", "(Ljava/lang/String;)Lf3/e$b$a;", "Lf3/e$a;", "callback", "c", "(Lf3/e$a;)Lf3/e$b$a;", "", "useNoBackupDirectory", "e", "(Z)Lf3/e$b$a;", "allowDataLossOnRecovery", "a", "Landroid/content/Context;", "Ljava/lang/String;", "Lf3/e$a;", "Z", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static class a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @l
            private final Context context;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @m
            private String name;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @m
            private a callback;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private boolean useNoBackupDirectory;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private boolean allowDataLossOnRecovery;

            public a(@l Context context) {
                l0.p(context, "context");
                this.context = context;
            }

            @l
            public a a(boolean allowDataLossOnRecovery) {
                this.allowDataLossOnRecovery = allowDataLossOnRecovery;
                return this;
            }

            @l
            public b b() {
                String str;
                a aVar = this.callback;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.useNoBackupDirectory && ((str = this.name) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.context, this.name, aVar, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
            }

            @l
            public a c(@l a callback) {
                l0.p(callback, "callback");
                this.callback = callback;
                return this;
            }

            @l
            public a d(@m String name) {
                this.name = name;
                return this;
            }

            @l
            public a e(boolean useNoBackupDirectory) {
                this.useNoBackupDirectory = useNoBackupDirectory;
                return this;
            }
        }

        /* compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf3/e$b$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lf3/e$b$a;", "a", "(Landroid/content/Context;)Lf3/e$b$a;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: f3.e$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @l
            @n
            public final a a(@l Context context) {
                l0.p(context, "context");
                return new a(context);
            }

            public Companion(w wVar) {
            }
        }

        public b(@l Context context, @m String str, @l a callback, boolean z4, boolean z5) {
            l0.p(context, "context");
            l0.p(callback, "callback");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z4;
            this.allowDataLossOnRecovery = z5;
        }

        @l
        @n
        public static final a a(@l Context context) {
            return INSTANCE.a(context);
        }

        public /* synthetic */ b(Context context, String str, a aVar, boolean z4, boolean z5, int i4, w wVar) {
            this(context, str, aVar, (i4 & 8) != 0 ? false : z4, (i4 & 16) != 0 ? false : z5);
        }
    }
}
