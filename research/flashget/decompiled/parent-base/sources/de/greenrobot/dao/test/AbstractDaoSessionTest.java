package de.greenrobot.dao.test;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.AbstractDaoMaster;
import de.greenrobot.dao.AbstractDaoSession;

/* loaded from: classes7.dex */
public abstract class AbstractDaoSessionTest<A extends Application, T extends AbstractDaoMaster, S extends AbstractDaoSession> extends DbTest<A> {
    protected T daoMaster;
    private final Class<T> daoMasterClass;
    protected S daoSession;

    public AbstractDaoSessionTest(Class<T> cls) {
        this(cls, true);
    }

    @Override // de.greenrobot.dao.test.DbTest
    protected void setUp() {
        super.setUp();
        try {
            this.daoMaster = this.daoMasterClass.getConstructor(SQLiteDatabase.class).newInstance(this.f73727db);
            this.daoMasterClass.getMethod(ProtectedSandApp.s("思\u0001"), SQLiteDatabase.class, Boolean.TYPE).invoke(null, this.f73727db, Boolean.FALSE);
            this.daoSession = (S) this.daoMaster.newSession();
        } catch (Exception e4) {
            throw new RuntimeException(ProtectedSandApp.s("怞\u0001"), e4);
        }
    }

    public AbstractDaoSessionTest(Class<T> cls, boolean z4) {
        super(z4);
        this.daoMasterClass = cls;
    }

    public AbstractDaoSessionTest(Class<A> cls, Class<T> cls2, boolean z4) {
        super(cls, z4);
        this.daoMasterClass = cls2;
    }
}
