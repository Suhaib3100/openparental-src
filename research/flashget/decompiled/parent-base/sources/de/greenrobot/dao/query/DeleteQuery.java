package de.greenrobot.dao.query;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;

/* loaded from: classes7.dex */
public class DeleteQuery<T> extends AbstractQuery<T> {
    private SQLiteStatement compiledStatement;
    private final ThreadLocalQuery<T> threadLocalQuery;

    private static final class ThreadLocalQuery<T2> extends ThreadLocal<DeleteQuery<T2>> {
        private final AbstractDao<T2, ?> dao;
        private final String[] initialValues;
        private final String sql;

        private ThreadLocalQuery(AbstractDao<T2, ?> abstractDao, String str, String[] strArr) {
            this.dao = abstractDao;
            this.sql = str;
            this.initialValues = strArr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public DeleteQuery<T2> initialValue() {
            return new DeleteQuery<>(this, this.dao, this.sql, (String[]) this.initialValues.clone());
        }
    }

    static <T2> DeleteQuery<T2> create(AbstractDao<T2, ?> abstractDao, String str, Object[] objArr) {
        return new ThreadLocalQuery(abstractDao, str, AbstractQuery.toStringArray(objArr)).get();
    }

    private synchronized void executeDeleteWithoutDetachingEntitiesInsideTx() {
        try {
            SQLiteStatement sQLiteStatement = this.compiledStatement;
            if (sQLiteStatement != null) {
                sQLiteStatement.clearBindings();
            } else {
                this.compiledStatement = this.dao.getDatabase().compileStatement(this.sql);
            }
            int i4 = 0;
            while (true) {
                String[] strArr = this.parameters;
                if (i4 < strArr.length) {
                    String str = strArr[i4];
                    if (str != null) {
                        this.compiledStatement.bindString(i4 + 1, str);
                    } else {
                        this.compiledStatement.bindNull(i4 + 1);
                    }
                    i4++;
                } else {
                    this.compiledStatement.execute();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void executeDeleteWithoutDetachingEntities() {
        checkThread();
        SQLiteDatabase database = this.dao.getDatabase();
        if (database.isDbLockedByCurrentThread()) {
            executeDeleteWithoutDetachingEntitiesInsideTx();
            return;
        }
        database.beginTransaction();
        try {
            executeDeleteWithoutDetachingEntitiesInsideTx();
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    public DeleteQuery<T> forCurrentThread() {
        DeleteQuery<T> deleteQuery = (DeleteQuery) this.threadLocalQuery.get();
        String[] strArr = ((ThreadLocalQuery) this.threadLocalQuery).initialValues;
        System.arraycopy(strArr, 0, deleteQuery.parameters, 0, strArr.length);
        return deleteQuery;
    }

    @Override // de.greenrobot.dao.query.AbstractQuery
    public /* bridge */ /* synthetic */ void setParameter(int i4, Object obj) {
        super.setParameter(i4, obj);
    }

    private DeleteQuery(ThreadLocalQuery<T> threadLocalQuery, AbstractDao<T, ?> abstractDao, String str, String[] strArr) {
        super(abstractDao, str, strArr);
        this.threadLocalQuery = threadLocalQuery;
    }
}
