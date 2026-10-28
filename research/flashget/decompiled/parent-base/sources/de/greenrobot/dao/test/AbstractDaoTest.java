package de.greenrobot.dao.test;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoLog;
import de.greenrobot.dao.InternalUnitTestDaoAccess;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.identityscope.IdentityScope;

/* loaded from: classes7.dex */
public abstract class AbstractDaoTest<D extends AbstractDao<T, K>, T, K> extends DbTest<Application> {
    protected D dao;
    protected InternalUnitTestDaoAccess<T, K> daoAccess;
    protected final Class<D> daoClass;
    protected IdentityScope<K, T> identityScopeForDao;
    protected Property pkColumn;

    public AbstractDaoTest(Class<D> cls) {
        this(cls, true);
    }

    protected void clearIdentityScopeIfAny() {
        IdentityScope<K, T> identityScope = this.identityScopeForDao;
        if (identityScope == null) {
            DaoLog.d(ProtectedSandApp.s("怠\u0001"));
        } else {
            identityScope.clear();
            DaoLog.d(ProtectedSandApp.s("怟\u0001"));
        }
    }

    protected void logTableDump() {
        logTableDump(this.dao.getTablename());
    }

    public void setIdentityScopeBeforeSetUp(IdentityScope<K, T> identityScope) {
        this.identityScopeForDao = identityScope;
    }

    @Override // de.greenrobot.dao.test.DbTest
    protected void setUp() {
        super.setUp();
        try {
            setUpTableForDao();
            InternalUnitTestDaoAccess<T, K> internalUnitTestDaoAccess = new InternalUnitTestDaoAccess<>(this.f73727db, this.daoClass, this.identityScopeForDao);
            this.daoAccess = internalUnitTestDaoAccess;
            this.dao = internalUnitTestDaoAccess.getDao();
        } catch (Exception e4) {
            throw new RuntimeException(ProtectedSandApp.s("怡\u0001"), e4);
        }
    }

    protected void setUpTableForDao() throws Exception {
        try {
            this.daoClass.getMethod(ProtectedSandApp.s("怢\u0001"), SQLiteDatabase.class, Boolean.TYPE).invoke(null, this.f73727db, Boolean.FALSE);
        } catch (NoSuchMethodException unused) {
            DaoLog.i(ProtectedSandApp.s("怣\u0001"));
        }
    }

    public AbstractDaoTest(Class<D> cls, boolean z4) {
        super(z4);
        this.daoClass = cls;
    }
}
