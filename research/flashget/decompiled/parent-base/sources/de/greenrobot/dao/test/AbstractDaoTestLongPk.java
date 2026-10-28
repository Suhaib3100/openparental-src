package de.greenrobot.dao.test;

import android.test.ApplicationTestCase;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoLog;

/* loaded from: classes7.dex */
public abstract class AbstractDaoTestLongPk<D extends AbstractDao<T, Long>, T> extends AbstractDaoTestSinglePk<D, T, Long> {
    public AbstractDaoTestLongPk(Class<D> cls) {
        super(cls);
    }

    public void testAssignPk() {
        if (!this.daoAccess.isEntityUpdateable()) {
            DaoLog.d(ProtectedSandApp.s("怴\u0001") + this.daoClass);
            return;
        }
        T createEntity = createEntity(null);
        if (createEntity == null) {
            DaoLog.d(ProtectedSandApp.s("怲\u0001") + this.daoClass + ProtectedSandApp.s("怳\u0001"));
            return;
        }
        T createEntity2 = createEntity(null);
        this.dao.insert(createEntity);
        this.dao.insert(createEntity2);
        Long l4 = (Long) this.daoAccess.getKey(createEntity);
        ApplicationTestCase.assertNotNull(l4);
        Long l5 = (Long) this.daoAccess.getKey(createEntity2);
        ApplicationTestCase.assertNotNull(l5);
        ApplicationTestCase.assertFalse(l4.equals(l5));
        ApplicationTestCase.assertNotNull(this.dao.load(l4));
        ApplicationTestCase.assertNotNull(this.dao.load(l5));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // de.greenrobot.dao.test.AbstractDaoTestSinglePk
    public Long createRandomPk() {
        return Long.valueOf(this.random.nextLong());
    }
}
