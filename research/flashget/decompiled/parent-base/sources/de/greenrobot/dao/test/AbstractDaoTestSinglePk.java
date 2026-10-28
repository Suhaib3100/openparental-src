package de.greenrobot.dao.test;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.support.v4.media.c;
import android.test.ApplicationTestCase;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public abstract class AbstractDaoTestSinglePk<D extends AbstractDao<T, K>, T, K> extends AbstractDaoTest<D, T, K> {
    private Property pkColumn;
    protected Set<K> usedPks;

    public AbstractDaoTestSinglePk(Class<D> cls) {
        super(cls);
        this.usedPks = new HashSet();
    }

    protected abstract T createEntity(K k4);

    protected T createEntityWithRandomPk() {
        return createEntity(nextPk());
    }

    protected abstract K createRandomPk();

    protected K nextPk() {
        for (int i4 = 0; i4 < 100000; i4++) {
            K createRandomPk = createRandomPk();
            if (this.usedPks.add(createRandomPk)) {
                return createRandomPk;
            }
        }
        throw new IllegalStateException(ProtectedSandApp.s("怤\u0001"));
    }

    protected Cursor queryWithDummyColumnsInFront(int i4, String str, K k4) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("急\u0001"));
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append(str);
            sb.append(ProtectedSandApp.s("怦\u0001"));
        }
        SqlUtils.appendColumns(sb, ProtectedSandApp.s("性\u0001"), this.dao.getAllColumns()).append(ProtectedSandApp.s("怨\u0001"));
        sb.append(this.dao.getTablename());
        sb.append(ProtectedSandApp.s("怩\u0001"));
        if (k4 != null) {
            sb.append(ProtectedSandApp.s("怪\u0001"));
            ApplicationTestCase.assertEquals(1, this.dao.getPkColumns().length);
            sb.append(this.dao.getPkColumns()[0]);
            sb.append(ProtectedSandApp.s("怫\u0001"));
            DatabaseUtils.appendValueToSql(sb, k4);
        }
        Cursor rawQuery = this.f73727db.rawQuery(sb.toString(), null);
        ApplicationTestCase.assertTrue(rawQuery.moveToFirst());
        for (int i6 = 0; i6 < i4; i6++) {
            try {
                ApplicationTestCase.assertEquals(str, rawQuery.getString(i6));
            } catch (RuntimeException e4) {
                rawQuery.close();
                throw e4;
            }
        }
        if (k4 != null) {
            ApplicationTestCase.assertEquals(1, rawQuery.getCount());
        }
        return rawQuery;
    }

    protected void runLoadPkTest(int i4) {
        K nextPk = nextPk();
        this.dao.insert(createEntity(nextPk));
        Cursor queryWithDummyColumnsInFront = queryWithDummyColumnsInFront(i4, ProtectedSandApp.s("怬\u0001"), nextPk);
        try {
            ApplicationTestCase.assertEquals(nextPk, this.daoAccess.readKey(queryWithDummyColumnsInFront, i4));
        } finally {
            queryWithDummyColumnsInFront.close();
        }
    }

    @Override // de.greenrobot.dao.test.AbstractDaoTest, de.greenrobot.dao.test.DbTest
    protected void setUp() {
        super.setUp();
        for (Property property : this.daoAccess.getProperties()) {
            if (property.primaryKey) {
                if (this.pkColumn != null) {
                    throw new RuntimeException(ProtectedSandApp.s("怭\u0001"));
                }
                this.pkColumn = property;
            }
        }
        if (this.pkColumn == null) {
            throw new RuntimeException(ProtectedSandApp.s("怮\u0001"));
        }
    }

    public void testCount() {
        this.dao.deleteAll();
        ApplicationTestCase.assertEquals(0L, this.dao.count());
        this.dao.insert(createEntityWithRandomPk());
        ApplicationTestCase.assertEquals(1L, this.dao.count());
        this.dao.insert(createEntityWithRandomPk());
        ApplicationTestCase.assertEquals(2L, this.dao.count());
    }

    public void testDelete() {
        K nextPk = nextPk();
        this.dao.deleteByKey(nextPk);
        this.dao.insert(createEntity(nextPk));
        ApplicationTestCase.assertNotNull(this.dao.load(nextPk));
        this.dao.deleteByKey(nextPk);
        ApplicationTestCase.assertNull(this.dao.load(nextPk));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void testDeleteAll() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < 10; i4++) {
            arrayList.add(createEntityWithRandomPk());
        }
        this.dao.insertInTx(arrayList);
        this.dao.deleteAll();
        ApplicationTestCase.assertEquals(0L, this.dao.count());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object key = this.daoAccess.getKey(it.next());
            ApplicationTestCase.assertNotNull(key);
            ApplicationTestCase.assertNull(this.dao.load(key));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void testDeleteByKeyInTx() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < 10; i4++) {
            arrayList.add(createEntityWithRandomPk());
        }
        this.dao.insertInTx(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.daoAccess.getKey(arrayList.get(0)));
        arrayList2.add(this.daoAccess.getKey(arrayList.get(3)));
        arrayList2.add(this.daoAccess.getKey(arrayList.get(4)));
        arrayList2.add(this.daoAccess.getKey(arrayList.get(8)));
        this.dao.deleteByKeyInTx(arrayList2);
        ApplicationTestCase.assertEquals(arrayList.size() - arrayList2.size(), this.dao.count());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ApplicationTestCase.assertNotNull(next);
            ApplicationTestCase.assertNull(this.dao.load(next));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void testDeleteInTx() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < 10; i4++) {
            arrayList.add(createEntityWithRandomPk());
        }
        this.dao.insertInTx(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(arrayList.get(0));
        arrayList2.add(arrayList.get(3));
        arrayList2.add(arrayList.get(4));
        arrayList2.add(arrayList.get(8));
        this.dao.deleteInTx(arrayList2);
        ApplicationTestCase.assertEquals(arrayList.size() - arrayList2.size(), this.dao.count());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object key = this.daoAccess.getKey(it.next());
            ApplicationTestCase.assertNotNull(key);
            ApplicationTestCase.assertNull(this.dao.load(key));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void testInsertAndLoad() {
        K nextPk = nextPk();
        T createEntity = createEntity(nextPk);
        this.dao.insert(createEntity);
        ApplicationTestCase.assertEquals(nextPk, this.daoAccess.getKey(createEntity));
        Object load = this.dao.load(nextPk);
        ApplicationTestCase.assertNotNull(load);
        ApplicationTestCase.assertEquals(this.daoAccess.getKey(createEntity), this.daoAccess.getKey(load));
    }

    public void testInsertInTx() {
        this.dao.deleteAll();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < 20; i4++) {
            arrayList.add(createEntityWithRandomPk());
        }
        this.dao.insertInTx(arrayList);
        ApplicationTestCase.assertEquals(arrayList.size(), this.dao.count());
    }

    public void testInsertOrReplaceInTx() {
        this.dao.deleteAll();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < 20; i4++) {
            T createEntityWithRandomPk = createEntityWithRandomPk();
            if (i4 % 2 == 0) {
                arrayList.add(createEntityWithRandomPk);
            }
            arrayList2.add(createEntityWithRandomPk);
        }
        this.dao.insertOrReplaceInTx(arrayList);
        this.dao.insertOrReplaceInTx(arrayList2);
        ApplicationTestCase.assertEquals(arrayList2.size(), this.dao.count());
    }

    public void testInsertOrReplaceTwice() {
        T createEntityWithRandomPk = createEntityWithRandomPk();
        long insert = this.dao.insert(createEntityWithRandomPk);
        long insertOrReplace = this.dao.insertOrReplace(createEntityWithRandomPk);
        if (this.dao.getPkProperty().type == Long.class) {
            ApplicationTestCase.assertEquals(insert, insertOrReplace);
        }
    }

    public void testInsertTwice() {
        T createEntity = createEntity(nextPk());
        this.dao.insert(createEntity);
        try {
            this.dao.insert(createEntity);
            ApplicationTestCase.fail(ProtectedSandApp.s("怯\u0001"));
        } catch (SQLException unused) {
        }
    }

    public void testLoadAll() {
        this.dao.deleteAll();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < 15; i4++) {
            arrayList.add(createEntity(nextPk()));
        }
        this.dao.insertInTx(arrayList);
        ApplicationTestCase.assertEquals(arrayList.size(), this.dao.loadAll().size());
    }

    public void testLoadPk() {
        runLoadPkTest(0);
    }

    public void testLoadPkWithOffset() {
        runLoadPkTest(10);
    }

    public void testQuery() {
        this.dao.insert(createEntityWithRandomPk());
        K nextPk = nextPk();
        this.dao.insert(createEntity(nextPk));
        this.dao.insert(createEntityWithRandomPk());
        List<T> queryRaw = this.dao.queryRaw(c.a(new StringBuilder(ProtectedSandApp.s("怰\u0001")), this.dao.getPkColumns()[0], ProtectedSandApp.s("怱\u0001")), nextPk.toString());
        ApplicationTestCase.assertEquals(1, queryRaw.size());
        ApplicationTestCase.assertEquals(nextPk, this.daoAccess.getKey(queryRaw.get(0)));
    }

    public void testReadWithOffset() {
        K nextPk = nextPk();
        this.dao.insert(createEntity(nextPk));
        Cursor queryWithDummyColumnsInFront = queryWithDummyColumnsInFront(5, ProtectedSandApp.s("怬\u0001"), nextPk);
        try {
            ApplicationTestCase.assertEquals(nextPk, this.daoAccess.getKey(this.daoAccess.readEntity(queryWithDummyColumnsInFront, 5)));
        } finally {
            queryWithDummyColumnsInFront.close();
        }
    }

    public void testRowId() {
        ApplicationTestCase.assertTrue(this.dao.insert(createEntityWithRandomPk()) != this.dao.insert(createEntityWithRandomPk()));
    }

    public void testUpdate() {
        this.dao.deleteAll();
        T createEntityWithRandomPk = createEntityWithRandomPk();
        this.dao.insert(createEntityWithRandomPk);
        this.dao.update(createEntityWithRandomPk);
        ApplicationTestCase.assertEquals(1L, this.dao.count());
    }
}
