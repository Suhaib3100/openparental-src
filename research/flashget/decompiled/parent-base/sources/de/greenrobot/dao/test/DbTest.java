package de.greenrobot.dao.test;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.test.ApplicationTestCase;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.DbUtils;
import java.util.Random;

/* loaded from: classes7.dex */
public abstract class DbTest<T extends Application> extends ApplicationTestCase<T> {

    /* renamed from: db, reason: collision with root package name */
    protected SQLiteDatabase f73727db;
    protected final boolean inMemory;
    protected Random random;

    public DbTest() {
        this(true);
    }

    protected void logTableDump(String str) {
        DbUtils.logTableDump(this.f73727db, str);
    }

    protected void setUp() {
        try {
            super.setUp();
            createApplication();
            setUpDb();
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    protected void setUpDb() {
        if (this.inMemory) {
            this.f73727db = SQLiteDatabase.create(null);
            return;
        }
        Application application = getApplication();
        String s4 = ProtectedSandApp.s("怜\u0001");
        application.deleteDatabase(s4);
        this.f73727db = getApplication().openOrCreateDatabase(s4, 0, null);
    }

    protected void tearDown() throws Exception {
        this.f73727db.close();
        if (!this.inMemory) {
            getApplication().deleteDatabase(ProtectedSandApp.s("怜\u0001"));
        }
        super.tearDown();
    }

    public DbTest(boolean z4) {
        this(Application.class, z4);
    }

    public DbTest(Class<T> cls, boolean z4) {
        super(cls);
        this.inMemory = z4;
        this.random = new Random();
    }
}
