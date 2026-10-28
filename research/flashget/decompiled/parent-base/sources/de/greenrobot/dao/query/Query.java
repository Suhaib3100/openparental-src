package de.greenrobot.dao.query;

import android.support.v4.media.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoException;
import java.util.List;

/* loaded from: classes7.dex */
public class Query<T> extends AbstractQuery<T> {
    private final int limitPosition;
    private final int offsetPosition;
    private final ThreadLocalQuery<T> threadLocalQuery;

    private static final class ThreadLocalQuery<T2> extends ThreadLocal<Query<T2>> {
        private final AbstractDao<T2, ?> dao;
        private final String[] initialValues;
        private final int limitPosition;
        private final int offsetPosition;
        private final String sql;

        private ThreadLocalQuery(AbstractDao<T2, ?> abstractDao, String str, String[] strArr, int i4, int i5) {
            this.dao = abstractDao;
            this.sql = str;
            this.initialValues = strArr;
            this.limitPosition = i4;
            this.offsetPosition = i5;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Query<T2> initialValue() {
            return new Query<>(this, this.dao, this.sql, (String[]) this.initialValues.clone(), this.limitPosition, this.offsetPosition);
        }
    }

    static <T2> Query<T2> create(AbstractDao<T2, ?> abstractDao, String str, Object[] objArr, int i4, int i5) {
        return new ThreadLocalQuery(abstractDao, str, AbstractQuery.toStringArray(objArr), i4, i5).get();
    }

    public static <T2> Query<T2> internalCreate(AbstractDao<T2, ?> abstractDao, String str, Object[] objArr) {
        return create(abstractDao, str, objArr, -1, -1);
    }

    public Query<T> forCurrentThread() {
        Query<T> query = (Query) this.threadLocalQuery.get();
        String[] strArr = ((ThreadLocalQuery) this.threadLocalQuery).initialValues;
        System.arraycopy(strArr, 0, query.parameters, 0, strArr.length);
        return query;
    }

    public List<T> list() {
        checkThread();
        return this.daoAccess.loadAllAndCloseCursor(this.dao.getDatabase().rawQuery(this.sql, this.parameters));
    }

    public CloseableListIterator<T> listIterator() {
        return listLazyUncached().listIteratorAutoClose();
    }

    public LazyList<T> listLazy() {
        checkThread();
        return new LazyList<>(this.daoAccess, this.dao.getDatabase().rawQuery(this.sql, this.parameters), true);
    }

    public LazyList<T> listLazyUncached() {
        checkThread();
        return new LazyList<>(this.daoAccess, this.dao.getDatabase().rawQuery(this.sql, this.parameters), false);
    }

    public void setLimit(int i4) {
        checkThread();
        int i5 = this.limitPosition;
        if (i5 == -1) {
            throw new IllegalStateException(ProtectedSandApp.s("忽\u0001"));
        }
        this.parameters[i5] = Integer.toString(i4);
    }

    public void setOffset(int i4) {
        checkThread();
        int i5 = this.offsetPosition;
        if (i5 == -1) {
            throw new IllegalStateException(ProtectedSandApp.s("忾\u0001"));
        }
        this.parameters[i5] = Integer.toString(i4);
    }

    @Override // de.greenrobot.dao.query.AbstractQuery
    public void setParameter(int i4, Object obj) {
        if (i4 >= 0 && (i4 == this.limitPosition || i4 == this.offsetPosition)) {
            throw new IllegalArgumentException(a.a(ProtectedSandApp.s("忿\u0001"), i4));
        }
        super.setParameter(i4, obj);
    }

    public T unique() {
        checkThread();
        return this.daoAccess.loadUniqueAndCloseCursor(this.dao.getDatabase().rawQuery(this.sql, this.parameters));
    }

    public T uniqueOrThrow() {
        T unique = unique();
        if (unique != null) {
            return unique;
        }
        throw new DaoException(ProtectedSandApp.s("怀\u0001"));
    }

    private Query(ThreadLocalQuery<T> threadLocalQuery, AbstractDao<T, ?> abstractDao, String str, String[] strArr, int i4, int i5) {
        super(abstractDao, str, strArr);
        this.threadLocalQuery = threadLocalQuery;
        this.limitPosition = i4;
        this.offsetPosition = i5;
    }
}
