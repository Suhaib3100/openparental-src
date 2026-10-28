package de.greenrobot.dao.async;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.DaoException;
import de.greenrobot.dao.DaoLog;
import de.greenrobot.dao.async.AsyncOperation;
import de.greenrobot.dao.query.Query;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
class AsyncOperationExecutor implements Runnable, Handler.Callback {
    private static ExecutorService executorService = Executors.newCachedThreadPool();
    private int countOperationsCompleted;
    private int countOperationsEnqueued;
    private volatile boolean executorRunning;
    private Handler handlerMainThread;
    private int lastSequenceNumber;
    private volatile AsyncOperationListener listener;
    private volatile AsyncOperationListener listenerMainThread;
    private final BlockingQueue<AsyncOperation> queue = new LinkedBlockingQueue();
    private volatile int maxOperationCountToMerge = 50;
    private volatile int waitForMergeMillis = 50;

    /* renamed from: de.greenrobot.dao.async.AsyncOperationExecutor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType;

        static {
            int[] iArr = new int[AsyncOperation.OperationType.values().length];
            $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType = iArr;
            try {
                iArr[AsyncOperation.OperationType.Delete.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.DeleteInTxIterable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.DeleteInTxArray.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.Insert.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.InsertInTxIterable.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.InsertInTxArray.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.InsertOrReplace.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.InsertOrReplaceInTxIterable.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.InsertOrReplaceInTxArray.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.Update.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.UpdateInTxIterable.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.UpdateInTxArray.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.TransactionRunnable.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.TransactionCallable.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.QueryList.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.QueryUnique.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.DeleteByKey.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.DeleteAll.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.Load.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.LoadAll.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.Count.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.Refresh.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    AsyncOperationExecutor() {
    }

    private void executeOperation(AsyncOperation asyncOperation) {
        String s4 = ProtectedSandApp.s("忔\u0001");
        asyncOperation.timeStarted = System.currentTimeMillis();
        try {
            switch (AnonymousClass1.$SwitchMap$de$greenrobot$dao$async$AsyncOperation$OperationType[asyncOperation.type.ordinal()]) {
                case 1:
                    asyncOperation.dao.delete(asyncOperation.parameter);
                    break;
                case 2:
                    asyncOperation.dao.deleteInTx((Iterable<Object>) asyncOperation.parameter);
                    break;
                case 3:
                    asyncOperation.dao.deleteInTx((Object[]) asyncOperation.parameter);
                    break;
                case 4:
                    asyncOperation.dao.insert(asyncOperation.parameter);
                    break;
                case 5:
                    asyncOperation.dao.insertInTx((Iterable<Object>) asyncOperation.parameter);
                    break;
                case 6:
                    asyncOperation.dao.insertInTx((Object[]) asyncOperation.parameter);
                    break;
                case 7:
                    asyncOperation.dao.insertOrReplace(asyncOperation.parameter);
                    break;
                case 8:
                    asyncOperation.dao.insertOrReplaceInTx((Iterable<Object>) asyncOperation.parameter);
                    break;
                case 9:
                    asyncOperation.dao.insertOrReplaceInTx((Object[]) asyncOperation.parameter);
                    break;
                case 10:
                    asyncOperation.dao.update(asyncOperation.parameter);
                    break;
                case 11:
                    asyncOperation.dao.updateInTx((Iterable<Object>) asyncOperation.parameter);
                    break;
                case 12:
                    asyncOperation.dao.updateInTx((Object[]) asyncOperation.parameter);
                    break;
                case 13:
                    executeTransactionRunnable(asyncOperation);
                    break;
                case 14:
                    executeTransactionCallable(asyncOperation);
                    break;
                case 15:
                    asyncOperation.result = ((Query) asyncOperation.parameter).list();
                    break;
                case 16:
                    asyncOperation.result = ((Query) asyncOperation.parameter).unique();
                    break;
                case 17:
                    asyncOperation.dao.deleteByKey(asyncOperation.parameter);
                    break;
                case 18:
                    asyncOperation.dao.deleteAll();
                    break;
                case 19:
                    asyncOperation.result = asyncOperation.dao.load(asyncOperation.parameter);
                    break;
                case 20:
                    asyncOperation.result = asyncOperation.dao.loadAll();
                    break;
                case 21:
                    asyncOperation.result = Long.valueOf(asyncOperation.dao.count());
                    break;
                case 22:
                    asyncOperation.dao.refresh(asyncOperation.parameter);
                    break;
                default:
                    throw new DaoException(s4 + asyncOperation.type);
            }
        } catch (Throwable th) {
            asyncOperation.throwable = th;
        }
        asyncOperation.timeCompleted = System.currentTimeMillis();
    }

    private void executeOperationAndPostCompleted(AsyncOperation asyncOperation) {
        executeOperation(asyncOperation);
        handleOperationCompleted(asyncOperation);
    }

    private void executeTransactionCallable(AsyncOperation asyncOperation) throws Exception {
        SQLiteDatabase database = asyncOperation.getDatabase();
        database.beginTransaction();
        try {
            asyncOperation.result = ((Callable) asyncOperation.parameter).call();
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    private void executeTransactionRunnable(AsyncOperation asyncOperation) {
        SQLiteDatabase database = asyncOperation.getDatabase();
        database.beginTransaction();
        try {
            ((Runnable) asyncOperation.parameter).run();
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    private void handleOperationCompleted(AsyncOperation asyncOperation) {
        asyncOperation.setCompleted();
        AsyncOperationListener asyncOperationListener = this.listener;
        if (asyncOperationListener != null) {
            asyncOperationListener.onAsyncOperationCompleted(asyncOperation);
        }
        if (this.listenerMainThread != null) {
            if (this.handlerMainThread == null) {
                this.handlerMainThread = new Handler(Looper.getMainLooper(), this);
            }
            this.handlerMainThread.sendMessage(this.handlerMainThread.obtainMessage(1, asyncOperation));
        }
        synchronized (this) {
            try {
                int i4 = this.countOperationsCompleted + 1;
                this.countOperationsCompleted = i4;
                if (i4 == this.countOperationsEnqueued) {
                    notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        throw new de.greenrobot.dao.DaoException(com.flashget.parentalcontrol.ProtectedSandApp.s("忕\u0001"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void mergeTxAndExecute(de.greenrobot.dao.async.AsyncOperation r6, de.greenrobot.dao.async.AsyncOperation r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r6)
            r0.add(r7)
            android.database.sqlite.SQLiteDatabase r6 = r6.getDatabase()
            r6.beginTransaction()
            r7 = 0
            r1 = r7
        L14:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L53
            if (r1 >= r2) goto L67
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L53
            de.greenrobot.dao.async.AsyncOperation r2 = (de.greenrobot.dao.async.AsyncOperation) r2     // Catch: java.lang.Throwable -> L53
            r5.executeOperation(r2)     // Catch: java.lang.Throwable -> L53
            boolean r3 = r2.isFailed()     // Catch: java.lang.Throwable -> L53
            r4 = 1
            if (r3 == 0) goto L2c
            r7 = r4
            goto L67
        L2c:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L53
            int r3 = r3 - r4
            if (r1 != r3) goto L64
            java.util.concurrent.BlockingQueue<de.greenrobot.dao.async.AsyncOperation> r3 = r5.queue     // Catch: java.lang.Throwable -> L53
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Throwable -> L53
            de.greenrobot.dao.async.AsyncOperation r3 = (de.greenrobot.dao.async.AsyncOperation) r3     // Catch: java.lang.Throwable -> L53
            int r4 = r5.maxOperationCountToMerge     // Catch: java.lang.Throwable -> L53
            if (r1 >= r4) goto L61
            boolean r2 = r2.isMergeableWith(r3)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L61
            java.util.concurrent.BlockingQueue<de.greenrobot.dao.async.AsyncOperation> r2 = r5.queue     // Catch: java.lang.Throwable -> L53
            java.lang.Object r2 = r2.remove()     // Catch: java.lang.Throwable -> L53
            de.greenrobot.dao.async.AsyncOperation r2 = (de.greenrobot.dao.async.AsyncOperation) r2     // Catch: java.lang.Throwable -> L53
            if (r2 != r3) goto L55
            r0.add(r2)     // Catch: java.lang.Throwable -> L53
            goto L64
        L53:
            r7 = move-exception
            goto La7
        L55:
            de.greenrobot.dao.DaoException r7 = new de.greenrobot.dao.DaoException     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = "忕\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L53
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L53
            throw r7     // Catch: java.lang.Throwable -> L53
        L61:
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L53
        L64:
            int r1 = r1 + 1
            goto L14
        L67:
            r6.endTransaction()
            if (r7 == 0) goto L8c
            java.lang.String r6 = "忖\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            de.greenrobot.dao.DaoLog.i(r6)
            java.util.Iterator r6 = r0.iterator()
        L79:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto La6
            java.lang.Object r7 = r6.next()
            de.greenrobot.dao.async.AsyncOperation r7 = (de.greenrobot.dao.async.AsyncOperation) r7
            r7.reset()
            r5.executeOperationAndPostCompleted(r7)
            goto L79
        L8c:
            int r6 = r0.size()
            java.util.Iterator r7 = r0.iterator()
        L94:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r7.next()
            de.greenrobot.dao.async.AsyncOperation r0 = (de.greenrobot.dao.async.AsyncOperation) r0
            r0.mergedOperationsCount = r6
            r5.handleOperationCompleted(r0)
            goto L94
        La6:
            return
        La7:
            r6.endTransaction()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.dao.async.AsyncOperationExecutor.mergeTxAndExecute(de.greenrobot.dao.async.AsyncOperation, de.greenrobot.dao.async.AsyncOperation):void");
    }

    public void enqueue(AsyncOperation asyncOperation) {
        synchronized (this) {
            try {
                int i4 = this.lastSequenceNumber + 1;
                this.lastSequenceNumber = i4;
                asyncOperation.sequenceNumber = i4;
                this.queue.add(asyncOperation);
                this.countOperationsEnqueued++;
                if (!this.executorRunning) {
                    this.executorRunning = true;
                    executorService.execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AsyncOperationListener getListener() {
        return this.listener;
    }

    public AsyncOperationListener getListenerMainThread() {
        return this.listenerMainThread;
    }

    public int getMaxOperationCountToMerge() {
        return this.maxOperationCountToMerge;
    }

    public int getWaitForMergeMillis() {
        return this.waitForMergeMillis;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        AsyncOperationListener asyncOperationListener = this.listenerMainThread;
        if (asyncOperationListener == null) {
            return false;
        }
        asyncOperationListener.onAsyncOperationCompleted((AsyncOperation) message.obj);
        return false;
    }

    public synchronized boolean isCompleted() {
        return this.countOperationsEnqueued == this.countOperationsCompleted;
    }

    @Override // java.lang.Runnable
    public void run() {
        AsyncOperation poll;
        while (true) {
            try {
                try {
                    AsyncOperation poll2 = this.queue.poll(1L, TimeUnit.SECONDS);
                    if (poll2 == null) {
                        synchronized (this) {
                            poll2 = this.queue.poll();
                            if (poll2 == null) {
                                this.executorRunning = false;
                                this.executorRunning = false;
                                return;
                            }
                        }
                    }
                    if (!poll2.isMergeTx() || (poll = this.queue.poll(this.waitForMergeMillis, TimeUnit.MILLISECONDS)) == null) {
                        executeOperationAndPostCompleted(poll2);
                    } else if (poll2.isMergeableWith(poll)) {
                        mergeTxAndExecute(poll2, poll);
                    } else {
                        executeOperationAndPostCompleted(poll2);
                        executeOperationAndPostCompleted(poll);
                    }
                } catch (InterruptedException e4) {
                    DaoLog.w(Thread.currentThread().getName() + ProtectedSandApp.s("志\u0001"), e4);
                    this.executorRunning = false;
                    return;
                }
            } catch (Throwable th) {
                this.executorRunning = false;
                throw th;
            }
        }
    }

    public void setListener(AsyncOperationListener asyncOperationListener) {
        this.listener = asyncOperationListener;
    }

    public void setListenerMainThread(AsyncOperationListener asyncOperationListener) {
        this.listenerMainThread = asyncOperationListener;
    }

    public void setMaxOperationCountToMerge(int i4) {
        this.maxOperationCountToMerge = i4;
    }

    public void setWaitForMergeMillis(int i4) {
        this.waitForMergeMillis = i4;
    }

    public synchronized void waitForCompletion() {
        while (!isCompleted()) {
            try {
                wait();
            } catch (InterruptedException e4) {
                throw new DaoException(ProtectedSandApp.s("忘\u0001"), e4);
            }
        }
    }

    public synchronized boolean waitForCompletion(int i4) {
        if (!isCompleted()) {
            try {
                wait(i4);
            } catch (InterruptedException e4) {
                throw new DaoException(ProtectedSandApp.s("忘\u0001"), e4);
            }
        }
        return isCompleted();
    }
}
