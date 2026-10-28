package de.greenrobot.dao;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class AbstractDaoMaster {
    protected final Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> daoConfigMap = new HashMap();

    /* renamed from: db, reason: collision with root package name */
    protected final SQLiteDatabase f73723db;
    protected final int schemaVersion;

    public AbstractDaoMaster(SQLiteDatabase sQLiteDatabase, int i4) {
        this.f73723db = sQLiteDatabase;
        this.schemaVersion = i4;
    }

    public SQLiteDatabase getDatabase() {
        return this.f73723db;
    }

    public int getSchemaVersion() {
        return this.schemaVersion;
    }

    public abstract AbstractDaoSession newSession();

    public abstract AbstractDaoSession newSession(IdentityScopeType identityScopeType);

    protected void registerDaoClass(Class<? extends AbstractDao<?, ?>> cls) {
        this.daoConfigMap.put(cls, new DaoConfig(this.f73723db, cls));
    }
}
