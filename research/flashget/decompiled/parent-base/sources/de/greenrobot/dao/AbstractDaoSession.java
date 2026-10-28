package de.greenrobot.dao;

import android.database.sqlite.SQLiteDatabase;
import androidx.content.preferences.protobuf.o1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.async.AsyncSession;
import de.greenrobot.dao.query.QueryBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public class AbstractDaoSession {

    /* renamed from: db, reason: collision with root package name */
    private final SQLiteDatabase f73724db;
    private final Map<Class<?>, AbstractDao<?, ?>> entityToDao = new HashMap();

    public AbstractDaoSession(SQLiteDatabase sQLiteDatabase) {
        this.f73724db = sQLiteDatabase;
    }

    public <V> V callInTx(Callable<V> callable) throws Exception {
        this.f73724db.beginTransaction();
        try {
            V call = callable.call();
            this.f73724db.setTransactionSuccessful();
            return call;
        } finally {
            this.f73724db.endTransaction();
        }
    }

    public <V> V callInTxNoException(Callable<V> callable) {
        this.f73724db.beginTransaction();
        try {
            try {
                V call = callable.call();
                this.f73724db.setTransactionSuccessful();
                return call;
            } catch (Exception e4) {
                throw new DaoException(ProtectedSandApp.s("徥\u0001"), e4);
            }
        } finally {
            this.f73724db.endTransaction();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void delete(T t4) {
        getDao(t4.getClass()).delete(t4);
    }

    public <T> void deleteAll(Class<T> cls) {
        getDao(cls).deleteAll();
    }

    public AbstractDao<?, ?> getDao(Class<? extends Object> cls) {
        AbstractDao<?, ?> abstractDao = this.entityToDao.get(cls);
        if (abstractDao != null) {
            return abstractDao;
        }
        throw new DaoException(o1.a(ProtectedSandApp.s("徦\u0001"), cls));
    }

    public SQLiteDatabase getDatabase() {
        return this.f73724db;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> long insert(T t4) {
        return getDao(t4.getClass()).insert(t4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> long insertOrReplace(T t4) {
        return getDao(t4.getClass()).insertOrReplace(t4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T, K> T load(Class<T> cls, K k4) {
        return (T) getDao(cls).load(k4);
    }

    public <T, K> List<T> loadAll(Class<T> cls) {
        return (List<T>) getDao(cls).loadAll();
    }

    public <T> QueryBuilder<T> queryBuilder(Class<T> cls) {
        return (QueryBuilder<T>) getDao(cls).queryBuilder();
    }

    public <T, K> List<T> queryRaw(Class<T> cls, String str, String... strArr) {
        return (List<T>) getDao(cls).queryRaw(str, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void refresh(T t4) {
        getDao(t4.getClass()).refresh(t4);
    }

    protected <T> void registerDao(Class<T> cls, AbstractDao<T, ?> abstractDao) {
        this.entityToDao.put(cls, abstractDao);
    }

    public void runInTx(Runnable runnable) {
        this.f73724db.beginTransaction();
        try {
            runnable.run();
            this.f73724db.setTransactionSuccessful();
        } finally {
            this.f73724db.endTransaction();
        }
    }

    public AsyncSession startAsyncSession() {
        return new AsyncSession(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void update(T t4) {
        getDao(t4.getClass()).update(t4);
    }
}
