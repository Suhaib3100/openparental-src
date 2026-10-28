package de.greenrobot.dao.query;

import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoException;
import de.greenrobot.dao.InternalQueryDaoAccess;

/* loaded from: classes7.dex */
abstract class AbstractQuery<T> {
    protected final AbstractDao<T, ?> dao;
    protected final InternalQueryDaoAccess<T> daoAccess;
    protected final Thread ownerThread = Thread.currentThread();
    protected final String[] parameters;
    protected final String sql;

    protected AbstractQuery(AbstractDao<T, ?> abstractDao, String str, String[] strArr) {
        this.dao = abstractDao;
        this.daoAccess = new InternalQueryDaoAccess<>(abstractDao);
        this.sql = str;
        this.parameters = strArr;
    }

    protected static String[] toStringArray(Object[] objArr) {
        int length = objArr.length;
        String[] strArr = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = objArr[i4];
            if (obj != null) {
                strArr[i4] = obj.toString();
            } else {
                strArr[i4] = null;
            }
        }
        return strArr;
    }

    protected void checkThread() {
        if (Thread.currentThread() != this.ownerThread) {
            throw new DaoException(ProtectedSandApp.s("忷\u0001"));
        }
    }

    public void setParameter(int i4, Object obj) {
        checkThread();
        if (obj != null) {
            this.parameters[i4] = obj.toString();
        } else {
            this.parameters[i4] = null;
        }
    }
}
