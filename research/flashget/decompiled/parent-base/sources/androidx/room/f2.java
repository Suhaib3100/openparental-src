package androidx.room;

import android.database.Cursor;
import androidx.annotation.c1;
import f3.e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RoomOpenHelper.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0017\u0018\u0000 \u000f2\u00020\u0001:\u0003\u001f\u0013 B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J'\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0010R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/room/f2;", "Lf3/e$a;", "Landroidx/room/n;", "configuration", "Landroidx/room/f2$b;", "delegate", "", "identityHash", "legacyHash", "<init>", "(Landroidx/room/n;Landroidx/room/f2$b;Ljava/lang/String;Ljava/lang/String;)V", "(Landroidx/room/n;Landroidx/room/f2$b;Ljava/lang/String;)V", "Lf3/d;", "db", "Lkotlin/k2;", "h", "(Lf3/d;)V", "j", "i", "b", "d", "", "oldVersion", "newVersion", "g", "(Lf3/d;II)V", "e", "f", "Landroidx/room/n;", "Landroidx/room/f2$b;", "Ljava/lang/String;", "a", "c", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.internal.r1({"SMAP\nRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,245:1\n1855#2,2:246\n145#3,7:248\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper\n*L\n90#1:246,2\n137#1:248,7\n*E\n"})
/* loaded from: classes3.dex */
public class f2 extends e.a {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private n configuration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b delegate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String identityHash;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String legacyHash;

    /* compiled from: RoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/room/f2$a;", "", "<init>", "()V", "Lf3/d;", "db", "", "b", "(Lf3/d;)Z", "a", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,245:1\n145#2,7:246\n145#2,7:253\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper$Companion\n*L\n231#1:246,7\n239#1:253,7\n*E\n"})
    /* renamed from: androidx.room.f2$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final boolean a(@fg.l f3.d db2) {
            kotlin.jvm.internal.l0.p(db2, "db");
            Cursor U2 = db2.U2("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                Cursor cursor = U2;
                boolean z4 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) == 0) {
                        z4 = true;
                    }
                }
                kotlin.io.b.a(U2, null);
                return z4;
            } finally {
            }
        }

        public final boolean b(@fg.l f3.d db2) {
            kotlin.jvm.internal.l0.p(db2, "db");
            Cursor U2 = db2.U2("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                Cursor cursor = U2;
                boolean z4 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) != 0) {
                        z4 = true;
                    }
                }
                kotlin.io.b.a(U2, null);
                return z4;
            } finally {
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: RoomOpenHelper.kt */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/room/f2$b;", "", "", "version", "<init>", "(I)V", "Lf3/d;", "db", "Lkotlin/k2;", "dropAllTables", "(Lf3/d;)V", "createAllTables", "onOpen", "onCreate", "validateMigration", "Landroidx/room/f2$c;", "onValidateSchema", "(Lf3/d;)Landroidx/room/f2$c;", "onPreMigrate", "onPostMigrate", "I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {

        @kd.f
        public final int version;

        public b(int i4) {
            this.version = i4;
        }

        public abstract void createAllTables(@fg.l f3.d db2);

        public abstract void dropAllTables(@fg.l f3.d db2);

        public abstract void onCreate(@fg.l f3.d db2);

        public abstract void onOpen(@fg.l f3.d db2);

        public void onPostMigrate(@fg.l f3.d db2) {
            kotlin.jvm.internal.l0.p(db2, "db");
        }

        public void onPreMigrate(@fg.l f3.d db2) {
            kotlin.jvm.internal.l0.p(db2, "db");
        }

        @fg.l
        public c onValidateSchema(@fg.l f3.d db2) {
            kotlin.jvm.internal.l0.p(db2, "db");
            validateMigration(db2);
            return new c(true, null);
        }

        @kotlin.k(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        protected void validateMigration(@fg.l f3.d db2) {
            kotlin.jvm.internal.l0.p(db2, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* compiled from: RoomOpenHelper.kt */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/room/f2$c;", "", "", "isValid", "", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "a", "Z", "b", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final boolean isValid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        @kd.f
        public final String expectedFoundMsg;

        public c(boolean z4, @fg.m String str) {
            this.isValid = z4;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(@fg.l n configuration, @fg.l b delegate, @fg.l String identityHash, @fg.l String legacyHash) {
        super(delegate.version);
        kotlin.jvm.internal.l0.p(configuration, "configuration");
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        kotlin.jvm.internal.l0.p(identityHash, "identityHash");
        kotlin.jvm.internal.l0.p(legacyHash, "legacyHash");
        this.configuration = configuration;
        this.delegate = delegate;
        this.identityHash = identityHash;
        this.legacyHash = legacyHash;
    }

    private final void h(f3.d db2) {
        if (!INSTANCE.b(db2)) {
            c onValidateSchema = this.delegate.onValidateSchema(db2);
            if (onValidateSchema.isValid) {
                this.delegate.onPostMigrate(db2);
                j(db2);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.expectedFoundMsg);
            }
        }
        Cursor i12 = db2.i1(new f3.b("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            Cursor cursor = i12;
            String string = cursor.moveToFirst() ? cursor.getString(0) : null;
            kotlin.io.b.a(i12, null);
            if (!kotlin.jvm.internal.l0.g(this.identityHash, string) && !kotlin.jvm.internal.l0.g(this.legacyHash, string)) {
                throw new IllegalStateException(androidx.fragment.app.k0.a(new StringBuilder("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "), this.identityHash, ", found: ", string));
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.io.b.a(i12, th);
                throw th2;
            }
        }
    }

    private final void i(f3.d db2) {
        db2.b0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(f3.d db2) {
        i(db2);
        db2.b0(e2.a(this.identityHash));
    }

    @Override // f3.e.a
    public void b(@fg.l f3.d db2) {
        kotlin.jvm.internal.l0.p(db2, "db");
        super.b(db2);
    }

    @Override // f3.e.a
    public void d(@fg.l f3.d db2) {
        kotlin.jvm.internal.l0.p(db2, "db");
        boolean a5 = INSTANCE.a(db2);
        this.delegate.createAllTables(db2);
        if (!a5) {
            c onValidateSchema = this.delegate.onValidateSchema(db2);
            if (!onValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.expectedFoundMsg);
            }
        }
        j(db2);
        this.delegate.onCreate(db2);
    }

    @Override // f3.e.a
    public void e(@fg.l f3.d db2, int oldVersion, int newVersion) {
        kotlin.jvm.internal.l0.p(db2, "db");
        g(db2, oldVersion, newVersion);
    }

    @Override // f3.e.a
    public void f(@fg.l f3.d db2) {
        kotlin.jvm.internal.l0.p(db2, "db");
        super.f(db2);
        h(db2);
        this.delegate.onOpen(db2);
        this.configuration = null;
    }

    @Override // f3.e.a
    public void g(@fg.l f3.d db2, int oldVersion, int newVersion) {
        List<androidx.room.migration.b> e4;
        kotlin.jvm.internal.l0.p(db2, "db");
        n nVar = this.configuration;
        if (nVar == null || (e4 = nVar.migrationContainer.e(oldVersion, newVersion)) == null) {
            n nVar2 = this.configuration;
            if (nVar2 == null || nVar2.a(oldVersion, newVersion)) {
                throw new IllegalStateException(androidx.collection.q2.a("A migration from ", oldVersion, " to ", newVersion, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            }
            this.delegate.dropAllTables(db2);
            this.delegate.createAllTables(db2);
            return;
        }
        this.delegate.onPreMigrate(db2);
        Iterator<T> it = e4.iterator();
        while (it.hasNext()) {
            ((androidx.room.migration.b) it.next()).migrate(db2);
        }
        c onValidateSchema = this.delegate.onValidateSchema(db2);
        if (onValidateSchema.isValid) {
            this.delegate.onPostMigrate(db2);
            j(db2);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.expectedFoundMsg);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f2(@fg.l n configuration, @fg.l b delegate, @fg.l String legacyHash) {
        this(configuration, delegate, "", legacyHash);
        kotlin.jvm.internal.l0.p(configuration, "configuration");
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        kotlin.jvm.internal.l0.p(legacyHash, "legacyHash");
    }
}
