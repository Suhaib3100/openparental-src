package de.greenrobot.dao;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.flashget.parentalcontrol.database.a;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.identityscope.IdentityScopeLong;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.internal.FastCursor;
import de.greenrobot.dao.internal.TableStatements;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class AbstractDao<T, K> {
    protected final DaoConfig config;

    /* renamed from: db, reason: collision with root package name */
    protected final SQLiteDatabase f73722db;
    protected IdentityScope<K, T> identityScope;
    protected IdentityScopeLong<T> identityScopeLong;
    protected final int pkOrdinal;
    protected final AbstractDaoSession session;
    protected TableStatements statements;

    public AbstractDao(DaoConfig daoConfig) {
        this(daoConfig, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void deleteByKeyInsideSynchronized(K k4, SQLiteStatement sQLiteStatement) {
        if (k4 instanceof Long) {
            sQLiteStatement.bindLong(1, ((Long) k4).longValue());
        } else {
            if (k4 == 0) {
                throw new DaoException(ProtectedSandApp.s("得\u0001"));
            }
            sQLiteStatement.bindString(1, k4.toString());
        }
        sQLiteStatement.execute();
    }

    private void deleteInTxInternal(Iterable<T> iterable, Iterable<K> iterable2) {
        ArrayList arrayList;
        IdentityScope<K, T> identityScope;
        assertSinglePk();
        SQLiteStatement deleteStatement = this.statements.getDeleteStatement();
        this.f73722db.beginTransaction();
        try {
            synchronized (deleteStatement) {
                IdentityScope<K, T> identityScope2 = this.identityScope;
                if (identityScope2 != null) {
                    identityScope2.lock();
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                if (iterable != null) {
                    try {
                        Iterator<T> it = iterable.iterator();
                        while (it.hasNext()) {
                            K keyVerified = getKeyVerified(it.next());
                            deleteByKeyInsideSynchronized(keyVerified, deleteStatement);
                            if (arrayList != null) {
                                arrayList.add(keyVerified);
                            }
                        }
                    } catch (Throwable th) {
                        IdentityScope<K, T> identityScope3 = this.identityScope;
                        if (identityScope3 != null) {
                            identityScope3.unlock();
                        }
                        throw th;
                    }
                }
                if (iterable2 != null) {
                    for (K k4 : iterable2) {
                        deleteByKeyInsideSynchronized(k4, deleteStatement);
                        if (arrayList != null) {
                            arrayList.add(k4);
                        }
                    }
                }
                IdentityScope<K, T> identityScope4 = this.identityScope;
                if (identityScope4 != null) {
                    identityScope4.unlock();
                }
            }
            this.f73722db.setTransactionSuccessful();
            if (arrayList != null && (identityScope = this.identityScope) != null) {
                identityScope.remove((Iterable) arrayList);
            }
        } finally {
            this.f73722db.endTransaction();
        }
    }

    private long executeInsert(T t4, SQLiteStatement sQLiteStatement) {
        long executeInsert;
        if (this.f73722db.isDbLockedByCurrentThread()) {
            synchronized (sQLiteStatement) {
                bindValues(sQLiteStatement, t4);
                executeInsert = sQLiteStatement.executeInsert();
            }
        } else {
            this.f73722db.beginTransaction();
            try {
                synchronized (sQLiteStatement) {
                    bindValues(sQLiteStatement, t4);
                    executeInsert = sQLiteStatement.executeInsert();
                }
                this.f73722db.setTransactionSuccessful();
            } finally {
                this.f73722db.endTransaction();
            }
        }
        updateKeyAfterInsertAndAttach(t4, executeInsert, true);
        return executeInsert;
    }

    private void executeInsertInTx(SQLiteStatement sQLiteStatement, Iterable<T> iterable, boolean z4) {
        this.f73722db.beginTransaction();
        try {
            synchronized (sQLiteStatement) {
                IdentityScope<K, T> identityScope = this.identityScope;
                if (identityScope != null) {
                    identityScope.lock();
                }
                try {
                    for (T t4 : iterable) {
                        bindValues(sQLiteStatement, t4);
                        if (z4) {
                            updateKeyAfterInsertAndAttach(t4, sQLiteStatement.executeInsert(), false);
                        } else {
                            sQLiteStatement.execute();
                        }
                    }
                    IdentityScope<K, T> identityScope2 = this.identityScope;
                    if (identityScope2 != null) {
                        identityScope2.unlock();
                    }
                } catch (Throwable th) {
                    IdentityScope<K, T> identityScope3 = this.identityScope;
                    if (identityScope3 != null) {
                        identityScope3.unlock();
                    }
                    throw th;
                }
            }
            this.f73722db.setTransactionSuccessful();
        } finally {
            this.f73722db.endTransaction();
        }
    }

    protected void assertSinglePk() {
        if (this.config.pkColumns.length == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(ProtectedSandApp.s("徘\u0001"));
        throw new DaoException(c.a(sb, this.config.tablename, ProtectedSandApp.s("徙\u0001")));
    }

    protected void attachEntity(T t4) {
    }

    protected abstract void bindValues(SQLiteStatement sQLiteStatement, T t4);

    public long count() {
        return DatabaseUtils.queryNumEntries(this.f73722db, ProtectedSandApp.s("徚\u0001") + this.config.tablename + '\'');
    }

    public void delete(T t4) {
        assertSinglePk();
        deleteByKey(getKeyVerified(t4));
    }

    public void deleteAll() {
        a.a(new StringBuilder(ProtectedSandApp.s("徛\u0001")), this.config.tablename, ProtectedSandApp.s("徚\u0001"), this.f73722db);
        IdentityScope<K, T> identityScope = this.identityScope;
        if (identityScope != null) {
            identityScope.clear();
        }
    }

    public void deleteByKey(K k4) {
        assertSinglePk();
        SQLiteStatement deleteStatement = this.statements.getDeleteStatement();
        if (this.f73722db.isDbLockedByCurrentThread()) {
            synchronized (deleteStatement) {
                deleteByKeyInsideSynchronized(k4, deleteStatement);
            }
        } else {
            this.f73722db.beginTransaction();
            try {
                synchronized (deleteStatement) {
                    deleteByKeyInsideSynchronized(k4, deleteStatement);
                }
                this.f73722db.setTransactionSuccessful();
            } finally {
                this.f73722db.endTransaction();
            }
        }
        IdentityScope<K, T> identityScope = this.identityScope;
        if (identityScope != null) {
            identityScope.remove((IdentityScope<K, T>) k4);
        }
    }

    public void deleteByKeyInTx(Iterable<K> iterable) {
        deleteInTxInternal(null, iterable);
    }

    public void deleteInTx(Iterable<T> iterable) {
        deleteInTxInternal(iterable, null);
    }

    public boolean detach(T t4) {
        if (this.identityScope == null) {
            return false;
        }
        return this.identityScope.detach(getKeyVerified(t4), t4);
    }

    public String[] getAllColumns() {
        return this.config.allColumns;
    }

    public SQLiteDatabase getDatabase() {
        return this.f73722db;
    }

    protected abstract K getKey(T t4);

    protected K getKeyVerified(T t4) {
        K key = getKey(t4);
        if (key != null) {
            return key;
        }
        if (t4 == null) {
            throw new NullPointerException(ProtectedSandApp.s("徜\u0001"));
        }
        throw new DaoException(ProtectedSandApp.s("徝\u0001"));
    }

    public String[] getNonPkColumns() {
        return this.config.nonPkColumns;
    }

    public String[] getPkColumns() {
        return this.config.pkColumns;
    }

    public Property getPkProperty() {
        return this.config.pkProperty;
    }

    public Property[] getProperties() {
        return this.config.properties;
    }

    public AbstractDaoSession getSession() {
        return this.session;
    }

    TableStatements getStatements() {
        return this.config.statements;
    }

    public String getTablename() {
        return this.config.tablename;
    }

    public long insert(T t4) {
        return executeInsert(t4, this.statements.getInsertStatement());
    }

    public void insertInTx(Iterable<T> iterable) {
        insertInTx(iterable, isEntityUpdateable());
    }

    public long insertOrReplace(T t4) {
        return executeInsert(t4, this.statements.getInsertOrReplaceStatement());
    }

    public void insertOrReplaceInTx(Iterable<T> iterable, boolean z4) {
        executeInsertInTx(this.statements.getInsertOrReplaceStatement(), iterable, z4);
    }

    public long insertWithoutSettingPk(T t4) {
        long executeInsert;
        SQLiteStatement insertStatement = this.statements.getInsertStatement();
        if (this.f73722db.isDbLockedByCurrentThread()) {
            synchronized (insertStatement) {
                bindValues(insertStatement, t4);
                executeInsert = insertStatement.executeInsert();
            }
        } else {
            this.f73722db.beginTransaction();
            try {
                synchronized (insertStatement) {
                    bindValues(insertStatement, t4);
                    executeInsert = insertStatement.executeInsert();
                }
                this.f73722db.setTransactionSuccessful();
            } finally {
                this.f73722db.endTransaction();
            }
        }
        return executeInsert;
    }

    protected abstract boolean isEntityUpdateable();

    public T load(K k4) {
        T t4;
        assertSinglePk();
        if (k4 == null) {
            return null;
        }
        IdentityScope<K, T> identityScope = this.identityScope;
        return (identityScope == null || (t4 = identityScope.get(k4)) == null) ? loadUniqueAndCloseCursor(this.f73722db.rawQuery(this.statements.getSelectByKey(), new String[]{k4.toString()})) : t4;
    }

    public List<T> loadAll() {
        return loadAllAndCloseCursor(this.f73722db.rawQuery(this.statements.getSelectAll(), null));
    }

    protected List<T> loadAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }

    protected List<T> loadAllFromCursor(Cursor cursor) {
        CursorWindow window;
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList(count);
        if ((cursor instanceof CrossProcessCursor) && (window = ((CrossProcessCursor) cursor).getWindow()) != null) {
            if (window.getNumRows() == count) {
                cursor = new FastCursor(window);
            } else {
                DaoLog.d(ProtectedSandApp.s("從\u0001") + window.getNumRows() + ProtectedSandApp.s("徟\u0001") + count);
            }
        }
        if (cursor.moveToFirst()) {
            IdentityScope<K, T> identityScope = this.identityScope;
            if (identityScope != null) {
                identityScope.lock();
                this.identityScope.reserveRoom(count);
            }
            do {
                try {
                    arrayList.add(loadCurrent(cursor, 0, false));
                } finally {
                    IdentityScope<K, T> identityScope2 = this.identityScope;
                    if (identityScope2 != null) {
                        identityScope2.unlock();
                    }
                }
            } while (cursor.moveToNext());
        }
        return arrayList;
    }

    public T loadByRowId(long j4) {
        return loadUniqueAndCloseCursor(this.f73722db.rawQuery(this.statements.getSelectByRowId(), new String[]{Long.toString(j4)}));
    }

    protected final T loadCurrent(Cursor cursor, int i4, boolean z4) {
        if (this.identityScopeLong != null) {
            if (i4 != 0 && cursor.isNull(this.pkOrdinal + i4)) {
                return null;
            }
            long j4 = cursor.getLong(this.pkOrdinal + i4);
            IdentityScopeLong<T> identityScopeLong = this.identityScopeLong;
            T t4 = z4 ? identityScopeLong.get2(j4) : identityScopeLong.get2NoLock(j4);
            if (t4 != null) {
                return t4;
            }
            T readEntity = readEntity(cursor, i4);
            if (z4) {
                this.identityScopeLong.put2(j4, readEntity);
            } else {
                this.identityScopeLong.put2NoLock(j4, readEntity);
            }
            attachEntity(readEntity);
            return readEntity;
        }
        if (this.identityScope == null) {
            if (i4 != 0 && readKey(cursor, i4) == null) {
                return null;
            }
            T readEntity2 = readEntity(cursor, i4);
            attachEntity(readEntity2);
            return readEntity2;
        }
        K readKey = readKey(cursor, i4);
        if (i4 != 0 && readKey == null) {
            return null;
        }
        IdentityScope<K, T> identityScope = this.identityScope;
        T noLock = z4 ? identityScope.get(readKey) : identityScope.getNoLock(readKey);
        if (noLock != null) {
            return noLock;
        }
        T readEntity3 = readEntity(cursor, i4);
        attachEntity(readKey, readEntity3, z4);
        return readEntity3;
    }

    protected final <O> O loadCurrentOther(AbstractDao<O, ?> abstractDao, Cursor cursor, int i4) {
        return abstractDao.loadCurrent(cursor, i4, true);
    }

    protected T loadUnique(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            return null;
        }
        if (cursor.isLast()) {
            return loadCurrent(cursor, 0, true);
        }
        throw new DaoException(ProtectedSandApp.s("徠\u0001") + cursor.getCount());
    }

    protected T loadUniqueAndCloseCursor(Cursor cursor) {
        try {
            return loadUnique(cursor);
        } finally {
            cursor.close();
        }
    }

    public QueryBuilder<T> queryBuilder() {
        return QueryBuilder.internalCreate(this);
    }

    public List<T> queryRaw(String str, String... strArr) {
        return loadAllAndCloseCursor(this.f73722db.rawQuery(this.statements.getSelectAll() + str, strArr));
    }

    public Query<T> queryRawCreate(String str, Object... objArr) {
        return queryRawCreateListArgs(str, Arrays.asList(objArr));
    }

    public Query<T> queryRawCreateListArgs(String str, Collection<Object> collection) {
        return Query.internalCreate(this, this.statements.getSelectAll() + str, collection.toArray());
    }

    protected abstract T readEntity(Cursor cursor, int i4);

    protected abstract void readEntity(Cursor cursor, T t4, int i4);

    protected abstract K readKey(Cursor cursor, int i4);

    public void refresh(T t4) {
        String s4 = ProtectedSandApp.s("徠\u0001");
        String s5 = ProtectedSandApp.s("御\u0001");
        assertSinglePk();
        K keyVerified = getKeyVerified(t4);
        Cursor rawQuery = this.f73722db.rawQuery(this.statements.getSelectByKey(), new String[]{keyVerified.toString()});
        try {
            if (!rawQuery.moveToFirst()) {
                throw new DaoException(s5 + t4.getClass() + ProtectedSandApp.s("徢\u0001") + keyVerified);
            }
            if (rawQuery.isLast()) {
                readEntity(rawQuery, t4, 0);
                attachEntity(keyVerified, t4, true);
            } else {
                throw new DaoException(s4 + rawQuery.getCount());
            }
        } finally {
            rawQuery.close();
        }
    }

    public void update(T t4) {
        assertSinglePk();
        SQLiteStatement updateStatement = this.statements.getUpdateStatement();
        if (this.f73722db.isDbLockedByCurrentThread()) {
            synchronized (updateStatement) {
                updateInsideSynchronized(t4, updateStatement, true);
            }
            return;
        }
        this.f73722db.beginTransaction();
        try {
            synchronized (updateStatement) {
                updateInsideSynchronized(t4, updateStatement, true);
            }
            this.f73722db.setTransactionSuccessful();
        } finally {
            this.f73722db.endTransaction();
        }
    }

    public void updateInTx(Iterable<T> iterable) {
        SQLiteStatement updateStatement = this.statements.getUpdateStatement();
        this.f73722db.beginTransaction();
        try {
            synchronized (updateStatement) {
                IdentityScope<K, T> identityScope = this.identityScope;
                if (identityScope != null) {
                    identityScope.lock();
                }
                try {
                    Iterator<T> it = iterable.iterator();
                    while (it.hasNext()) {
                        updateInsideSynchronized(it.next(), updateStatement, false);
                    }
                } finally {
                    IdentityScope<K, T> identityScope2 = this.identityScope;
                    if (identityScope2 != null) {
                        identityScope2.unlock();
                    }
                }
            }
            this.f73722db.setTransactionSuccessful();
        } finally {
            this.f73722db.endTransaction();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void updateInsideSynchronized(T t4, SQLiteStatement sQLiteStatement, boolean z4) {
        bindValues(sQLiteStatement, t4);
        int length = this.config.allColumns.length + 1;
        Object key = getKey(t4);
        if (key instanceof Long) {
            sQLiteStatement.bindLong(length, ((Long) key).longValue());
        } else {
            if (key == null) {
                throw new DaoException(ProtectedSandApp.s("徣\u0001"));
            }
            sQLiteStatement.bindString(length, key.toString());
        }
        sQLiteStatement.execute();
        attachEntity(key, t4, z4);
    }

    protected abstract K updateKeyAfterInsert(T t4, long j4);

    protected void updateKeyAfterInsertAndAttach(T t4, long j4, boolean z4) {
        if (j4 != -1) {
            attachEntity(updateKeyAfterInsert(t4, j4), t4, z4);
        } else {
            DaoLog.w(ProtectedSandApp.s("徤\u0001"));
        }
    }

    public AbstractDao(DaoConfig daoConfig, AbstractDaoSession abstractDaoSession) {
        this.config = daoConfig;
        this.session = abstractDaoSession;
        this.f73722db = daoConfig.f73725db;
        IdentityScopeLong<T> identityScopeLong = (IdentityScope<K, T>) daoConfig.getIdentityScope();
        this.identityScope = identityScopeLong;
        if (identityScopeLong instanceof IdentityScopeLong) {
            this.identityScopeLong = identityScopeLong;
        }
        this.statements = daoConfig.statements;
        Property property = daoConfig.pkProperty;
        this.pkOrdinal = property != null ? property.ordinal : -1;
    }

    protected final void attachEntity(K k4, T t4, boolean z4) {
        IdentityScope<K, T> identityScope = this.identityScope;
        if (identityScope != null && k4 != null) {
            if (z4) {
                identityScope.put(k4, t4);
            } else {
                identityScope.putNoLock(k4, t4);
            }
        }
        attachEntity(t4);
    }

    public void deleteByKeyInTx(K... kArr) {
        deleteInTxInternal(null, Arrays.asList(kArr));
    }

    public void deleteInTx(T... tArr) {
        deleteInTxInternal(Arrays.asList(tArr), null);
    }

    public void insertInTx(T... tArr) {
        insertInTx(Arrays.asList(tArr), isEntityUpdateable());
    }

    public void insertInTx(Iterable<T> iterable, boolean z4) {
        executeInsertInTx(this.statements.getInsertStatement(), iterable, z4);
    }

    public void insertOrReplaceInTx(Iterable<T> iterable) {
        insertOrReplaceInTx(iterable, isEntityUpdateable());
    }

    public void insertOrReplaceInTx(T... tArr) {
        insertOrReplaceInTx(Arrays.asList(tArr), isEntityUpdateable());
    }

    public void updateInTx(T... tArr) {
        updateInTx(Arrays.asList(tArr));
    }
}
