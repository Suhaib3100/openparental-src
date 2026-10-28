package de.greenrobot.dao.async;

import android.database.sqlite.SQLiteDatabase;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoException;

/* loaded from: classes7.dex */
public class AsyncOperation {
    public static final int FLAG_MERGE_TX = 1;
    public static final int FLAG_STOP_QUEUE_ON_EXCEPTION = 2;
    private volatile boolean completed;
    final AbstractDao<Object, Object> dao;
    private final SQLiteDatabase database;
    final int flags;
    volatile int mergedOperationsCount;
    final Object parameter;
    volatile Object result;
    int sequenceNumber;
    volatile Throwable throwable;
    volatile long timeCompleted;
    volatile long timeStarted;
    final OperationType type;

    public enum OperationType {
        Insert,
        InsertInTxIterable,
        InsertInTxArray,
        InsertOrReplace,
        InsertOrReplaceInTxIterable,
        InsertOrReplaceInTxArray,
        Update,
        UpdateInTxIterable,
        UpdateInTxArray,
        Delete,
        DeleteInTxIterable,
        DeleteInTxArray,
        DeleteByKey,
        DeleteAll,
        TransactionRunnable,
        TransactionCallable,
        QueryList,
        QueryUnique,
        Load,
        LoadAll,
        Count,
        Refresh
    }

    AsyncOperation(OperationType operationType, AbstractDao<?, ?> abstractDao, Object obj, int i4) {
        this.type = operationType;
        this.flags = i4;
        this.dao = abstractDao;
        this.database = null;
        this.parameter = obj;
    }

    SQLiteDatabase getDatabase() {
        SQLiteDatabase sQLiteDatabase = this.database;
        return sQLiteDatabase != null ? sQLiteDatabase : this.dao.getDatabase();
    }

    public long getDuration() {
        if (this.timeCompleted != 0) {
            return this.timeCompleted - this.timeStarted;
        }
        throw new DaoException(ProtectedSandApp.s("忒\u0001"));
    }

    public int getMergedOperationsCount() {
        return this.mergedOperationsCount;
    }

    public Object getParameter() {
        return this.parameter;
    }

    public synchronized Object getResult() {
        try {
            if (!this.completed) {
                waitForCompletion();
            }
            if (this.throwable != null) {
                throw new AsyncDaoException(this, this.throwable);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.result;
    }

    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public long getTimeCompleted() {
        return this.timeCompleted;
    }

    public long getTimeStarted() {
        return this.timeStarted;
    }

    public OperationType getType() {
        return this.type;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public boolean isCompletedSucessfully() {
        return this.completed && this.throwable == null;
    }

    public boolean isFailed() {
        return this.throwable != null;
    }

    public boolean isMergeTx() {
        return (this.flags & 1) != 0;
    }

    boolean isMergeableWith(AsyncOperation asyncOperation) {
        return asyncOperation != null && isMergeTx() && asyncOperation.isMergeTx() && getDatabase() == asyncOperation.getDatabase();
    }

    void reset() {
        this.timeStarted = 0L;
        this.timeCompleted = 0L;
        this.completed = false;
        this.throwable = null;
        this.result = null;
        this.mergedOperationsCount = 0;
    }

    synchronized void setCompleted() {
        this.completed = true;
        notifyAll();
    }

    public void setThrowable(Throwable th) {
        this.throwable = th;
    }

    public synchronized Object waitForCompletion() {
        while (!this.completed) {
            try {
                wait();
            } catch (InterruptedException e4) {
                throw new DaoException(ProtectedSandApp.s("忓\u0001"), e4);
            }
        }
        return this.result;
    }

    public synchronized boolean waitForCompletion(int i4) {
        if (!this.completed) {
            try {
                wait(i4);
            } catch (InterruptedException e4) {
                throw new DaoException(ProtectedSandApp.s("忓\u0001"), e4);
            }
        }
        return this.completed;
    }

    AsyncOperation(OperationType operationType, SQLiteDatabase sQLiteDatabase, Object obj, int i4) {
        this.type = operationType;
        this.database = sQLiteDatabase;
        this.flags = i4;
        this.dao = null;
        this.parameter = obj;
    }
}
