package de.greenrobot.dao.query;

import android.database.Cursor;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoException;

/* loaded from: classes7.dex */
public class CountQuery<T> extends AbstractQuery<T> {
    private final ThreadLocalQuery<T> threadLocalQuery;

    private static final class ThreadLocalQuery<T2> extends ThreadLocal<CountQuery<T2>> {
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
        public CountQuery<T2> initialValue() {
            return new CountQuery<>(this, this.dao, this.sql, (String[]) this.initialValues.clone());
        }
    }

    static <T2> CountQuery<T2> create(AbstractDao<T2, ?> abstractDao, String str, Object[] objArr) {
        return new ThreadLocalQuery(abstractDao, str, AbstractQuery.toStringArray(objArr)).get();
    }

    public long count() {
        String s4 = ProtectedSandApp.s("忸\u0001");
        String s5 = ProtectedSandApp.s("忹\u0001");
        checkThread();
        Cursor rawQuery = this.dao.getDatabase().rawQuery(this.sql, this.parameters);
        try {
            if (!rawQuery.moveToNext()) {
                throw new DaoException(ProtectedSandApp.s("忺\u0001"));
            }
            if (!rawQuery.isLast()) {
                throw new DaoException(s5 + rawQuery.getCount());
            }
            if (rawQuery.getColumnCount() == 1) {
                return rawQuery.getLong(0);
            }
            throw new DaoException(s4 + rawQuery.getColumnCount());
        } finally {
            rawQuery.close();
        }
    }

    public CountQuery<T> forCurrentThread() {
        CountQuery<T> countQuery = (CountQuery) this.threadLocalQuery.get();
        String[] strArr = ((ThreadLocalQuery) this.threadLocalQuery).initialValues;
        System.arraycopy(strArr, 0, countQuery.parameters, 0, strArr.length);
        return countQuery;
    }

    @Override // de.greenrobot.dao.query.AbstractQuery
    public /* bridge */ /* synthetic */ void setParameter(int i4, Object obj) {
        super.setParameter(i4, obj);
    }

    private CountQuery(ThreadLocalQuery<T> threadLocalQuery, AbstractDao<T, ?> abstractDao, String str, String[] strArr) {
        super(abstractDao, str, strArr);
        this.threadLocalQuery = threadLocalQuery;
    }
}
